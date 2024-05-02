package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.faqPage;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;

public class faqPageTest {


    @DataProvider
    public static Object[][] dataSorular() {
        return new Object[][]{{"How to contact with Customer Service?"},
                {"App installation failed, how to update system information?"},
                {"Website response taking time, how to improve?"},
                {"How do I create a account?"},};
    }

    @Description("FAQ sekmesine erisim saglanmalidir")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_01() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        faqPage faqPage = new faqPage();
        homePage.faqButon.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqText.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Description("Sitede FAQ sekmesinde hazir sorulara(sikca sorulan sorulardan secilmis) erisim saglanmalidir")
    @Severity(SeverityLevel.NORMAL)
    @Test(dataProvider = "dataSorular", groups = {"Regression", "No role"})

    public void TC_06_01(String soru) {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.faqButon.click();

        WebElement sorularLocater = Driver.getDriver().
                findElement(By.xpath("//h2[.='" + soru + "']"));
        System.out.println(sorularLocater.getText());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(sorularLocater.getText(), soru);

        Driver.closeDriver();
        softAssert.assertAll();

    }

    @Description("Sıkca sorulan sorularin yaninda + sembolune basildiginda, sembol -'ye donusmeli ")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_03() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage();
        homePage homePage = new homePage();
        SoftAssert softAssert = new SoftAssert();
        homePage.faqButon.click();
        WebElement faqSorular;

        for (int i = 1; i < 5; i++) {
            faqSorular = Driver.getDriver().findElement(By.xpath("(//*[@class='flex-shrink-0 stroke-2'])[" + i + "]"));
            softAssert.assertTrue(faqSorular.isDisplayed());
            faqSorular.click();
            Thread.sleep(2000);

        }
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Description("How to contact with Customer Service? sorusu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_02() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage();
        homePage homePage = new homePage();
//        Actions actions = new Actions(Driver.getDriver());
//        actions.click(homePage.faqButon)
//                .click(faqPage.faqilkSoruIsareti).perform();
        homePage.faqButon.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqilkSoru.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Description("How to contact with Customer Service? sorusunun cevabi acilmalidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_04() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage();
        homePage homePage = new homePage();
//        Actions actions = new Actions(Driver.getDriver());
//        actions.click(homePage.faqButon)
//                .click(faqPage.faqilkSoruIsareti).perform();
        homePage.faqButon.click();
        faqPage.faqilkSoruIsareti.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqilkSoruCevap.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Description("App installation failed, how to update system information? sorusu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_05() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage();
        homePage homePage = new homePage();
        homePage.faqButon.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqIkinciSoru.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Description("App installation failed, how to update system information? sorusunun cevabi acilmalidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_07() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage();
        homePage homePage = new homePage();
        homePage.faqButon.click();
        faqPage.faqIkinciSoruIsareti.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqIkinciSoruCevap.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Description("Website response taking time, how to improve? sorusu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_08() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage();
        homePage homePage = new homePage();
        homePage.faqButon.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqUcuncuSoru.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Description("Website response taking time, how to improve? sorusunun cevabi acilmalidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_10() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage();
        homePage homePage = new homePage();
        homePage.faqButon.click();
        faqPage.faqUcuncuSoruIsareti.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqUcuncuSoruCevap.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();

    }

    @Description("How do I create a account? sorusu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_11() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage();
        homePage homePage = new homePage();
        homePage.faqButon.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqDorduncuSoru.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Description("How do I create a account? sorusunun cevabi acilmalidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_13() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage();
        homePage homePage = new homePage();
        homePage.faqButon.click();
        faqPage.faqDorduncuSoruIsareti.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqDorduncuSoruCevap.isDisplayed());

        Driver.closeDriver();
        softAssert.assertAll();
    }
}