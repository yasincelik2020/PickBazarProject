package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.homePage;
import pages.contactPage;
import utilities.ConfigReader;
import utilities.Driver;

public class contactPageTest {
    @Description("Contact sekmesine erisim saglanmalidir")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_01() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.contactButon.click();
        String currentUrl = Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(currentUrl.contains("contact"));

        Driver.closeDriver();
        softAssert.assertAll();
    }
    @Description("Contact sekmesindeki form doldurulabilmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_02() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(contactPage.nameButton, "Nuray", Keys.TAB)
                .sendKeys("nry@gmail.com", Keys.TAB)
                .sendKeys("Sikayet", Keys.TAB)
                .sendKeys("Hatali Kod", Keys.TAB)
                .click(contactPage.submitButton).perform();
        SoftAssert softAssert = new SoftAssert();
       // softAssert.assertTrue();

        Driver.closeDriver();
        softAssert.assertAll();
    }
    @Description("Contact sekmesindeki AdresBilgileri görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_04() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
      softAssert.assertTrue(contactPage.adresBilgileri.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }@Description("Contact sekmesindeki PhoneBilgileri görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_05() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
      softAssert.assertTrue(contactPage.phoneBilgileri.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }@Description("Contact sekmesindeki webseiteBilgileri görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_06() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
      softAssert.assertTrue(contactPage.webseiteBilgileri.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }@Description("Contact sekmesindeki Visit This Site butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_07() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
      softAssert.assertTrue(contactPage.visitButton.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }@Description("Contact sekmesindeki Facebook butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_08() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
      softAssert.assertTrue(contactPage.facebookButton.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }@Description("Contact sekmesindeki Twitter butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_09() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
      softAssert.assertTrue(contactPage.twitterButton.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }@Description("Contact sekmesindeki instagram butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_10() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
      softAssert.assertTrue(contactPage.instagramButton.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }
}
