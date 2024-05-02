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
   @Severity(SeverityLevel.NORMAL)
   @Description("Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ; \"PickBazar\" butonu görüntülenmeli    ")
    @AfterTest
    public void closeDiver(){
       // Driver.getDriver().close();
    }
    @AfterMethod
    public void afterMethod() {
        Driver.closeDriver();
    }

    @BeforeMethod
    public void beforeMethod() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
    }
    @Description("Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ; \"PickBazar\" butonu görüntülenmeli    ")
    @Test (groups ={ "Smoke","No role"})
    public void TC_01_01() {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("pickUrl"));

        homePage homePage=new homePage();
       Assert.assertTrue( homePage.pickBazarButonHomePage.isDisplayed());


    }


    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ;" +
            " Sol üstte dropdown menü otomatik olarak \"Grocery\" secili sekilde görüntülenmeli   ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_02() {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.dropDownGroceryMain.isDisplayed());

    }
    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir:" +
            "\"Shops\"  butonu görüntülenmeli      ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_03() {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.shopsButtonHomePage.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Offers\" butonu görüntülenmeli  ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_04() {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.offersButtonHomePage.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"FAQ\"  butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_05() {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.faqButtonHomePage.isDisplayed());


    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Become a Seller\" butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_06() {

       Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.becomeASellerButtonHomePage.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir: \"Join\" butonu görüntülenmeli    ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_07() {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.joinButtonHomePage.isDisplayed());


    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Express Delivery\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_08() throws IOException {

        homePage homePage = new homePage();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),homePage.expressDeliveryFrameHomePage);

        Assert.assertTrue(homePage.expressDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Express Delivery Frame");

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Cash On Delivery\"  frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_10() throws IOException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.cashOnDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Cash On Delivery Frame");

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Gift Voucher\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_12() throws IOException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.giftVoucherFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Gift Voucher Frame");

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada scroll down yapildiginda;\n" +
            "Ekranin Sag tarafinda \"Grocery\" ürünleri gelmeli")
    @Test(groups = {"Smoke", "No role"})
    public void TC_01_14() throws IOException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(Driver.getDriver());
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(Driver.getDriver());
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        Assert.assertTrue(homePage.dropDownGroceryMain.isDisplayed());

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

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Express Delivery\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_23() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),homePage.expressDeliveryFrameHomePage);

        Assert.assertTrue(homePage.expressDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Express Delivery Frame");

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Cash On Delivery\"  frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_25() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),homePage.cashOnDeliveryFrameHomePage);
        Assert.assertTrue(homePage.cashOnDeliveryFrameHomePage.isDisplayed());

        ReusableMethods.takeScreenshot("Cash On Delivery Frame");

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada ekran asagi kaydirildiginda ekranda \"Gift Voucher\" frame ' i  görüntülenmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_01_27() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),homePage.giftVoucherFrameHomePage);
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(Driver.getDriver());
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(Driver.getDriver());
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

       JavaScriptExecutorUtils.scrollDownByJS(Driver.getDriver());

        homePage homePage = new homePage();
        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ,\"PickBazar\" butonunun oldugu Shops sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_02_02() throws IOException, InterruptedException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.offersButtonHomePage.click();

       ReusableMethods.waitForPageToLoad(3);

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("offers"));

        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ,\"PickBazar\" butonunun oldugu FAQ sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_02_04() throws IOException, InterruptedException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        JavaScriptExecutorUtils.scrollDownByJS(Driver.getDriver());

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.offersButtonHomePage.click();

        ReusableMethods.waitForPageToLoad(3);

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("offers"));

        homePage.pickBazarButonClickMethod();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ,\"PickBazar\" butonunun oldugu FAQ sayfasinda  \"PickBazar\" butonu ana sayfa ekranina dönmemizi saglamali.")
    @Test(groups = {"Regression", "Customer"})
    public void TC_02_09() throws IOException, InterruptedException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));
        homePage.dropDownGroceryMain.click();

      // JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),homePage.dropDownGroceryMain);

         //ReusableMethods.waitForVisibility(homePage.dropDownGroceryMainAlt,3);
        Thread.sleep(3000);
        homePage.dropDownGroceryMainAlt.click();

        //JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),homePage.dropDownGroceryMainAlt);

        System.out.println(Driver.getDriver().getCurrentUrl());

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("grocery"));
        ReusableMethods.takeScreenshot("Grocery");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Bakery secenegi tiklanabilmeli, URL ' de Bakery  yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_03() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.bakeryDropDownAltMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("bakery"));
        ReusableMethods.takeScreenshot("Bakery");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " MakeUp secenegi tiklanabilmeli, URL ' de MakeUp  yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_04() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
       Thread.sleep(3000);
        homePage.makeUpDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("makeup"));
        ReusableMethods.takeScreenshot("MakeUp");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Bags secenegi tiklanabilmeli, URL ' de Bags yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_05() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.bagsDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("bags"));
        ReusableMethods.takeScreenshot("Bags");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Clothing secenegi tiklanabilmeli, URL ' de Clothing  yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_06() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.clothingDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("clothing"));
        ReusableMethods.takeScreenshot("Clothing");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Furniture secenegi tiklanabilmeli, URL ' de Furniture  yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_07() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.furnitureDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("furniture"));
        ReusableMethods.takeScreenshot("Furniture");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            "  Daily Needs secenegi tiklanabilmeli, URL ' de  Daily Needs  yazisi görülmeli ")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_08() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.dailyNeedsDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("daily-needs"));
        ReusableMethods.takeScreenshot("Daily Needs");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitsiz kullanici olarak ana sayfada sol üstteki Shelf dropdown menu tiklanildiginda\n" +
            " Books secenegi tiklanabilmeli, URL ' de Books  yazisi görülmeli")
    @Test(groups = {"Regression", "No role"})
    public void TC_03_09() throws InterruptedException, IOException {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);

        //JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),homePage.booksDropDownMenu);
        homePage.booksDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("books"));
        ReusableMethods.takeScreenshot("Books");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici olarak ana ekranda  Shelf dropdown menusü \"Grocery\" secenegi secili sekilde görüntülenmeli  ")
    @Test(groups = {"Regression", "Customer"})
    public void TC_03_10() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.dropDownGroceryMainAlt.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("grocery"));
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        Thread.sleep(3000);
        homePage.bakeryDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("bakery"));
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.makeUpDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("makeup"));
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.bagsDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("bags"));
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.clothingDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("clothing"));
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.furnitureDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("furniture"));
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();
        Thread.sleep(3000);
        homePage.dailyNeedsDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("daily-needs"));
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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.dropDownGroceryMain.click();

        Thread.sleep(3000);

        homePage.booksDropDownMenu.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("books"));
        ReusableMethods.takeScreenshot("Books");

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kayitli kullanici shops bolumunu tikladiginda ,alisveris icin magaza seceneklerini gorebilmeli.")
    @Test(groups = {"Regression", "Customer"})
    public void TC_04_01() throws InterruptedException, IOException {

        loginPage loginPage=new loginPage();
        loginPage.loginMethod();
        ReusableMethods.takeScreenshot("Login");

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

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

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("pickUrl"));

        homePage homePage = new homePage();
        homePage.shopsButtonHomePage.click();

        for (int i = 0; i < homePage.allShopsShopsPage.size(); i++) {
            homePage.allShopsShopsPage.get(i).click();


            homePage.shopsButtonHomePage.click();
        }

    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde ürün ismi görüntülenmeli")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_01 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        //homePage.groceryDropDownMenu.click();
        JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
        jsexecutor.executeScript("arguments[0].scrollIntoView();", homePage.groceryApples);
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < homePage.anasayfaGroceryUrunIsimList.size() ; i++) {
            softAssert.assertFalse(homePage.anasayfaGroceryUrunIsimList.get(i).getText().isEmpty());

        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde ürün image görüntülenmeli")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_02 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        //homePage.groceryDropDownMenu.click();
        JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
        jsexecutor.executeScript("arguments[0].scrollIntoView();", homePage.groceryApples);
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < homePage.anasayfaImgList.size() ; i++) {
            softAssert.assertTrue(homePage.anasayfaImgList.get(i).isDisplayed());
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde ürün fiyati görüntülenmeli")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_03 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        //homePage.groceryDropDownMenu.click();
        JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
        jsexecutor.executeScript("arguments[0].scrollIntoView();", homePage.groceryApples);
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < homePage.anasayfaFiyatList.size() ; i++) {
            softAssert.assertFalse(homePage.anasayfaFiyatList.get(i).getText().isEmpty());

        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde ürün indirim orani (bu kisim zorunlu degildir) görüntülenmeli")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_04 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        //homePage.groceryDropDownMenu.click();
        JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
        jsexecutor.executeScript("arguments[0].scrollIntoView();", homePage.groceryApples);
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < homePage.anasayfaUrunIndirimOraniList.size() ; i++) {
            softAssert.assertFalse(homePage.anasayfaUrunIndirimOraniList.get(i).getText().isEmpty());
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada maksimumum 30 adet ürün görüntülendigini dogrulamali")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_05 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();

        int urunsayisi = homePage.anasayfaGroceryUrunIsimList.size();
        System.out.println(urunsayisi);
        if(urunsayisi<=30 ){
            softAssert.assertTrue(true);
        }else {
            softAssert.fail();
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde maksimumum 30 adet ürün görüntülendigini dogrulamali")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_06 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();

        int urunsayisi = homePage.anasayfaBakeryUrunIsimList.size();
        System.out.println(urunsayisi);
        if(urunsayisi<=30 ){
            softAssert.assertTrue(true);
        }else {
            softAssert.fail();
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();

    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde maksimumum 30 adet ürün görüntülendigini dogrulamali")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_07 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.makeupDropDownMenu.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();
        int urunsayisi = homePage.anasayfaMakeupUrunIsimList.size();
        System.out.println(urunsayisi);
        if(urunsayisi<=30 ){
            softAssert.assertTrue(true);
        }else {
            softAssert.fail();
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();

    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde maksimumum 30 adet ürün görüntülendigini dogrulamali")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_08 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bagsDropDownMenu.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();
        int urunsayisi = homePage.anasayfaBagsUrunIsimList.size();
        System.out.println(urunsayisi);
        if(urunsayisi<=30 ){
            softAssert.assertTrue(true);
        }else {
            softAssert.fail();
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde maksimumum 30 adet ürün görüntülendigini dogrulamali")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_09 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.clothingDropDownMenu.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();

        int urunsayisi = homePage.anasayfaClothingUrunIsimList.size();
        System.out.println(urunsayisi);
        if(urunsayisi<=30 ){
            softAssert.assertTrue(true);
        }else {
            softAssert.fail();
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde maksimumum 30 adet ürün görüntülendigini dogrulamali")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_10 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.furnitureDropDownMenu.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();

        int urunsayisi = homePage.anasayfaFurnitureUrunIsimList.size();
        System.out.println(urunsayisi);
        if(urunsayisi<=30 ){
            softAssert.assertTrue(true);
        }else {
            softAssert.fail();
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde maksimumum 30 adet ürün görüntülendigini dogrulamali")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_11 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();
        int urunsayisi = homePage.anasayfaDaiyNeedsUrunIsimList.size();
        System.out.println(urunsayisi);
        if(urunsayisi<=30 ){
            softAssert.assertTrue(true);
        }else {
            softAssert.fail();
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde maksimumum 30 adet ürün görüntülendigini dogrulamali")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_12 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.booksDropDownMenu.click();
        ReusableMethods.waitForPageToLoad(3);// sayfanin yüklenmesini icin.
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        int booksurunsayisi = homePage.anasayfaBooksIsimList.size();
        System.out.println(booksurunsayisi);
        if(booksurunsayisi<=30 ){
            softAssert.assertTrue(true);
        }else {
            softAssert.fail();
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini (Grocery) sectikten sonra \"Load More\" butonu tiklandiginda daha fazla ürün yüklendigi dogrulamali")
    @Test ( groups ={ "Regression","No role"})
    public void TC_15_13 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(homePage.loadMoreButton.isDisplayed());
        homePage.loadMoreButton.click();
        Thread.sleep(3000);
        int urunsayisi = homePage.anasayfaGroceryUrunIsimList.size();
        System.out.println(urunsayisi);
        if (urunsayisi >30) {
            softAssert.assertTrue(true);
        } else {
            softAssert.fail();
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectikten sonra \"Load More\" butonu tiklandiginda daha fazla ürün yüklendigi dogrulamali")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_14 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bagsDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.loadMoreButton.isDisplayed());
        homePage.loadMoreButton.click();
        Thread.sleep(3000);
        int urunsayisi = homePage.anasayfaBagsUrunIsimList.size();
        System.out.println(urunsayisi);

        if (urunsayisi > 30) {
            softAssert.assertTrue(true);
        } else {
            softAssert.fail();
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectikten sonra \"Load More\" butonu tiklandiginda daha fazla ürün yüklendigi dogrulamali")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_15 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.loadMoreButton.isDisplayed());
        homePage.loadMoreButton.click();
        Thread.sleep(3000);
        int urunsayisi = homePage.anasayfaDaiyNeedsUrunIsimList.size();
        System.out.println(urunsayisi);
        if (urunsayisi > 30) {
            softAssert.assertTrue(true);
        } else {
            softAssert.fail();
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün eklemek icin, ürün daha önce ekli degilse \"Add\" ve \"+\"butonu aktif olmalidir. ")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_16 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
        jsexecutor.executeScript("arguments[0].scrollIntoView();", homePage.groceryApples);

        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < homePage.anasayfaGroceryUrunIsimList.size(); i++) {
            if(homePage.anasayfaGroceryUrunIsimList.get(i).isDisplayed()) {
                softAssert.assertTrue(homePage.addButton.isDisplayed());
            }
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Ürün eklemek icin, daha önce eklenmis ürün ise \"+\" secenegi ile tekrardan yeni bir ürün eklenmeli.")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_17 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
        jsexecutor.executeScript("arguments[0].scrollIntoView();", homePage.groceryApples);
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();

        int addSorasiilkSayi=0;
        for (int i = 0; i < homePage.anasayfaGroceryUrunIsimList.size(); i++) {
            if(homePage.anasayfaGroceryUrunIsimList.get(i).isDisplayed()) {
                homePage.addButton.click();
                addSorasiilkSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
                softAssert.assertTrue(addSorasiilkSayi==1);
            }
        }
        for (int j = 1; j < homePage.anasayfaGroceryUrunIsimList.size()+1; j++) {
           WebElement plusElement = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[2])["+j+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), plusElement);
            int addSorasiIkinciSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(addSorasiIkinciSayi>addSorasiilkSayi);
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Ürün eklemek icin, daha önce eklenmis ürün ise \"-\" secenegi ile ürün  cikarma islemi yapilmali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_18 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
        jsexecutor.executeScript("arguments[0].scrollIntoView();", homePage.groceryApples);
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < homePage.anasayfaGroceryUrunIsimList.size(); i++) {
            if(homePage.anasayfaGroceryUrunIsimList.get(i).isDisplayed()) {
                homePage.addButton.click();
            }
        }
        int plusSonrasiSayi=0;
        for (int i = 1; i < homePage.anasayfaGroceryUrunIsimList.size()+1; i++) {
            WebElement plusElement = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[2])["+(i)+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), plusElement);
            ReusableMethods.waitForVisibility(homePage.sepeteEklenenUrunSayisi,3);
            plusSonrasiSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(plusSonrasiSayi==2);
        }
        for (int i = 1; i < homePage.anasayfaGroceryUrunIsimList.size()+1; i++) {
            WebElement minusButton = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[1])["+(i)+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), minusButton);
            ReusableMethods.waitForVisibility(homePage.sepeteEklenenUrunSayisi,3);
            int minusSorasiIkinciSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(minusSorasiIkinciSayi==1 );
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün eklemek icin, ürün daha önce ekli degilse \"Add\" ve \"+\"butonu aktif olmalidir. ")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_19 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < homePage.anasayfaBakeryUrunIsimList.size(); i++) {
            if(homePage.anasayfaBakeryUrunIsimList.get(i).isDisplayed()) {
                softAssert.assertTrue(homePage.addButton.isDisplayed());
            }
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Ürün eklemek icin, daha önce eklenmis ürün ise \"+\" secenegi ile tekrardan yeni bir ürün eklenmeli.")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_20 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(1000);
        int addSorasiilkSayi=0;
        for (int i = 0; i < homePage.anasayfaBakeryUrunIsimList.size(); i++) {
            if(homePage.anasayfaBakeryUrunIsimList.get(i).isDisplayed()) {
                homePage.bakeryaArtiButton.click();
                addSorasiilkSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
                softAssert.assertTrue(addSorasiilkSayi==1);
            }
        }
        for (int j = 1; j < homePage.anasayfaBakeryUrunIsimList.size()+1; j++) {
            WebElement plusElement = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[2])["+j+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), plusElement);
            int addSorasiIkinciSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(addSorasiIkinciSayi>addSorasiilkSayi);
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Ürün eklemek icin, daha önce eklenmis ürün ise \"-\" secenegi ile ürün  cikarma islemi yapilmali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_21 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(1000);

        for (int i = 0; i < homePage.anasayfaBakeryUrunIsimList.size(); i++) {
            if(homePage.anasayfaBakeryUrunIsimList.get(i).isDisplayed()) {
                homePage.bakeryaArtiButton.click();
            }
        }
        int plusSonrasiSayi=0;
        for (int i = 1; i < homePage.anasayfaBakeryUrunIsimList.size()+1; i++) {
            WebElement plusElement = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[2])["+(i)+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), plusElement);
            ReusableMethods.waitForVisibility(homePage.sepeteEklenenUrunSayisi,3);
            plusSonrasiSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(plusSonrasiSayi==2);

        }
        for (int i = 1; i < homePage.anasayfaBakeryUrunIsimList.size()+1; i++) {
            WebElement minusButton = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[1])["+(i)+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), minusButton);
            ReusableMethods.waitForVisibility(homePage.sepeteEklenenUrunSayisi,3);
            int minusSorasiIkinciSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(minusSorasiIkinciSayi==1 );
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün eklemek icin, ürün daha önce ekli degilse \"Add\" ve \"+\"butonu aktif olmalidir. ")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_22 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.makeupDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < homePage.anasayfaMakeupUrunIsimList.size(); i++) {
            if(homePage.anasayfaMakeupUrunIsimList.get(i).isDisplayed()) {
                softAssert.assertTrue(homePage.addButton.isDisplayed());
            }
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Ürün eklemek icin, daha önce eklenmis ürün ise \"+\" secenegi ile tekrardan yeni bir ürün eklenmeli.")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_23 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.makeupDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(1000);
        int addSorasiilkSayi=0;
        for (int i = 0; i < homePage.anasayfaMakeupUrunIsimList.size(); i++) {
            if(homePage.anasayfaMakeupUrunIsimList.get(i).isDisplayed()) {
                homePage.cartButton.click();
                addSorasiilkSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
                softAssert.assertTrue(addSorasiilkSayi==1);
            }
        }
        for (int j = 1; j < homePage.anasayfaMakeupUrunIsimList.size()+1; j++) {
            WebElement plusElement = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[2])["+j+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), plusElement);
            int addSorasiIkinciSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(addSorasiIkinciSayi>addSorasiilkSayi);
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Ürün eklemek icin, daha önce eklenmis ürün ise \"-\" secenegi ile ürün  cikarma islemi yapilmali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_24 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.makeupDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(1000);

        for (int i = 0; i < homePage.anasayfaMakeupUrunIsimList.size(); i++) {
            if(homePage.anasayfaMakeupUrunIsimList.get(i).isDisplayed()) {
                homePage.cartButton.click();
            }
        }
        int plusSonrasiSayi=0;
        for (int i = 1; i < homePage.anasayfaBakeryUrunIsimList.size()+1; i++) {
            WebElement plusElement = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[2])["+(i)+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), plusElement);
            ReusableMethods.waitForVisibility(homePage.sepeteEklenenUrunSayisi,3);
            plusSonrasiSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(plusSonrasiSayi==2);
        }
        for (int i = 1; i < homePage.anasayfaBakeryUrunIsimList.size()+1; i++) {
            WebElement minusButton = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[1])["+(i)+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), minusButton);
            ReusableMethods.waitForVisibility(homePage.sepeteEklenenUrunSayisi,3);
            int minusSorasiIkinciSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(minusSorasiIkinciSayi==1 );
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün eklemek icin, ürün daha önce ekli degilse \"Add\" ve \"+\"butonu aktif olmalidir. ")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_25 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bagsDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < homePage.anasayfaBagsUrunIsimList.size(); i++) {
            if(homePage.anasayfaBagsUrunIsimList.get(i).isDisplayed()) {
                softAssert.assertTrue(homePage.addButton.isDisplayed());
            }
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("  Ürün eklemek icin, daha önce eklenmis ürün ise \"+\" secenegi ile tekrardan yeni bir ürün eklenmeli.")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_26 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bagsDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(1000);
        int addSorasiilkSayi=0;
        for (int i = 0; i < homePage.anasayfaBagsUrunIsimList.size(); i++) {
            if(homePage.anasayfaBagsUrunIsimList.get(i).isDisplayed()) {
                homePage.cartButton.click();
                addSorasiilkSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
                softAssert.assertTrue(addSorasiilkSayi==1);
            }
        }
        for (int j = 1; j < homePage.anasayfaBagsUrunIsimList.size()+1; j++) {
            WebElement plusElement = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[2])["+j+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), plusElement);
            int addSorasiIkinciSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(addSorasiIkinciSayi>addSorasiilkSayi);
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description(" Ürün eklemek icin, daha önce eklenmis ürün ise \"-\" secenegi ile ürün  cikarma islemi yapilmali.")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_27 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.bagsDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(1000);

        for (int i = 0; i < homePage.anasayfaBagsUrunIsimList.size(); i++) {
            if(homePage.anasayfaBagsUrunIsimList.get(i).isDisplayed()) {
                homePage.cartButton.click();
            }
        }
        int plusSonrasiSayi=0;
        for (int i = 1; i < homePage.anasayfaBagsUrunIsimList.size()+1; i++) {
            WebElement plusElement = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[2])["+(i)+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), plusElement);
            ReusableMethods.waitForVisibility(homePage.sepeteEklenenUrunSayisi,3);
            plusSonrasiSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(plusSonrasiSayi==2);
        }
        for (int i = 1; i < homePage.anasayfaBagsUrunIsimList.size()+1; i++) {
            WebElement minusButton = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'flex overflow-hidden')]/button[1])["+(i)+"]"));
            JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), minusButton);
            ReusableMethods.waitForVisibility(homePage.sepeteEklenenUrunSayisi,3);
            int minusSorasiIkinciSayi = Integer.parseInt(homePage.sepeteEklenenUrunSayisi.getText());
            softAssert.assertTrue(minusSorasiIkinciSayi==1 );
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün eklemek icin, ürün daha önce ekli degilse \"Add\" ve \"+\"butonu aktif olmalidir. ")
    @Test(groups = {"Regression", "No role"})
    public void TC_15_28 () throws InterruptedException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.clothingDropDownMenu.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < homePage.anasayfaClothingUrunIsimList.size(); i++) {
            if(homePage.anasayfaClothingUrunIsimList.get(i).isDisplayed()) {
                softAssert.assertTrue(homePage.addButton.isDisplayed());
            }
        }
        softAssert.assertAll();  // en sonda bu satiri yazmak zorundayiz ki sofr assertionlar calissin
        Driver.getDriver().close();
    }





}
