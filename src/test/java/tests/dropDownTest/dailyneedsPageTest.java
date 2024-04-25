package tests.dropDownTest;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pages.dropDown.dailyneedsPage;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.ObjectInputFilter;

public class dailyneedsPageTest {
    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranda; \"You Deserve to eat fresh\" yazisi görüntülenir ")
    @Test
    public void TC_14_01() {
        dailyneedsPage dailyneedsPage = new dailyneedsPage();
        dailyneedsPage.dailyNeedsPage();// daily Needs sayfsaina gitmek icin method
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(dailyneedsPage.dailyNeedsYouDeserve.getText().contains("You Deserve"));
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranda; We source the best healthy foods for you.\" yazisi görüntülenir. ")
    @Test(groups ={"Regression","No role"})
    public void TC_14_02() {
        dailyneedsPage dailyneedsPage = new dailyneedsPage();
        dailyneedsPage.dailyNeedsPage();// daily Needs sayfsaina gitmek icin method
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(dailyneedsPage.dailyNeedsWeSourse.getText().contains("We source"));
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Search secenegi olan frame görüntülenir.")
    @Test(groups ={"Regression","No role"})
    public void TC_14_03() {
        dailyneedsPage dailyneedsPage = new dailyneedsPage();
        dailyneedsPage.dailyNeedsPage();// daily Needs sayfsaina gitmek icin method
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(dailyneedsPage.dailyNeedsWeSearchFrame.getText().equals("search"));
        softAssert.assertTrue(dailyneedsPage.dailyNeedsYouDeserve.getText().contains("You Deserve"));
        Driver.closeDriver();
    }

}
