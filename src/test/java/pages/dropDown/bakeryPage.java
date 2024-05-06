package pages.dropDown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class bakeryPage {
    @Parameters("browser")
    public bakeryPage(@Optional("chrome")String browser) {
        PageFactory.initElements(Driver.getDriver(browser), this);
    }
    @Parameters("browser")
    public void bakeryPageGit(@Optional("chrome")String browser) {// page methodu
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        homePage.bakeryDropDownMenu.click();
    }
    @FindBy(xpath = "//h1[.=\"Get Your Bakery Items Delivered\"]")
    public WebElement bakeryGetYour;

    @FindBy(xpath = "//p[.=\"Get your favorite bakery items baked and delivered to your doorsteps at any time\"]")
    public WebElement bakeryGetYourFavorite;

    @FindBy(id = "search")
    public WebElement bakeryWeSearchFrame;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement bakeryWeSearchButton;

    @FindBy(xpath = "//h3[.=\"Raspberry Crumble Cookies 300g\"]")
    public WebElement raspberryCrumbleCookiesUrunu;

    @FindBy(xpath = "//h3[.=\"Pears\"]")
    public WebElement pearsUrunu;

}
