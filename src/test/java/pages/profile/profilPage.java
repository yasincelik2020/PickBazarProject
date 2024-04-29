package pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class profilPage {
    public profilPage() {
        PageFactory.initElements(Driver.getDriver(), this);
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

    public void goToProfilPage() throws InterruptedException {
        profilPage profilPage = new profilPage();
        loginPage loginPage = new loginPage();
        loginPage.loginMethod();
        profilPage.profilFotoSekmesi.click();
        profilPage.profileKategorisi.click();
    }

    public void goToMyOrderPage() throws InterruptedException {
        loginPage loginPage = new loginPage();
        profilPage profilPage = new profilPage();
        loginPage.loginMethod();
        profilPage.profilFotoSekmesi.click();
        profilPage.myOrderKategorisi.click();
    }

    public void goToDownloadsPage() throws InterruptedException {
        loginPage loginPage = new loginPage();
        profilPage profilPage = new profilPage();
        loginPage.loginMethod();
        profilPage.profilFotoSekmesi.click();
        profilPage.profileKategorisi.click();
        profilPage.downloadsKategorisi.click();
    }

    public void goToMyWishLists() throws InterruptedException {
        loginPage loginPage = new loginPage();
        profilPage profilPage = new profilPage();
        loginPage.loginMethod();
        profilPage.profilFotoSekmesi.click();
        profilPage.profileKategorisi.click();
        profilPage.myWishlistsKategorisi.click();

    }

    public void goToMyRefunds() throws InterruptedException {
        loginPage loginPage = new loginPage();
        profilPage profilPage = new profilPage();
        loginPage.loginMethod();
        profilPage.profilFotoSekmesi.click();
        profilPage.profileKategorisi.click();
        profilPage.myRefundsKategorisi.click();
    }

    public void kasaApplesUrununuEkleme() throws InterruptedException {
        loginPage loginPage = new loginPage();
        profilPage profilPage = new profilPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        loginPage.loginMethod();
        profilPage.applesAddButton.click();// elma eklendi
    }


}
