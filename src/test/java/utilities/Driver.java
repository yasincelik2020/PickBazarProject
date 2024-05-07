package utilities;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;
  /*
      POM'de Driver icin TestBase class'ina extends etmek yerine
      Driver class'indan static method'lar kullanarak
      driver olusturup, ilgili ayarlarin yapilmasi
      ve en sonda driver'in kapatilmasi tercih edilmistir.
      POM'de Driver class'indaki getDriver()'nin obje olusturularak kullanilmasini
      engellemek icin
      Singleton pattern kullanimi benimsenmistir.
      Singleton Pattern : tekli kullanim, bir class'in farkli class'lardan
      obje olusturularak kullanimini engellemek icin kullanilir.
      Bunu saglamak icin yapmamiz gereken sey oldukca basit
      obje olusturmak icin kullanilan constructor'i private yaptiginizda
      baska class'larda Driver class'indan obje olusturulmasi mumkun OLAMAZ
       */

public class Driver {
    // create a private static WebDriver object
    public static WebDriver driver;

    //singleton driver yapmak için constructorımızı private yapıyoruzki bu classın dışından new anahtarıyla
    // driver object üretilemesin. Peki kim driver üretecek? getDriver() metodumuz.
    private Driver() { //constructor Driver
    }
    // create getDriver method to create and initiate the driver instance
    @Parameters("browser")
    public static synchronized WebDriver getDriver(@Optional("chrome") String browser) {
        if (driver == null) {
            //bu şekilde sadece bir driver object üretilmesini garantiliyoruz. daha önce driver üretilmişse null olmayacaktır ve
            //bu if bloğu çalışmayacak ve yeni driver üretilmeyecektir. Var olan (daha önce üretilmiş olan) driverı return edecektir.
            switch (browser) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "safari" :
                    driver=new SafariDriver();
                    break;
                case "edge" :
                    driver=new EdgeDriver();
                    break;
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }//getDriver ends here

    // create a closeDriver method to close the driver
    public static void closeDriver() {
        //   quit the driver id it is pointing chromedriver, firefoxdriver....
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
