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

    public void profilePageUrlAl(){

    }

}
