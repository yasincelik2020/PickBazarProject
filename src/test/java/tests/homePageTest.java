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
import pages.loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JavaScriptExecutorUtils;
import utilities.ReusableMethods;

import java.io.IOException;

import static utilities.Driver.driver;

public class homePageTest {
   @Severity(SeverityLevel.NORMAL)
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
        Assert.assertTrue(homePage.groceryDropDownMenuHomePage.isDisplayed());

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
    public void TC_01_08() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.expressDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Express Delivery Frame");

        Driver.closeDriver();

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Cash On Delivery\"  frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_10() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.cashOnDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Cash On Delivery Frame");

        Driver.closeDriver();

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Gift Voucher\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_12() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.giftVoucherFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Gift Voucher Frame");

        Driver.closeDriver();

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada scroll down yapildiginda;\n" +
            "Ekranin Sag tarafinda \"Grocery\" ürünleri gelmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_14() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform(); // Bir sayfa aşağı kaydır

        homePage homePage = new homePage();
        int k=0;

        for (WebElement listElement : homePage.groceryUrunleriHomePage) {
            System.out.println(homePage.groceryUrunleriHomePage.get(k).getText());
           Assert.assertTrue(listElement.isDisplayed());
           k++;
        }
        ReusableMethods.takeScreenshot("Grocery ana sayfa urunleri");

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada scroll down yapildiginda;\n" +
            "Ekranin Sol tarafinda \"Grocery\"nin alt menüleri gelmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_15() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        homePage homePage = new homePage();
        int i=0;

        for (WebElement listElement : homePage.groceryAltMenuUrunleriHomePage) {
            System.out.println(homePage.groceryAltMenuUrunleriHomePage.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Grocery alt menu" );

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ; \"PickBazar\" butonu görüntülenmeli       ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_16() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("pickUrl"));

        homePage homePage=new homePage();
        Assert.assertTrue( homePage.pickBazarButonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ; " +
            "Sol üstte dropdown menü otomatik olarak \"Grocery\" secili sekilde görüntülenmeli      ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_17() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.groceryDropDownMenuHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir:\"Shops\"  butonu görüntülenmeli  ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_18() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.shopsButtonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Offers\" butonu görüntülenmeli   ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_19() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.offersButtonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"FAQ\"  butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_20() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.faqButtonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Become a Seller\" butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_21() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.becomeASellerButtonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Join\" butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_22() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.joinButtonHomePage.isDisplayed());

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Express Delivery\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_23() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.expressDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Express Delivery Frame");

        Driver.closeDriver();

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Cash On Delivery\"  frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_25() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.cashOnDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Cash On Delivery Frame");

        Driver.closeDriver();

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Gift Voucher\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_27() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.giftVoucherFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Gift Voucher Frame");

        Driver.closeDriver();

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada scroll down yapildiginda;\n" +
            "Ekranin Sag tarafinda \"Grocery\" ürünleri gelmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_29() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform(); // Bir sayfa aşağı kaydır

        homePage homePage = new homePage();
        int k=0;

        for (WebElement listElement : homePage.groceryUrunleriHomePage) {
            System.out.println(homePage.groceryUrunleriHomePage.get(k).getText());
            Assert.assertTrue(listElement.isDisplayed());
            k++;
        }
        ReusableMethods.takeScreenshot("Grocery ana sayfa urunleri");

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada scroll down yapildiginda;\n" +
            "Ekranin Sol tarafinda \"Grocery\"nin alt menüleri gelmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_30() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        homePage homePage = new homePage();
        int i=0;

        for (WebElement listElement : homePage.groceryAltMenuUrunleriHomePage) {
            System.out.println(homePage.groceryAltMenuUrunleriHomePage.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Grocery alt menu" );

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Istenilen sayfada \"PickBazar\" butonu olmali")
    @Test
    public void US_02_PreCondition() {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("pickUrl"));

        homePage homePage=new homePage();
        Assert.assertTrue( homePage.pickBazarButonHomePage.isDisplayed());

        Driver.closeDriver();


    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada  \"Pick Bazar\" butonunun calistigi görülmeli")
    @Test(groups = {"Regression", "No role"},dependsOnMethods = "US_02_PreCondition")
    public void TC_02_01() throws IOException, InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

       JavaScriptExecutorUtils.scrollDownByJS(Driver.getDriver());

        homePage homePage = new homePage();
        homePage.pickBazarButonClickMethod();

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ,\"PickBazar\" butonunun oldugu Shops sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_02_02() throws IOException, InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.shopsButtonHomePage.click();

        Assert.assertTrue(homePage.allShopsShopsPage.isDisplayed());

        ReusableMethods.takeScreenshot("All Shops");

        homePage.pickBazarButonClickMethod();

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ,\"PickBazar\" butonunun oldugu Offers sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_02_03() throws IOException, InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.offersButtonHomePage.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("offers"));

        homePage.pickBazarButonClickMethod();

        Driver.closeDriver();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ,\"PickBazar\" butonunun oldugu FAQ sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_02_04() throws IOException, InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.faqButtonHomePage.click();

        Assert.assertTrue(homePage.faqTextFAQPage.isDisplayed());

        ReusableMethods.takeScreenshot("FAQ");

        homePage.pickBazarButonClickMethod();

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
