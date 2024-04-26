package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;

public class orderPageTest {
    @Severity(SeverityLevel.NORMAL)
    @Description("Anasayfada kücük ekranda sepet bilgisi gelmeli ")
    @Test(groups ={ "Smoke","No role"})
    public void TC_18_01 () {
        homePage homePage=new homePage();

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
        jsexecutor.executeScript("arguments[0].scrollIntoView();", homePage.groceryApples);
        homePage.groceryApples.click();


    }
}
