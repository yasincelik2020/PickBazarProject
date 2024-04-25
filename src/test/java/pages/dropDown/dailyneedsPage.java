package pages.dropDown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class dailyneedsPage {
    public dailyneedsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //"We source the best healthy foods for you." locater
    @FindBy(xpath = "//p[.=\"We source the best healthy foods for you.\"]")
    public WebElement dailyNeedsText;
}
