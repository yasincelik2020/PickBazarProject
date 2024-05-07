package tests.profile;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.profile.profilPage;
import utilities.Driver;
import utilities.JavaScriptExecutorUtils;
import utilities.ReusableMethods;
import java.io.IOException;

public class profilPageTest {

    @AfterMethod
    public void afterMethod() {
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Total kac puana sahip oldugu görüntülenmeli")
    @Parameters("browser")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_01(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        ReusableMethods.waitForVisibility(profilPage.total, 3);
        Assert.assertTrue(profilPage.total.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Used kac puana sahip oldugu görüntülenmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_02(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        Assert.assertTrue(profilPage.used.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Available kac puana sahip oldugu görüntülenmeli")
    @Test(groups = {"Regression", "Customer"} )
    public void TC_22_03(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        ReusableMethods.waitForVisibility(profilPage.available, 3);
        Assert.assertTrue(profilPage.available.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Image alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_04(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        ReusableMethods.waitForVisibility(profilPage.image, 3);
        Assert.assertTrue(profilPage.image.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Name alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_05(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        ReusableMethods.waitForVisibility(profilPage.name, 3);
        Assert.assertTrue(profilPage.name.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Bio alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_06(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        ReusableMethods.waitForVisibility(profilPage.bio, 3);
        Assert.assertTrue(profilPage.bio.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Email alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_07(@Optional("chrome")String browser) throws IOException, InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        ReusableMethods.waitForVisibility(profilPage.contactNumber, 3);
        ReusableMethods.takeScreenshot("Bug_TC_22_07_ProfildeEmailYOK_");
        // Eğer email olmadigi icin kendimiz fail oluşturduk
        Assert.fail("Email tab is present, but it shouldn't be.");
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("ContactNumber alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_08(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        ReusableMethods.waitForVisibility(profilPage.contactNumber, 3);
        Assert.assertTrue(profilPage.contactNumber.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Addresses alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_09(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        ReusableMethods.waitForVisibility(profilPage.addresses, 3);
        Assert.assertTrue(profilPage.addresses.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)

    @Description("Old Password alani görüntülenir")
    @Parameters("browser")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_10(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        ReusableMethods.waitForVisibility(profilPage.changePasswordSekme, 3);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForVisibility(profilPage.oldPassword, 3);
        Assert.assertTrue(profilPage.oldPassword.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("New Password alani görüntülenir")
    @Parameters("browser")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_11(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        ReusableMethods.waitForVisibility(profilPage.changePasswordSekme, 3);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForVisibility(profilPage.newPassword, 3);
        Assert.assertFalse(profilPage.newPassword.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Confirm Password alani görüntülenir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_12(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        ReusableMethods.waitForVisibility(profilPage.changePasswordSekme, 3);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForVisibility(profilPage.confirmPassword, 3);
        Assert.assertTrue(profilPage.confirmPassword.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Submit buttonu görüntülenir")
    @Parameters("browser")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_13(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        Thread.sleep(3000);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForVisibility(profilPage.submit, 3);
        Assert.assertTrue(profilPage.submit.getText().contains("mit"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Örnek olarak 'Appels' ürününün siparisi yapilir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_15(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.kasaApplesUrununuEkleme(browser);
        profilPage.itemButton.click();
        String applesFiyatCheckOut = "$1.60";
        // Apples ana sayfadaki fiyati eklenen yerdekli ile ayni old. kontrol edildi.
        Assert.assertEquals(profilPage.applesFiyat.getText(), applesFiyatCheckOut);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("'Apples' ürünü My Orders icerisinde görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_16(@Optional("chrome")String browser) throws InterruptedException, IOException {
        profilPage profilPage = new profilPage(browser);
        profilPage.kasaApplesUrununuEkleme(browser);
        profilPage.itemButton.click();
        ReusableMethods.waitForVisibility(profilPage.checkOut, 3);
        ReusableMethods.takeScreenshot("Bug_TC_22_16_KasayaApplesEklendi_");
        profilPage.closeEklenenUrunSayfa.click();
        profilPage.profilFotoSekmesi.click();
        profilPage.myOrderKategorisi.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser), profilPage.eklenenUrunMyOrder);
        ReusableMethods.waitForVisibility(profilPage.eklenenUrunMyOrder, 3);
        ReusableMethods.takeScreenshot("Bug_TC_22_16_KasadaApplesUrunYok_");
        System.out.println("profilPage.eklenenUrunMyOrder.getText() = " + profilPage.eklenenUrunMyOrder.getText());
        Assert.assertEquals(profilPage.eklenenUrunMyOrder.getText(), "Apples");
    }

    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {"chrome","Order Received"},
                {"chrome","Shipping Address"},
                {"chrome","Billing Address"},
                {"chrome","Sub Total"},
                {"chrome","Discount"},
                {"chrome","Delivery Fee"},
                {"chrome","Tax"},
                {"chrome","Total"},
                {"chrome","Item"}};
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("siparis detaylari icerisindeki tüm elementler test ediliyor")
    @Test(dataProvider = "data", groups = {"Regression", "Customer"})
    public void TC_22_17_26(@Optional("chrome")String browser,String detayString) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToMyOrderPage(browser);
        WebElement elementLocater = Driver.getDriver(browser).
                findElement(By.xpath("(//span[.='" + detayString + "'])[1]"));
        Assert.assertTrue(elementLocater.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Downloads: Ürün secenegi yer almali")
    @Parameters("browser")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_27(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToDownloadsPage(browser);
        for (WebElement webElement : profilPage.kitapUrunListe) {
            ReusableMethods.waitForVisibility(webElement,10);
            Assert.assertTrue(webElement.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Downloads: Download secenegi yer almali")
    @Parameters("browser")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_28(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToDownloadsPage(browser);
        int downloadSayisi = profilPage.downloadButtonListe.size();
        Assert.assertEquals(downloadSayisi, 10);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Wishlistteki ürün image i yer almali")
    @Parameters("browser")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_29(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToMyWishLists(browser);
        for (WebElement webElement : profilPage.myWishImageListe) {
            ReusableMethods.waitForVisibility(webElement,10);
            Assert.assertTrue(webElement.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Wishlistteki ürün fiyat i yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_30(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToMyWishLists(browser);
        for (WebElement webElement : profilPage.myWishFiyatListe) {
            ReusableMethods.waitForVisibility(webElement,10);
            Assert.assertTrue(webElement.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("My Wishlistteki ürünun add to cart secenegi ile yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_31(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToMyWishLists(browser);
        for (WebElement webElement : profilPage.myWishAddToCardListe) {
            ReusableMethods.waitForVisibility(webElement,10);
            Assert.assertTrue(webElement.isDisplayed());
        }
    }


    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Wishlistteki ürün remove secenegi ile yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_32(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToMyWishLists(browser);
        for (WebElement webElement : profilPage.myWishRemoveListe) {
            ReusableMethods.waitForVisibility(webElement,10);
            Assert.assertTrue(webElement.isDisplayed());
        }
    }

    //@Parameters("id")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("My Refunds: Refund ID-Reason-Status görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_35(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToMyRefunds(browser);
        Assert.assertTrue(profilPage.idLocater.isDisplayed());
    }

    //@Parameters("reosan")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("My Refunds: Reason görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_36(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToMyRefunds(browser);
        Assert.assertTrue(profilPage.reasonLocater.isDisplayed());
    }

    //@Parameters("status")
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("My Refunds: Status görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_37(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToMyRefunds(browser);
        Assert.assertTrue(profilPage.statusLocater.isDisplayed());
    }

    @DataProvider
    public static Object[][] data38_39_40_41() {
        return new Object[][]{
                {"chrome","Tracking Number"},
                {"chrome","Amount"},
                {"chrome","Date"},
                {"chrome","Details"}};
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("siparis detaylari icerisindeki tüm elementler test ediliyor")
    @Test(dataProvider = "data38_39_40_41", groups = {"Regression", "Customer"})
    public void TC_22_38_39_40_41(@Optional("chrome")String browser,String element) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToMyRefunds(browser);
        WebElement elementLocater = Driver.getDriver(browser).
                findElement(By.xpath("//th[.='" + element + "']"));
        Assert.assertTrue(elementLocater.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("My Reports da Raporlar görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_42(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToMyReports(browser);
        Assert.assertTrue(profilPage.myRapor.isDisplayed());
    }
    @Parameters("browser")
    @Severity(SeverityLevel.NORMAL)
    @Description("FAQ ekranina yönlendirir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_44(@Optional("chrome")String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToNeedHelp(browser);
        Assert.assertTrue(profilPage.FAQ.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Uygulamadan cikis yapilmali")
    @Parameters("browser")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_45(@Optional("chrome")String browser) throws InterruptedException, IOException {
        profilPage profilPage = new profilPage(browser);
        profilPage.goToProfilPage(browser);
        profilPage.logout1.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.takeScreenshot("TC_22_45_CikisYapilamiyor");
       // Driver.getDriver(browser).navigate().refresh();
        Assert.assertTrue(profilPage.loginLogout.isDisplayed());
    }

}
