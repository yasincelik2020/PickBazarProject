package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class faqPage {
    public faqPage() {
        PageFactory.initElements(Driver.getDriver("browser"), this);
    }
    @FindBy(xpath = "//h1[.='FAQ']")
    public WebElement faqText;
    @FindBy(xpath = "//h2[.='How to contact with Customer Service?']")
    public WebElement faqilkSoru;
    @FindBy(xpath = "//h2[.='App installation failed, how to update system information?']")
    public WebElement faqIkinciSoru;
    @FindBy(xpath = "//h2[.='Website response taking time, how to improve?']")
    public WebElement faqUcuncuSoru;
    @FindBy(xpath = "//h2[.='How do I create a account?']")
    public WebElement faqDorduncuSoru;
    @FindBy(xpath = "//*[@class='flex-shrink-0 stroke-2']")
    public List<WebElement> faqSorularList;
    @FindBy(xpath = "(//*[@class='flex-shrink-0 stroke-2'])[1]")
    public WebElement faqilkSoruIsareti;
    @FindBy(xpath = "//*[.='Our Customer Experience Team is available 7 days a week and we offer 2 ways to get in contact.Email and Chat . We try to reply quickly, so you need not to wait too long for a response!.']")
    public WebElement faqilkSoruCevap;
    @FindBy(xpath = "(//*[@class='flex-shrink-0 stroke-2'])[2]")
    public WebElement faqIkinciSoruIsareti;
    @FindBy(xpath = "//*[.='Please read the documentation carefully . We also have some online video tutorials regarding this issue . If the problem remains, Please Open a ticket in the support forum']")
    public WebElement faqIkinciSoruCevap;
    @FindBy(xpath = "(//*[@class='flex-shrink-0 stroke-2'])[3]")
    public WebElement faqUcuncuSoruIsareti;
    @FindBy(xpath = "//*[.='At first, Please check your internet connection . We also have some online video tutorials regarding this issue . If the problem remains, Please Open a ticket in the support forum.']")
    public WebElement faqUcuncuSoruCevap;
    @FindBy(xpath = "(//*[@class='flex-shrink-0 stroke-2'])[4]")
    public WebElement faqDorduncuSoruIsareti;
    @FindBy(xpath = "//*[.='If you want to open an account for personal use you can do it over the phone or online. Opening an account online should only take a few minutes.']")
    public WebElement faqDorduncuSoruCevap;

}
