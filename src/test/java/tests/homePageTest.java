package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class homePageTest {
    @Test
    public void testHomePage() throws Exception {
        Driver.getDriver().get(ConfigReader.getProperty("pick"));

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Pick"));
        System.out.println("Degisiklikler yapildi Nuray");

    }
}

