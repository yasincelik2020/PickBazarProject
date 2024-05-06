package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.homePage;
import pages.contactPage;
import utilities.ConfigReader;
import utilities.Driver;

public class contactPageTest {

    @BeforeMethod(groups = {"Regression", "No role"})
    public void beforeMethod() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
    }
    @AfterMethod(groups = {"Regression", "No role"})
    public void afterMethod() {
        Driver.closeDriver();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }

    @Description("Contact sekmesine erisim saglanmalidir")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_01() throws InterruptedException {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.contactButon.click();
        Thread.sleep(2000);
        String currentUrl = Driver.getDriver("browser").getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(currentUrl.contains("contact"));

    }

    @Description("Contact sekmesindeki form doldurulabilmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_02() {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();
        contactPage.contactFormMethod();

        Actions actions = new Actions(Driver.getDriver("browser"));
        actions.sendKeys(contactPage.nameButton, "Nuray", Keys.TAB)
                .sendKeys("nry@gmail.com", Keys.TAB)
                .sendKeys("Sikayet", Keys.TAB)
                .sendKeys("Hatali Kod", Keys.TAB)
                .click(contactPage.submitButton).perform();
        SoftAssert softAssert = new SoftAssert();
         softAssert.assertTrue(contactPage.yazi.getText().contains("Thank"));


    }

    @Description("Contact sekmesindeki AdresBilgileri görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_04() {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.adresBilgileri.isDisplayed());

    }

    @Description("Contact sekmesindeki PhoneBilgileri görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_05() {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.phoneBilgileri.isDisplayed());

    }

    @Description("Contact sekmesindeki webseiteBilgileri görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_06() {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.webseiteBilgileri.isDisplayed());

    }

    @Description("Contact sekmesindeki Visit This Site butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_07() {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.visitButton.isDisplayed());

    }

    @Description("Contact sekmesindeki Facebook butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_08() {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.facebookButton.isDisplayed());

    }

    @Description("Contact sekmesindeki Twitter butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_09() {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.twitterButton.isDisplayed());

    }

    @Description("Contact sekmesindeki instagram butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_10() {
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        contactPage contactPage = new contactPage();
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.instagramButton.isDisplayed());

    }
}
