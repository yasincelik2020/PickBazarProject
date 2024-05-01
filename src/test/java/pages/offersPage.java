package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.profile.profilPage;
import utilities.ConfigReader;
import utilities.Driver;

public class offersPage {
    public offersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //"We source the best healthy foods for you." locater
    @FindBy(xpath = "(//span[.='Copy'])[6]")
    public WebElement copy20$;
    @FindBy(xpath = "(//div[starts-with(@class,'w-11/12')])[6]")
    public WebElement copied20$;
    @FindBy(xpath = "(//span[.='Copy'])[1]")
    public WebElement copy2$;
    @FindBy(xpath = "//*[.='Copied!']")
    public WebElement copied2$;

    @FindBy(xpath = "(//span[.='Copy'])[9]")
    public WebElement copy5$;
    @FindBy(xpath = "//*[.='Copied!']")
    public WebElement copied5$;
    @FindBy(xpath = "(//span[.='Copy'])[4]")
    public WebElement copy12$;
    @FindBy(xpath = "(//span[.='Add'])[29]")
    public WebElement chickenBreastAddButton;
    @FindBy(xpath = "(//span[.='Add'])[29]")
    public WebElement breefSteakAddButton;
    @FindBy(xpath = "//button[starts-with(@class,'hidden product-cart')]")
    public WebElement itemButton;
    @FindBy(xpath = "//span[.='Checkout']")
    public WebElement checkoutButton;
    @FindBy(xpath = "//button[.='Checkout as guest']")
    public WebElement checkoutAsQuestButton;
    @FindBy(xpath = "//button[.='Check Availability']")
    public WebElement checkAvailabilityButton;
    @FindBy(xpath = "//p[.='Do you have coupon?']")
    public WebElement doYouHaveCouponButton;
    @FindBy(xpath = "//input[@id='code']")
    public WebElement enterCouponCodeButton;
    @FindBy(xpath = "//button[.='Apply']")
    public WebElement applyButton;
    @FindBy(xpath = "//span[@class='text-base font-semibold text-heading']")
    public WebElement totalPrice;

    public static  void offersGiris() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.offersButon.click();//offers gidildi

    }
    public void sepetUrunEkleme() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        chickenBreastAddButton.click();//sepete ürün eklendi
        breefSteakAddButton.click();
//        itemButton.click();//sepete gidildi
//        checkoutButton.click();
//        checkoutAsQuestButton.click();
//        checkAvailabilityButton.click();
//        doYouHaveCouponButton.click();
//        enterCouponCodeButton.click();
//        applyButton.click();
//        Actions actions = new Actions(Driver.getDriver());
//        actions.click(chickenBreastAddButton)
//                .click(breefSteakAddButton).perform();
//                .click(itemButton)
//                .click(checkoutButton)
//                .click(checkoutAsQuestButton)
//                .click(checkAvailabilityButton)
//                .click(doYouHaveCouponButton)
//                .click(enterCouponCodeButton)
//                .click(applyButton)
    }
    public void kuponKullanma() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
//        actions.click(itemButton)
//                .click(checkoutButton)
//                .click(checkoutAsQuestButton)
//                .click(checkAvailabilityButton)
//                .click(doYouHaveCouponButton)
//                .contextClick(enterCouponCodeButton)
//                .click(applyButton).perform();


        itemButton.click();//sepete gidildi
        Thread.sleep(2000);
        checkoutButton.click();Thread.sleep(2000);
        checkoutAsQuestButton.click();Thread.sleep(2000);
        checkAvailabilityButton.click();Thread.sleep(2000);
        doYouHaveCouponButton.click();Thread.sleep(2000);
        enterCouponCodeButton.sendKeys(Keys.CONTROL,"v");

        enterCouponCodeButton.click();Thread.sleep(2000);
        applyButton.click();

    }
    }

