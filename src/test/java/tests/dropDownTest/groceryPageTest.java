package tests.dropDownTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.dropDown.groceryPage;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.io.IOException;

import static utilities.Driver.driver;

public class groceryPageTest {


    @Severity(SeverityLevel.NORMAL)
    @Description("Shelf dropdown menu tiklandigi ve Grocery secildigi dogrulanir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_01() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Aranan ürün Grocery ile ilgili ise  ve sitede varsa geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_05() throws InterruptedException {
        groceryPage groceryPage = new groceryPage();
        groceryPage.groceryPageGit();
        Thread.sleep(3000);
        groceryPage.groceryWeSearchFrame.sendKeys("Clementies", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(groceryPage.clementinesUrunu.isDisplayed());
        Driver.closeDriver();
        softAssert.assertAll();
    }


    @Severity(SeverityLevel.NORMAL)
    @Description("NEGATIF TEST: Aranan ürün Grocery ile ilgili değil ise ve sitede yoksa gelmedigi dogrulanmalidir")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_06() throws InterruptedException {
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        groceryPage.groceryPageGit();
        Thread.sleep(3000);
        groceryPage.groceryWeSearchFrame.sendKeys("Tomates", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Sorry, No Product Found");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Grocery' secili oldugu icin Grocery ürünleri geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_10() throws IOException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        SoftAssert softAssert = new SoftAssert();

        int i=0;
        for (WebElement listElement : homePage.anasayfaGroceryUrunIsimList) {
            System.out.println(homePage.anasayfaGroceryUrunIsimList.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Grocery urun isimleri");

        softAssert.assertAll();
        Driver.getDriver().close();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Grocery' secili oldugu icin Grocery fiyatlari geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_10_01() throws InterruptedException, IOException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        SoftAssert softAssert = new SoftAssert();

        int i=0;
        for (WebElement listElement : homePage.anasayfaGrocerFiyatList) {
            System.out.println(homePage.anasayfaGrocerFiyatList.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Grocery urun fiyatlari");

        softAssert.assertAll();
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_11() {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_12() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_13() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_14() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_15() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_16() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_17() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_18() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_19() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_20() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında ürün imglerinde slide barın çalıştığını doğrulamalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_27() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        // softAssert.assertEquals(homePage.groceryDropDownMenu.getText(),"Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

}
