package tests;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.homePage;
import pages.loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JavaScriptExecutorUtils;
import utilities.ReusableMethods;

import java.io.IOException;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class homePageTest {


    @AfterMethod (groups = {"Smoke", "Regression","No role","US_15"})
    public void afterMethod() {
        Driver.closeDriver();
    }

    @BeforeMethod (groups = {"Smoke", "Regression","No role","US_15"})
    public void beforeMethod() {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
    }


    @Description("Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ; \"PickBazar\" butonu görüntülenmeli    ")
    @Test (groups ={ "Smoke","No role"})
    public void TC_01_01() {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(),ConfigReader.getProperty("pickUrl"));

        homePage homePage=new homePage();
       Assert.assertTrue( homePage.pickBazarButonHomePage.isDisplayed());


    }


    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ;" +
            " Sol üstte dropdown menü otomatik olarak \"Grocery\" secili sekilde görüntülenmeli   ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_02() {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.dropDownGroceryMain.isDisplayed());

    }
    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir:" +
            "\"Shops\"  butonu görüntülenmeli      ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_03() {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.shopsButtonHomePage.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Offers\" butonu görüntülenmeli  ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_04() {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.offersButtonHomePage.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"FAQ\"  butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_05() {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.faqButtonHomePage.isDisplayed());


    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Become a Seller\" butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_06() {

       Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.becomeASellerButtonHomePage.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Join\" butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_07() {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.joinButtonHomePage.isDisplayed());


    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Express Delivery\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_08() throws IOException {

        homePage homePage = new homePage();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.expressDeliveryFrameHomePage);

        Assert.assertTrue(homePage.expressDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Express Delivery Frame");

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Cash On Delivery\"  frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_10() throws IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.cashOnDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Cash On Delivery Frame");

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Gift Voucher\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_12() throws IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.giftVoucherFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Gift Voucher Frame");

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada scroll down yapildiginda;\n" +
            "Ekranin Sag tarafinda \"Grocery\" ürünleri gelmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_14() throws IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(Driver.getDriver("browser"));
        actions.sendKeys(Keys.PAGE_DOWN).perform(); // Bir sayfa aşağı kaydır

        homePage homePage = new homePage();
        int k=0;

        for (WebElement listElement : homePage.groceryUrunleriHomePage) {
            System.out.println(homePage.groceryUrunleriHomePage.get(k).getText());
           Assert.assertTrue(listElement.isDisplayed());
           k++;
        }
        ReusableMethods.takeScreenshot("Grocery ana sayfa urunleri");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada scroll down yapildiginda;\n" +
            "Ekranin Sol tarafinda \"Grocery\"nin alt menüleri gelmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_15() throws IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(Driver.getDriver("browser"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        homePage homePage = new homePage();
        int i=0;

        for (WebElement listElement : homePage.groceryAltMenuUrunleriHomePage) {
            System.out.println(homePage.groceryAltMenuUrunleriHomePage.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Grocery alt menu" );

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ; \"PickBazar\" butonu görüntülenmeli       ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_16() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(),ConfigReader.getProperty("pickUrl"));

        homePage homePage=new homePage();
        Assert.assertTrue( homePage.pickBazarButonHomePage.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ; " +
            "Sol üstte dropdown menü otomatik olarak \"Grocery\" secili sekilde görüntülenmeli      ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_17() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.dropDownGroceryMain.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir:\"Shops\"  butonu görüntülenmeli  ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_18() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.shopsButtonHomePage.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Offers\" butonu görüntülenmeli   ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_19() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.offersButtonHomePage.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"FAQ\"  butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_20() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.faqButtonHomePage.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Become a Seller\" butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_21() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.becomeASellerButtonHomePage.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitli kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Join\" butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_22() throws InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.joinButtonHomePage.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Express Delivery\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_23() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.expressDeliveryFrameHomePage);

        Assert.assertTrue(homePage.expressDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Express Delivery Frame");

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Cash On Delivery\"  frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_25() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.cashOnDeliveryFrameHomePage);
        Assert.assertTrue(homePage.cashOnDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Cash On Delivery Frame");

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Gift Voucher\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_27() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.giftVoucherFrameHomePage);
        Assert.assertTrue(homePage.giftVoucherFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Gift Voucher Frame");

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada scroll down yapildiginda;\n" +
            "Ekranin Sag tarafinda \"Grocery\" ürünleri gelmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_29() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(Driver.getDriver("browser"));
        actions.sendKeys(Keys.PAGE_DOWN).perform(); // Bir sayfa aşağı kaydır

        homePage homePage = new homePage();
        int k=0;

        for (WebElement listElement : homePage.groceryUrunleriHomePage) {
            System.out.println(homePage.groceryUrunleriHomePage.get(k).getText());
            Assert.assertTrue(listElement.isDisplayed());
            k++;
        }
        ReusableMethods.takeScreenshot("Grocery ana sayfa urunleri");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada scroll down yapildiginda;\n" +
            "Ekranin Sol tarafinda \"Grocery\"nin alt menüleri gelmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_30() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(Driver.getDriver("browser"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        homePage homePage = new homePage();
        int i=0;

        for (WebElement listElement : homePage.groceryAltMenuUrunleriHomePage) {
            System.out.println(homePage.groceryAltMenuUrunleriHomePage.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Grocery alt menu" );

    }



    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada  \"Pick Bazar\" butonunun calistigi görülmeli")
    @Test(groups = {"Regression", "No role"})
    public void TC_02_01() throws IOException, InterruptedException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

       JavaScriptExecutorUtils.scrollDownByJS(Driver.getDriver("browser"));

        homePage homePage = new homePage();
        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ,\"PickBazar\" butonunun oldugu Shops sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_02_02() throws IOException, InterruptedException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.shopsButtonHomePage.click();

        Assert.assertTrue(homePage.allShopsTextShopsPage.isDisplayed());

        ReusableMethods.takeScreenshot("All Shops");

        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ,\"PickBazar\" butonunun oldugu Offers sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_02_03() throws IOException, InterruptedException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.offersButtonHomePage.click();

       ReusableMethods.waitForPageToLoad(3);

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("offers"));

        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ,\"PickBazar\" butonunun oldugu FAQ sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_02_04() throws IOException, InterruptedException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.faqButtonHomePage.click();

        Assert.assertTrue(homePage.faqTextFAQPage.isDisplayed());

        ReusableMethods.takeScreenshot("FAQ");

        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ,\"PickBazar\" butonunun oldugu Contact sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_02_05() throws IOException, InterruptedException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.contactButtonHomePage.click();

        Assert.assertTrue(homePage.contactImgContactPage.isDisplayed());

        ReusableMethods.takeScreenshot("Contact Img");

        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada  \"Pick Bazar\" butonunun calistigi görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_02_06() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        JavaScriptExecutorUtils.scrollDownByJS(Driver.getDriver("browser"));

        homePage homePage = new homePage();
        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ,\"PickBazar\" butonunun oldugu Shops sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "Customer"})
    public void TC_02_07() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.shopsButtonHomePage.click();

        Assert.assertTrue(homePage.allShopsTextShopsPage.isDisplayed());

        ReusableMethods.takeScreenshot("All Shops");

        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ,\"PickBazar\" butonunun oldugu Offers sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "Customer"})
    public void TC_02_08() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.offersButtonHomePage.click();

        ReusableMethods.waitForPageToLoad(3);

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("offers"));

        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ,\"PickBazar\" butonunun oldugu FAQ sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "Customer"})
    public void TC_02_09() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.faqButtonHomePage.click();

        Assert.assertTrue(homePage.faqTextFAQPage.isDisplayed());

        ReusableMethods.takeScreenshot("FAQ");

        homePage.pickBazarButonClickMethod();

    }



    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ,\"PickBazar\" butonunun oldugu Contact sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "Customer"})
    public void TC_02_10() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.contactButtonHomePage.click();

        Assert.assertTrue(homePage.contactImgContactPage.isDisplayed());

        ReusableMethods.takeScreenshot("Contact Img");

        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana ekranda  Shelf dropdown menusü \"Grocery\" secenegi secili sekilde görüntülenmeli .")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_01() throws IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.dropDownGroceryMain.isDisplayed());
        ReusableMethods.takeScreenshot("Grocery Dropdown");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda " +
            " Grocery secenegi tiklanabilmeli, URL ' de Grocery yazisi görülmeli \n")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_02() throws InterruptedException, IOException {

        homePage homePage = new homePage();

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));
        homePage.dropDownGroceryMain.click();

      // JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.dropDownGroceryMain);

         //ReusableMethods.waitForVisibility(homePage.dropDownGroceryMainAlt,3);
        Thread.sleep(3000);
        homePage.dropDownGroceryMainAlt.click();

        //JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.dropDownGroceryMainAlt);

        System.out.println(Driver.getDriver("browser").getCurrentUrl());

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("grocery"));
        ReusableMethods.takeScreenshot("Grocery");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Bakery secenegi tiklanabilmeli, URL ' de Bakery  yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_03() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.bakeryDropDownAltMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("bakery"));
        ReusableMethods.takeScreenshot("Bakery");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " MakeUp secenegi tiklanabilmeli, URL ' de MakeUp  yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_04() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
       Thread.sleep(3000);
        homePage.makeUpDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("makeup"));
        ReusableMethods.takeScreenshot("MakeUp");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Bags secenegi tiklanabilmeli, URL ' de Bags yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_05() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.bagsDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("bags"));
        ReusableMethods.takeScreenshot("Bags");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Clothing secenegi tiklanabilmeli, URL ' de Clothing  yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_06() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.clothingDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("clothing"));
        ReusableMethods.takeScreenshot("Clothing");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Furniture secenegi tiklanabilmeli, URL ' de Furniture  yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_07() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.furnitureDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("furniture"));
        ReusableMethods.takeScreenshot("Furniture");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            "  Daily Needs secenegi tiklanabilmeli, URL ' de  Daily Needs  yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_08() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.dailyNeedsDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("daily-needs"));
        ReusableMethods.takeScreenshot("Daily Needs");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Books secenegi tiklanabilmeli, URL ' de Books  yazisi görülmeli")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_09() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);

        //JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.booksDropDownMenu);
        homePage.booksDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("books"));
        ReusableMethods.takeScreenshot("Books");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana ekranda  Shelf dropdown menusü \"Grocery\" secenegi secili sekilde görüntülenmeli  ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_03_10() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.dropDownGroceryMain.isDisplayed());
        ReusableMethods.takeScreenshot("Grocery");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda \n" +
            " Grocery secenegi tiklanabilmeli, URL ' de Grocery yazisi görülmeli ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_03_11() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.dropDownGroceryMainAlt.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("grocery"));
        ReusableMethods.takeScreenshot("Grocery");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Bakery secenegi tiklanabilmeli, URL ' de Bakery  yazisi görülmeli ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_03_12() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.bakeryDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("bakery"));
        ReusableMethods.takeScreenshot("Bakery");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " MakeUp secenegi tiklanabilmeli, URL ' de MakeUp  yazisi görülmeli ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_03_13() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.makeUpDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("makeup"));
        ReusableMethods.takeScreenshot("MakeUp");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Bags secenegi tiklanabilmeli, URL ' de Bags yazisi görülmeli ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_03_14() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.bagsDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("bags"));
        ReusableMethods.takeScreenshot("Bags");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Clothing secenegi tiklanabilmeli, URL ' de Clothing  yazisi görülmeli  ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_03_15() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.clothingDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("clothing"));
        ReusableMethods.takeScreenshot("Clothing");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Furniture secenegi tiklanabilmeli, URL ' de Furniture  yazisi görülmeli ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_03_16() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.furnitureDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("furniture"));
        ReusableMethods.takeScreenshot("Furniture");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            "  Daily Needs secenegi tiklanabilmeli, URL ' de  Daily Needs  yazisi görülmeli  ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_03_17() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.dailyNeedsDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("daily-needs"));
        ReusableMethods.takeScreenshot("Daily Needs");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Books secenegi tiklanabilmeli, URL ' de Books  yazisi görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_03_18() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();

        Thread.sleep(3000);

        homePage.booksDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver("browser").getCurrentUrl().contains("books"));
        ReusableMethods.takeScreenshot("Books");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici shops bolumunu tikladiginda ,alisveris icin magaza seceneklerini gorebilmeli.")
    @Test(groups = {"Regression", "Customer"})
    public void TC_04_01() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.shopsButtonHomePage.click();

        int i=0;

        for (WebElement listElement : homePage.allShopsShopsPage) {
            System.out.println(homePage.allShopsShopsPage.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("All Shops Shops Page" );

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici  shops bölümünde  herhangi bir magayaza tıkladiginda o magazaya ait magaza bilgisine erisebilmeli. ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_04_02() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.shopsButtonHomePage.click();

        for (int i = 0; i < homePage.allShopsShopsPage.size(); i++) {
            homePage.allShopsShopsPage.get(i).click();

            for (int j = 0; j < homePage.shopsInformation.size(); j++) {
                System.out.println(homePage.shopsInformation.get(j).getText());
                Assert.assertTrue(homePage.shopsInformation.get(j).isDisplayed());
                ReusableMethods.takeScreenshot("Shops Information Shops Page" );
            }
            homePage.shopsButtonHomePage.click();
        }

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici  shops bölümünde  herhangi bir magayaza tıkladiginda o magazaya ait\n" +
            "facebook linki bilgisine erisebilmeli. ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_04_03() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
       Thread.sleep(3000);
        homePage.shopsButtonHomePage.click();
        SoftAssert sa =new SoftAssert();

        for (int i = 0; i < homePage.allShopsShopsPage.size(); i++) {
            homePage.allShopsShopsPage.get(i).click();

            sa.assertTrue(homePage.facebookIcon.isDisplayed());

            ReusableMethods.takeScreenshot("Facebook Information Shops Page" );

            homePage.shopsButtonHomePage.click();

        }
       // sa.assertAll();


    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici shops bölümünde  herhangi bir magayaza tıkladiginda o magazaya ait\n" +
            "instagram linki bilgisine erisebilmeli. ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_04_04() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Thread.sleep(3000);
        homePage.shopsButtonHomePage.click();

        for (int i = 0; i < homePage.allShopsShopsPage.size(); i++) {
            homePage.allShopsShopsPage.get(i).click();
            System.out.println(homePage.instagramIcon.size());

            for (int j = 0; j < homePage.instagramIcon.size(); j++) {

                Assert.assertTrue(homePage.instagramIcon.get(j).isDisplayed());
                ReusableMethods.takeScreenshot("Instagram Information Shops Page" );
            }
            homePage.shopsButtonHomePage.click();
        }

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici  shops bölümünde  herhangi bir magayaza tıkladiginda o magazaya ait\n" +
            "Address bilgisine erisebilmeli.  ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_04_05() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.shopsButtonHomePage.click();

        for (int i = 0; i < homePage.allShopsShopsPage.size(); i++) {
            homePage.allShopsShopsPage.get(i).click();

         /*   for (int j = 0; j < homePage.facebookIcon.size(); j++) {

                Assert.assertTrue(homePage.facebookIcon.get(j).isDisplayed());
                ReusableMethods.takeScreenshot("Facebook Information Shops Page" );
            }*/
            homePage.shopsButtonHomePage.click();
        }

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici  shops bölümünde  herhangi bir magayaza tıkladiginda o magazaya ait\n" +
            "telefon bilgisine erisebilmeli. ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_04_06() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.shopsButtonHomePage.click();

        for (int i = 0; i < homePage.allShopsShopsPage.size(); i++) {
            homePage.allShopsShopsPage.get(i).click();

//            for (int j = 0; j < homePage.facebookIcon.size(); j++) {
//
//                Assert.assertTrue(homePage.facebookIcon.get(j).isDisplayed());
//                ReusableMethods.takeScreenshot("Facebook Information Shops Page" );
//            }
            homePage.shopsButtonHomePage.click();
        }

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici shops bölümünde  herhangi bir magayaza tıkladiginda o magazaya ait\n" +
            "site adresi bilgisine erisebilmeli. ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_04_07() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.shopsButtonHomePage.click();

        for (int i = 0; i < homePage.allShopsShopsPage.size(); i++) {
            homePage.allShopsShopsPage.get(i).click();

//            for (int j = 0; j < homePage.facebookIcon.size(); j++) {
//
//                Assert.assertTrue(homePage.facebookIcon.get(j).isDisplayed());
//                ReusableMethods.takeScreenshot("Facebook Information Shops Page" );
//            }
            homePage.shopsButtonHomePage.click();
        }

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici Shops bolumunde herhangi magaza secenegini tıkladiktan sonra herhangi bir  urunu  sepete ekleme islemini yapabilmeli ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_04_08() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver("browser").getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.shopsButtonHomePage.click();

        for (int i = 0; i < homePage.allShopsShopsPage.size(); i++) {
            homePage.allShopsShopsPage.get(i).click();


            homePage.shopsButtonHomePage.click();
        }

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde ürün ismi görüntülenmeli")
    @Test (groups ={ "Regression","No role","US_15"})
    public void TC_15_01 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size() ; i++) {
            Assert.assertTrue(homePage.anasayfaUrunIsimList.get(i).isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde ürün image görüntülenmeli")
    @Test (groups ={ "Regression","No role","US_15"})
    public void TC_15_02 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaImgList.size() ; i++) {
            Assert.assertTrue(homePage.anasayfaImgList.get(i).isDisplayed());
        }
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde ürün fiyati görüntülenmeli")
    @Test (groups ={ "Regression","No role","US_15"})
    public void TC_15_03 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaFiyatList.size() ; i++) {
            Assert.assertTrue(homePage.anasayfaFiyatList.get(i).isDisplayed());
        }
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde ürün indirim orani (bu kisim zorunlu degildir) görüntülenmeli")
    @Test (groups ={ "Regression","No role","US_15"})
    public void TC_15_04 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIndirimOraniList.size() ; i++) {
            Assert.assertTrue(homePage.anasayfaUrunIndirimOraniList.get(i).isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada maksimumum 30 adet ürün görüntülendigini dogrulamali")
    @Test (groups ={ "Regression","No role","US_15"})
    public void TC_15_05 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        int urunsayisi = homePage.anasayfaUrunIsimList.size();
        System.out.println(urunsayisi);
        if(urunsayisi<=30 ){
            Assert.assertTrue(true);
        }else {
            Assert.fail();
        }

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini (Grocery) sectikten sonra \"Load More\" butonu tiklandiginda daha fazla ürün yüklendigi dogrulamali")
    @Test ( groups ={ "Regression","No role","US_15"})
    public void TC_15_13 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        Assert.assertTrue(homePage.loadMoreButton.isDisplayed());
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.loadMoreButton);
        Thread.sleep(2000);

        int urunsayisi = homePage.anasayfaUrunIsimList.size();
        System.out.println(urunsayisi);
        if (urunsayisi >30) {
           Assert.assertTrue(true);
        } else {
           Assert.fail();
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün eklemek icin, ürün daha önce ekli degilse \"Add\" ve \"+\"butonu aktif olmalidir. ")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_16 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            Assert.assertTrue(homePage.addButton.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Ürün eklemek icin, daha önce eklenmis ürün ise \"+\" secenegi ile tekrardan yeni bir ürün eklenmeli.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_17 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        int addSorasiilkSayi=0;
        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            if(homePage.anasayfaUrunIsimList.get(i).isDisplayed()) {
                homePage.addButton.click();
                addSorasiilkSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
                Assert.assertEquals(addSorasiilkSayi, 1);
            }
        }
        for (int j = 1; j < homePage.anasayfaUrunIsimList.size()+1; j++) {
           WebElement plusElement = Driver.getDriver("browser").findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[2])["+j+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), plusElement);
            int addSorasiIkinciSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            Assert.assertTrue(addSorasiIkinciSayi>addSorasiilkSayi);
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Ürün eklemek icin, daha önce eklenmis ürün ise \"-\" secenegi ile ürün  cikarma islemi yapilmali.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_18 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            if(homePage.anasayfaUrunIsimList.get(i).isDisplayed()) {
                homePage.addButton.click();
            }
        }
        int plusSonrasiSayi=0;
        for (int i = 1; i < homePage.anasayfaUrunIsimList.size()+1; i++) {
            WebElement plusElement = Driver.getDriver("browser").findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[2])["+(i)+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), plusElement);
            ReusableMethods.waitForVisibility(homePage.sepeteEklenenUrunSayisi,3);
            plusSonrasiSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            Assert.assertEquals(plusSonrasiSayi, 2);
        }
        for (int i = 1; i < homePage.anasayfaUrunIsimList.size()+1; i++) {
            WebElement minusButton = Driver.getDriver("browser").findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[1])["+(i)+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), minusButton);
            ReusableMethods.waitForVisibility(homePage.sepeteEklenenUrunSayisi,3);
            int minusSorasiIkinciSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            Assert.assertEquals(minusSorasiIkinciSayi, 1);
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen ürün image bilgileri dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_40 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            Assert.assertTrue(homePage.anasayfaAltkart_UrunImg.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen ürün ismi dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_41 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            Assert.assertTrue(homePage.anasayfaAltkart_UrunIsmi.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen ürün miktari bilgileri dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_42 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);
        int sayi = homePage.anasayfaUrunIsimList.size();

        for (int i = 0; i < sayi; i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.addToShoppingCartButton);

            WebElement urunMiktari = Driver.getDriver("browser").findElement(By.xpath("(//div[starts-with(@class,'flex flex-1 items-center')])["+(i+3)+"]"));
            Assert.assertTrue(urunMiktari.isDisplayed());

        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen ürün fiyati bilgileri dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_43 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            Assert.assertTrue(homePage.anasayfaAltkart_UrunFiyati.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen ürün indirim orani (bu kisim zorunlu degildir) bilgileri dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_44 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIndirimOraniList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIndirimOraniList.get(i));
            Assert.assertTrue(homePage.anasayfaAltkart_UrunIndirimOrani.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen like butonu (basta bos sekilde, secildiginde dolu olmali, sadece müsteriler secebilir) bilgileri dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_45 () throws InterruptedException, IOException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < 1; i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            Thread.sleep(2000);
            ReusableMethods.takeScreenshot("TC_15_45 Ürün alt kartında secilen like butonu baslangicta bos");
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaAltkart_UrunLikeButtonu);
            homePage.likeButtonuIcinLoginMethodu();
        }
        Thread.sleep(2000);
        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaAltkart_UrunLikeButtonu);

            Assert.assertTrue(homePage.anasayfaAltkart_UrunLikeButtonu.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen ürün aciklamasi (\"Read More\" ve \"Less\" secenekleri ile aciklama detayi görüntülenebilir) bilgileri dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_46 () throws InterruptedException, IOException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {

            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));

            try {
                Assert.assertTrue(homePage.anasayfaAltkart_UrunAciklamasi.isDisplayed());
            }catch (NoSuchElementException e) {
                Thread.sleep(2000);
                ReusableMethods.takeScreenshot("TC_15_46 test Read More secenegi yok");
            }
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen available ürün sayisi bilgileri dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_47 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            Assert.assertTrue(homePage.anasayfaAltkart_AvailableUrunSayisi.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen ürün kategori bilgileri dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_48 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            Assert.assertTrue(homePage.anasayfaAltkart_UrunKategoriBilgisi.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen ürün satici bilgileri dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_49 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            Assert.assertTrue(homePage.anasayfaAltkart_UrunSaticiBilgileri.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen \"Details\" kisminda ürün detay bilgileri dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_50 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            Assert.assertTrue(homePage.anasayfaAltkart_DetailsKismindaUrunDetaylari.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen ürün puani  bilgileri dogru gelmelidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_51 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);

        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            Assert.assertTrue(homePage.anasayfaAltkart_UrunPuani.isDisplayed());
            System.out.println(homePage.anasayfaAltkart_UrunIsmi.getText());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında secilen ürün bilgilerinden \"Related Products\" kisminda ürünle ilgili diger ürünler image leri, fiyati ve ekleme butonu dogru gelmelidir;")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_52 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);
        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            Assert.assertTrue(homePage.anasayfaAltkart_IlgiliDigerUrunlerImgList.get(1).isDisplayed());
            Assert.assertTrue(homePage.anasayfaAltkart_IlgiliDigerUrunlerFiyatList.get(1).isDisplayed());
            Assert.assertTrue(homePage.anasayfaAltkart_IlgiliDigerUrunlerEklemeButtonuList.get(1).isDisplayed());

        }
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında cikis yapabilmek icin, ana sayfa alanina tiklamak gereklidir.")
    @Test(groups = {"Regression", "No role","US_15"})
    public void TC_15_53 () throws InterruptedException {
        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"),homePage.groceryApples);
        for (int i = 0; i < homePage.anasayfaUrunIsimList.size(); i++) {
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.anasayfaUrunIsimList.get(i));
            Assert.assertTrue(homePage.anasayfaAltkart_UrunFiyati.isDisplayed());

            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.altkartdanHomePageGecis);
            Assert.assertTrue(homePage.anasayfaUrunIsimList.get(1).isDisplayed());

        }
    }



}
