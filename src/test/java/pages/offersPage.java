package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class offersPage {
    public offersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //"We source the best healthy foods for you." locater
    @FindBy(xpath = "(//span[.='Copy'])[6]")
    public WebElement copy20$;
    @FindBy(xpath = "(//span[.='Copied!'])[6]")
    public WebElement copied20$;
    @FindBy(xpath = "(//span[.='Copy'])[1]")
    public WebElement copy2$;
    @FindBy(xpath = "(//*[.='Copied!'])[1]")
    public WebElement copied2$;

    @FindBy(xpath = "(//span[.='Copy'])[9]")
    public WebElement copy5$;
    @FindBy(xpath = "(//span[.='Copied!'])[9]")
    public WebElement copied5$;
    @FindBy(xpath = "(//span[.='Copy'])[4]")
    public WebElement copy12$;
    @FindBy(xpath = "(//span[.='Copied!'])[4]")
    public WebElement copied12$;
    public static  void offersGiris() {

    }
}
