package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.homePage;
import pages.loginPage;
import pages.orderPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JavaScriptExecutorUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;


public class orderPageTest {
    @Parameters("browser")
    @AfterMethod(groups = {"Smoke", "Regression"})
    public void afterMethod(@Optional("browser") String browser) {
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfada kücük ekranda sepet bilgisi gelmeli ")
    @Parameters("browser")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_01(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.applesAddButton.click();
        sa.assertTrue(homePage.chartButtonAtrightItemCount.getText().contains("1"));
        sa.assertTrue(homePage.chartButtonAtrightPrice.getText().contains("1.60"));
        sa.assertAll();

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Anasayfada kücük görüntüdeki sepet bilgilerinin ürün eklendiginde dogru bir sekilde güncellenmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_02(@Optional("chrome")String browser) throws InterruptedException {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        Thread.sleep(2000);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.spinachAddButton);
        double total = homePage.valueEvuloation(homePage.applesPriceValue, homePage.spinachPriceValue);
        System.out.println(total);
        String strTotal = String.valueOf(total);
        sa.assertTrue(homePage.itemsNumber.getText().contains("2"));
        sa.assertTrue(homePage.chartButtonAtrightPrice.getText().contains(strTotal));
        sa.assertAll();

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Anasayfada kücük görüntüdeki sepet bilgilerinin ürün cikarildiginda dogru bir sekilde güncellenmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_03(@Optional("chrome")String browser) {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.spinachAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButtonMinusSign);
        sa.assertTrue(homePage.chartButtonAtrightItemCount.getText().contains("1"));
        sa.assertTrue(homePage.chartButtonAtrightPrice.getText().contains(homePage.spinachPriceValue.getText()));
        sa.assertAll();

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Anasayfadaki kücük sepet bilgisi ekraninin tiklanarak daha büyük bir görüntüde sepet ekrani acilmasi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_04(@Optional("chrome")String browser) {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        sa.assertTrue(homePage.checkoutButtonArea.isEnabled());
        sa.assertTrue(homePage.checkoutButtonArea.isDisplayed());
        sa.assertAll();


    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Anasayfadaki kücük sepet bilgisi ekraninin tiklanarak daha büyük bir görüntüde sepet ekrani acildiginda, en altta \"Checkout\" secenegi butonunun geldigi gorulmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_05(@Optional("chrome")String browser) {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
       
        ReusableMethods.waitForVisibility(homePage.checkoutButton, 3);
        sa.assertTrue(homePage.checkoutButton.isDisplayed());
        sa.assertAll();

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Daily Needs ekraninda sepet ikonu gelmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_06(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        homePage.groceryDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        ReusableMethods.waitForVisibility(homePage.dailyNeedsChartIkon, 3);
        sa.assertTrue(homePage.dailyNeedsChartIkon.isDisplayed());
        sa.assertAll();

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Daily Needs ekraninda sepet ikonu tiklandiginda, sepet ekraninin sagda acilabilmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_07(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        homePage.groceryDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        ReusableMethods.waitForVisibility(homePage.dailyNeedsChartIkon, 3);
        homePage.dailyNeedsChartIkon.click();
        ReusableMethods.waitForVisibility(homePage.checkoutButtonArea, 3);
        sa.assertTrue(homePage.checkoutButtonArea.isDisplayed());
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Daily Needs ekraninda sepet ikonu tiklandiginda, sepet ekrani acildiginda, en altta \"Checkout\" secenegi butonunun geldiginin gorulmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_08(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        homePage.groceryDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        ReusableMethods.waitForVisibility(homePage.dailyNeedsChartIkon, 3);
        homePage.dailyNeedsChartIkon.click();
        ReusableMethods.waitForVisibility(homePage.checkoutButton, 3);
        sa.assertTrue(homePage.checkoutButton.isDisplayed());
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Contact Number alaninin (Zorunlu alan) default olarak bos geldigi gorulur")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_01(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        homePage.groceryDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        homePage.dailyNeedsChartIkon.click();
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        sa.assertTrue(homePage.telefonNumberBox.getText().isEmpty());
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Contact Number alanininda (Zorunlu alan) contact number ekli ise eklenen numara görüntülenebilmelidir")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_02(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        homePage.groceryDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        homePage.dailyNeedsChartIkon.click();
        homePage.checkoutButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(browser), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(homePage.eMailBox));
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),homePage.eMailBox);
        homePage.eMailBox.sendKeys(ConfigReader.getProperty("eposta"));
        homePage.passswordBox.click();
        homePage.passswordBox.sendKeys(ConfigReader.getProperty("password"));
        homePage.loginButton.click();

        sa.assertTrue(homePage.telefonNumberBox.getText().isEmpty());
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Contact Number alaninin (Zorunlu alan) ülke alanin update bölümüne gidilmeden degistirilmesi gerekir")
    @Test(groups = {"Smoke", "No role", "Failed"})
    public void TC_19_03(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        sa.assertTrue(homePage.flagIcon.isSelected());
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Billing Adres alaninin default olarak bos geldigi gorulur. ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_04(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        homePage.billingAddressNoAdressFound.click();
        sa.assertTrue(homePage.billingAddressNoAdressFound.getText().contains("No Address Found"));
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Billing Adres alaninina adres ekli ise eklenen adres görüntülenebilmelidir")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_05(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        homePage.billingAddressAddButton.click();
        homePage.titleButton.click();
        homePage.titleButton.sendKeys(ConfigReader.getProperty("firmName"));
        Actions action = new Actions(Driver.getDriver(browser));
        action
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("country"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("city"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("state"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("zipcode"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("streetAddress"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        sa.assertFalse(homePage.billingAddressAdded.getText().isEmpty());
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Billing Adres alanininda (Zorunlu alan), \"+ Add\" secenegi ile Billing Adres update edilebilmelidir")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_06(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        homePage.billingAddressAddButton.click();
        homePage.titleButton.click();
        homePage.titleButton.sendKeys(ConfigReader.getProperty("firmName"));
        Actions action = new Actions(Driver.getDriver(browser));
        action
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("country"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("city"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("state"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("zipcode"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("streetAddress"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        homePage.billingAddressAddButton.click();
        homePage.titleButton.click();
        homePage.titleButton.sendKeys(ConfigReader.getProperty("firmName"));
        action
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("country"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("city"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("state"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("zipcode"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("streetAddress"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        sa.assertFalse(homePage.billingAddressAdded.getText().isEmpty());
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Shipping Adres alani (Zorunlu alan), default olarak bos gelmelidir. ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_07(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        homePage.shippingAddressNoAdressFound.click();
        sa.assertTrue(homePage.billingAddressNoAdressFound.getText().contains("No Address Found"));
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Shipping Adres alanina (Zorunlu alan),  adres ekli ise eklenen adres görüntülenebilmelidir")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_08(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        homePage.shippingAddressAddButton.click();
        homePage.titleButton.click();
        homePage.titleButton.sendKeys(ConfigReader.getProperty("firmName"));
        Actions action = new Actions(Driver.getDriver(browser));
        action
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("country"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("city"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("state"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("zipcode"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("streetAddress"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        sa.assertFalse(homePage.shippingAddressAdded.getText().isEmpty());
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Shipping Adres alanina (Zorunlu alan),  adres ekli ise eklenen adres görüntülenebilmelidir")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_09(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        sa.assertTrue(homePage.telefonNumberBox.getText().isEmpty());
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasinda, sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Delivery Schedule alaninda (Zorunlu alan), uygun zaman araliklari kullaniciya sunulmalidir.")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_10(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        sa.assertTrue(homePage.expressDelivery.getText().contains("90 min"));
        sa.assertTrue(homePage.morning.getText().contains("8.00 AM"));
        sa.assertTrue(homePage.noon.getText().contains("11.00 AM"));
        sa.assertTrue(homePage.afternoon.getText().contains("2.00 PM"));
        sa.assertTrue(homePage.evening.getText().contains("5.00 PM"));
        sa.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasinda, Delivery Schedule alaninda (Zorunlu alan), uygun zaman araliklari kullaniciya sunulmalidir. Kullanici bunlar arasinda secim yapmalidir.")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_11(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        sa.assertTrue(homePage.morning.isEnabled());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability kontrol edilmeden önce, kullanici sepetteki ürünlerini görüntüleyebilmeli")
    @Parameters("browser")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_12(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        sa.assertTrue(homePage.appleCheck.getText().contains("Apples"));
        sa.assertAll();

    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability kontrol edilmeden önce,  Ürün Fiyatlari Toplamini ( Sub Total) görüntüleyebilmeli")
    @Parameters("browser")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_13(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        sa.assertTrue(homePage.subTotalPrice.getText().contains("1.60"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability kontrol edilmeden önce,  Ürün Fiyatlari Toplamini ( Sub Total) görüntüleyebilmeli")
    @Parameters("browser")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_14(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        sa.assertTrue(homePage.taxPrice.getText().contains("0"));
        ReusableMethods.takeScreenshot("Bug_19_14_");
        sa.assertAll();

    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability kontrol edilmeden önce,   Kargo fiyati (Estimated Shipping) görüntülenmeli")
    @Parameters("browser")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_15(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        sa.assertTrue(homePage.shippingPrice.getText().contains("0"));
        ReusableMethods.takeScreenshot("Bug_19_15_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability secildikten sonra,   sepetteki ürünler görüntülenmeli")
    @Parameters("browser")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_16(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        sa.assertTrue(homePage.appleCheck.getText().contains("Apples"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability secildikten sonra,    Ürün Fiyatlari Toplamini görüntülenebilmeli")
    @Parameters("browser")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_17(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        sa.assertTrue(homePage.subTotalPrice.getText().contains("1.60"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability secildikten sonra,    Vergi fiyati görüntülenebilmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_18(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        sa.assertTrue(homePage.taxPriceAfterCheckAvaibility.getText().contains("0"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability secildikten sonra, Kargo fiyati (Shipping)  görüntülenebilmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_19(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        sa.assertTrue(homePage.shippingPriceAfterCheckAvaibility.getText().contains("0"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability secildikten sonra,Kupon kodu girme alani (\"Do you have any coupons?\") görüntülenebilmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_20(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.doYouHaveCouponButton.click();
        sa.assertTrue(homePage.couponEntryArea.isDisplayed());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability secildikten sonra,    Toplam fiyat (Total) görüntülenebilmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_21(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        sa.assertTrue(homePage.totalPrice.getText().contains("1.60"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability secildikten sonra,    Cüzdan puanlari  (Wallet points) görüntülenebilmeli")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_22(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        sa.assertTrue(homePage.walletPoints.isDisplayed());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability secildikten sonra,    Cüzdan para birimi (Wallet currency) görüntülenebilmeli ($0.00)")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_23(@Optional("chrome")String browser) throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        sa.assertTrue(homePage.walletCurrency.getText().contains("0.00"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability secildikten sonra, Cüzdan secenegi (\"Do you want to use wallet?\") isaretlenebilmelidir.")
    @Test(groups = {"Smoke", "Customer"})

    public void TC_19_24(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        sa.assertTrue(homePage.doYouWantToUseWallet.isSelected());
        ReusableMethods.takeScreenshot("Bug_19_24_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability secildikten sonra, Ödeme methodu secilebilmelidir. (Stripe, PayPal, Cash On Delivery)")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_25(@Optional("chrome")String browser) throws InterruptedException{
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        sa.assertTrue(homePage.cashOnDeliveryText.getText().contains("Your Goods"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Checkout sayfasinda,Your Order (Siparis bilgi ekrani) alaninda , Check Availability secildikten sonra,    \"Place Order\" secenegi ile siparis verilebilmelidir.")
    @Test(groups = {"Smoke", "Customer"})
    public void TC_19_26(@Optional("chrome")String browser) throws InterruptedException{
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.orderReceived.isDisplayed());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,Order Statusu görüntülenebilmeli ((Order Pending / Order Processing / Order At Local Facility/ Order  Out For Delivery))")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_01(@Optional("chrome")String browser) throws InterruptedException{
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.orderReceived.isDisplayed());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Payment Status görüntülenebilmelidir. (Payment Success / Payment  Failed)")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_02(@Optional("chrome")String browser) throws InterruptedException{
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(false);
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Order Number ile siparis numarasi görüntülenebilmelidir")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_03(@Optional("chrome")String browser) throws InterruptedException{
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.orderNumber.isDisplayed());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Date alaninda siparis tarihi görüntülenebilmelidir")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_04(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.orderDate.getText().equals("May 06, 2024"));
        ReusableMethods.takeScreenshot("Bug_20_04_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Total alaninda, siparis toplam ücreti görüntülenebilmelidir.")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_05(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.totalPriceOrderPage.getText().contains("1.60"));
        ReusableMethods.takeScreenshot("Bug_20_05_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Payment Method alaninda siparis methodu görüntülenebilmelidir")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_06(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.paymentMethod.isDisplayed());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Total Amount bölümünde, Ürün Fiyatlari Toplami görüntülenebilmeli")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_07(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.subTotalAmount.getText().contains("1.60"));
        ReusableMethods.takeScreenshot("Bug_20_07_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Total Amount bölümünde, Shipping Charge: Kargo fiyatini görüntülenebilmeli.")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_08(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.shippingCharge.isDisplayed());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Total Amount bölümünde, Tax: Vergi fiyatini görüntülenebilmeli")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_09(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.taxCharge.getText().contains("3.00"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Total Amount bölümünde, Discount: Indirim fiyati görüntülenebilmeli")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_10(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.discountCharge.isDisplayed());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Total Amount bölümünde, Total: Toplam fiyat görüntülenebilmeli")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_11(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.totalAmount.getText().contains("1.60"));
        ReusableMethods.takeScreenshot("Bug_20_11_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Order Details bölümünde, Name: Müsteri ismi yer almalidir")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_12(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(false);
        ReusableMethods.takeScreenshot("Bug_20_12_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Total Item: Kac ürün siparis edildiyse sayisi yer almalidir.")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_13(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.spinachAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.totalItem.getText().contains("2"));
        ReusableMethods.takeScreenshot("Bug_20_13_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Delivery Time: Ürünlerin varacagi tarih yer almalidir.")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_14(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.spinachAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.deliveryTime.getText().contains("2024"));
        ReusableMethods.takeScreenshot("Bug_20_14_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Shipping Adress: Ürünlerin kargolanacagi adres yer almalidir.")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_15(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.spinachAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.shippingAddress.getText().contains("United States"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Order Details bölümünde,Billing Adress: Faturanin kargolanacagi adres yer almalidir")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_16(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.spinachAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.billingAddress.getText().contains("United"));
        ReusableMethods.takeScreenshot("Bug_20_16_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Ürün detaylari bölümünde,Item: Ürün image, ürün miktari, ürün fiyati yer almalidir")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_17(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.spinachAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(homePage.itemName.getText().contains("Apples"));
        ReusableMethods.takeScreenshot("Bug_20_17_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  Ürün detaylari bölümünde,Write a review/ Update review: Secenekleri ile ürünler icin yorum yapilabilmeli ve update edilebilmeli")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_18(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.spinachAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        homePage.writeAReview.click();
        homePage.textAreaComment.sendKeys("Deneme");
        Actions action = new Actions(Driver.getDriver(browser));
        action
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        sa.assertTrue(homePage.writeAReview.getText().contains("Deneme"));
        ReusableMethods.takeScreenshot("Bug_20_18_");
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Order Status ekraninda,  ÜOrder Status ekraninda, Tracking detaylari görüntülenebilmelidir")
    @Test(groups = {"Smoke", "Customer"})
    @Parameters("browser")
    public void TC_20_19(@Optional("chrome")String browser) throws InterruptedException, IOException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage(browser);
        homePage.gohomePageUrl(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.spinachAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkAvailability.click();
        homePage.cashOnDeliveryYasin.click();
        homePage.placeOrder.click();
        sa.assertTrue(false);
        ReusableMethods.takeScreenshot("Bug_20_19_");
        sa.assertAll();
    }

}
