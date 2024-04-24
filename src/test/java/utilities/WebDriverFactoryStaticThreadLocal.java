package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactoryStaticThreadLocal {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static  void setDriver() {
        driver.set(new ChromeDriver());
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void closeBrowser() {
        driver.get().quit();
        driver.remove();
    }

//Bu kod coklu thread kullanmamiza izin verir.
//WebDriver objesini yonetmek icin  ThreadLocal classini kullaniriz
//her bir thread kendine ozel bir WebDriver objesine sahip olur
//ve bu ThreadLocal objesi , her bir objeyi bagimsiz olarak saklar

//setDriver() , WebDriverManager ile ChromeDriver i yapilandirir
//ve olusturlan objeyi ThreadLocal degiskenine atar,
//bu method her bir thread e ozgu bir WebDriver objesi olusturur

//getDriver(), mevcut olan thread e ait WebDriver objesini dondurur

//closeBrowser(), mevcut olan thread e ait WebDriver objesini kapatir
//ve ThreadLocal degiskeninini kaldirir.

//bu sekilde her bir thread in ayri bir WebDriver objesine sahip oldugundan emin oluruz
//ve senaryolar es zamanli olarak calisir
}
