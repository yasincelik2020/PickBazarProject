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

import static utilities.Driver.driver;


public class orderPageTest {
//    @AfterMethod
//    public void afterMethod() {
//        Driver.closeDriver();
//    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfada kücük ekranda sepet bilgisi gelmeli ")
    @Test(groups ={ "Smoke","No role"})
    public void TC_18_01 () {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        SoftAssert sa = new SoftAssert();
        homePage homePage=new homePage();
        homePage.applesAddButton.click();
        sa.assertTrue(homePage.chartButtonAtrightItemCount.getText().contains("1"));
        sa.assertTrue(homePage.chartButtonAtrightPrice.getText().contains("1.60"));
        sa.assertAll();
        Driver.closeDriver();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfada kücük görüntüdeki sepet bilgilerinin ürün eklendiginde dogru bir sekilde güncellenmesi")
    @Test(groups ={ "Smoke","No role"})
    public void TC_18_02 () throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        SoftAssert sa = new SoftAssert();
        homePage homePage=new homePage();
        Thread.sleep(2000);
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) driver);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),homePage.applesAddButton);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),homePage.spinachAddButton);
        double total = homePage.valueEvuloation(homePage.applesPriceValue, homePage.spinachPriceValue);
        System.out.println(total);
        String strTotal = String.valueOf(total);
        sa.assertTrue(homePage.itemsNumber.getText().contains("2"));
        sa.assertTrue(homePage.chartButtonAtrightPrice.getText().contains(strTotal));
        sa.assertAll();
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfada kücük görüntüdeki sepet bilgilerinin ürün cikarildiginda dogru bir sekilde güncellenmesi")
    @Test(groups ={ "Smoke","No role"})
    public void TC_18_03 () {
        SoftAssert sa = new SoftAssert();
        homePage homePage=new homePage();
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) driver);
        homePage.chartAddFunctions();
        jsexecutor.executeScript("arguments[0].click();", homePage.applesAddButton);
        jsexecutor.executeScript("arguments[0].click();", homePage.spinachAddButton);
        jsexecutor.executeScript("arguments[0].click();", homePage.applesAddButtonMinusSign);
        sa.assertTrue(homePage.chartButtonAtrightItemCount.getText().contains("1"));
        sa.assertTrue(homePage.chartButtonAtrightPrice.getText().contains(homePage.spinachPriceValue.getText()));
        sa.assertAll();
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfadaki kücük sepet bilgisi ekraninin tiklanarak daha büyük bir görüntüde sepet ekrani acilmasi")
    @Test(groups ={ "Smoke","No role"})
    public void TC_18_04 () {
        SoftAssert sa = new SoftAssert();
        homePage homePage=new homePage();
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) driver);
        homePage.chartAddFunctions();
        jsexecutor.executeScript("arguments[0].click();", homePage.applesAddButton);
        jsexecutor.executeScript("arguments[0].click();", homePage.chartButtonAtrightPrice);
        sa.assertTrue(homePage.checkoutButtonArea.isDisplayed());
        sa.assertAll();
        Driver.closeDriver();

    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfadaki kücük sepet bilgisi ekraninin tiklanarak daha büyük bir görüntüde sepet ekrani acilmasi")
    @Test(groups ={ "Smoke","No role"})
    public void TC_18_05 () {
        SoftAssert sa = new SoftAssert();
        homePage homePage=new homePage();
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) driver);
        homePage.chartAddFunctions();
        jsexecutor.executeScript("arguments[0].click();", homePage.applesAddButton);
        jsexecutor.executeScript("arguments[0].click();", homePage.chartButtonAtrightPrice);
        sa.assertTrue(homePage.checkoutButton.isDisplayed());
        sa.assertAll();
        Driver.closeDriver();
    }
}
