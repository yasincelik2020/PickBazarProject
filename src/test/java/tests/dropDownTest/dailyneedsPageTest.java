package tests.dropDownTest;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.dropDown.dailyneedsPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;


public class dailyneedsPageTest {
    dailyneedsPage dailyneedsPage = new dailyneedsPage();

    @DataProvider
    public static Object[][] data() {
        return new Object[][]{{"Vegetables"},
                {"Snacks"},
                {"Rice & Pulse"},
                {"Meat"},
                {"Fruits"},
                {"Fish"},
                {"Dairy & Eggs"},
                {"Bakery"},};
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranda; \"You Deserve to eat fresh\" yazisi görüntülenir ")
    @Test
    public void TC_14_01() {
        dailyneedsPage.dailyNeedsPageGit();// daily Needs sayfsaina gitmek icin method
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(dailyneedsPage.dailyNeedsYouDeserve.getText().contains("You Deserve"));
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranda; 'We source the best healthy foods for you' yazisi görüntülenir. ")
    @Test(groups = {"Regression", "No role"})
    public void TC_14_02() {
        dailyneedsPage.dailyNeedsPageGit();// daily Needs sayfsaina gitmek icin method
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(dailyneedsPage.dailyNeedsWeSourse.getText().contains("We source"));
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Search secenegi olan frame görüntülenir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_14_03() {
        dailyneedsPage.dailyNeedsPageGit();// daily Needs sayfsaina gitmek icin method
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(dailyneedsPage.dailyNeedsWeSearchFrame.getText().equals("search"));
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Arama yapmak icin 'Search' butonu görülür,")
    @Test(groups = {"Regression", "No role", "Failed"})
    public void TC_14_05() throws InterruptedException, IOException {
        dailyneedsPage.dailyNeedsPageGit();// daily Needs sayfsaina gitmek icin method
        Thread.sleep(3000);
        ReusableMethods.takeScreenshot("Bug_TC_14_05_SearchButtonYok_");
        Assert.assertTrue(dailyneedsPage.dailyNeedsWeSearchButton.isDisplayed());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Aranan ürün Daily Needs ile ilgili ise ve sitede varsa gelmelidir")
    @Test(groups = {"Regression", "No role"})
    public void TC_14_06() throws InterruptedException {
        dailyneedsPage.dailyNeedsPageGit();// daily Needs sayfsaina gitmek icin method
        Thread.sleep(3000);
        dailyneedsPage.dailyNeedsWeSearchFrame.sendKeys("Rice", Keys.ENTER);
        Assert.assertTrue(dailyneedsPage.sekkaGrainRiceUrunu.isDisplayed());
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("NEGATIF TEST: Aranan ürün Daily Needs ile ilgili degil ise ve sitede varsa gelmemelidir")
    @Test(groups = {"Regression", "No role"})
    public void TC_14_07() throws InterruptedException {
        dailyneedsPage.dailyNeedsPageGit();// daily Needs sayfsaina gitmek icin method
        Thread.sleep(3000);
        //"Kullanici "Clothing"" kategorisindeki" Mango Self Striped A Line Dress"  adli ürünü search sekmesinde arar.
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(dailyneedsPage.dailyNeedsWeSearchFrame, "Mango Self Striped A Line Dress",Keys.ENTER).perform();
            WebElement gelenYazi = Driver.getDriver().findElement
                    (By.xpath("//h3[.='No products found']"));
            Assert.assertTrue(gelenYazi.getText().contains("No products found"));

        Driver.closeDriver();
    }

    // bu data table ile yapilabilir
    @Severity(SeverityLevel.NORMAL)
    @Description("Tüm alt kategorilerin görünür oldugu test edilecek")
    @Test(dataProvider = "data", groups = {"Regression", "No role"})
    public void TC_14_08(String kategoriAdi) throws InterruptedException {
        dailyneedsPage.dailyNeedsPageGit();// daily Needs sayfsaina gitmek icin method
        ReusableMethods.waitForPageToLoad(3);// sayfanin yüklenmesini icin.
        WebElement kategoriLocater = Driver.getDriver().
                findElement(By.xpath("//h3[.='" + kategoriAdi + "']"));
        SoftAssert softAssert = new SoftAssert();// hatayi bulacak ama test devam edecek.
        softAssert.assertEquals(kategoriLocater.getText(), kategoriAdi);
        Driver.closeDriver();
    }

}
