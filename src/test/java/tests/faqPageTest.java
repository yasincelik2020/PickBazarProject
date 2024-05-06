package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.faqPage;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;

public class faqPageTest {
    @Parameters("browser")

    @BeforeMethod(groups = {"dataSorular","Regression", "No role"})
    public void beforeMethod(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
    }

    @AfterMethod(groups = {"dataSorular","Regression", "No role"})
    public void afterMethod() {
        Driver.closeDriver();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }

    @DataProvider
    public static Object[][] dataSorular() {
        return new Object[][]{{"How to contact with Customer Service?"},
                {"App installation failed, how to update system information?"},
                {"Website response taking time, how to improve?"},
                {"How do I create a account?"},};
    }

    @Description("FAQ sekmesine erisim saglanmalidir")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})

    public void TC_06_01(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        faqPage faqPage = new faqPage(browser);
        homePage.faqButon.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqText.isDisplayed());

    }

    @Description("Sitede FAQ sekmesinde hazir sorulara(sikca sorulan sorulardan secilmis) erisim saglanmalidir")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(dataProvider = "dataSorular", groups = {"Regression", "No role"})

    public void TC_06_01(@Optional("chrome")String browser,String soru) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        homePage.faqButon.click();

        WebElement sorularLocater = Driver.getDriver(browser).
                findElement(By.xpath("//h2[.='" + soru + "']"));
        System.out.println(sorularLocater.getText());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(sorularLocater.getText(), soru);

    }

    @Description("Sıkca sorulan sorularin yaninda + sembolune basildiginda, sembol -'ye donusmeli ")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})

    public void TC_06_03(@Optional("chrome")String browser) throws InterruptedException {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage(browser);
        homePage homePage = new homePage(browser);
        SoftAssert softAssert = new SoftAssert();
        homePage.faqButon.click();
        WebElement faqSorular;

        for (int i = 1; i < 5; i++) {
            faqSorular = Driver.getDriver(browser).findElement(By.xpath("(//*[@class='flex-shrink-0 stroke-2'])[" + i + "]"));
            softAssert.assertTrue(faqSorular.isDisplayed());
            faqSorular.click();
            Thread.sleep(2000);

        }

    }

    @Description("How to contact with Customer Service? sorusu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})

    public void TC_06_02(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage(browser);
        homePage homePage = new homePage(browser);
//        Actions actions = new Actions(Driver.getDriver(browser));
//        actions.click(homePage.faqButon)
//                .click(faqPage.faqilkSoruIsareti).perform();
        homePage.faqButon.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqilkSoru.isDisplayed());

    }

    @Description("How to contact with Customer Service? sorusunun cevabi acilmalidir.")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})

    public void TC_06_04(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage(browser);
        homePage homePage = new homePage(browser);
//        Actions actions = new Actions(Driver.getDriver(browser));
//        actions.click(homePage.faqButon)
//                .click(faqPage.faqilkSoruIsareti).perform();
        homePage.faqButon.click();
        faqPage.faqilkSoruIsareti.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqilkSoruCevap.isDisplayed());

    }

    @Description("App installation failed, how to update system information? sorusu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_05(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage(browser);
        homePage homePage = new homePage(browser);
        homePage.faqButon.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqIkinciSoru.isDisplayed());

    }

    @Description("App installation failed, how to update system information? sorusunun cevabi acilmalidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_07(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage(browser);
        homePage homePage = new homePage(browser);
        homePage.faqButon.click();
        faqPage.faqIkinciSoruIsareti.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqIkinciSoruCevap.isDisplayed());

    }

    @Description("Website response taking time, how to improve? sorusu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_08(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage(browser);
        homePage homePage = new homePage(browser);
        homePage.faqButon.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqUcuncuSoru.isDisplayed());

    }

    @Description("Website response taking time, how to improve? sorusunun cevabi acilmalidir.")
    @Severity(SeverityLevel.NORMAL)
    @Test(groups = {"Regression", "No role"})

    public void TC_06_10(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage(browser);
        homePage homePage = new homePage(browser);
        homePage.faqButon.click();
        faqPage.faqUcuncuSoruIsareti.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqUcuncuSoruCevap.isDisplayed());


    }

    @Description("How do I create a account? sorusu görülmelidir.")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})

    public void TC_06_11(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage(browser);
        homePage homePage = new homePage(browser);
        homePage.faqButon.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqDorduncuSoru.isDisplayed());

    }

    @Description("How do I create a account? sorusunun cevabi acilmalidir.")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Test(groups = {"Regression", "No role"})

    public void TC_06_13(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        faqPage faqPage = new faqPage(browser);
        homePage homePage = new homePage(browser);
        homePage.faqButon.click();
        faqPage.faqDorduncuSoruIsareti.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faqPage.faqDorduncuSoruCevap.isDisplayed());

    }
}