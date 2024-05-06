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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.homePage;
import pages.loginPage;
import pages.orderPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JavaScriptExecutorUtils;
import utilities.ReusableMethods;

import java.time.Duration;


public class orderPageTest {
    @AfterMethod(groups = {"Smoke", "Regression"})
    public void afterMethod() {
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfada kücük ekranda sepet bilgisi gelmeli ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_01() {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.applesAddButton.click();
        sa.assertTrue(homePage.chartButtonAtrightItemCount.getText().contains("1"));
        sa.assertTrue(homePage.chartButtonAtrightPrice.getText().contains("1.60"));
        sa.assertAll();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfada kücük görüntüdeki sepet bilgilerinin ürün eklendiginde dogru bir sekilde güncellenmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_02() throws InterruptedException {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        Thread.sleep(2000);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.spinachAddButton);
        double total = homePage.valueEvuloation(homePage.applesPriceValue, homePage.spinachPriceValue);
        System.out.println(total);
        String strTotal = String.valueOf(total);
        sa.assertTrue(homePage.itemsNumber.getText().contains("2"));
        sa.assertTrue(homePage.chartButtonAtrightPrice.getText().contains(strTotal));
        sa.assertAll();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfada kücük görüntüdeki sepet bilgilerinin ürün cikarildiginda dogru bir sekilde güncellenmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_03() {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.spinachAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButtonMinusSign);
        sa.assertTrue(homePage.chartButtonAtrightItemCount.getText().contains("1"));
        sa.assertTrue(homePage.chartButtonAtrightPrice.getText().contains(homePage.spinachPriceValue.getText()));
        sa.assertAll();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfadaki kücük sepet bilgisi ekraninin tiklanarak daha büyük bir görüntüde sepet ekrani acilmasi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_04() {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.chartButtonAtrightPrice);
        sa.assertTrue(homePage.checkoutButtonArea.isEnabled());
        sa.assertTrue(homePage.checkoutButtonArea.isDisplayed());
        sa.assertAll();


    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfadaki kücük sepet bilgisi ekraninin tiklanarak daha büyük bir görüntüde sepet ekrani acildiginda, en altta \"Checkout\" secenegi butonunun geldigi gorulmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_05() {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.chartButtonAtrightPrice);
       
        ReusableMethods.waitForVisibility(homePage.checkoutButton, 3);
        sa.assertTrue(homePage.checkoutButton.isDisplayed());
        sa.assertAll();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Daily Needs ekraninda sepet ikonu gelmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_06() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        homePage.groceryDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        ReusableMethods.waitForVisibility(homePage.dailyNeedsChartIkon, 3);
        sa.assertTrue(homePage.dailyNeedsChartIkon.isDisplayed());
        sa.assertAll();

    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Daily Needs ekraninda sepet ikonu tiklandiginda, sepet ekraninin sagda acilabilmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_07() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        homePage.groceryDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        ReusableMethods.waitForVisibility(homePage.dailyNeedsChartIkon, 3);
        homePage.dailyNeedsChartIkon.click();
        ReusableMethods.waitForVisibility(homePage.checkoutButtonArea, 3);
        sa.assertTrue(homePage.checkoutButtonArea.isDisplayed());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Daily Needs ekraninda sepet ikonu tiklandiginda, sepet ekrani acildiginda, en altta \"Checkout\" secenegi butonunun geldiginin gorulmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_08() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        homePage.groceryDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        ReusableMethods.waitForVisibility(homePage.dailyNeedsChartIkon, 3);
        homePage.dailyNeedsChartIkon.click();
        ReusableMethods.waitForVisibility(homePage.checkoutButton, 3);
        sa.assertTrue(homePage.checkoutButton.isDisplayed());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Contact Number alaninin (Zorunlu alan) default olarak bos geldigi gorulur")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_01() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        homePage.groceryDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        homePage.dailyNeedsChartIkon.click();
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        sa.assertTrue(homePage.telefonNumberBox.getText().isEmpty());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Contact Number alanininda (Zorunlu alan) contact number ekli ise eklenen numara görüntülenebilmelidir")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_02() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        homePage.groceryDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        homePage.dailyNeedsChartIkon.click();
        homePage.checkoutButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver("browser"), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(homePage.eMailBox));
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"),homePage.eMailBox);
        homePage.eMailBox.sendKeys(ConfigReader.getProperty("eposta"));
        homePage.passswordBox.click();
        homePage.passswordBox.sendKeys(ConfigReader.getProperty("password"));
        homePage.loginButton.click();

        sa.assertTrue(homePage.telefonNumberBox.getText().isEmpty());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Contact Number alaninin (Zorunlu alan) ülke alanin update bölümüne gidilmeden degistirilmesi gerekir")
    @Test(groups = {"Smoke", "No role", "Failed"})
    public void TC_19_03() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        sa.assertTrue(homePage.flagIcon.isEnabled());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Billing Adres alaninin default olarak bos geldigi gorulur. ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_04() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        homePage.billingAddressNoAdressFound.click();
        sa.assertTrue(homePage.billingAddressNoAdressFound.getText().contains("No Address Found"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Billing Adres alaninina adres ekli ise eklenen adres görüntülenebilmelidir")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_05() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        homePage.billingAddressAddButton.click();
        homePage.titleButton.click();
        homePage.titleButton.sendKeys(ConfigReader.getProperty("firmName"));
        Actions action = new Actions(Driver.getDriver("browser"));
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
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Billing Adres alanininda (Zorunlu alan), \"+ Add\" secenegi ile Billing Adres update edilebilmelidir")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_06() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        homePage.billingAddressAddButton.click();
        homePage.titleButton.click();
        homePage.titleButton.sendKeys(ConfigReader.getProperty("firmName"));
        Actions action = new Actions(Driver.getDriver("browser"));
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
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Shipping Adres alani (Zorunlu alan), default olarak bos gelmelidir. ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_07() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        homePage.shippingAddressNoAdressFound.click();
        sa.assertTrue(homePage.billingAddressNoAdressFound.getText().contains("No Address Found"));
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Shipping Adres alanina (Zorunlu alan),  adres ekli ise eklenen adres görüntülenebilmelidir")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_08() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        homePage.shippingAddressAddButton.click();
        homePage.titleButton.click();
        homePage.titleButton.sendKeys(ConfigReader.getProperty("firmName"));
        Actions action = new Actions(Driver.getDriver("browser"));
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
    @Description("Checkout sayfasina sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Shipping Adres alanina (Zorunlu alan),  adres ekli ise eklenen adres görüntülenebilmelidir")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_09() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        sa.assertTrue(homePage.telefonNumberBox.getText().isEmpty());
        sa.assertAll();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Checkout sayfasinda, sepet ekranindaki \"Checkout\" butonundan ulasilmalidir. Delivery Schedule alaninda (Zorunlu alan), uygun zaman araliklari kullaniciya sunulmalidir.")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_10() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.chartButtonAtrightPrice);
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
    @Description("Checkout sayfasinda, Delivery Schedule alaninda (Zorunlu alan), uygun zaman araliklari kullaniciya sunulmalidir. Kullanici bunlar arasinda secim yapmalidir.")
    @Test(groups = {"Smoke", "No role"})
    public void TC_19_11() throws InterruptedException {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.gohomePageUrl();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver("browser"), homePage.chartButtonAtrightPrice);
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
//        homePage.contactNumberAddButton.click();
//        homePage.telefonNumberBox.sendKeys("telNumber");
//        homePage.contactNumberAddButton.click();
        homePage.shippingAddressAddButton.click();
        homePage.titleButton.click();
        homePage.titleButton.sendKeys(ConfigReader.getProperty("firmName"));
        Actions action = new Actions(Driver.getDriver("browser"));
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

        sa.assertAll();
    }

}
