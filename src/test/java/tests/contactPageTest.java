package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import pages.homePage;
import pages.contactPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class contactPageTest {
    @Parameters("browser")
    @BeforeMethod(groups = {"Regression", "No role"})
    public void beforeMethod(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
    }
    @AfterMethod(groups = {"Regression", "No role"})
    public void afterMethod() {
        Driver.closeDriver();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }

    @Description("Contact sekmesine erisim saglanmalidir")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})

    public void TC_07_01(@Optional("chrome")String browser) throws InterruptedException {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        homePage.contactButon.click();
        Thread.sleep(2000);
        String currentUrl = Driver.getDriver(browser).getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(currentUrl.contains("contact"));

    }

    @Description("Contact sekmesindeki form doldurulabilmelidir.")
    @Parameters("browser")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_02(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        contactPage contactPage = new contactPage(browser);
        homePage.contactButon.click();
        contactPage.contactFormMethod(browser);

        Actions actions = new Actions(Driver.getDriver(browser));
        actions.sendKeys(contactPage.nameButton, "Nuray", Keys.TAB)
                .sendKeys("nry@gmail.com", Keys.TAB)
                .sendKeys("Sikayet", Keys.TAB)
                .sendKeys("Hatali Kod", Keys.TAB)
                .click(contactPage.submitButton).perform();
        SoftAssert softAssert = new SoftAssert();
         softAssert.assertTrue(contactPage.yazi.getText().contains("Thank"));


    }

    @Description("Contact sekmesindeki AdresBilgileri görülmelidir.")
    @Parameters("browser")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_04(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        contactPage contactPage = new contactPage(browser);
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.adresBilgileri.isDisplayed());

    }

    @Description("Contact sekmesindeki PhoneBilgileri görülmelidir.")
    @Parameters("browser")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_05(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        contactPage contactPage = new contactPage(browser);
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.phoneBilgileri.isDisplayed());

    }

    @Description("Contact sekmesindeki Webseite Bilgileri görülmelidir.")
    @Parameters("browser")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_07_06(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        contactPage contactPage = new contactPage(browser);
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.webseiteBilgileri.isDisplayed());

    }

    @Description("Contact sekmesindeki Visit This Site butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})

    public void TC_07_07(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        contactPage contactPage = new contactPage(browser);
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.visitButton.isDisplayed());

    }

    @Description("Contact sekmesindeki Facebook butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})

    public void TC_07_08(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        contactPage contactPage = new contactPage(browser);
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.facebookButton.isDisplayed());

    }

    @Description("Contact sekmesindeki Twitter butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})

    public void TC_07_09(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        contactPage contactPage = new contactPage(browser);
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.twitterButton.isDisplayed());

    }

    @Description("Contact sekmesindeki instagram butonu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})

    public void TC_07_10(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        contactPage contactPage = new contactPage(browser);
        homePage.contactButon.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.instagramButton.isDisplayed());

    }
    @Description("Contact sekmesindeki form, isim yazilmadan gönderilmemelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role", "Negatif Test"})

    public void TC_07_11(@Optional("chrome")String browser) throws IOException {
        homePage homePage = new homePage(browser);
        contactPage contactPage = new contactPage(browser);
        homePage.contactButon.click();
        Actions actions = new Actions(Driver.getDriver(browser));
        actions.sendKeys(contactPage.nameButton, Keys.TAB)
                .sendKeys(ConfigReader.getProperty("eposta"), Keys.TAB)
                .sendKeys("Sikayet", Keys.TAB)
                .sendKeys("Hatali Kod", Keys.TAB)
                .click(contactPage.submitButton).perform();

        ReusableMethods.takeScreenshot("Uyari Yazisi ");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.nameUyariYazisi.isDisplayed());

    }
    @Description("Contact sekmesindeki form, isim yazilmadan gönderilmemelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role", "Negatif Test"})

    public void TC_07_11(@Optional("chrome")String browser) throws IOException {
        homePage homePage = new homePage(browser);
        contactPage contactPage = new contactPage(browser);
        homePage.contactButon.click();
        Actions actions = new Actions(Driver.getDriver(browser));
        actions.sendKeys(contactPage.nameButton, Keys.TAB)
                .sendKeys(ConfigReader.getProperty("eposta"), Keys.TAB)
                .sendKeys("Sikayet", Keys.TAB)
                .sendKeys("Hatali Kod", Keys.TAB)
                .click(contactPage.submitButton).perform();

        ReusableMethods.takeScreenshot("Uyari Yazisi ");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(contactPage.nameUyariYazisi.isDisplayed());

    }
}
