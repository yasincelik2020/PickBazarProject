package tests.profile;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.dropDown.dailyneedsPage;
import pages.loginPage;
import utilities.Driver;

public class profilPageTest {

    @Severity(SeverityLevel.NORMAL)
    @Description("Total kac puana sahip oldugu görüntülenmeli")
    @Test
    public void TC_22_01() throws InterruptedException {
        loginPage loginPage = new loginPage();
        loginPage.loginMethod();
        loginPage.profilFotoSekmesi.click();
        //Driver.closeDriver();
    }
}
