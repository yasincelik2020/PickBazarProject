package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.offersPage;
import utilities.Driver;


public class offersPageTest {
    @DataProvider
    public static Object[][] dataCopied() {
        return new Object[][]{{"$2 OFF"},
                {"($8 OFF"},
                {"$12 OFF"},
                {"$15 OFF"},
                {"$18 OFF"},
                {"$20 OFF"},
                {"$10 OFF"},
                {"$6 OFF"},
                {"$5 OFF"},
                {"$4 OFF"},};
    }

    @Description("Kayitsiz kullanici offers bolumunde  20$ indirim kuponunu \"Copy\" secenegi ile kopyalayabilmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "dataCopied", groups = {"Regression", "No role"})
    public void TC_05_01(String copiedKupon) throws InterruptedException {
        offersPage.offersGiris();
        SoftAssert softAssert = new SoftAssert();
        WebElement offersCpoiedLocater = Driver.getDriver().findElement(By.xpath("//div[starts-with(@class,'w-11/12')]"));
//        for (WebElement offersCpoiedLocaterList : offersCpoiedLocater) {
//
//        }
        offersCpoiedLocater.click();
        Thread.sleep(3000);
        System.out.println("text : "+offersCpoiedLocater.getText());
        softAssert.assertTrue(offersCpoiedLocater.getText().contains("Copied!"));
        Driver.closeDriver();
    }

    @Description("Kayitsiz kullanici offers bolumunde  2$ indirim kuponunu \"Copy\" secenegi ile kopyalayabilmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})
    public void TC_05_02() {
        offersPage.offersGiris();
        offersPage offersPage = new offersPage();
        offersPage.copy2$.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(offersPage.copied2$.getText().contains("Copied!"));
        Driver.closeDriver();
    }

    @Description("Kayitsiz kullanici offers bolumunde  8$ indirim kuponunu \"Copy\" secenegi ile kopyalayabilmelidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_05_03() {


    }

    @Description("Kayitsiz kullanici offers bolumunde  12$ indirim kuponunu \"Copy\" secenegi ile kopyalayabilmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(enabled = false, groups = {"Regression", "No role"})
    public void TC_05_04() {
        offersPage.offersGiris();
        offersPage offersPage = new offersPage();
        offersPage.copy12$.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(offersPage.copied12$.getText().contains("Copied!"));
        Driver.closeDriver();

    }

    @Description("Kayitsiz kullanici offers bolumunde  18$ indirim kuponunu \"Copy\" secenegi ile kopyalayabilmelidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_05_05() {

    }

    @Description("Kayitsiz kullanici offers bolumunde  15$ indirim kuponunu \"Copy\" secenegi ile kopyalayabilmelidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_05_06() {


    }

    @Description("Kayitsiz kullanici offers bolumunde  10$ indirim kuponunu \"Copy\" secenegi ile kopyalayabilmelidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_05_07() {


    }

    @Description("Kayitsiz kullanici offers bolumunde  5$ indirim kuponunu \"Copy\" secenegi ile kopyalayabilmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})
    public void TC_05_08() {
        offersPage.offersGiris();
        offersPage offersPage = new offersPage();
        offersPage.copy5$.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(offersPage.copied5$.getText().contains("Copied!"));
        Driver.closeDriver();

    }

    @Description("Kayitsiz kullanici offers bolumunde  6$ indirim kuponunu \"Copy\" secenegi ile kopyalayabilmelidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_05_09() {


    }

    @Description("Kayitsiz kullanici offers bolumunde  4$ indirim kuponunu \"Copy\" secenegi ile kopyalayabilmelidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_05_10() {


    }
}


