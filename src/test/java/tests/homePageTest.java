package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class homePageTest {

    public homePageTest() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @Test
    public void testHomePage() throws Exception {
        Driver.getDriver().get(ConfigReader.getProperty("pick"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Pick"));

    }

    @FindBy(id = "headlessui-menu-button-1")
    WebElement grocery;
}
