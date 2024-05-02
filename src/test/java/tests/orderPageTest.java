package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JavaScriptExecutorUtils;
import utilities.ReusableMethods;

import static utilities.Driver.driver;


public class orderPageTest {
    @AfterMethod
    public void afterMethod() {
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfada kücük ekranda sepet bilgisi gelmeli ")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_01() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
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
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        Thread.sleep(2000);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), homePage.spinachAddButton);
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
        homePage.chartAddFunctions();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), homePage.spinachAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), homePage.applesAddButtonMinusSign);
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
        homePage.chartAddFunctions();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), homePage.chartButtonAtrightPrice);
        sa.assertTrue(homePage.checkoutButtonArea.isDisplayed());
        sa.assertAll();


    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfadaki kücük sepet bilgisi ekraninin tiklanarak daha büyük bir görüntüde sepet ekrani acildiginda, en altta \"Checkout\" secenegi butonunun geldigi gorulmesi")
    @Test(groups = {"Smoke", "No role"})
    public void TC_18_05() {
        SoftAssert sa = new SoftAssert();
        homePage homePage = new homePage();
        homePage.chartAddFunctions();
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(), homePage.chartButtonAtrightPrice);
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
        homePage.chartAddFunctions();
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
        homePage.chartAddFunctions();
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
        homePage.chartAddFunctions();
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
        homePage.chartAddFunctions();
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
        homePage.chartAddFunctions();
        homePage.groceryDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        homePage.dailyNeedsChartIkon.click();
        homePage.checkoutButton.click();
        homePage.checkoutAsGuestButton.click();
        sa.assertTrue(homePage.telefonNumberBox.getText().isEmpty());
        sa.assertAll();
    }
}
