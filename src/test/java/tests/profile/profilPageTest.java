package tests.profile;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pages.dropDown.dailyneedsPage;
import pages.loginPage;
import pages.profile.profilPage;
import utilities.Driver;

public class profilPageTest {


    @Severity(SeverityLevel.NORMAL)
    @Description("Total kac puana sahip oldugu görüntülenmeli")
    @Test(groups = {"Regression", "No role",}, threadPoolSize = 3)// burada 3 therad olusturulur ve 3 test ayni anda yürütülür
    public void TC_22_01() throws InterruptedException {
        loginPage loginPage = new loginPage();
        loginPage.loginMethod();
        profilPage profilPage = new profilPage();
        profilPage.profilFotoSekmesi.click();
        Thread.sleep(3000);
        profilPage.profileKategorisi.click();
        WebElement total = Driver.getDriver().findElement(By.xpath("//span[.='Total']"));
        Assert.assertTrue(total.isDisplayed());
        Driver.closeDriver();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Total kac puana sahip oldugu görüntülenmeli")
    @Test(groups = {"Regression", "No role"}, threadPoolSize = 3)
    public void TC_22_02() throws InterruptedException {
        loginPage loginPage = new loginPage();
        loginPage.loginMethod();
        profilPage profilPage = new profilPage();
        profilPage.profilFotoSekmesi.click();
        Thread.sleep(3000);
        profilPage.profileKategorisi.click();
        WebElement used = Driver.getDriver().findElement(By.xpath("//span[.='Used']"));
        Assert.assertTrue(used.isDisplayed());
        Driver.closeDriver();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Total kac puana sahip oldugu görüntülenmeli")
    @Test(groups = {"Regression", "No role",},threadPoolSize = 3)
    public void TC_22_03() throws InterruptedException {
        loginPage loginPage = new loginPage();
        loginPage.loginMethod();
        profilPage profilPage = new profilPage();
        profilPage.profilFotoSekmesi.click();
        Thread.sleep(3000);
        profilPage.profileKategorisi.click();
        WebElement available = Driver.getDriver().findElement(By.xpath("//span[.='Available']"));
        Assert.assertTrue(available.isDisplayed());
        Driver.closeDriver();
    }
}
