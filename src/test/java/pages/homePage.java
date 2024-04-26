package pages;

import org.openqa.selenium.By;
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
    public WebElement pickBazarButonHomePage ;






























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
















    @FindBy(xpath = "//a[.='Shops']")
    public WebElement shopsButtonHomePage;

    @FindBy(xpath = "//a[.='Offers']")
    public WebElement offersButtonHomePage;

    @FindBy(xpath = "//a[.='FAQ']")
    public WebElement faqButtonHomePage;

    @FindBy(xpath = "//a[.='Contact']")
    public WebElement contactButtonHomePage;

    @FindBy(xpath = "//a[.='Become a Seller']")
    public WebElement becomeASellerButtonHomePage;

    @FindBy(xpath = "//button[.='Join']")
    public WebElement joinButtonHomePage;

    @FindBy(xpath = "//img[@alt='902']")
    public WebElement expressDeliveryFrameHomePage;

    @FindBy(xpath = "//img[@alt='903']")
    public WebElement cashOnDeliveryFrameHomePage;
    @FindBy(xpath = "//img[@alt='904']")
    public WebElement giftVoucherFrameHomePage;

   @FindBy(xpath = "//article[@class='product-card cart-type-neon h-full" +
           " transform overflow-hidden rounded border border-border-200 bg-light shadow-sm transition-all duration-200 hover:-translate-y-0.5 hover:shadow']")
    public List<WebElement> groceryUrunleriHomePage;



    @FindBy(xpath = "//li[@class='rounded-md py-1']")
    public List<WebElement> groceryAltMenuUrunleriHomePage;





































}
