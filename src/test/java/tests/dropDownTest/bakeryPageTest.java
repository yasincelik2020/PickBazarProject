package tests.dropDownTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.dropDown.bakeryPage;
import pages.dropDown.groceryPage;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;

public class bakeryPageTest {
    homePage homePage = new homePage();
    bakeryPage bakeryPage = new bakeryPage();

    @Severity(SeverityLevel.NORMAL)
    @Description(" Shelf dropdown menu tiklanir ve \"Bakery\" secilir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_01(){
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.bakeryDropDownMenu.getText(),"Bakery");
        Driver.closeDriver();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("\"Get Your Bakery Items Delivered\" yazisi görüntülenir ")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_02() throws InterruptedException {
        bakeryPage.bakeryPageGit();
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bakeryPage.bakeryGetYour.getText().contains("Get Your"));
        Driver.closeDriver();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("\"Get your favorite bakery items baked and delivered to your doorsteps at any time\"")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_03() throws InterruptedException {
        bakeryPage.bakeryPageGit();
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bakeryPage.bakeryGetYourFavorite.getText().contains("Get your favorite"));
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Search secenegi olan frame görüntülenir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_04() throws InterruptedException {
        bakeryPage.bakeryPageGit();
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bakeryPage.bakeryWeSearchFrame.getText().contains("Search"));
        Driver.closeDriver();
    }


    @Severity(SeverityLevel.NORMAL)
    @Description ("Aranan ürün Bakery ile ilgili ise  ve sitede varsa geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_05() throws InterruptedException {
        bakeryPage.bakeryPageGit();
        Thread.sleep(3000);
        bakeryPage.bakeryWeSearchFrame.sendKeys("Raspberry Crumble Cookies", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bakeryPage.raspberryCrumbleCookiesUrunu.isDisplayed());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description ("NEGATIF TEST: Aranan ürün Bakery ile ilgili değil ise ve sitede yoksa gelmedigi dogrulanmalidir")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_06() throws InterruptedException {
        bakeryPage.bakeryPageGit();
        Thread.sleep(3000);
        bakeryPage.bakeryWeSearchFrame.sendKeys("Pears", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.bakeryDropDownMenu.getText(),"Sorry, No Product Found");
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description ("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Bakery' secili oldugu icin Bakery ürünleri ve fiyatlari geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_07() throws InterruptedException {
        bakeryPage.bakeryPageGit();
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        Driver.closeDriver();
    }


}
