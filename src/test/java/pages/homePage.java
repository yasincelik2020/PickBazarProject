package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.Optional;
import utilities.*;
import utilities.*;
import utilities.*;
import utilities.ConfigReader;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.List;


public class homePage {

    public homePage(@Optional("chrome")String browser) {
        PageFactory.initElements(Driver.getDriver(browser), this);
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

    @FindBy(xpath = "//button[.='Load More']")
    public WebElement loadMoreButton;

    @FindBy(xpath = "(//button[.='Add'])[1]")
    public WebElement addButton;
    @FindBy(xpath = "//span[.='Cart']")
    public WebElement cartButton;
    @FindBy(xpath = "(//div[starts-with(@class,'flex overflow-hidden')]/button[1])[1]")
    public WebElement minusButton;
    @FindBy(xpath = "(//div[starts-with(@class,'flex overflow-hidden')]/button[2])[1]")
    public WebElement plusButton;
    @FindBy(xpath = "(//div[starts-with(@class,'flex overflow-hidden')]/button[1])[3]")
    public WebElement altKartminusButton;
    @FindBy(xpath = "(//div[starts-with(@class,'flex overflow-hidden')]/button[2])[3]")
    public WebElement altKartplusButton;
    @FindBy(xpath = "(//span[.='Add To Shopping Cart'])[2]")
    public WebElement addToShoppingCartButton;


    @FindBy(xpath = "//div[starts-with(@class,'flex flex-1 items-center')]")
    public WebElement sepeteEklenenUrunSayisi;
    @FindBy(xpath = "(//div[starts-with(@class,'flex flex-1 items-center')])[3]")
    public WebElement altKartsepeteEklenenUrunSayisi;
    @FindBy(xpath = "//span[starts-with(@class,'grid h-7 w-7')]")
    public WebElement groceryArtiButton;


    @FindBy(xpath = "((//div[starts-with(@class,'-mb-1.5 flex w-full')])[3]/div)[1]")  // Clothin menusunde ürün
    public WebElement clothingUrunColor;      //
    @FindBy(xpath = "((//div[starts-with(@class,'-mb-1.5 flex w-full')])[4]/div)[1]")  //
    public WebElement clothingUrunSize;      //

    @FindBy(xpath = "//*[@id=\"productGallery\"]")  // - ürün image (1 ve daha fayla sayida olabilir)
    public WebElement anasayfaAltkart_UrunImg;      //
    @FindBy(xpath = "//div[starts-with(@class,'w-full')]/div/h1")  //
    public WebElement anasayfaAltkart_UrunIsmi;      ////*[@id="headlessui-dialog-panel-7"]/article/article/div[1]/div[2]/div[1]/div[4]/div/div/div
    @FindBy(xpath = "(//div[starts-with(@class,'flex flex-1 items-center')])[3]")  //***
    public WebElement anasayfaAltkart_UrunMiktari;      //
    @FindBy(xpath = "//span[starts-with(@class,'my-5 flex items')]/ins")  //
    public WebElement anasayfaAltkart_UrunFiyati;      //
    @FindBy(xpath = "//div[starts-with(@class,'rounded-full bg-yellow')]")  //- *** ürün indirim orani (bu kisim zorunlu degildir)
    public WebElement anasayfaAltkart_UrunIndirimOrani;      //
    @FindBy(xpath = "//button[starts-with(@class,'mt-0.5 flex h-10')]")  //- *** like butonu (basta bos sekilde, secildiginde dolu olmali, sadece müsteriler secebilir)
    public WebElement anasayfaAltkart_UrunLikeButtonu;      //
    @FindBy(xpath = "//*[starts-with(@class,'inline-flex shrink-0')]")  //
    public WebElement anasayfaAltkart_UrunPuani;      //
    @FindBy(xpath = "//button[.='Read more']")  // ürün aciklamasi ("Read More" ve "Less" secenekleri ile aciklama detayi görüntülenebilir)
    public WebElement anasayfaAltkart_UrunAciklamasi;      //
    @FindBy(xpath = "//span[starts-with(@class,'whitespace-nowrap text-base')]")  //
    public WebElement anasayfaAltkart_AvailableUrunSayisi;      //
    @FindBy(xpath = "//div[starts-with(@class,'flex flex-row flex-wrap')]")
    public WebElement anasayfaAltkart_UrunKategoriBilgisi;
    @FindBy(xpath = "//button[starts-with(@class,'text-sm tracking-wider')]")
    public WebElement anasayfaAltkart_UrunSaticiBilgileri;
    @FindBy(xpath = "//p[@class='text-sm text-body']")  // "Details" kisminda ürün detaylari
    public WebElement anasayfaAltkart_DetailsKismindaUrunDetaylari;      //
    @FindBy(xpath = "//div[starts-with(@class,'fixed inset-0 h-full')]")  // "Details" kisminda ürün detaylari
    public WebElement altkartdanHomePageGecis;      //

    @FindBy(xpath = "")  //**** "Related Products" kisminda ürünle ilgili diger ürünler image leri, fiyati ve ekleme butonu ile
    public WebElement anasayfaAltkart_UrunRelatedProductsKismi;      //
    @FindBy(xpath = "//div[starts-with(@class,'grid grid-cols-1 md:grid')]/article/div")  // anasayfaAltkart_IlgiliDigerUrunlerImg listesini dönderir,
    public List<WebElement> anasayfaAltkart_IlgiliDigerUrunlerImgList;      //Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'grid grid-cols-1')]/article/header/div/span")  //  anasayfaAltkart_IlgiliDigerUrunlerFiyat listesini dönderir,
    public List<WebElement> anasayfaAltkart_IlgiliDigerUrunlerFiyatList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'grid grid-cols-1')]/article/header/button")  //  anasayfaAltkart_IlgiliDigerUrunlerFiyat listesini dönderir,
    public List<WebElement> anasayfaAltkart_IlgiliDigerUrunlerEklemeButtonuList;      // Bulunamadiginda bos liste




    public void likeButtonuIcinLoginMethodu(@Optional("chrome")String browser) {// page methodu
        Actions actions = new Actions(Driver.getDriver(browser));
        loginPage loginPage = new loginPage(browser);
        loginPage.eMail.sendKeys("abc@gmail.com");
        loginPage.password.sendKeys("abc123");
        loginPage.loginButton.click();

    }



    @FindBy(xpath = "//h3[contains(@class,'text')]")  // bize anasayfadaki (DaiyNeeds ve books haric) ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaUrunIsimList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//h3[contains(@class,'text')]")  // bize anasayfadaki Grocery ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaGroceryUrunIsimList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//h3[contains(@class,'text')]")  // bize anasayfadaki Bakery ürünlerin isim listesini dönderir,
    public List<WebElement> anasayfaBakeryUrunIsimList;      // Bulunamadiginda bos liste

    @FindBy(xpath = "//img[starts-with(@class,'product-image')]")  // bize anasayfadaki (DaiyNeeds haric) ürünlerin img listesini dönderir,
    public List<WebElement> anasayfaImgList;      // Bulunamadiginda bos liste


    @FindBy(xpath = "//div[starts-with(@class,'mb-2 flex items-')]/span")  // bize anasayfadaki ürünlerin Fiyat listesini dönderir,
    public List<WebElement> anasayfaFiyatList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'mb-2 flex items-')]/span")  // bize anasayfadaki ürünlerin Fiyat listesini dönderir,
    public List<WebElement> anasayfaGrocerFiyatList;      // Bulunamadiginda bos liste
    @FindBy(xpath = "//div[starts-with(@class,'mb-2 flex items-')]/span")  // bize anasayfadaki ürünlerin Fiyat listesini dönderir,
    public List<WebElement> anasayfaBakeryFiyatList;      // Bulunamadiginda bos liste

    @FindBy(xpath = "//div[starts-with(@class,'absolute top-3 rounded')]")  // bize anasayfadaki ürünlerin ürün indirim orani  listesini dönderir,
    public List<WebElement> anasayfaUrunIndirimOraniList;      // Bulunamadiginda bos liste

    @FindBy(xpath = "//div[starts-with(@id,'headlessui-menu-')]")  // bize anasayfadaki Shelf dropdown menu deki 8 kategorinin listesini dönderir,
    public List<WebElement> anasayfaShelfDropdownMenuList;      // Bulunamadiginda bos liste





















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

    @FindBy(xpath = "(//div[@class='swiper-slide swiper-slide-active'])[2]")
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
    public WebElement allShopsTextShopsPage;

    public void pickBazarButonClickMethod() throws InterruptedException, IOException {

        pickBazarButonHomePage.click();
        Assert.assertTrue(groceriesDeliveredIn90MinuteText.isDisplayed());
        ReusableMethods.takeScreenshot("Groceries Delivered in 90 Minute ");

    }

    @FindBy(xpath = "//h1[.='FAQ']")
    public WebElement faqTextFAQPage;

    @FindBy(xpath = "//div[@class='order-2 w-full shrink-0 bg-light p-5 md:order-1 md:w-72 lg:w-96']")
    public  WebElement contactImgContactPage;

    @FindBy(xpath = "(//div[@role='menuitem'])[3]")   ////div[@id='headlessui-menu-item-39']
    public WebElement makeUpDropDownMenu;

   /* @FindBy(xpath = "(//div[@role='menuitem'])[8]")   ////div[@id='headlessui-menu-item-39']
    public WebElement booksDropDownMenu;*/

    @FindBy(xpath = "//div[@class='relative flex h-16 w-16 shrink-0 items-center justify-center overflow-hidden rounded-full bg-gray-300']")
    public List<WebElement> allShopsShopsPage;

    @FindBy(xpath = "//span[.='Furniture Shop']")
    public WebElement furnitureShop;
    @FindBy(xpath = "//span[.='Clothing Shop']")
    public WebElement clothingShop;
    @FindBy(xpath = "//span[.='Bags Shop']")
    public WebElement bagsShop;
    @FindBy(xpath = "//span[.='Makeup Shop']")
    public WebElement makeupShop;
    @FindBy(xpath = "//span[.='Bakery Shop']")
    public WebElement bakeryShop;
    @FindBy(xpath = "//span[.='Grocery Shop']")
    public WebElement groceryShop;
    @FindBy(xpath = "//span[.='Books Shop']")
    public WebElement booksShop;

    @FindBy(xpath = "(//div[@role='menuitem'])[2]")
    public WebElement bakeryDropDownAltMenu;

    @FindBy(xpath = "(//span[.='Grocery'])[1]")
    public WebElement dropDownGroceryMain;

    @FindBy(xpath = "(//div[@role='menuitem'])[1]")
    public WebElement dropDownGroceryMainAlt;

    @FindBy(xpath = "//p[@class='mb-2 text-sm leading-relaxed text-center text-body']")
    public List <WebElement> shopsInformation;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/']")   //a[@href='https://www.facebook.com/'] //a[@href='https://www.facebook.com/']
    public WebElement facebookIcon;

    @FindBy(xpath = "//*[@data-name='Group 96']")   //a[@href='https://www.facebook.com/']
    public List <WebElement> instagramIcon;

    @FindBy(xpath = "(//span[@class='text-sm text-body'])[1]")
    public WebElement adressInformation;

    @FindBy(xpath = "//span[.='Product Image']")
    public List  <WebElement> urunResimleri;

    @FindBy(xpath = "//span[.='Add To Shopping Cart']")
    public WebElement addToShoppingCart;

    @FindBy(xpath = "//span[@class='flex ltr:ml-2 rtl:mr-2']")
    public WebElement cartIcon;

    @FindBy(xpath = "//button[.=\"Join\"]")
    public WebElement joinButton;

    @FindBy(id = "email")
    public WebElement eMail;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.=\"Login\"]")
    public WebElement loginButton;

    public void loginMethod(@Optional("chrome")String browser) throws InterruptedException {

        Thread.sleep(3000);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),joinButton);
        eMail.sendKeys(ConfigReader.getProperty("eposta"));
        password.sendKeys(ConfigReader.getProperty("password"));
        loginButton.click();

    }

    @FindBy(xpath = "(//span[.='plus'])[3]")
    public WebElement plusButtonUrunCart;

    @FindBy(xpath = "//span[.='minus']")
    public WebElement minusButtonUrunCart;

    @FindBy (xpath = "//div[@class='min-h-full text-center md:p-5']")
    public WebElement urunCartArkasiBosluk;

    @FindBy(xpath = "//span[.='Checkout']")
    public WebElement checkoutButtonCart;

    @FindBy(xpath = "//div[@class='flex flex-col my-auto']")
    public WebElement loginSayfasi;

    @FindBy(xpath = "(//div[@class='flex flex-1 items-center justify-center px-3 text-sm font-semibold'])[3]")
    public WebElement urunMiktariniGosterenButton;

    @FindBy(xpath = "//ins[@class='text-2xl font-semibold text-accent no-underline md:text-3xl'] ")  //ins[.='$40.00'])[2]
    public WebElement urunFiyati;

    @FindBy(xpath = "//span[@class='bg-light rounded w-full py-2 px-2 text-accent mt-3']")
    public WebElement sepetIconundakiUrunFiyati;

    @FindBy(xpath = "//button[starts-with(@class,'inline-flex items')]")
    public WebElement checkAvaibility;





























































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
    public void gohomePageUrl(@Optional("chrome")String browser){
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
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

    @FindBy(xpath = "//button[@class='hidden product-cart lg:flex relative']//*[name()='svg']")
    public WebElement dailyNeedsChartIkon;

    @FindBy(xpath = "//button[.='Checkout as guest']")
    public WebElement checkoutAsGuestButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement eMailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passswordBox;

    @FindBy(xpath = "//button[@class='flex items-center text-sm font-semibold transition-colors duration-200 text-accent hover:text-accent-hover focus:text-accent-hover focus:outline-none']")
    public WebElement contactNumberAddButton;

    @FindBy(xpath = "//input[@placeholder='1 (702) 123-4567']")
    public WebElement telefonNumberBox;

    @FindBy(xpath = "(//button[starts-with(@class,'inline-flex ')])[3]")
    public WebElement addContactButton;

    @FindBy(xpath = " (//span[.='No Address Found'])[1]")
    public WebElement billingAddressNoAdressFound;

    @FindBy(xpath = " (//span[.='No Address Found'])[2]")
    public WebElement shippingAddressNoAdressFound;

    @FindBy(xpath = "//div[@class='flag us']")
    public WebElement flagIcon;

    @FindBy(xpath = " (//button[.='Add'])[2]")
    public WebElement billingAddressAddButton;

    @FindBy(xpath = " (//button[.='Add'])[3]")
    public WebElement shippingAddressAddButton;

    @FindBy(xpath = " //input[@id='title']")
    public WebElement titleButton;



    @FindBy(xpath = " //p[@class='text-sm text-sub-heading']")
    public WebElement billingAddressAdded;

    @FindBy(xpath = " //p[@class='text-sm text-sub-heading']")
    public WebElement shippingAddressAdded;

    @FindBy(xpath = "//span[.='90 min express delivery']")
    public WebElement expressDelivery;

    @FindBy(xpath = "//span[.='8.00 AM - 11.00 AM']")
    public WebElement morning;

    @FindBy(xpath = "//span[.='11.00 AM - 2.00 PM']")
    public WebElement noon;

    @FindBy(xpath = "//span[.='2.00 PM - 5.00 PM']")
    public WebElement afternoon;

    @FindBy(xpath = "//span[.='5.00 PM - 8.00 PM']")
    public WebElement evening;

    @FindBy(xpath = "//button[.='Check Availability']")
    public WebElement checkAvailability;

    @FindBy(xpath = "//span[.='Cash On Delivery']")
    public WebElement cashOnDelivery;

    @FindBy(xpath = "//button[.='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//span[.='Apples']")
    public WebElement appleCheck;

    @FindBy(xpath = "(//span[.='$1.60'])[2]")
    public WebElement subTotalPrice;

    @FindBy(xpath = "(//span[.='Calculated at checkout'])[1]")
    public WebElement taxPrice;
    @FindBy(xpath = "(//span[.='Calculated at checkout'])[2]")
    public WebElement shippingPrice;

    @FindBy(xpath = "(//span[.='$0.00'])[1]")
    public WebElement taxPriceAfterCheckAvaibility;

    @FindBy(xpath = "(//span[.='$0.00'])[2]")
    public WebElement shippingPriceAfterCheckAvaibility;

    @FindBy(xpath = "//p[@role='button']")
    public WebElement doYouHaveCouponButton;

    @FindBy(xpath = "//input[@id='code']")
    public WebElement couponEntryArea;
    @FindBy(xpath = "(//span[.='$1.60'])[3]")
    public WebElement totalPrice;

    @FindBy(xpath = "//span[.='Points']")
    public WebElement walletPoints;

    @FindBy(xpath = "(//span[.='$0.00'])[3]")
    public WebElement walletCurrency;

    @FindBy(xpath = "//input[@id='use_wallet']")
    public WebElement doYouWantToUseWallet;

    @FindBy(xpath = "//span[.='Cash On Delivery']")
    public WebElement cashOnDeliveryYasin;

    @FindBy(xpath = "//span[.='Please Pay After You Receive Your Goods!']")
    public WebElement cashOnDeliveryText;

    @FindBy(xpath = "//span[.='Order Received']")
    public WebElement orderReceived;

    @FindBy(xpath = "//p[.='CGG82oQZc4i8']")
    public WebElement orderNumber;

    @FindBy(xpath = "//p[.='January 12, 2022']")
    public WebElement orderDate;
    //p[.='$153.00']
    @FindBy(xpath = "//p[.='$153.00']")
    public WebElement totalPriceOrderPage;

    @FindBy(xpath = "//p[.='CASH_ON_DELIVERY']")
    public WebElement paymentMethod;

    @FindBy(xpath = "//span[.='$150.00']")
    public WebElement subTotalAmount;

    @FindBy(xpath = "(//span[.='$0.00'])[1]")
    public WebElement shippingCharge;

    @FindBy(xpath = "//span[.='$3.00']")
    public WebElement taxCharge;
    @FindBy(xpath = "(//span[.='$0.00'])[2]")
    public WebElement discountCharge;
    @FindBy(xpath = "//span[.='$153.00']")
    public WebElement totalAmount;
    //span[.='1 Item']
    @FindBy(xpath = "//span[.='1 Item']")
    public WebElement totalItem;

    @FindBy(xpath = "//span[.='Express Delivery']")
    public WebElement deliveryTime;

    @FindBy(xpath = "//span[.='ss, aaaa, aaa, 122, aaa']")
    public WebElement billingAddress;

    @FindBy(xpath = "//a[starts-with(@class,\"inline-block\")]")
    public WebElement itemName;

    @FindBy(xpath = "//button[.='Write a review']")
    public WebElement writeAReview;

    @FindBy(xpath = "//textarea[@id='comment']")
    public WebElement textAreaComment;
    //span[.='2148  Straford Park, KY, Winchester, 40391, United States']
    @FindBy(xpath = "//span[.='2148  Straford Park, KY, Winchester, 40391, United States']")
    public WebElement shippingAddress;








}
