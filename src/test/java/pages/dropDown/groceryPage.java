package pages.dropDown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;

public class groceryPage {
    public groceryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void groceryPageGit() {// page methodu
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
    }

    @FindBy(id = "search")
    public WebElement groceryWeSearchFrame;
    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement groceryWeSearchButton;

    @FindBy(xpath = "//h3[.=\"Clementines\"]")
    public WebElement clementinesUrunu;

    @FindBy(xpath = "//h3[.=\"Tomates\"]")
    public WebElement tomatesUrunu;




}
