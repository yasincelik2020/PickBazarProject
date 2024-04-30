package tests.dropDownTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.dropDown.groceryPage;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.*;

public class groceryPageTest {
    homePage homePage = new homePage();
    groceryPage groceryPage = new groceryPage();

    @Severity(SeverityLevel.NORMAL)
    @Description("Shelf dropdown menu tiklandigi ve Grocery secildigi dogrulanir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_01() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Aranan ürün Grocery ile ilgili ise  ve sitede varsa geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_05() throws InterruptedException {
        groceryPage.groceryPageGit();
        Thread.sleep(3000);
        groceryPage.groceryWeSearchFrame.sendKeys("Clementies", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(groceryPage.clementinesUrunu.isDisplayed());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("NEGATIF TEST: Aranan ürün Grocery ile ilgili değil ise ve sitede yoksa gelmedigi dogrulanmalidir")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_06() throws InterruptedException {
        groceryPage.groceryPageGit();
        Thread.sleep(3000);
        groceryPage.groceryWeSearchFrame.sendKeys("Tomates", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(groceryPage.tomatesUrunu.isDisplayed());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Grocery' secili oldugu icin Grocery ürünleri ve fiyatlari geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_10() throws InterruptedException {
        groceryPage.groceryPageGit();
        Thread.sleep(3000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(homePage.groceryUrunleriHomePage.isEmpty());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_11() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_12() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_13() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_14() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_15() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_16() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_17() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_18() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_19() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_20() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
    }

}
