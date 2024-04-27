package pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class profilPage {
    public profilPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "img[alt=\"user name\"]")
    public WebElement profilFotoSekmesi;

    @FindBy(xpath = "//button[.=\"Profile\"]")
    public WebElement profileKategorisi;

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


}
