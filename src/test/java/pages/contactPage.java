package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class contactPage {
    public contactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//input[starts-with(@class, 'flex w-full appearance-none')])[1]")
    public WebElement nameButton;
    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//span[.='Address']")
    public WebElement adresBilgileri;
    @FindBy(xpath = "(//span[@class='text-sm text-body'])[2]")
    public WebElement phoneBilgileri;
    @FindBy(xpath = "//span[.='Website']")
    public WebElement webseiteBilgileri;
    @FindBy(xpath = "//a[.='Visit This Site']")
    public WebElement visitButton;
    @FindBy(xpath = "(//a[@class='text-muted transition-colors duration-300 focus:outline-none ltr:mr-8 ltr:last:mr-0 rtl:ml-8 rtl:last:ml-0 hover:undefined'])[1]")
    public WebElement facebookButton;
    @FindBy(xpath = "(//a[@class='text-muted transition-colors duration-300 focus:outline-none ltr:mr-8 ltr:last:mr-0 rtl:ml-8 rtl:last:ml-0 hover:undefined'])[2]")
    public WebElement instagramButton;
    @FindBy(xpath = "(//a[@class='text-muted transition-colors duration-300 focus:outline-none ltr:mr-8 ltr:last:mr-0 rtl:ml-8 rtl:last:ml-0 hover:undefined'])[3]")
    public WebElement twitterButton;
}
