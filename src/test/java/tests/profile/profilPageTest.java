package tests.profile;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.loginPage;
import pages.profile.profilPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.NoSuchElementException;

public class profilPageTest {
    // Bu method driver in direkt profil bilgilerinin
    // oldugu sayfaya dependsOnMethods methodu icin hazirlandi.
    @Test()
    public void profilPage() throws InterruptedException {
        loginPage loginPage = new loginPage();
        loginPage.loginMethod();
        profilPage profilPage = new profilPage();
        profilPage.profilFotoSekmesi.click();
        Thread.sleep(3000);
        profilPage.profileKategorisi.click();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Total kac puana sahip oldugu görüntülenmeli")
    @Test(dependsOnMethods = "profilPage",priority = 1, groups = {"Regression", "Customer","Us22_1.grup"}, threadPoolSize = 3)
// burada 3 therad olusturulur ve 3 test ayni anda yürütülür
    public void TC_22_01() {
        profilPage profilPage = new profilPage();
        Assert.assertTrue(profilPage.total.isDisplayed());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Used kac puana sahip oldugu görüntülenmeli")
    @Test(dependsOnMethods = "profilPage",priority = 2, groups = {"Regression", "Customer","Us22_1.grup"}, threadPoolSize = 3)
    public void TC_22_02() {
        profilPage profilPage = new profilPage();
        Assert.assertTrue(profilPage.used.isDisplayed());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Available kac puana sahip oldugu görüntülenmeli")
    @Test(dependsOnMethods = "profilPage", priority = 3, groups = {"Regression", "Customer","Us22_1.grup"}, threadPoolSize = 3)
    public void TC_22_03() {
        profilPage profilPage = new profilPage();
        Assert.assertTrue(profilPage.available.isDisplayed());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Image alani görülür")
    @Test(dependsOnMethods = "profilPage", groups = {"Regression", "Customer","Us22_2.grup"}, threadPoolSize = 3)
    public void TC_22_05() {
        profilPage profilPage = new profilPage();
        Assert.assertTrue(profilPage.image.isDisplayed());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Bio alani görülür")
    @Test(dependsOnMethods = "profilPage", groups = {"Regression", "Customer","Us22_2.grup"}, threadPoolSize = 3)
    public void TC_22_06() {
        profilPage profilPage = new profilPage();
        Assert.assertTrue(profilPage.bio.isDisplayed());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Email alani görülür")
    @Test(dependsOnMethods = "profilPage", groups = {"Regression", "Customer","Us22_2.grup"}, threadPoolSize = 3)
    public void TC_22_07() throws IOException {
        ReusableMethods.takeScreenshot("Bug-TC_22_07---ProfildeEmailYOK");
        // Eğer email olmadigi icin kendimiz fail oluşturduk
        Assert.fail("Email tab is present, but it shouldn't be.");
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("ContactNumber alani görülür")
    @Test(dependsOnMethods = "profilPage", groups = {"Regression", "Customer","Us22_2.grup"}, threadPoolSize = 3)
    public void TC_22_08() {
        profilPage profilPage = new profilPage();
        Assert.assertTrue(profilPage.contactNumber.isDisplayed());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Addresses alani görülür")
    @Test(dependsOnMethods = "profilPage", groups = {"Regression", "Customer","Us22_2.grup"}, threadPoolSize = 3)
    public void TC_22_09() {
        profilPage profilPage = new profilPage();
        Assert.assertTrue(profilPage.addresses.isDisplayed());
        Driver.closeDriver();
    }
}

