package pages.dropDown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class bakeryPage {
    public bakeryPage() {
        PageFactory.initElements(Driver.getDriver("browser"), this);
    }
    public void bakeryPageGit() {// page methodu
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
    }
    //Get Your Bakery Items Delivered
    @FindBy(xpath = "//h1[.=\"Get Your Bakery Items Delivered\"]")
    public WebElement bakeryGetYour;

    //Get your favorite bakery items baked and delivered to your doorsteps at any time
    @FindBy(xpath = "//p[.=\"Get your favorite bakery items baked and delivered to your doorsteps at any time\"]")
    public WebElement bakeryGetYourFavorite;

    //"Search" secenegi olan frame görüntülenir.
    @FindBy(id = "search")
    public WebElement bakeryWeSearchFrame;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement bakeryWeSearchButton;

    @FindBy(xpath = "//h3[.=\"Raspberry Crumble Cookies 300g\"]")
    public WebElement raspberryCrumbleCookiesUrunu;

    @FindBy(xpath = "//h3[.=\"Pears\"]")
    public WebElement pearsUrunu;





}
