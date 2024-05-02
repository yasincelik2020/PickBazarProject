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
    public void TC_05_01() throws InterruptedException {
        offersPage.offersGiris();
        SoftAssert softAssert = new SoftAssert();
        for (int i = 1; i < 11; i++) {
            if (i == 2||i==5||i==8){
                continue;
            }
            WebElement offersCpoiedKupons = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'w-11/12')])[" + i + "]"));
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
    @Test(groups = {"Regression", "No role"})
    public void TC_05_11() throws InterruptedException {

        offersPage offersPage=new offersPage();
        offersPage.sepetUrunEkleme();

        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(Driver.getDriver());
        for (int i = 1; i < 10; i++) {
            if (i == 2||i==5||i==8){
                continue;
            }offersPage.offersGiris();
            WebElement offersCopiedKupons = Driver.getDriver().findElement(By.xpath("(//div[starts-with(@class,'w-11/12')])[" + i + "]"));
            String kuponAdi = offersCopiedKupons.getText().substring(0,3);
            String kaynakKod = Driver.getDriver().getPageSource();
            System.out.println("********"+kaynakKod);
            System.out.println("+++++++"+kuponAdi);
            offersCopiedKupons.click();

            offersPage.kuponKullanma();

            Assert.assertTrue(kaynakKod.contains(kuponAdi));

        }
        Driver.closeDriver();
        softAssert.assertAll();
    }
}
















