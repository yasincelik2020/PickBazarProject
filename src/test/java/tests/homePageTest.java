package tests;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JavaScriptExecutorUtils;

import static utilities.Driver.driver;

public class homePageTest {
    @Description("Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ; \"PickBazar\" butonu görüntülenmeli    ")
    @Test (groups ={ "Smoke","No role"})
    public void TC_01_01() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("pickUrl"));

        homePage homePage=new homePage();
       Assert.assertTrue( homePage.pickBazarButonHomePage.isDisplayed());

       Driver.closeDriver();


    }


    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ;" +
            " Sol üstte dropdown menü otomatik olarak \"Grocery\" secili sekilde görüntülenmeli   ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_02() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.homePageDropDownMenu.isDisplayed());

        Driver.closeDriver();

    }
    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir:" +
            "\"Shops\"  butonu görüntülenmeli      ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_03() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.shopsButtonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Offers\" butonu görüntülenmeli  ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_04() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.offersButtonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"FAQ\"  butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_05() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.faqButtonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Become a Seller\" butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_06() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.becomeASellerButtonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Join\" butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_07() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.joinButtonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Express Delivery\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_08() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.expressDeliveryFrameHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak anasayfada ekran asagi kaydirildiginda ekranda \"Express Delivery\" frame ' inde  \"Save Now\" buttonu görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_09() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.expressDeliveryFrameHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Cash On Delivery\"  frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_10() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.cashOnDeliveryFrameHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Cash On Delivery\"  frame ' inde  \"Save Now\" buttonu görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_11() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.expressDeliveryFrameHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Gift Voucher\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_12() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.giftVoucherFrameHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Gift Voucher\" frame ' inde  \"Shop Cuopons\" buttonu görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_13() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.expressDeliveryFrameHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada scroll down yapildiginda;\n" +
            "Ekranin Sag tarafinda \"Grocery\" ürünleri gelmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_14() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform(); // Bir sayfa aşağı kaydır

        homePage homePage = new homePage();

        for (WebElement listElement : homePage.groceryUrunleriHomePage) {
           Assert.assertTrue(listElement.isDisplayed());
        }

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada scroll down yapildiginda;\n" +
            "Ekranin Sol tarafinda \"Grocery\"nin alt menüleri gelmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_15() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        homePage homePage = new homePage();

        for (WebElement listElement : homePage.groceryAltMenuUrunleriHomePage) {
            Assert.assertTrue(listElement.isDisplayed());
        }

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ; \"PickBazar\" butonu görüntülenmeli       ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_16() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("pickUrl"));


        homePage homePage=new homePage();
        Assert.assertTrue( homePage.pickBazarButonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde ürünün image i görüntülenmeli ")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_01 () {
        homePage homePage=new homePage();

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
        jsexecutor.executeScript("arguments[0].scrollIntoView();", homePage.groceryApples);
        homePage.groceryApples.click();


    }




}
