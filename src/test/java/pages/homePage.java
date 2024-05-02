package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import utilities.ConfigReader;
import utilities.ConfigReader;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
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
    @FindBy(xpath = "//span[.=\"Bakery\"]")
    public WebElement bakeryDropDownMenu;
    @FindBy(xpath = "//span[.=\"Makeup\"]")
    public WebElement makeupDropDownMenu;
    @FindBy(xpath = "//span[.=\"Bags\"]")
    public WebElement bagsDropDownMenu;
    @FindBy(xpath = "//span[.=\"Clothing\"]")
    public WebElement clothingDropDownMenu;
    @FindBy(xpath = "//span[.=\"Furniture\"]")
    public WebElement furnitureDropDownMenu;
    @FindBy(xpath = "//span[.=\"Books\"]")
    public WebElement booksDropDownMenu;

    @FindBy(xpath = "//img[@alt=\"Apples\"]")
    public WebElement groceryApples;
    @FindBy(xpath = "//div[starts-with(@class,'grid grid-cols')]/article")
    // bize anasayfadaki ürünlerin bir Listesi döner,
    public List<WebElement> anasayfaUrunList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//button[.='Load More']")
    public WebElement loadMoreButton;

    @FindBy(xpath = "(//button[.='Add'])[1]")
    public WebElement addButton;
    @FindBy(xpath = "(//div[starts-with(@class,'flex overflow-hidden')]/button[1])[1]")
    public WebElement minusButton;
    @FindBy(xpath = "(//div[starts-with(@class,'flex overflow-hidden')]/button[2])[1]")
    public WebElement plusButton;

    @FindBy(xpath = "//span[.='Cart']")
    public WebElement cartButton;
    @FindBy(xpath = "(//span[.='Add To Shopping Cart'])[2]")
    public WebElement clothingAddToShoppingCartButton;
    @FindBy(xpath = "//div[starts-with(@class,'flex flex-1 items-center')]")
    public WebElement sepeteEklenenUrunSayisi;
    @FindBy(xpath = "(//div[starts-with(@class,'flex flex-1 items-center')])[2]")
    public WebElement clothingSepeteEklenenUrunSayisi;



    @FindBy(xpath = "//span[starts-with(@class,'grid h-7 w-7')]")
    public WebElement groceryArtiButton;
    @FindBy(xpath = "//button[starts-with(@class,'flex h-7 w-7 ')]")
    public WebElement bakeryaArtiButton;
    @FindBy(xpath = "//button[contains(@class,'w-7')]")
    public WebElement clothingArtiButton;


    @FindBy(xpath = "((//div[starts-with(@class,'-mb-1.5 flex w-full')])[3]/div)[1]")  // Clothin menusunde ürün
    public WebElement clothingUrunColor;      //
    @FindBy(xpath = "((//div[starts-with(@class,'-mb-1.5 flex w-full')])[4]/div)[1]")  //
    public WebElement clothingUrunSize;      //


    @FindBy(xpath = "//h3[contains(@class,'text')]")  // bize anasayfadaki (DaiyNeeds ve books haric) ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaUrunIsimList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//h3[contains(@class,'text')]")  // bize anasayfadaki Grocery ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaGroceryUrunIsimList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//h3[contains(@class,'text')]")  // bize anasayfadaki Bakery ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaBakeryUrunIsimList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//h3[contains(@class,'text')]")  // bize anasayfadaki Makeup ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaMakeupUrunIsimList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//h3[contains(@class,'text')]")  // bize anasayfadaki Bags ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaBagsUrunIsimList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//h3[contains(@class,'text')]")  // bize anasayfadaki Furniture ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaClothingUrunIsimList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//h3[contains(@class,'text')]")  // bize anasayfadaki Furniture ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaFurnitureUrunIsimList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//header[starts-with(@class,'flex shrink')]/a")  // bize anasayfadaki Books ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaBooksIsimList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'flex flex-col')]/h3")  // bize anasayfadaki DaiyNeeds ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaDaiyNeedsUrunIsimList;      // Bulunamadiginda bos liste

    @FindBy(xpath = "//img[starts-with(@class,'product-image')]")  // bize anasayfadaki (DaiyNeeds haric) ürünlerin img listesini dönderir,
    public List<WebElement> anasayfaImgList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//img[starts-with(@class,'product-image')]")  // bize anasayfadaki Grocer ürünlerin img listesini dönderir,
    public List<WebElement> anasayfaGrocerImgList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//img[starts-with(@class,'product-image')]")  // bize anasayfadaki Bakery ürünlerin img listesini dönderir,
    public List<WebElement> anasayfaBakeryImgList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//img[starts-with(@class,'product-image')]")  // bize anasayfadaki Makeup ürünlerin img listesini dönderir,
    public List<WebElement> anasayfaMakeupImgList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//img[starts-with(@class,'product-image')]")  // bize anasayfadaki Bags ürünlerin img listesini dönderir,
    public List<WebElement> anasayfaBagsImgList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//img[starts-with(@class,'product-image')]")  // bize anasayfadaki Furniture ürünlerin img listesini dönderir,
    public List<WebElement> anasayfaFurnitureImgList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'absolute bottom')]/span/img")  // bize anasayfadaki DaiyNeeds e ait ürünlerin img listesini dönderir,
    public List<WebElement> anasayfaDaiyNeedsImgList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//img[starts-with(@class,'product-image')]")  // bize anasayfadaki Books ürünlerin img listesini dönderir,
    public List<WebElement> anasayfaBooksImgList;      // Bulunamadiginda bos liste

    @FindBy(xpath = "//div[starts-with(@class,'mb-2 flex items-')]/span")  // bize anasayfadaki ürünlerin Fiyat listesini dönderir,
    public List<WebElement> anasayfaFiyatList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'mb-2 flex items-')]/span")  // bize anasayfadaki ürünlerin Fiyat listesini dönderir,
    public List<WebElement> anasayfaGrocerFiyatList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'mb-2 flex items-')]/span")  // bize anasayfadaki ürünlerin Fiyat listesini dönderir,
    public List<WebElement> anasayfaBakeryFiyatList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'relative mt-7')]/div/span")  // bize anasayfadaki Makeup ürünlerin Fiyat listesini dönderir,
    public List<WebElement> anasayfaMakeupFiyatList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//span[starts-with(@class,'text-sm font-semibold')]")  // bize anasayfadaki ürünlerin Fiyat listesini dönderir,
    public List<WebElement> anasayfaBagsFiyatList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//header[starts-with(@class,'p-3 md:p-6')]/div")  // bize anasayfadaki Clothing ürünlerin Fiyat listesini dönderir,
    public List<WebElement> anasayfaClothingFiyatList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'flex items-center')]/span")  // bize anasayfadaki ürünlerin Fiyat listesini dönderir,
    public List<WebElement> anasayfaFurnitureFiyatList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'flex shrink-')]")  // bize anasayfadaki Books ürünlerin Fiyat listesini dönderir,
    public List<WebElement> anasayfaBooksFiyatList;      // Bulunamadiginda bos liste

    @FindBy(xpath = "//div[starts-with(@class,'absolute top-3 rounded')]")  // bize anasayfadaki ürünlerin ürün indirim orani  listesini dönderir,
    public List<WebElement> anasayfaUrunIndirimOraniList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'absolute top-3 rounded')]")  // bize anasayfadaki ürünlerin ürün indirim orani  listesini dönderir,
    public List<WebElement> anasayfaGrocerUrunIndirimOraniList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'absolute top-3 rounded')]")  // bize anasayfadaki ürünlerin ürün indirim orani  listesini dönderir,
    public List<WebElement> anasayfaBakeryUrunIndirimOraniList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'absolute top-3 rounded')]")  // bize anasayfadaki ürünlerin ürün indirim orani  listesini dönderir,
    public List<WebElement> anasayfaMakeupUrunIndirimOraniList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'absolute top-3 rounded')]")  // bize anasayfadaki ürünlerin ürün indirim orani  listesini dönderir,
    public List<WebElement> anasayfaBagsUrunIndirimOraniList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'absolute top-3 rounded')]")  // bize anasayfadaki ürünlerin ürün indirim orani  listesini dönderir,
    public List<WebElement> anasayfaClothingUrunIndirimOraniList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'absolute top-3 rounded')]")  // bize anasayfadaki Furniture ürünlerin ürün indirim orani listesini dönderir,
    public List<WebElement> anasayfaFurnitureUrunIndirimOraniList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'text-xs text-accent')]")  // bize anasayfadaki ürünlerin ürün indirim orani  listesini dönderir,
    public List<WebElement> anasayfaBooksUrunIndirimOraniList;      // Bulunamadiginda bos liste


    @FindBy(xpath = "//div[starts-with(@id,'headlessui-menu-')]")  // bize anasayfadaki Shelf dropdown menu deki 8 kategorinin listesini dönderir,
    public List<WebElement> anasayfaShelfDropdownMenuList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'flex flex-col')]/h3")  // dailyNeeds menu altinda deki 8 kategorinin listesini dönderir,
    public List<WebElement> dailyNeedsMenuUrunList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//a[starts-with(@class,'text-sm font-semibold text-heading')]")  // books menu altinda deki ürünlerin isim listesini dönderir,
    public List<WebElement> booksMenuUrunList;      // Bulunamadiginda bos liste


















    @FindBy(xpath = "(//span[@class='whitespace-nowrap'])[1]")
    public WebElement groceryDropDownMenuHomePage;

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

    @FindBy(xpath = "//h1[@class='text-2xl font-bold tracking-tight text-heading lg:text-4xl xl:text-5xl']")
    public WebElement groceriesDeliveredIn90MinuteText;

    @FindBy(xpath = "//h3[.='All Shops']")
    public WebElement allShopsShopsPage;

    public void pickBazarButonClickMethod() throws InterruptedException, IOException {

        pickBazarButonHomePage.click();
        Assert.assertTrue(groceriesDeliveredIn90MinuteText.isDisplayed());
        ReusableMethods.takeScreenshot("Groceries Delivered in 90 Minute ");

    }

    @FindBy(xpath = "//h1[.='FAQ']")
    public WebElement faqTextFAQPage;































    @FindBy(xpath = "(//span[.='Add'])[1]")
    public WebElement applesAddButton;
    //article[20]//header[1]//button[1]//span[1]
    @FindBy(xpath = "(//span[.='Add'])[1]")
    public WebElement spinachAddButton;






    @FindBy(xpath = "//span[@class='bg-light rounded w-full py-2 px-2 text-accent mt-3']")
    public WebElement chartButtonAtrightPrice;
    //div[starts-with(@class,'flex-grow pt')]
    @FindBy(xpath = "//div[starts-with(@class,'flex-grow pt')]")
    public WebElement checkoutButtonArea;
    @FindBy(xpath = "//span[starts-with(@class,'flex h-full flex-1 ')]")
    public WebElement checkoutButton;
    public void chartAddFunctions(){
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
    }





























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



    public double valueEvuloation (WebElement apples, WebElement spinach){
        double total = Double.parseDouble(apples.getText().substring(1))+Double.parseDouble(spinach.getText().substring(1));
        return total;
    }





}
