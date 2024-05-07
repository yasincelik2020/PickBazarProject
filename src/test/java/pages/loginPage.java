package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class loginPage {
    public loginPage(@Optional("chrome")String browser) {
        PageFactory.initElements(Driver.getDriver(browser), this);
    }


    @FindBy(xpath = "//button[.=\"Join\"]")
    public WebElement joinButton;

    @FindBy(id = "email")
    public WebElement eMail;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.=\"Login\"]")
    public WebElement loginButton;
    @FindBy(xpath = "(//label[@for='password'])[2]")
    public WebElement passwordVisible;
    @FindBy(xpath = "//button[.='Register']")
    public WebElement registerYazisi;
    @FindBy(xpath = "//input[starts-with(@class, 'flex w-full appearance-none items-center')]")
    public WebElement nameRegister;
    @FindBy(xpath = "//div[@class='text-center text-sm text-body sm:text-base']")
    public WebElement allreadyHaveYazisi;
    @FindBy(xpath = "//button[.='Register']")
    public WebElement registerButton;
    @FindBy(xpath = "//span[.='user avatar']")
    public WebElement userAvatar;
    @FindBy(xpath = "//button[.='Forgot password?']")
    public WebElement passwordForgot;
    @FindBy(xpath = "//input[starts-with(@class, 'flex w-full appearance-none items-center')]")
    public WebElement passwordForgotEmail;
    @FindBy(xpath = "//button[.='Submit Email']")
    public WebElement passwordForgotSubmitEmail;
    @FindBy(xpath = "//p[.='Password change successful']")
    public WebElement passwordChangeSuccessful;
    @FindBy(xpath = "//button[.='Login with Google']")
    public WebElement loginWithGoogleButon;
    @FindBy(xpath = "//pre[.='Internal Server Error']")
    public WebElement errorYazisi;
    @FindBy(xpath = "//button[.='Login with Mobile number']")
    public WebElement loginWithMobileButon;
    @FindBy(xpath = "//input[@type='tel']")
    public WebElement nummerButon;
    @FindBy(xpath = "//button[.='Send OTP']")
    public WebElement sendOtpButon;
    @FindBy(xpath = "//input[@aria-label='Please enter verification code. Character 1']")
    public WebElement otpCode1;
    @FindBy(xpath = "//input[@aria-label='Character 2']")
    public WebElement otpCode2;
    @FindBy(xpath = "//input[@aria-label='Character 3']")
    public WebElement otpCode3;
    @FindBy(xpath = "//input[@aria-label='Character 4']")
    public WebElement otpCode4;
    @FindBy(xpath = "//input[@aria-label='Character 5']")
    public WebElement otpCode5;
    @FindBy(xpath = "//input[@aria-label='Character 6']")
    public WebElement otpCode6;
    @FindBy(xpath = "//button[.='Verify Code']")
    public WebElement verifyCodeButton;
    @FindBy(xpath = "//p[starts-with(@class,'mt-4 text-sm leading-relaxed')]")
    public WebElement loginWithMobileYazisi;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement resgisterLoginButton;
    @FindBy(xpath = "//p[.='Login with your email & password']")
    public WebElement loginYazisi;

    public void loginMethod(@Optional("chrome")String browser) throws InterruptedException {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        ReusableMethods.waitForVisibility(joinButton,10);
        joinButton.click();
        eMail.sendKeys(ConfigReader.getProperty("eposta"));
        password.sendKeys(ConfigReader.getProperty("password"));
        loginButton.click();

    }
    public void registerMethod() throws InterruptedException {
        Thread.sleep(3000);
        joinButton.click();
        registerYazisi.click();
        nameRegister.sendKeys(ConfigReader.getProperty("username"));
        eMail.sendKeys(ConfigReader.getProperty("eposta"));
        password.sendKeys(ConfigReader.getProperty("password"));
        registerButton.click();

    }
    public void passwordYenilemeMethod() throws InterruptedException {
        Thread.sleep(3000);
        joinButton.click();
        passwordForgot.click();
        passwordForgotEmail.sendKeys(ConfigReader.getProperty("eposta"));
        passwordForgotSubmitEmail.click();

    }
    public void loginWithMobileMethod() throws InterruptedException {
        Thread.sleep(3000);
        joinButton.click();
        loginWithMobileButon.click();
        nummerButon.sendKeys("8888888888");
        sendOtpButon.click();
        otpCode1.sendKeys("8");
        otpCode2.sendKeys("8");
        otpCode3.sendKeys("8");
        otpCode4.sendKeys("8");
        otpCode5.sendKeys("8");
        otpCode6.sendKeys("8");Thread.sleep(3000);
        verifyCodeButton.click();





    }


}
