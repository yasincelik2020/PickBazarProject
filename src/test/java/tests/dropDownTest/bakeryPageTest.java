package tests.dropDownTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.dropDown.bakeryPage;
import pages.dropDown.groceryPage;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static utilities.Driver.driver;

public class bakeryPageTest {


    @Severity(SeverityLevel.NORMAL)
    @Description(" Shelf dropdown menu tiklanir ve \"Bakery\" secilir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_01(){
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.bakeryDropDownMenu.getText(),"Bakery");
        Driver.closeDriver();
        softAssert.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("\"Get Your Bakery Items Delivered\" yazisi görüntülenir ")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_02() throws InterruptedException {
        bakeryPage bakeryPage = new bakeryPage();
        bakeryPage.bakeryPageGit();
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bakeryPage.bakeryGetYour.getText().contains("Get Your"));
        Driver.closeDriver();
        softAssert.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("\"Get your favorite bakery items baked and delivered to your doorsteps at any time\"")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_03() throws InterruptedException {
        bakeryPage bakeryPage = new bakeryPage();
        bakeryPage.bakeryPageGit();
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bakeryPage.bakeryGetYourFavorite.getText().contains("Get your favorite"));
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Search secenegi olan frame görüntülenir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_04() throws InterruptedException {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        bakeryPage bakeryPage = new bakeryPage();
        bakeryPage.bakeryPageGit();
        Thread.sleep(3000);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
        softAssert.assertTrue(bakeryPage.bakeryWeSearchFrame.getText().contains("Search"));
        Driver.closeDriver();

    }


    @Severity(SeverityLevel.NORMAL)
    @Description ("Aranan ürün Bakery ile ilgili ise  ve sitede varsa geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_05() throws InterruptedException {
        bakeryPage bakeryPage = new bakeryPage();
        bakeryPage.bakeryPageGit();
        Thread.sleep(3000);
        bakeryPage.bakeryWeSearchFrame.sendKeys("Raspberry Crumble Cookies", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bakeryPage.raspberryCrumbleCookiesUrunu.isDisplayed());
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description ("NEGATIF TEST: Aranan ürün Bakery ile ilgili değil ise ve sitede yoksa gelmedigi dogrulanmalidir")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_06() throws InterruptedException {
        homePage homePage = new homePage();
        bakeryPage bakeryPage = new bakeryPage();
        bakeryPage.bakeryPageGit();
        Thread.sleep(3000);
        bakeryPage.bakeryWeSearchFrame.sendKeys("Pears", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
        softAssert.assertEquals(homePage.bakeryDropDownMenu.getText(),"Sorry, No Product Found");
        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description ("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Bakery' secili oldugu icin Bakery ürünleri geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_07() throws IOException, InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        SoftAssert softAssert = new SoftAssert();

        int i=0;
        for (WebElement listElement : homePage.anasayfaBakeryUrunIsimList) {
            System.out.println(homePage.anasayfaBakeryUrunIsimList.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Bakery urun isimleri");

        softAssert.assertAll();
        Driver.getDriver("browser").close();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description ("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Bakery' secili oldugu icin Bakery fiyatlari geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_09_07_01() throws IOException, InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        SoftAssert softAssert = new SoftAssert();

        int i=0;
        for (WebElement listElement : homePage.anasayfaBakeryFiyatList) {
            System.out.println(homePage.anasayfaBakeryFiyatList.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Bakery urun fiyatlari");

        softAssert.assertAll();
        Driver.getDriver("browser").close();
    }


}
