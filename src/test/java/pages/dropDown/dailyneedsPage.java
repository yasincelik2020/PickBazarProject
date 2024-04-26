package pages.dropDown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;

public class dailyneedsPage {
    public dailyneedsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //"You deserve to eat fresh" yazisi görüntülenir.
    @FindBy(xpath = "//h1[.=\"You Deserve To Eat Fresh\"]")
    public WebElement dailyNeedsYouDeserve;

    //"We source the best healthy foods for you." locater
    @FindBy(xpath = "//p[.=\"We source the best healthy foods for you.\"]")
    public WebElement dailyNeedsWeSourse;

    //"Search" secenegi olan frame görüntülenir.
    @FindBy(id = "search")
    public WebElement dailyNeedsWeSearchFrame;

    public void dailyNeedsPageGit() {// page methodu
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        homePage.dailyNeedsDropDownMenu.click();
    }

    //Arama yapmak icin  "Search" butonu görülür,
    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement dailyNeedsWeSearchButton;

    //Search alaninda DailyNeds kategorisinden bir ürün aranmdi
    @FindBy(xpath = "//span[.=\"Sekka grain rice 2lb\"]")
    public WebElement sekkaGrainRiceUrunu;


}


