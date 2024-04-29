package tests.profile;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.profile.profilPage;
import utilities.Driver;
import utilities.JavaScriptExecutorUtils;
import utilities.ReusableMethods;
import java.io.IOException;
import java.time.Duration;

public class profilPageTest {
    profilPage profilPage = new profilPage();
    SoftAssert softAssert = new SoftAssert();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @AfterMethod
    public void afterMethod() {
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Total kac puana sahip oldugu görüntülenmeli")
    @Test(groups = {"Regression", "Customer"})
    // burada 3 therad olusturulur ve 3 test ayni anda yürütülür
    public void TC_22_01() throws InterruptedException {
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.total, 3);
        softAssert.assertTrue(profilPage.total.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Used kac puana sahip oldugu görüntülenmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_02() throws InterruptedException {
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.used, 3);
        softAssert.assertTrue(profilPage.used.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Available kac puana sahip oldugu görüntülenmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_03() throws InterruptedException {
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.available, 3);
        softAssert.assertTrue(profilPage.available.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Image alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_04() throws InterruptedException {
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.image, 3);
        softAssert.assertTrue(profilPage.image.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Name alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_05() throws InterruptedException {
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.name, 3);
        softAssert.assertTrue(profilPage.name.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Bio alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_06() throws InterruptedException {
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.bio, 3);
        softAssert.assertTrue(profilPage.bio.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Email alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_07() throws IOException, InterruptedException {
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
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.contactNumber, 3);
        softAssert.assertTrue(profilPage.contactNumber.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Addresses alani görülür")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_09() throws InterruptedException {
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.addresses, 3);
        Assert.assertTrue(profilPage.addresses.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Old Password alani görüntülenir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_10() throws InterruptedException {
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.changePasswordSekme, 3);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForVisibility(profilPage.oldPassword, 3);
        softAssert.assertTrue(profilPage.oldPassword.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("New Password alani görüntülenir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_11() throws InterruptedException {
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.changePasswordSekme,3);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForVisibility(profilPage.newPassword,3);
        softAssert.assertTrue(profilPage.newPassword.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Confirm Password alani görüntülenir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_12() throws InterruptedException {
        profilPage.goToProfilPage();
        ReusableMethods.waitForVisibility(profilPage.changePasswordSekme,3);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForVisibility(profilPage.confirmPassword,3);
        Assert.assertTrue(profilPage.confirmPassword.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Submit buttonu görüntülenir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_13() throws InterruptedException {
        profilPage.goToProfilPage();
        Thread.sleep(3000);
        profilPage.changePasswordSekme.click();
        ReusableMethods.waitForPageToLoad(3);
        Assert.assertTrue(profilPage.submit.getText().contains("mit"));
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Örnek olarak 'Appels' ürününün siparisi yapilir")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_15() throws InterruptedException {
        profilPage.kasaApplesUrununuEkleme();
        WebElement itemButton = Driver.getDriver().
                findElement(By.xpath("//span[text()='1 Item']"));
        itemButton.click();
        String applesFiyatCheckOut = "$1.60";
        WebElement applesFiyat = Driver.getDriver().// Apples ana sayfadaki fiyati eklenen yerdekli ile ayni old. kontrol edildi.
                findElement(By.xpath("(//span[.='$1.60'])[1]"));
        Assert.assertEquals(applesFiyat.getText(), applesFiyatCheckOut);
        Driver.closeDriver();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("'Apples' ürünü My Orders icerisinde görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_16() throws InterruptedException, IOException {
        profilPage.kasaApplesUrununuEkleme();
        WebElement itemButton = Driver.getDriver().
                findElement(By.xpath("//span[text()='1 Item']"));
        itemButton.click();
        WebElement checkOut = Driver.getDriver().
                findElement(By.xpath("//span[.='Checkout']"));
        ReusableMethods.waitForVisibility(checkOut, 3);
        ReusableMethods.takeScreenshot("Bug_TC_22_16_KasayaApplesEklendi_");
        WebElement closeEklenenUrun = Driver.getDriver().
                findElement(By.xpath("(//section[@class='relative flex h-full flex-col']//button)[1]"));
        closeEklenenUrun.click();
        profilPage.profilFotoSekmesi.click();
        profilPage.myOrderKategorisi.click();
        WebElement eklenenUrunMyOrder = Driver.getDriver().// myOrder da olan ürünün locater i
                findElement(By.xpath("//a[.='Greddy Love']"));
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(), eklenenUrunMyOrder);
        ReusableMethods.waitForVisibility(eklenenUrunMyOrder, 3);
        ReusableMethods.takeScreenshot("Bug_TC_22_16_KasadaApplesUrunYok_");
        Assert.assertEquals(eklenenUrunMyOrder.getText(), "Apples");
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
        profilPage.goToMyOrderPage();
        Thread.sleep(3000);
        WebElement detayStringLocater = Driver.getDriver().
                findElement(By.xpath("(//span[.='" + detayString + "'])[1]"));
        softAssert.assertTrue(detayStringLocater.isDisplayed());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Downloads: Ürün secenegi yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_27() throws InterruptedException {
        profilPage.goToDownloadsPage();
        Thread.sleep(3000);
        int i = 0;
        for (WebElement webElement : profilPage.kitapUrunListe) {
            //System.out.println(profilPage.kitapUrunListe.get(i).getText());
            softAssert.assertTrue(webElement.isDisplayed());
            i++;
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Downloads: Download secenegi yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_28() throws InterruptedException {
        profilPage.goToDownloadsPage();
        Thread.sleep(3000);
        int downloadSayisi = profilPage.downloadButtonListe.size();
        softAssert.assertEquals(downloadSayisi, 10);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Wishlistteki ürün image i yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_29() throws InterruptedException {
        profilPage.goToMyWishLists();
        Thread.sleep(3000);
        for (WebElement webElement : profilPage.myWishImageListe) {
            softAssert.assertTrue(webElement.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Wishlistteki ürün fiyat i yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_30() throws InterruptedException {
        profilPage.goToMyWishLists();
        Thread.sleep(3000);
        for (WebElement webElement : profilPage.myWishFiyatListe) {
            softAssert.assertTrue(webElement.isDisplayed());
        }
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("My Wishlistteki ürünun add to cart secenegi ile yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_31() throws InterruptedException {
        profilPage.goToMyWishLists();
        Thread.sleep(3000);
        for (WebElement webElement : profilPage.myWishAddToCardListe) {
            softAssert.assertTrue(webElement.isDisplayed());
        }
    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Wishlistteki ürün remove secenegi ile yer almali")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_32() throws InterruptedException {
        profilPage.goToMyWishLists();
        Thread.sleep(3000);
        for (WebElement webElement : profilPage.myWishRemoveListe) {
            softAssert.assertTrue(webElement.isDisplayed());
        }
    }

    //@Parameters("id")
    @Severity(SeverityLevel.NORMAL)
    @Description("My Refunds: Refund ID-Reason-Status görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_35() throws InterruptedException {
        profilPage.goToMyRefunds();
        Thread.sleep(3000);
        WebElement idLocater = Driver.getDriver().findElement(By.
                xpath("//th[.='ID']"));
        softAssert.assertTrue(idLocater.isDisplayed());
    }

    //@Parameters("reosan")
    @Severity(SeverityLevel.NORMAL)
    @Description("My Refunds: Reason görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_36() throws InterruptedException {
        profilPage.goToMyRefunds();
        Thread.sleep(3000);
        WebElement reasonLocater = Driver.getDriver().findElement(By.
                xpath("//th[.='Reason']"));
        softAssert.assertTrue(reasonLocater.isDisplayed());
    }

    //@Parameters("status")
    @Severity(SeverityLevel.NORMAL)
    @Description("My Refunds: Status görülmeli")
    @Test(groups = {"Regression", "Customer"})
    public void TC_22_37() throws InterruptedException {
        profilPage.goToMyRefunds();
        Thread.sleep(3000);
        WebElement statusLocater = Driver.getDriver().findElement(By.
                xpath("//th[.='Status']"));
        softAssert.assertTrue(statusLocater.isDisplayed());
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
        profilPage.goToMyRefunds();
        Thread.sleep(3000);
        WebElement elementLocater = Driver.getDriver().
                findElement(By.xpath("//th[.='" + element + "']"));

        softAssert.assertTrue(elementLocater.isDisplayed());
    }
}
