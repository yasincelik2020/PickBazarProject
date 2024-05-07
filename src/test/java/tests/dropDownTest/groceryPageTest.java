package tests.dropDownTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.dropDown.groceryPage;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JavaScriptExecutorUtils;
import utilities.ReusableMethods;
import java.io.IOException;


public class groceryPageTest {
    @Parameters("browser")
    @BeforeMethod(groups = {"Regression", "No role"})
    public void beforeMethod(@Optional("chrome")String browser){
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
    }
    @AfterMethod(groups = {"Regression", "No role"})
    public void afterMethod() {
        Driver.closeDriver();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Shelf dropdown menu tiklandigi ve Grocery secildigi dogrulanir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_01(@Optional("chrome")String browser) {
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage(browser);
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Aranan ürün Grocery ile ilgili ise  ve sitede varsa geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_05(@Optional("chrome")String browser) throws InterruptedException {
        groceryPage groceryPage = new groceryPage(browser);
        groceryPage.groceryPageGit(browser);
        Thread.sleep(3000);
        groceryPage.groceryWeSearchFrame.sendKeys("Clementies", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(groceryPage.clementinesUrunu.isDisplayed());
    }


    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("NEGATIF TEST: Aranan ürün Grocery ile ilgili değil ise ve sitede yoksa gelmedigi dogrulanmalidir")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_06(@Optional("chrome")String browser) throws InterruptedException {
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);
        groceryPage.groceryPageGit(browser);
        Thread.sleep(3000);
        groceryPage.groceryWeSearchFrame.sendKeys("Tomates", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Sorry, No Product Found");
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Grocery' secili oldugu icin Grocery ürünleri geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_10(@Optional("chrome")String browser)  {
        homePage homePage = new homePage(browser);

        int i=0;
        for (WebElement listElement : homePage.anasayfaGroceryUrunIsimList) {
            System.out.println(homePage.anasayfaGroceryUrunIsimList.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }

    }
    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Grocery' secili oldugu icin Grocery fiyatlari geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_10_01(@Optional("chrome")String browser) {
        homePage homePage = new homePage(browser);
        Driver.getDriver(browser).get(ConfigReader.getProperty("pickUrl"));

        int i=0;
        for (WebElement listElement : homePage.anasayfaGrocerFiyatList) {
            System.out.println(homePage.anasayfaGrocerFiyatList.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Fruits & Vegetables dropdown menu button,Fruits ve Vegetables alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_11(@Optional("chrome")String browser) {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);

        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.fruitandVegetablesbutton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.fruitsAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.fruitsAltBaslik);
        softAssert.assertEquals(groceryPage.fruitsAltBaslik.getText(),"Fruits");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.vegetablesAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.vegetablesAltBaslik);
        softAssert.assertEquals(groceryPage.vegetablesAltBaslik.getText(),"Vegetables");

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Meat & Fish dropdown menu button,Fresh Fish ve Meat alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_12(@Optional("chrome")String browser) {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.meatandFishbutton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.freshFishAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.freshFishAltBaslik);
        softAssert.assertEquals(groceryPage.freshFishAltBaslik.getText(),"Fresh Fish");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.meatAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.meatAltBaslik);
        softAssert.assertEquals(groceryPage.meatAltBaslik.getText(),"Meat");

    }


    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Snacks dropdown menu button, Nuts&Biscuits, Chocolates, Crisps, Noodles&Pasta, Sauce ve Soup alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_13(@Optional("chrome")String browser) {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);

        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.snacksButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.nutsAndBiscuitsAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.nutsAndBiscuitsAltBaslik);
        softAssert.assertEquals(groceryPage.nutsAndBiscuitsAltBaslik.getText(),"Nuts & Biscuits");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.chokolatesAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.chokolatesAltBaslik);
        softAssert.assertEquals(groceryPage.chokolatesAltBaslik.getText(),"Chocolates");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.crispsAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.crispsAltBaslik);
        softAssert.assertEquals(groceryPage.crispsAltBaslik.getText(),"Crisps");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.noodlesAndPastaAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.noodlesAndPastaAltBaslik);
        softAssert.assertEquals(groceryPage.noodlesAndPastaAltBaslik.getText(),"Noodles & Pasta");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.sauceAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.sauceAltBaslik);
        softAssert.assertEquals(groceryPage.sauceAltBaslik.getText(),"Sauce");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.soupAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.soupAltBaslik);
        softAssert.assertEquals(groceryPage.soupAltBaslik.getText(),"Soup");

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Pet Care dropdown menu button, Cat Food, Dog Food ve Accessories alt basliklari geldigi doğrulanmalıdır")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_14(@Optional("chrome")String browser) {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);

        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.petCareButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.catFoodAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.catFoodAltBaslik);
        softAssert.assertEquals(groceryPage.catFoodAltBaslik.getText(),"Cat Food");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.dogFoodAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.dogFoodAltBaslik);
        softAssert.assertEquals(groceryPage.dogFoodAltBaslik.getText(),"Dog Food");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.accessoriesAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.accessoriesAltBaslik);
        softAssert.assertEquals(groceryPage.accessoriesAltBaslik.getText(),"Accessories");

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")

    @Description("Home & Cleaning dropdown menu button, Air Freshner,Cleaning  Products,Kitchen Accessories  ve Laundry alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_15(@Optional("chrome")String browser) {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);

        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.homeAndCleaningButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.airFreshnerAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.airFreshnerAltBaslik);
        softAssert.assertEquals(groceryPage.airFreshnerAltBaslik.getText(),"Air Freshner");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.cleaningProductsdAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.cleaningProductsdAltBaslik);
        softAssert.assertEquals(groceryPage.cleaningProductsdAltBaslik.getText(),"Cleaning Products");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.kitchenAccessoriesAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.kitchenAccessoriesAltBaslik);
        softAssert.assertEquals(groceryPage.kitchenAccessoriesAltBaslik.getText(),"Kitchen Accessories");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.laundryAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.laundryAltBaslik);
        softAssert.assertEquals(groceryPage.laundryAltBaslik.getText(),"Laundry");

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")

    @Description("Dairy dropdown menu button, Milk, Butter,Egg ve Yogurt alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_16(@Optional("chrome")String browser) {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);

        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.dairyButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.milkAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.milkAltBaslik);
        softAssert.assertEquals(groceryPage.milkAltBaslik.getText(),"Milk");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.butterAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.butterAltBaslik);
        softAssert.assertEquals(groceryPage.butterAltBaslik.getText(),"Butter");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.eggAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.eggAltBaslik);
        softAssert.assertEquals(groceryPage.eggAltBaslik.getText(),"Egg");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.yogurtAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.yogurtAltBaslik);
        softAssert.assertEquals(groceryPage.yogurtAltBaslik.getText(),"Yogurt");

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")

    @Description("Cooking dropdown menu button, Oil, Rice,Salt&Sugar ve Spices alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_17(@Optional("chrome")String browser) {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);

        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.cookingButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.oilAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.oilAltBaslik);
        softAssert.assertEquals(groceryPage.oilAltBaslik.getText(),"Oil");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.riceAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.riceAltBaslik);
        softAssert.assertEquals(groceryPage.riceAltBaslik.getText(),"Rice");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.saltAndSugarAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.saltAndSugarAltBaslik);
        softAssert.assertEquals(groceryPage.saltAndSugarAltBaslik.getText(),"Salt & Sugar");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.spicesAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.spicesAltBaslik);
        softAssert.assertEquals(groceryPage.spicesAltBaslik.getText(),"Spices");

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Breakfast dropdown menu button, Bread,Cereal ve Jam alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_18(@Optional("chrome")String browser) {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);

        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.berakfastButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.breadAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.breadAltBaslik);
        softAssert.assertEquals(groceryPage.breadAltBaslik.getText(),"Bread");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.cerealAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.cerealAltBaslik);
        softAssert.assertEquals(groceryPage.cerealAltBaslik.getText(),"Cereal");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.jamAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.jamAltBaslik);
        softAssert.assertEquals(groceryPage.jamAltBaslik.getText(),"Jam");

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Beverage dropdown menu button,Coffee,Energy Drinks,Juice,Fizzy Drinks ve Tea alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_19(@Optional("chrome")String browser) {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);

        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.beverageButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.coffeeAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.coffeeAltBaslik);
        softAssert.assertEquals(groceryPage.coffeeAltBaslik.getText(),"Coffee");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.energyDrinksAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.energyDrinksAltBaslik);
        softAssert.assertEquals(groceryPage.energyDrinksAltBaslik.getText(),"Energy Drinks");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.juiceAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.juiceAltBaslik);
        softAssert.assertEquals(groceryPage.juiceAltBaslik.getText(),"Juice");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.fizzyDrinksAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.fizzyDrinksAltBaslik);
        softAssert.assertEquals(groceryPage.fizzyDrinksAltBaslik.getText(),"Fizzy Drinks");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.teaAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.teaAltBaslik);
        softAssert.assertEquals(groceryPage.teaAltBaslik.getText(),"Tea");
    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Health & Beauty dropdown menu button, Bath,Cream,Deodorant, Face Care,Oral Care ve Shaving Needs alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_20(@Optional("chrome")String browser) {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);

        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.healthAndBeautyButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.bathAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.bathAltBaslik);
        softAssert.assertEquals(groceryPage.bathAltBaslik.getText(),"Bath");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.creamAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.creamAltBaslik);
        softAssert.assertEquals(groceryPage.creamAltBaslik.getText(),"Cream");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.deodorantAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.deodorantAltBaslik);
        softAssert.assertEquals(groceryPage.deodorantAltBaslik.getText(),"Deodorant");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.faceCareAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.faceCareAltBaslik);
        softAssert.assertEquals(groceryPage.faceCareAltBaslik.getText(),"Face Care");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.oralCareAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.oralCareAltBaslik);
        softAssert.assertEquals(groceryPage.oralCareAltBaslik.getText(),"Oral Care");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(browser),groceryPage.shavingNeedsAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.shavingNeedsAltBaslik);
        softAssert.assertEquals(groceryPage.shavingNeedsAltBaslik.getText(),"Shaving Needs");

    }

    @Severity(SeverityLevel.NORMAL)
    @Parameters("browser")
    @Description("Ürün alt kartında ürün imglerinde slide barın çalıştığını doğrulamalıdır.")
    @Test(groups = {"Regression", "No role"})

    public void TC_08_27(@Optional("chrome")String browser) throws InterruptedException  {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage(browser);
        groceryPage groceryPage = new groceryPage(browser);
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.fruitandVegetablesbutton.click();
        Thread.sleep(2000);
        groceryPage.applesUrunu.click();
        Thread.sleep(2000);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(browser),groceryPage.slideBar);
       // groceryPage.slideBar.click();

        softAssert.assertTrue(groceryPage.slideBar.isDisplayed());

    }

}
