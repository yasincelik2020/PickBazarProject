package tests;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
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

public class homePageTest {
   @Severity(SeverityLevel.NORMAL)
   @Description("Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ; \"PickBazar\" butonu görüntülenmeli    ")
    @AfterTest
    public void closeDiver(){
       // Driver.getDriver().close();
    }
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
