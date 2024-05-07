package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.homePage;
import pages.loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class loginPageTest {
    @Parameters("browser")

    @BeforeMethod(groups = {"Smoke", "No role", "Costumer"})
    public void beforeMethod(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));

    }
    @AfterMethod(groups = {"Smoke", "No role", "Costumer"})
    public void afterMethod() {
        Driver.closeDriver();


    }
    @Description("Kullanici register olabilmelidir")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Smoke", "No role"})

    public void TC_16_01(@Optional("chrome")String browser) throws Exception {
        loginPage loginPage = new loginPage(browser);
        loginPage.registerMethod();

        SoftAssert softassert= new SoftAssert();
        softassert.assertTrue(loginPage.allreadyHaveYazisi.isDisplayed());
        softassert.assertAll();

    }
    @Description("Kullanici password görebilmelidir")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Smoke", "No role"})

    public void TC_16_02(@Optional("chrome")String browser) throws Exception {
        loginPage loginPage = new loginPage(browser);
        loginPage.joinButton.click();
        loginPage.registerYazisi.click();
        loginPage.nameRegister.sendKeys(ConfigReader.getProperty("username"));
        loginPage.eMail.sendKeys(ConfigReader.getProperty("eposta"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.passwordVisible.click();

        SoftAssert softassert= new SoftAssert();
        softassert.assertTrue(loginPage.password.isDisplayed());
        softassert.assertAll();

    }
    @Description("Müsteri login olabilmelidir")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Smoke", "Costumer"})

    public void TC_17_01(@Optional("chrome")String browser) throws Exception {
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);

        SoftAssert softassert= new SoftAssert();
        softassert.assertTrue(loginPage.userAvatar.isDisplayed());
        softassert.assertAll();
    }
    @Description("Müsteri password görebilmelidir")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Smoke", "Costumer"})

    public void TC_17_02(@Optional("chrome")String browser) throws Exception {
        loginPage loginPage = new loginPage(browser);
        loginPage.joinButton.click();
        loginPage.eMail.sendKeys(ConfigReader.getProperty("eposta"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.passwordVisible.click();

        SoftAssert softassert= new SoftAssert();
        softassert.assertTrue(loginPage.password.isDisplayed());
        softassert.assertAll();
    }

    @Description("Müsteri password degistirebilmelidir")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Smoke", "Costumer"})

    public void TC_17_05(@Optional("chrome")String browser) throws Exception {
        loginPage loginPage = new loginPage(browser);
        loginPage.passwordYenilemeMethod();

        SoftAssert softassert= new SoftAssert();
        softassert.assertTrue(loginPage.passwordChangeSuccessful.isDisplayed());
        softassert.assertAll();
    }
    @Description("Müsteri google accountu ile login olunabilmeli")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Smoke", "Costumer"})

    public void TC_17_07(@Optional("chrome")String browser) throws Exception {
        loginPage loginPage = new loginPage(browser);
        loginPage.joinButton.click();
        loginPage.loginWithGoogleButon.click();

        SoftAssert softassert= new SoftAssert();
        softassert.assertFalse(loginPage.errorYazisi.isDisplayed());
        ReusableMethods.takeScreenshot("Login Olunmuyor  ");
        ReusableMethods.waitFor(1);
        softassert.assertAll();
    }
    @Description("Müsteri cep telefonu numarasi ile login olunabilmeli")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Smoke", "Costumer"})

    public void TC_17_08(@Optional("chrome")String browser) throws Exception {
        loginPage loginPage = new loginPage(browser);
       loginPage.loginWithMobileMethod();

        SoftAssert softassert= new SoftAssert();
        softassert.assertTrue(loginPage.loginWithMobileYazisi.isDisplayed());

    }
    @Description("Müsteri \"Register\" ekraninda(Already have an account?) \"Login\" butonu ile login ekranina yönlenmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Smoke", "Costumer"})

    public void TC_17_09(@Optional("chrome")String browser) throws Exception {
        Thread.sleep(3000);
        loginPage loginPage = new loginPage(browser);
        loginPage.joinButton.click();
        loginPage.registerButton.click();
        loginPage.loginButton.click();

        SoftAssert softassert= new SoftAssert();
        softassert.assertTrue(loginPage.loginYazisi.isDisplayed());

    }
}