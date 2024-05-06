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
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_01() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.total, 3);
        Assert.assertTrue(profilPage.total.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Used kac puana sahip oldugu görüntülenmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_02() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        Assert.assertTrue(profilPage.used.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Available kac puana sahip oldugu görüntülenmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_03() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.available, 3);
        Assert.assertTrue(profilPage.available.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Image alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_04() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.image, 3);
        Assert.assertTrue(profilPage.image.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Name alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_05() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.name, 3);
        Assert.assertTrue(profilPage.name.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Bio alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_06() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.bio, 3);
        Assert.assertTrue(profilPage.bio.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Email alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_07() throws IOException, InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.contactNumber, 3);
        ReusableMethods.takeScreenshot("Bug_TC_22_07_ProfildeEmailYOK_");
        // Eğer email olmadigi icin kendimiz fail oluşturduk
        Assert.fail("Email tab is present, but it shouldn't be.");
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("ContactNumber alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_08() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.contactNumber, 3);
        Assert.assertTrue(profilPage.contactNumber.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Addresses alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_09() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.addresses, 3);
        Assert.assertTrue(profilPage.addresses.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Old Password alani görüntülenir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_10() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.changePasswordSekme, 3);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForVisibility(profilPage.oldPassword, 3);
        Assert.assertTrue(profilPage.oldPassword.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("New Password alani görüntülenir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_11() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.changePasswordSekme, 3);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForVisibility(profilPage.newPassword, 3);
        Assert.assertFalse(profilPage.newPassword.isDisplayed());

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Confirm Password alani görüntülenir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_12() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.changePasswordSekme, 3);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForVisibility(profilPage.confirmPassword, 3);
        Assert.assertTrue(profilPage.confirmPassword.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Submit buttonu görüntülenir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_13() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        Thread.sleep(3000);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForVisibility(profilPage.submit, 3);
        Assert.assertTrue(profilPage.submit.getText().contains("mit"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Örnek olarak 'Appels' ürününün siparisi yapilir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_15() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.kasaApplesUrununuEkleme();
        profilPage.itemButton.click();
        String applesFiyatCheckOut = "$1.60";
        // Apples ana sayfadaki fiyati eklenen yerdekli ile ayni old. kontrol edildi.
        Assert.assertEquals(profilPage.applesFiyat.getText(), applesFiyatCheckOut);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("'Apples' ürünü My Orders icerisinde görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_16() throws InterruptedException, IOException {
        profilPage profilPage = new profilPage();
        profilPage.kasaApplesUrununuEkleme();
        profilPage.itemButton.click();
        ReusableMethods.waitForVisibility(profilPage.checkOut, 3);
        ReusableMethods.takeScreenshot("Bug_TC_22_16_KasayaApplesEklendi_");
        profilPage.closeEklenenUrunSayfa.click();
        profilPage.profilFotoSekmesi.click();
        profilPage.myOrderKategorisi.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver("browser"), profilPage.eklenenUrunMyOrder);
        ReusableMethods.waitForVisibility(profilPage.eklenenUrunMyOrder, 3);
        ReusableMethods.takeScreenshot("Bug_TC_22_16_KasadaApplesUrunYok_");
        System.out.println("profilPage.eklenenUrunMyOrder.getText() = " + profilPage.eklenenUrunMyOrder.getText());
        Assert.assertEquals(profilPage.eklenenUrunMyOrder.getText(), "Apples");
    }

    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {"Order Received"},
                {"Shipping Address"},
                {"Billing Address"},
                {"Sub Total"},
                {"Discount"},
                {"Delivery Fee"},
                {"Tax"},
                {"Total"},
                {"Item"}};
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("siparis detaylari icerisindeki tüm elementler test ediliyor")
    @Test(dataProvider = "data", groups = {"Regression", "Customer"})
    public void TC_22_17_26(String detayString) throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToMyOrderPage();
        WebElement elementLocater = Driver.getDriver("browser").
                findElement(By.xpath("(//span[.='" + detayString + "'])[1]"));
        Assert.assertTrue(elementLocater.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Downloads: Ürün secenegi yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_27() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToDownloadsPage();
        for (WebElement webElement : profilPage.kitapUrunListe) {
            ReusableMethods.waitForVisibility(webElement,10);
            Assert.assertTrue(webElement.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Downloads: Download secenegi yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_28() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToDownloadsPage();
        int downloadSayisi = profilPage.downloadButtonListe.size();
        Assert.assertEquals(downloadSayisi, 10);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Wishlistteki ürün image i yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_29() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToMyWishLists();
        for (WebElement webElement : profilPage.myWishImageListe) {
            ReusableMethods.waitForVisibility(webElement,10);
            Assert.assertTrue(webElement.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Wishlistteki ürün fiyat i yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_30() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToMyWishLists();
        for (WebElement webElement : profilPage.myWishFiyatListe) {
            ReusableMethods.waitForVisibility(webElement,10);
            Assert.assertTrue(webElement.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("My Wishlistteki ürünun add to cart secenegi ile yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_31() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToMyWishLists();
        for (WebElement webElement : profilPage.myWishAddToCardListe) {
            ReusableMethods.waitForVisibility(webElement,10);
            Assert.assertTrue(webElement.isDisplayed());
        }
    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Wishlistteki ürün remove secenegi ile yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_32() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToMyWishLists();
        for (WebElement webElement : profilPage.myWishRemoveListe) {
            ReusableMethods.waitForVisibility(webElement,10);
            Assert.assertTrue(webElement.isDisplayed());
        }
    }

    //@Parameters("id")
    @Severity(SeverityLevel.NORMAL)
    @Description("My Refunds: Refund ID-Reason-Status görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_35() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToMyRefunds();
        Assert.assertTrue(profilPage.idLocater.isDisplayed());
    }

    //@Parameters("reosan")
    @Severity(SeverityLevel.NORMAL)
    @Description("My Refunds: Reason görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_36() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToMyRefunds();
        Assert.assertTrue(profilPage.reasonLocater.isDisplayed());
    }

    //@Parameters("status")
    @Severity(SeverityLevel.NORMAL)
    @Description("My Refunds: Status görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_37() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToMyRefunds();
        Assert.assertTrue(profilPage.statusLocater.isDisplayed());
    }

    @DataProvider
    public static Object[][] data38_39_40_41() {
        return new Object[][]{
                {"Tracking Number"},
                {"Amount"},
                {"Date"},
                {"Details"}};
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("siparis detaylari icerisindeki tüm elementler test ediliyor")
    @Test(dataProvider = "data38_39_40_41", groups = {"Regression", "Customer"})
    public void TC_22_38_39_40_41(String element) throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToMyRefunds();
        WebElement elementLocater = Driver.getDriver("browser").
                findElement(By.xpath("//th[.='" + element + "']"));
        Assert.assertTrue(elementLocater.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("My Reports da Raporlar görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_42() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToMyReports();
        Assert.assertTrue(profilPage.myRapor.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("FAQ ekranina yönlendirir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_44() throws InterruptedException {
        profilPage profilPage = new profilPage();
        profilPage.goToNeedHelp();
        Assert.assertTrue(profilPage.FAQ.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Uygulamadan cikis yapilmali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_45() throws InterruptedException, IOException {
        profilPage profilPage = new profilPage();
        profilPage.goToProfilPage();
        profilPage.logout1.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.takeScreenshot("TC_22_45_CikisYapilamiyor");
       // Driver.getDriver("browser").navigate().refresh();
        Assert.assertTrue(profilPage.loginLogout.isDisplayed());
    }

}
