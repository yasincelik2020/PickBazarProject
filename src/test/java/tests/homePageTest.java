package tests;


import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import pages.homePage;
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


}
