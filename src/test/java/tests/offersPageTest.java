package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.homePage;
import pages.offersPage;
import pages.profile.profilPage;
import utilities.Driver;

import java.util.Collections;


public class offersPageTest {

    @Description("Kayitsiz kullanici offers bolumunde indirim kuponunlarini \"Copy\" secenegi ile kopyalayabilmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})
    public void TC_05_01(@Optional("chrome")String browser) throws InterruptedException {
        offersPage.offersGiris(browser);
        SoftAssert softAssert = new SoftAssert();
        for (int i = 1; i < 11; i++) {
            if (i == 2 || i == 5 || i == 8) {
                continue;
            }
            WebElement offersCpoiedKupons = Driver.getDriver(browser).findElement(By.xpath("(//div[starts-with(@class,'w-11/12')])[" + i + "]"));
            offersCpoiedKupons.click();
            Thread.sleep(3000);
            System.out.println("text : " + offersCpoiedKupons.getText());
            softAssert.assertTrue(offersCpoiedKupons.getText().contains("Copied!"));
        }
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Description("Kayitsiz kullanici offers bolumunde kopyaladigi indirim kuponunlarini  kullanabilmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role", "Failed"})
    public void TC_05_11(@Optional("chrome")String browser) throws InterruptedException {

        offersPage offersPage = new offersPage(browser);
        offersPage.sepetUrunEkleme(browser);

        SoftAssert softAssert = new SoftAssert();

                for (int i = 1; i < 11; i++) {
                    if (i == 2 || i == 5 || i == 8) {
                        continue;
                    }
                    offersPage.offersGiris(browser);
                    WebElement offersCopiedKupons = Driver.getDriver(browser).findElement(By.xpath("(//div[starts-with(@class,'w-11/12')])[" + i + "]"));
                    
                offersCopiedKupons.click();

                offersPage.kuponKullanma(browser);
                if (i == 1) {
                    softAssert.assertEquals(offersPage.discount.getText().substring(1), "2");

                } else if (i == 3) {
                    softAssert.assertEquals(offersPage.discount.getText().substring(1), "12");
                } else if (i == 4) {
                    softAssert.assertEquals(offersPage.discount.getText().substring(1), "15");
                } else if (i == 6) {
                    softAssert.assertEquals(offersPage.discount.getText().substring(1), "20");
                } else if (i == 7) {
                    softAssert.assertEquals(offersPage.discount.getText().substring(1), "10");
                } else if (i == 9) {
                    softAssert.assertEquals(offersPage.discount.getText().substring(1), "5");
                } else if (i == 10) {
                    softAssert.assertEquals(offersPage.discount.getText().substring(1), "4");
                }

            }
            Driver.closeDriver();
            softAssert.assertAll();
        }
    }
















