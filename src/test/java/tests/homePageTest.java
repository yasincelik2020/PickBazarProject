package tests;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class homePageTest {
    @Description("Kayitsiz kullanici olarak ana sayfanin elementlerinin dogru sekilde geldigi görüntülenmelidir ; \"PickBazar\" butonu görüntülenmeli    ")
    @Test (groups ={ "Smoke","No role"})
    public void TC_01_01(@Optional("chrome")String browser) {

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("pickUrl"));

        homePage homePage=new homePage();
       Assert.assertTrue( homePage.PickBazarButon.isDisplayed());

       Driver.closeDriver();


    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Kullanici anasayfada Shelf dropdown menudeki seceneklerden birini sectiginde ürünün image i görüntülenmeli ")
    @Test (groups ={ "Regression","No role"})
    public void TC_15_01 () {
        homePage homePage=new homePage();

        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
        jsexecutor.executeScript("arguments[0].scrollIntoView();", homePage.groceryApples);
        homePage.groceryApples.click();


    }




}
