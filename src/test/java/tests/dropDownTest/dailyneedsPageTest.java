package tests.dropDownTest;

import jdk.jfr.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.dropDown.dailyneedsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class dailyneedsPageTest {
    @Description("Ekranda; \"You deserve to eat fresh\" yazisi görüntülenir ")
    @Test
    public void TC_14_01(){
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();

        dailyneedsPage dailyneedsPage = new dailyneedsPage();
        softAssert.assertTrue(dailyneedsPage.dailyNeedsText.getText().contains("We source"));
        Driver.closeDriver();
    }
}
