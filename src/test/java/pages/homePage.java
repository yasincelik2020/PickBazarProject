package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;


public class homePage {

    public homePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "headlessui-menu-button-1")
    public WebElement homePageDropDownMenu;

    @FindBy(xpath = "//span[.=\"Daily Needs\"]")
    public WebElement dailyNeedsDropDownMenu;

    @FindBy(xpath = "//img[@alt='Pickbazar']")
    public WebElement pickBazarButonHomePage ;

    @FindBy(xpath = "//a[.='Offers']")
    public WebElement offersButon ;
    @FindBy(xpath = "//a[.='FAQ']")
    public WebElement faqButon ;
    @FindBy(xpath = "//a[.='Contact']")
    public WebElement contactButon ;
    @FindBy(xpath = "//img[@alt='user name']")
    public WebElement profilresmiButon ;

    public WebElement PickBazarButon;


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
    @FindBy(xpath = "//div[starts-with(@class,'grid grid-cols')]/article")
    // bize anasayfadaki ürünlerin bir Listesi döner,
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


























































    @FindBy(xpath = "//article[1]//header[1]//button[1]//span[1]")
    public WebElement applesAddButton;
    //article[20]//header[1]//button[1]//span[1]
    @FindBy(xpath = "//article[20]//header[1]//button[1]//span[1]")
    public WebElement spinachAddButton;

    @FindBy(xpath = "//span[starts-with(@class,'flex ltr')]")
    public WebElement itemsNumber;
    @FindBy(xpath = "(//span[starts-with(@class,'text-sm ')])[1]")
    public WebElement applesPriceValue;

    @FindBy(xpath = "(//span[starts-with(@class,'text-sm ')])[2]")
    public WebElement spinachPriceValue;

    @FindBy(xpath = "//div[@class='min-h-screen']//button[2]//*[name()='svg']")
    public WebElement applesAddButtonPlusSign;

    @FindBy(xpath = "(//button[starts-with(@class,'cursor-pointer p-2 ')])[1]")
    public WebElement applesAddButtonMinusSign;
    @FindBy(xpath = "//span[@class='flex ltr:ml-2 rtl:mr-2']")
    public WebElement chartButtonAtrightItemCount;

    @FindBy(xpath = "//span[@class='bg-light rounded w-full py-2 px-2 text-accent mt-3']")
    public WebElement chartButtonAtrightPrice;

    @FindBy(xpath = "//span[starts-with(@class,'flex h-full flex-1 ')]")
    public WebElement checkoutButton;
    public void chartAddFunctions(){
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
    }

    public double valueEvuloation (WebElement apples, WebElement spinach){
        double total = Double.parseDouble(apples.getText().substring(1))+Double.parseDouble(spinach.getText().substring(1));
        return total;
    }





}
