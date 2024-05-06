package tests.dropDownTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.dropDown.bakeryPage;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;


public class bakeryPageTest {
    @Parameters("browser")

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
    @Description(" Shelf dropdown menu tiklanir ve \"Bakery\" secilir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_01(@Optional("chrome")String browser){
      Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.bakeryDropDownMenu.getText(),"Bakery");
    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("\"Get Your Bakery Items Delivered\" yazisi görüntülenir ")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_02(@Optional("chrome")String browser) throws InterruptedException {
        bakeryPage bakeryPage = new bakeryPage(browser);
        bakeryPage.bakeryPageGit(browser);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bakeryPage.bakeryGetYour.getText().contains("Get Your"));
    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("\"Get your favorite bakery items baked and delivered to your doorsteps at any time\"")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_03(@Optional("chrome")String browser) throws InterruptedException {
        bakeryPage bakeryPage = new bakeryPage(browser);
        bakeryPage.bakeryPageGit(browser);
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bakeryPage.bakeryGetYourFavorite.getText().contains("Get your favorite"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Search secenegi olan frame görüntülenir.")
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_04(@Optional("chrome")String browser) throws InterruptedException {

        bakeryPage bakeryPage = new bakeryPage(browser);
        bakeryPage.bakeryPageGit(browser);
        Thread.sleep(3000);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bakeryPage.bakeryWeSearchFrame.getText().contains("Search"));
    }


    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description ("Aranan ürün Bakery ile ilgili ise  ve sitede varsa geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_05(@Optional("chrome")String browser) throws InterruptedException {
        bakeryPage bakeryPage = new bakeryPage(browser);
        bakeryPage.bakeryPageGit(browser);
        Thread.sleep(3000);
        bakeryPage.bakeryWeSearchFrame.sendKeys("Raspberry Crumble Cookies", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bakeryPage.raspberryCrumbleCookiesUrunu.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description ("NEGATIF TEST: Aranan ürün Bakery ile ilgili değil ise ve sitede yoksa gelmedigi dogrulanmalidir")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_06(@Optional("chrome")String browser) throws InterruptedException {
        homePage homePage = new homePage(browser);
        bakeryPage bakeryPage = new bakeryPage(browser);
        bakeryPage.bakeryPageGit(browser);
        Thread.sleep(3000);
        bakeryPage.bakeryWeSearchFrame.sendKeys("Pears", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.bakeryDropDownMenu.getText(),"Sorry, No Product Found");
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description ("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Bakery' secili oldugu icin Bakery ürünleri geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_07(@Optional("chrome")String browser) throws IOException, InterruptedException {
        homePage homePage = new homePage(browser);
      Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
        Thread.sleep(2000);

        int i=0;
        for (WebElement listElement : homePage.anasayfaBakeryUrunIsimList) {
            System.out.println(homePage.anasayfaBakeryUrunIsimList.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Bakery urun isimleri");


    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description ("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Bakery' secili oldugu icin Bakery fiyatlari geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_07_01(@Optional("chrome")String browser) throws IOException, InterruptedException {
        homePage homePage = new homePage(browser);
      Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
        Thread.sleep(2000);

        int i=0;
        for (WebElement listElement : homePage.anasayfaBakeryFiyatList) {
            System.out.println(homePage.anasayfaBakeryFiyatList.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Bakery urun fiyatlari");


    }


}
