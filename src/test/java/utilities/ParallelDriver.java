package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

import static utilities.ConfigReader.getProperty;

public class ParallelDriver {
    //parallel olarak testlerimizi calistrmak istedigimizde bu Driver classi kullanabilriz..
//Framework de ayrica bir Driver class a da ihtiyac kalmaz, bu driver her test icin calisir..
    private static final ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    public ParallelDriver() {
    }

    private static WebDriver driver;
    public static WebDriver getDriver(){
        if (driverPool.get() == null) {
            // this line will tell which browser should open based on the value from properties file
            String browserParamFromEnv = System.getProperty("browser");
            String browser = browserParamFromEnv == null ? getProperty("browser") : browserParamFromEnv;
            switch (browser) {
                case "chrome":
                    driverPool.set(new ChromeDriver());
                    break;
                case "firefox":
                    driverPool.set(new FirefoxDriver());
                    break;
                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
                        throw new WebDriverException("Your OS doesn't support Internet Explorer");
                    }
                    driverPool.set(new InternetExplorerDriver());
                    break;
                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
                        throw new WebDriverException("Your OS doesn't support Edge");
                    }
                    driverPool.set(new EdgeDriver());
                    break;
                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new WebDriverException("Your OS doesn't support Safari");
                    }
                    driverPool.set(new SafariDriver());
                    break;

                default:
                    driverPool.set(new ChromeDriver());
            }
            driverPool.get().manage().window().maximize();
            driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driverPool.get();
    }
    public static void closeDriver(){
        if (driver!=null){
            driverPool.get().quit();
            driverPool.remove();
        }
        driver=null;
    }
}
