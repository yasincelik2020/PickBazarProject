package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class loginPage {
    public loginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[.=\"Join\"]")
    public WebElement joinButton;

    @FindBy(id = "email")
    public WebElement eMail;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.=\"Login\"]")
    public WebElement loginButton;

    public void loginMethod() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        Thread.sleep(3000);
        joinButton.click();
        eMail.sendKeys(ConfigReader.getProperty("eposta"));
        password.sendKeys(ConfigReader.getProperty("password"));
        loginButton.click();
    }


}
