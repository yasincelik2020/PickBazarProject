package pages.dropDown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class groceryPage {
    public groceryPage() {
        PageFactory.initElements(Driver.getDriver("browser"), this);
    }
    public void groceryPageGit() {// page methodu
        Driver.getDriver("browser").get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
    }

    @FindBy(id = "search")
    public WebElement groceryWeSearchFrame;
    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement groceryWeSearchButton;

    @FindBy(xpath = "//h3[.=\"Clementines\"]")
    public WebElement clementinesUrunu;

    @FindBy(xpath = "//h3[.=\"Tomates\"]")
    public WebElement tomatesUrunu;

    @FindBy(xpath = "//span[normalize-space()='Fruits & Vegetables']")
    public WebElement fruitandVegetablesbutton;

    @FindBy(xpath = "//h3[.=\"Apples\"]")
    public WebElement applesUrunu;

    @FindBy(xpath = "(//div[starts-with(@class,'product-gallery')])[2]")
    public WebElement slideBar;


    @FindBy(xpath = "//h3[.=\"Lemon\"]")
    public WebElement lemonUrunu;

    @FindBy (xpath = "//button//span[.=\"Fruits\"]")
    public WebElement fruitsAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Vegetables\"]")
    public WebElement vegetablesAltBaslik;

    @FindBy(xpath = "//span[normalize-space()='Meat & Fish']")
    public WebElement meatandFishbutton;

    @FindBy (xpath = "//button//span[.=\"Fresh Fish\"]")
    public WebElement freshFishAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Meat\"]")
    public WebElement meatAltBaslik;

    @FindBy(xpath = "//span[normalize-space()='Snacks']")
    public WebElement snacksButton;

    @FindBy (xpath = "//button//span[.=\"Nuts & Biscuits\"]")
    public WebElement nutsAndBiscuitsAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Chocolates\"]")
    public WebElement chokolatesAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Crisps\"]")
    public WebElement crispsAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Noodles & Pasta\"]")
    public WebElement noodlesAndPastaAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Sauce\"]")
    public WebElement sauceAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Soup\"]")
    public WebElement soupAltBaslik;

    @FindBy(xpath = "//span[normalize-space()='Pet Care']")
    public WebElement petCareButton;

    @FindBy (xpath = "//button//span[.=\"Cat Food\"]")
    public WebElement catFoodAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Dog Food\"]")
    public WebElement dogFoodAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Accessories\"]")
    public WebElement accessoriesAltBaslik;

    @FindBy(xpath = "//span[normalize-space()='Home & Cleaning']")
    public WebElement homeAndCleaningButton;

    @FindBy (xpath = "//button//span[.=\"Air Freshner\"]")
    public WebElement airFreshnerAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Cleaning Products\"]")
    public WebElement cleaningProductsdAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Kitchen Accessories\"]")
    public WebElement kitchenAccessoriesAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Laundry\"]")
    public WebElement laundryAltBaslik;

    @FindBy(xpath = "//span[normalize-space()='Dairy']")
    public WebElement dairyButton;

    @FindBy (xpath = "//button//span[.=\"Milk\"]")
    public WebElement milkAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Butter\"]")
    public WebElement butterAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Egg\"]")
    public WebElement eggAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Yogurt\"]")
    public WebElement yogurtAltBaslik;

    @FindBy(xpath = "//span[normalize-space()='Cooking']")
    public WebElement cookingButton;

    @FindBy (xpath = "//button//span[.=\"Oil\"]")
    public WebElement oilAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Rice\"]")
    public WebElement riceAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Salt & Sugar\"]")
    public WebElement saltAndSugarAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Spices\"]")
    public WebElement spicesAltBaslik;

    @FindBy(xpath = "//span[normalize-space()='Breakfast']")
    public WebElement berakfastButton;

    @FindBy (xpath = "//button//span[.=\"Bread\"]")
    public WebElement breadAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Cereal\"]")
    public WebElement cerealAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Jam\"]")
    public WebElement jamAltBaslik;

    @FindBy(xpath = "//span[normalize-space()='Beverage']")
    public WebElement beverageButton;

    @FindBy (xpath = "//button//span[.=\"Coffee\"]")
    public WebElement coffeeAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Energy Drinks\"]")
    public WebElement energyDrinksAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Juice\"]")
    public WebElement juiceAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Fizzy Drinks\"]")
    public WebElement fizzyDrinksAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Tea\"]")
    public WebElement teaAltBaslik;

    @FindBy(xpath = "//span[normalize-space()='Health & Beauty']")
    public WebElement healthAndBeautyButton;

    @FindBy (xpath = "//button//span[.=\"Bath\"]")
    public WebElement bathAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Cream\"]")
    public WebElement creamAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Deodorant\"]")
    public WebElement deodorantAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Face Care\"]")
    public WebElement faceCareAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Oral Care\"]")
    public WebElement oralCareAltBaslik;

    @FindBy (xpath = "//button//span[.=\"Shaving Needs\"]")
    public WebElement shavingNeedsAltBaslik;












}
