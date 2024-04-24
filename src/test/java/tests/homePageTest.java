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
        System.out.println("Degisiklikler yapildi Beyza");
        System.out.println("degisiklik2");

        System.out.println("Degisiklikler yapildi Nuray");

        System.out.println("degisikli yapildi Rasit hocam");
        System.out.println("asd");
        System.out.println("asdqw");
        System.out.println("asdqwqw e");
        System.out.println("degisiklik");




        System.out.println("yasin degisiklik yapti");
        System.out.println("Degisiklikler yapildi Beyza");
        System.out.println("degisiklik2");

        System.out.println("Degisiklikler yapildi Nuray");

        System.out.println("degisikli yapildi Rasit hocam");
        System.out.println("asd");
        System.out.println("asdqw");
        System.out.println("asdqwqw e");
        System.out.println("degisiklik");




        System.out.println("yasin degisiklik yapti");
        System.out.println("ebru");



    }
}
