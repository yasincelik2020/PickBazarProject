package pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class profilPage {
    @Parameters("browser")
    public profilPage(@Optional("chrome") String browser) {
        PageFactory.initElements(Driver.getDriver(browser), this);
    }

    @FindBy(css = "img[alt=\"user name\"]")
    public WebElement profilFotoSekmesi;

    @FindBy(xpath = "//button[.=\"Profile\"]")
    public WebElement profileKategorisi;

    @FindBy(xpath = "//button[.='My Orders']")
    public WebElement myOrderKategorisi;

    @FindBy(xpath = "//a[.='Downloads']")
    public WebElement downloadsKategorisi;

    @FindBy(xpath = "//a[.='My Wishlists']")
    public WebElement myWishlistsKategorisi;

    @FindBy(xpath = "//a[.='My Refunds']")
    public WebElement myRefundsKategorisi;

    @FindBy(xpath = "//a[.='My Reports']")
    public WebElement myReportsKategorisi;

    @FindBy(xpath = "//a[.='Need Help']")
    public WebElement needHelpKategorisi;

    @FindBy(xpath = "//span[.='Total']")
    public WebElement total;

    @FindBy(xpath = "//span[.='Used']")
    public WebElement used;

    @FindBy(xpath = "//span[.='Available']")
    public WebElement available;

    @FindBy(xpath = "//span[.='Upload an image']")
    public WebElement image;

    @FindBy(xpath = "//label[.='Name']")
    public WebElement name;

    @FindBy(xpath = "//label[.='Bio']")
    public WebElement bio;

    @FindBy(xpath = "//p[.='Contact Number']")
    public WebElement contactNumber;

    @FindBy(xpath = "//p[.='Addresses']")
    public WebElement addresses;

    @FindBy(xpath = "//a[.='Change Password']")
    public WebElement changePasswordSekme;

    @FindBy(xpath = "//*[@id=\"oldPassword\"]")
    public WebElement oldPassword;

    @FindBy(xpath = "//*[@id=\"newPassword\"]")
    public WebElement newPassword;

    @FindBy(xpath = "//*[@id=\"passwordConfirmation\"]")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button[text()=\"Submit\"]")
    public WebElement submit;

    @FindBy(xpath = "(//span[.='Add'])[1]")
    public WebElement applesAddButton;

    @FindBy(xpath = "//a[@class='text-base font-semibold text-heading transition-colors hover:text-accent']")
    public List<WebElement> kitapUrunListe;

    @FindBy(xpath = "//button[.='Download']")
    public List<WebElement> downloadButtonListe;

    @FindBy(xpath = "//ins[@class='text-xl font-semibold text-heading no-underline']")
    public List<WebElement> myWishFiyatListe;

    @FindBy(xpath = "//img[@alt='text']")
    public List<WebElement> myWishImageListe;

    @FindBy(xpath = "//span[.='Add to Cart']")
    public List<WebElement> myWishAddToCardListe;

    @FindBy(xpath = "//button[.='Remove']")
    public List<WebElement> myWishRemoveListe;

    @FindBy(xpath = "//span[text()='1 Item']")
    public WebElement itemButton;

    @FindBy(xpath = "(//span[.='$1.60'])[1]")
    public WebElement applesFiyat;

    @FindBy(xpath = "//span[.='Checkout']")
    public WebElement checkOut;

    @FindBy(xpath = "(//section[@class='relative flex h-full flex-col']//button)[1]")
    public WebElement closeEklenenUrunSayfa;

    @FindBy(xpath = "//a[.='Greddy Love']")
    public WebElement eklenenUrunMyOrder;

    @FindBy(xpath = "//th[.='ID']")
    public WebElement idLocater;

    @FindBy(xpath = "//th[.='Reason']")
    public WebElement reasonLocater;

    @FindBy(xpath = "//th[.='Status']")
    public WebElement statusLocater;

    @FindBy(xpath = "//td[.='xvcgfdgdfg']")
    public WebElement myRapor;

    @FindBy(xpath = "//h1[.='FAQ']")
    public WebElement FAQ;

    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logout1;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginLogout;

    @Parameters("browser")
    public void kasaApplesUrununuEkleme(@Optional("chrome") String browser) throws InterruptedException {
        loginPage loginPage = new loginPage(browser);
        profilPage profilPage = new profilPage(browser);
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        loginPage.loginMethod(browser);
        profilPage.applesAddButton.click();// elma eklendi
    }

    @Parameters("browser")
    public void goToMyRefunds(@Optional("chrome") String browser) throws InterruptedException {
        loginPage loginPage = new loginPage(browser);
        profilPage profilPage = new profilPage(browser);
        loginPage.loginMethod(browser);
        profilPage.profilFotoSekmesi.click();
        profilPage.profileKategorisi.click();
        profilPage.myRefundsKategorisi.click();
    }

    @Parameters("browser")

    public void goToProfilPage(@Optional("chrome") String browser) throws InterruptedException {
        profilPage profilPage = new profilPage(browser);
        loginPage loginPage = new loginPage(browser);
        loginPage.loginMethod(browser);
        profilPage.profilFotoSekmesi.click();
        profilPage.profileKategorisi.click();
    }

    public void goToMyOrderPage(@Optional("chrome") String browser) throws InterruptedException {
        loginPage loginPage = new loginPage(browser);
        profilPage profilPage = new profilPage(browser);
        loginPage.loginMethod(browser);
        profilPage.profilFotoSekmesi.click();
        profilPage.myOrderKategorisi.click();
    }

    @Parameters("browser")

    public void goToDownloadsPage(@Optional("chrome") String browser) throws InterruptedException {
        loginPage loginPage = new loginPage(browser);
        profilPage profilPage = new profilPage(browser);
        loginPage.loginMethod(browser);
        profilPage.profilFotoSekmesi.click();
        profilPage.profileKategorisi.click();
        profilPage.downloadsKategorisi.click();
    }

    @Parameters("browser")

    public void goToMyWishLists(@Optional("chrome") String browser) throws InterruptedException {
        loginPage loginPage = new loginPage(browser);
        profilPage profilPage = new profilPage(browser);
        loginPage.loginMethod(browser);
        profilPage.profilFotoSekmesi.click();
        profilPage.profileKategorisi.click();
        profilPage.myWishlistsKategorisi.click();
    }

    @Parameters("browser")

    public void goToMyReports(@Optional("chrome") String browser) throws InterruptedException {
        loginPage loginPage = new loginPage(browser);
        profilPage profilPage = new profilPage(browser);
        loginPage.loginMethod(browser);
        profilPage.profilFotoSekmesi.click();
        profilPage.profileKategorisi.click();
        profilPage.myReportsKategorisi.click();
    }

    @Parameters("browser")

    public void goToNeedHelp(@Optional("chrome") String browser) throws InterruptedException {
        loginPage loginPage = new loginPage(browser);
        profilPage profilPage = new profilPage(browser);
        loginPage.loginMethod(browser);
        profilPage.profilFotoSekmesi.click();
        profilPage.profileKategorisi.click();
        profilPage.needHelpKategorisi.click();
    }

}
