package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ExtentReport {

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;

    /*
     * Statik blok, ExtentReportUtils.somemethod... çağrıldığında çalışır ve önkoşulları gerçekleştirir
     */
    static {
//        RAPOR ADI VE OLUŞTURULACAĞI YER
//        YOL
        String now = new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/Reports/"+now+"extent_reports.html";
//        HTML şablonunu oluşturmak için extent spark reporter kullanarak yolu belirle
        extentSparkReporter = new ExtentSparkReporter(path);
//        Extent raporu oluştur
        extentReports = new ExtentReports();

//        ***********ÖZEL SİSTEM BİLGİLERİ EKLEME ***********
        extentReports.setSystemInfo("Uygulama Adı","Apple M1 Birimi");
        extentReports.setSystemInfo("Test Ortamı","Regresyon");
        extentReports.setSystemInfo("Tarayıcı","Chrome");
        extentReports.setSystemInfo("Ekip Adı","Kartallar");
        extentReports.setSystemInfo("SQA","John");
        extentReports.setSystemInfo("Özellik Numarası","FE1056");
        extentReports.setSystemInfo("Şirket Adı","Clarusway");

//        ***********BELGE BİLGİSİ************************
        extentSparkReporter.config().setReportName("Test Raporu");
        extentSparkReporter.config().setDocumentTitle("Asya'nın Test Raporları");
//        ***********YAPILAN YAPILANDIRMALAR BİTTİ********************
//        extent raporları ve extent spark reporter'ı birleştirme
        extentReports.attachReporter(extentSparkReporter);
    }
    //

    /*
     * LOG OLARAK BİLİNEN EXTENT TESTİ OLUŞTURUR
     * Başka herhangi bir rapor metodundan önce bunu kullanmalısınız, aksi takdirde bir istisna alırsınız
     */
    public static void createTestReport(String name, String description){
        extentTest=extentReports.createTest(name,description);
    }
    //    LOGGER METODLARI
//    ExtentReportUtils.pass("message") -> Log'u başarılı olarak işaretler ve mesaj raporda görünür
    public static void pass(String message){
        extentTest.log(Status.PASS,message);
    }
    //    ExtentReportUtils.info("message") -> Log'u bilgi olarak işaretler ve mesaj raporda görünür
    public static void info(String message){
        extentTest.log(Status.INFO,message);
    }
    //    ExtentReportUtils.fail("message") -> Log'u başarısız olarak işaretler ve mesaj raporda görünür
    public static void fail(String message){
        extentTest.log(Status.FAIL,message);
    }

    //    Bu metod log oluşturur VE ekran görüntüsü alır VE bunları html raporuna ekler
    public static void passAndCaptureScreenshot(String message)  {
        try {
            extentTest
                    .log(Status.PASS,message)
                    .addScreenCaptureFromPath(takeScreenshot(Driver.getDriver("browser")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /*
    RAPORU OLUŞTURMAK İÇİN EN SONDA FLUSH KULLANILMALIDIR
    ExtentReportUtils.flush
    */
    public static void flush(){
        extentReports.flush();
    }

    public static String takeScreenshot(WebDriver driver) throws IOException {
        // 1. Ekran görüntüsünü yakalamak için getScreenShotAs yöntemine sahip TakeScreenShot sınıfı
        File image = ((TakesScreenshot)Driver.getDriver("browser")).getScreenshotAs(OutputType.FILE);
        // 2. Resmi kaydetmek için bir yol oluşturun
        // Ekran görüntüleri aynı ismi kullanıyorsa dinamik bir isim vermek için bir tarih oluşturun
        String now = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date())+System.nanoTime();//getting local date in this format
        // PROJE KLASÖRÜ klasoradi  alt klasora di  resim adi
        String path = System.getProperty("user.dir")+"/test-output/Reports/Screenshots/"+now+"image.png";
        // 3. Resmi dosya olarak belirtilen yola kaydedin
        FileUtils.copyFile(image,new File(path));
        // 4. Resim yolunu String olarak dön
        return path;
    }}