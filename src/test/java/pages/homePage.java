package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class homePage {

    public homePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="headlessui-menu-button-1")
    public WebElement homePageDropDownMenu;

    @FindBy(xpath = "//span[.=\"Daily Needs\"]")
    public WebElement dailyNeedsDropDownMenu;

    @FindBy(xpath = "//img[@alt='Pickbazar']")
    public WebElement PickBazarButon ;






























    @FindBy(xpath = "//span[.=\"Grocery\"]")
    public WebElement groceryDropDownMenu;
    //
    @FindBy(xpath = "//span[.=\"Bakery\"]")
    public WebElement bakeryDropDownMenu;
    @FindBy(xpath = "//span[.=\"Bags\"]")
    public WebElement bagsDropDownMenu;
    @FindBy(xpath = "//span[.=\"Clothing\"]")
    public WebElement clothingDropDownMenu;
    @FindBy(xpath = "//span[.=\"Furniture\"]")
    public WebElement furnitureDropDownMenu;
    @FindBy(xpath = "//img[@alt=\"Apples\"]")
    public WebElement groceryApples;
    @FindBy(xpath = "//div[starts-with(@class,'grid grid-cols')]/article")  // bize anasayfadaki ürünlerin bir Listesi döner,
    public List<WebElement> anasayfaUrunList;      // Bulunamadiginda bos liste






}
