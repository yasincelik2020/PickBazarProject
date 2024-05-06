package tests.dropDownTest;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.dropDown.booksPage;
import pages.homePage;
import utilities.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class booksPageTest {

    @Parameters ("browser")
    @BeforeMethod(groups = {"Regression", "No role"})
    public void beforeMethod(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
    }
    @AfterMethod(groups = {"Regression", "No role"})
    public void afterMethod() {
        Driver.closeDriver();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }



    @Severity(SeverityLevel.NORMAL)
    @Description("Books sayfasina gidilir")
    @Parameters("browser")
    @Test(groups = {"Regression", "Customer"})

    public void TC_23_00(@Optional("chrome")String browser) {
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        booksPage booksPage = new booksPage(browser);
        booksPage.booksDropDown.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(Driver.getDriver(browser).getCurrentUrl().contains("books"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Best Selling Products alani görüntülenir")
    @Test(groups = {"Regression", "Customer", "Failed"})
    public void TC_23_04(@Optional("chrome")String browser) {
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        booksPage booksPage = new booksPage(browser);
        booksPage.booksDropDown.click();
        for (WebElement webElement : booksPage.booksBasliklar) {
            Assert.assertTrue(webElement.getText().contains("Best Selling"));
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Popular Products alani görüntülenir")
    @Parameters ("browser")
    @Test(groups = {"Regression", "Customer"})
    public void TC_23_05(@Optional("chrome")String browser) {
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        booksPage booksPage = new booksPage(browser);
        booksPage.booksDropDown.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser), booksPage.popularProducts);
        Assert.assertTrue(booksPage.popularProducts.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters ("browser")
    @Description("Popüler kitaplar; image i, ismi, fiyati seklinde siralanmis olmalidir.")
    @Test(groups = {"Regression", "Customer"})
    public void TC_23_06(@Optional("chrome")String browser) {
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        booksPage booksPage = new booksPage(browser);
        booksPage.booksDropDown.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser), booksPage.popularProducts);

        for (int i = 0; i < booksPage.popularKitaplarImages.size() - 1; i++) {
            Assert.assertTrue(booksPage.popularKitaplarImages.get(i).isDisplayed());
            Assert.assertTrue(booksPage.popularKitaplarIsimler.get(i).isDisplayed());
            Assert.assertTrue(booksPage.popularKitaplarFiyatlar.get(i).isDisplayed());
            //Burada önce img-isim-fiyat in alt alta gelip gelmedigi her elementin üst kenarlari bulunarak yapiliyor.
            //Bir web sayfasında, sayfanın üst kısmına yaklaştıkça,elementlerin getLocation().getY() değerleri daha küçük olur.
            //Yani, bir elementin üst kenarı sayfanın üst kısmına daha yakın olduğunda, getY() değeri daha küçük olacaktır.
            Assert.assertTrue(booksPage.popularKitaplarImages.get(i).getLocation().getY()
                    < booksPage.popularKitaplarIsimler.get(i).getLocation().getY());
            Assert.assertTrue(booksPage.popularKitaplarIsimler.get(i).getLocation().getY()
                    < booksPage.popularKitaplarFiyatlar.get(i).getLocation().getY());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters ("browser")
    @Description("Popüler kitaplar altinda kitabin ismi olmali.")
    @Test(groups = {"Regression", "Customer", "Failed"})
    public void TC_23_07(@Optional("chrome")String browser) {
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        booksPage booksPage = new booksPage(browser);
        booksPage.booksDropDown.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser), booksPage.popularProducts);
        Assert.assertTrue(booksPage.popularKitaplarIsimler.getFirst().getText().contains("Agents"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters ("browser")
    @Description("'Which Books You Like To See?' alani görüntülenir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_23_09(@Optional("chrome")String browser) {
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        booksPage booksPage = new booksPage(browser);
        booksPage.booksDropDown.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser), booksPage.whichBookHeader);
        Assert.assertTrue(booksPage.whichBookHeader.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters ("browser")
    @Description("Science Fiction,Literature,Children`s Literature," +
            "Comic books,Horror Fiction,Novels,Romantic Poetry,Thriller alanlari görüntülenir")
    @Test(groups = {"Regression", "Customer", "Failed"})
    public void TC_23_10_17(@Optional("chrome")String browser) {
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        booksPage booksPage = new booksPage(browser);
        booksPage.booksDropDown.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser), booksPage.whichBookHeader);
        List<String> whichBookIsimListesi = new ArrayList<>(Arrays.asList("Comic books", "Science Fiction", "Literature",
                "Children's Literature", "Horror Fiction", "Novels", "Romantic Poetry", "Thriller"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(browser), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(booksPage.whichBookHeader));
        System.out.println("Thriller = " + booksPage.whichBookList.getLast().getText());
        for (int i = 0; i < booksPage.whichBookList.size() - 1; i++) {
            Assert.assertEquals(whichBookIsimListesi.get(i), booksPage.whichBookList.get(i).getText());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters ("browser")
    @Description("Ekranda 'Save up to 50% on best selling title' frame, 'Shop Now' button görülür")
    @Test(groups = {"Regression", "Customer", "Failed"})
    public void TC_23_18_22(@Optional("chrome")String browser) {
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        booksPage booksPage = new booksPage(browser);
        booksPage.booksDropDown.click();
        Assert.fail("Ekranda 'Save up to 50% on best selling title' frame görülmedi");
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters ("browser")
    @Description("'Top Authors' alani görüntülenir.")
    @Test(groups = {"Regression", "Customer"})
    public void TC_23_22(@Optional("chrome")String browser) {
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        booksPage booksPage = new booksPage(browser);
        booksPage.booksDropDown.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser), booksPage.topAuthors);
        Assert.assertTrue(booksPage.topAuthors.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters ("browser")
    @Description("Yazar resmi yuvarlak frame lerde yer almalidir.")
    @Test(groups = {"Regression", "Customer"})
    public void TC_23_23(@Optional("chrome")String browser) {
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        booksPage booksPage = new booksPage(browser);
        booksPage.booksDropDown.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser), booksPage.topAuthors);
        for (WebElement yazarImage : booksPage.yazarTumImages) {
            Dimension resimBoyutu = yazarImage.getSize();// bu class dan resmin yatay ve dikey uzunlugu aliniyor
            int genislik = resimBoyutu.getWidth();
            //System.out.println("resimBoyutu.getWidth() = " + resimBoyutu.getWidth());
            int yukseklik = resimBoyutu.getHeight();
            //System.out.println("resimBoyutu.getHeight() = " + resimBoyutu.getHeight());
            Assert.assertEquals(yukseklik, genislik);
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters ("browser")
    @Description("Yazar ismi yuvarlak frame lerde yer almalidir.")
    @Test(groups = {"Regression", "Customer"})
    public void TC_23_24(@Optional("chrome")String browser) throws InterruptedException {
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        booksPage booksPage = new booksPage(browser);
        booksPage.booksDropDown.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser), booksPage.yazarTumImages.getFirst());
        for (int i = 0; i < booksPage.yazarIsimleri.size(); i++) {
            try {
                if (booksPage.yazarIsimleri.get(i).getText().isEmpty()) {
                    throw new Exception("Yazar ismi boş.");
                }
                Assert.assertTrue(booksPage.yazarIsimleri.get(i).isDisplayed());
            } catch (Exception e) {
                JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), booksPage.nextYazar);
                ReusableMethods.waitForVisibility(booksPage.yazarIsimleri.get(i), 10);
                Assert.assertTrue(booksPage.yazarIsimleri.get(i).isDisplayed());
            }

        }
    }
}


