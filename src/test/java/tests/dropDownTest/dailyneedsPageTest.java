package tests.dropDownTest;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.dropDown.dailyneedsPage;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class dailyneedsPageTest {

    @BeforeMethod(groups = {"Regression"})
    @Parameters("browser")
    public void beforeMethod(@Optional("chrome") String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
    }

    @AfterMethod(groups = {"Regression", "No role"})
    public void afterMethod() {
        Driver.closeDriver();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Ekranda; \"You Deserve to eat fresh\" yazisi görüntülenir ")
    @Test
    public void TC_14_01(@Optional("chrome") String browser) {
        dailyneedsPage dailyneedsPage = new dailyneedsPage(browser);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(dailyneedsPage.dailyNeedsYouDeserve.getText().contains("You Deserve"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Ekranda; 'We source the best healthy foods for you' yazisi görüntülenir. ")
    @Test(groups = {"Regression", "No role"})
    public void TC_14_02(@Optional("chrome") String browser) {
        dailyneedsPage dailyneedsPage = new dailyneedsPage(browser);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(dailyneedsPage.dailyNeedsWeSourse.getText().contains("We source"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Search secenegi olan frame görüntülenir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_14_03(@Optional("chrome") String browser) {
        dailyneedsPage dailyneedsPage = new dailyneedsPage(browser);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(dailyneedsPage.dailyNeedsWeSearchFrame.getText().equals("search"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Arama yapmak icin 'Search' butonu görülür")
    @Test(groups = {"Regression", "No role", "Failed"})
    public void TC_14_05(@Optional("chrome") String browser) throws InterruptedException, IOException {
        dailyneedsPage dailyneedsPage = new dailyneedsPage(browser);
        Thread.sleep(3000);
        ReusableMethods.takeScreenshot("Bug_TC_14_05_SearchButtonYok_");
        Assert.fail("Arama yapmak icin 'Search' butonu görülmedi");
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Aranan ürün Daily Needs ile ilgili ise ve sitede varsa gelmelidir")
    @Test(groups = {"Regression", "No role"})
    public void TC_14_06(@Optional("chrome") String browser) throws InterruptedException {
        dailyneedsPage dailyneedsPage = new dailyneedsPage(browser);
        Thread.sleep(3000);
        dailyneedsPage.dailyNeedsWeSearchFrame.sendKeys("Rice", Keys.ENTER);
        Assert.assertTrue(dailyneedsPage.sekkaGrainRiceUrunu.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("NEGATIF TEST: Aranan ürün Daily Needs ile ilgili degil ise ve sitede varsa gelmemelidir")
    @Test(groups = {"Regression", "No role"})
    public void TC_14_07(@Optional("chrome") String browser) throws InterruptedException {
        dailyneedsPage dailyneedsPage = new dailyneedsPage(browser);
        Thread.sleep(3000);
        //"Kullanici "Clothing"" kategorisindeki" Mango Self Striped A Line Dress"  adli ürünü search sekmesinde arar.
        Actions actions = new Actions(Driver.getDriver(browser));
        actions.sendKeys(dailyneedsPage.dailyNeedsWeSearchFrame, "Mango Self Striped A Line Dress", Keys.ENTER).perform();
        WebElement gelenYazi = Driver.getDriver(browser).findElement
                (By.xpath("//h3[.='No products found']"));
        Assert.assertTrue(gelenYazi.getText().contains("No products found"));
    }


    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {"chrome","Vegetables"},
                {"chrome","Snacks"},
                {"chrome","Rice & Pulse"},
                {"chrome","Meat"},
                {"chrome","Fruits"},
                {"chrome","Fish"},
                {"chrome","Dairy & Eggs"},
                {"chrome","Bakery"}};
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Tüm alt kategorilerin görünür oldugu test edilecek")
    @Test(dataProvider = "data", groups = {"Regression", "No role"})
    public void TC_14_08(@Optional("chrome")String browser, String kategoriAdi) {
        ReusableMethods.waitForPageToLoad(3);// sayfanin yüklenmesini icin.
        WebElement kategoriLocater = Driver.getDriver(browser).
                findElement(By.xpath("//h3[.='" + kategoriAdi + "']"));
        SoftAssert softAssert = new SoftAssert();// hatayi bulacak ama test devam edecek.
        softAssert.assertEquals(kategoriLocater.getText(), kategoriAdi);
        Driver.closeDriver();
    }

    }


