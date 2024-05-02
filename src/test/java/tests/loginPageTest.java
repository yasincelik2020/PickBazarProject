package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.homePage;
import pages.loginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class loginPageTest {
    @Description("Login sekmesine erisim saglanmalidir")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Smoke", "No role"})

    public void TC_06_01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        loginPage loginPage = new loginPage();
        loginPage.loginMethod();
    }
}