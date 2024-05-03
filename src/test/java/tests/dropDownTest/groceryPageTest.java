package tests.dropDownTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.dropDown.groceryPage;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JavaScriptExecutorUtils;
import utilities.ReusableMethods;

import java.awt.*;
import java.io.IOException;

import static utilities.Driver.driver;

public class groceryPageTest {


    @Severity(SeverityLevel.NORMAL)
    @Description("Shelf dropdown menu tiklandigi ve Grocery secildigi dogrulanir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_01() {
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Grocery");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Aranan ürün Grocery ile ilgili ise  ve sitede varsa geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_05() throws InterruptedException {
        groceryPage groceryPage = new groceryPage();
        groceryPage.groceryPageGit();
        Thread.sleep(3000);
        groceryPage.groceryWeSearchFrame.sendKeys("Clementies", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(groceryPage.clementinesUrunu.isDisplayed());
        Driver.closeDriver();
        softAssert.assertAll();
    }


    @Severity(SeverityLevel.NORMAL)
    @Description("NEGATIF TEST: Aranan ürün Grocery ile ilgili değil ise ve sitede yoksa gelmedigi dogrulanmalidir")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_06() throws InterruptedException {
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        groceryPage.groceryPageGit();
        Thread.sleep(3000);
        groceryPage.groceryWeSearchFrame.sendKeys("Tomates", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.groceryDropDownMenu.getText(), "Sorry, No Product Found");
        Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Grocery' secili oldugu icin Grocery ürünleri geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_10() throws IOException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        SoftAssert softAssert = new SoftAssert();

        int i=0;
        for (WebElement listElement : homePage.anasayfaGroceryUrunIsimList) {
            System.out.println(homePage.anasayfaGroceryUrunIsimList.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Grocery urun isimleri");

        softAssert.assertAll();
        Driver.getDriver().close();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Scroll down yapildiginda ekranin sag tarafinda ürünler 'Grocery' secili oldugu icin Grocery fiyatlari geldigi dogrulanmalidir.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_10_01() throws InterruptedException, IOException {
        homePage homePage = new homePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        SoftAssert softAssert = new SoftAssert();

        int i=0;
        for (WebElement listElement : homePage.anasayfaGrocerFiyatList) {
            System.out.println(homePage.anasayfaGrocerFiyatList.get(i).getText());
            Assert.assertTrue(listElement.isDisplayed());
            i++;
        }
        ReusableMethods.takeScreenshot("Grocery urun fiyatlari");

        softAssert.assertAll();
        Driver.getDriver().close();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Fruits & Vegetables\" dropdown menu button,\n" +
            "\"Fruits\" ve \"Vegetables\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_11() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.fruitandVegetablesbutton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.fruitsAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.fruitsAltBaslik);
        softAssert.assertEquals(groceryPage.fruitsAltBaslik.getText(),"Fruits");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.vegetablesAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.vegetablesAltBaslik);
        softAssert.assertEquals(groceryPage.vegetablesAltBaslik.getText(),"Vegetables");

       // Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "        \"Meat & Fish\" dropdown menu button, \n" +
            "\"Fresh Fish\" ve \"Meat\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_12() {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.meatandFishbutton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.freshFishAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.freshFishAltBaslik);
        softAssert.assertEquals(groceryPage.freshFishAltBaslik.getText(),"Fresh Fish");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.meatAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.meatAltBaslik);
        softAssert.assertEquals(groceryPage.meatAltBaslik.getText(),"Meat");

        // Driver.closeDriver();
        softAssert.assertAll();
    }


    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "     \"Snacks\" dropdown menu button, \"Nuts&Biscuits\", \n" +
            "\"Chocolates\",  \"Crisps\", \"Noodles&Pasta\", \n" +
            "\"Sauce\" ve \"Soup\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_13() {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.snacksButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.nutsAndBiscuitsAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.nutsAndBiscuitsAltBaslik);
        softAssert.assertEquals(groceryPage.nutsAndBiscuitsAltBaslik.getText(),"Nuts & Biscuits");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.chokolatesAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.chokolatesAltBaslik);
        softAssert.assertEquals(groceryPage.chokolatesAltBaslik.getText(),"Chocolates");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.crispsAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.crispsAltBaslik);
        softAssert.assertEquals(groceryPage.crispsAltBaslik.getText(),"Crisps");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.noodlesAndPastaAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.noodlesAndPastaAltBaslik);
        softAssert.assertEquals(groceryPage.noodlesAndPastaAltBaslik.getText(),"Noodles & Pasta");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.sauceAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.sauceAltBaslik);
        softAssert.assertEquals(groceryPage.sauceAltBaslik.getText(),"Sauce");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.soupAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.soupAltBaslik);
        softAssert.assertEquals(groceryPage.soupAltBaslik.getText(),"Soup");

        // Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "        \"Pet Care\" dropdown menu button, \n" +
            "\"Cat Food\",  \"Dog Food\" ve \"Accessories\" alt basliklari geldigi doğrulanmalıdır")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_14() {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.petCareButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.catFoodAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.catFoodAltBaslik);
        softAssert.assertEquals(groceryPage.catFoodAltBaslik.getText(),"Cat Food");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.dogFoodAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.dogFoodAltBaslik);
        softAssert.assertEquals(groceryPage.dogFoodAltBaslik.getText(),"Dog Food");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.accessoriesAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.accessoriesAltBaslik);
        softAssert.assertEquals(groceryPage.accessoriesAltBaslik.getText(),"Accessories");
        // Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "      Home & Cleaning\" dropdown menu button, \n" +
            "\"Air Freshner\",  \"Cleaning  Products\",  \"Kitchen Accessories\"\n" +
            "ve \"Laundry\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_15() {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.homeAndCleaningButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.airFreshnerAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.airFreshnerAltBaslik);
        softAssert.assertEquals(groceryPage.airFreshnerAltBaslik.getText(),"Air Freshner");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.cleaningProductsdAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.cleaningProductsdAltBaslik);
        softAssert.assertEquals(groceryPage.cleaningProductsdAltBaslik.getText(),"Cleaning Products");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.kitchenAccessoriesAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.kitchenAccessoriesAltBaslik);
        softAssert.assertEquals(groceryPage.kitchenAccessoriesAltBaslik.getText(),"Kitchen Accessories");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.laundryAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.laundryAltBaslik);
        softAssert.assertEquals(groceryPage.laundryAltBaslik.getText(),"Laundry");
        // Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "        \"Dairy\" dropdown menu button, \"Milk\",  \"Butter\",  \"Egg\" ve\n" +
            "\"Yogurt\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_16() {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.dairyButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.milkAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.milkAltBaslik);
        softAssert.assertEquals(groceryPage.milkAltBaslik.getText(),"Milk");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.butterAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.butterAltBaslik);
        softAssert.assertEquals(groceryPage.butterAltBaslik.getText(),"Butter");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.eggAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.eggAltBaslik);
        softAssert.assertEquals(groceryPage.eggAltBaslik.getText(),"Egg");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.yogurtAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.yogurtAltBaslik);
        softAssert.assertEquals(groceryPage.yogurtAltBaslik.getText(),"Yogurt");
        // Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Cooking\" dropdown menu button, \"Oil\", \"Rice\", \"Salt&Sugar\"\n" +
            "ve \"Spices\"alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_17() {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.cookingButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.oilAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.oilAltBaslik);
        softAssert.assertEquals(groceryPage.oilAltBaslik.getText(),"Oil");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.riceAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.riceAltBaslik);
        softAssert.assertEquals(groceryPage.riceAltBaslik.getText(),"Rice");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.saltAndSugarAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.saltAndSugarAltBaslik);
        softAssert.assertEquals(groceryPage.saltAndSugarAltBaslik.getText(),"Salt & Sugar");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.spicesAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.spicesAltBaslik);
        softAssert.assertEquals(groceryPage.spicesAltBaslik.getText(),"Spices");
        // Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "            \"Breakfast\" dropdown menu button, \"Bread\",  \"Cereal\" \n" +
            "ve \"Jam\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_18() {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.berakfastButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.breadAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.breadAltBaslik);
        softAssert.assertEquals(groceryPage.breadAltBaslik.getText(),"Bread");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.cerealAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.cerealAltBaslik);
        softAssert.assertEquals(groceryPage.cerealAltBaslik.getText(),"Cereal");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.jamAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.jamAltBaslik);
        softAssert.assertEquals(groceryPage.jamAltBaslik.getText(),"Jam");

        // Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "      \"Beverage\" dropdown menu button,  \"Coffee\",  \"Energy Drinks\", \"Juice\", \n" +
            "\"Fizzy Drinks\"  ve \"Tea\" alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_19() {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.beverageButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.coffeeAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.coffeeAltBaslik);
        softAssert.assertEquals(groceryPage.coffeeAltBaslik.getText(),"Coffee");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.energyDrinksAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.energyDrinksAltBaslik);
        softAssert.assertEquals(groceryPage.energyDrinksAltBaslik.getText(),"Energy Drinks");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.juiceAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.juiceAltBaslik);
        softAssert.assertEquals(groceryPage.juiceAltBaslik.getText(),"Juice");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.fizzyDrinksAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.fizzyDrinksAltBaslik);
        softAssert.assertEquals(groceryPage.fizzyDrinksAltBaslik.getText(),"Fizzy Drinks");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.teaAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.teaAltBaslik);
        softAssert.assertEquals(groceryPage.teaAltBaslik.getText(),"Tea");

        // Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ekranin Sol tarafinda \"Grocery\" secili oldugu icin su sekilde gelmelidir;\n" +
            "       \"Health & Beauty\" dropdown menu button,  \"Bath\",  \"Cream\", \"Deodorant\", \n" +
            "\"Face Care\",  \"Oral Care\"  ve \"Shaving Needs\"  alt basliklari geldigi doğrulanmalıdır.")
    @Test(groups = {"Regression", "No role"})
    public void TC_08_20() {
        SoftAssert softAssert = new SoftAssert();
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.healthAndBeautyButton.click();
        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.bathAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.bathAltBaslik);
        softAssert.assertEquals(groceryPage.bathAltBaslik.getText(),"Bath");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.creamAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.creamAltBaslik);
        softAssert.assertEquals(groceryPage.creamAltBaslik.getText(),"Cream");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.deodorantAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.deodorantAltBaslik);
        softAssert.assertEquals(groceryPage.deodorantAltBaslik.getText(),"Deodorant");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.faceCareAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.faceCareAltBaslik);
        softAssert.assertEquals(groceryPage.faceCareAltBaslik.getText(),"Face Care");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.oralCareAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.oralCareAltBaslik);
        softAssert.assertEquals(groceryPage.oralCareAltBaslik.getText(),"Oral Care");

        JavaScriptExecutorUtils.scrollIntoViewJS(Driver.getDriver(),groceryPage.shavingNeedsAltBaslik);
        JavaScriptExecutorUtils.clickElementByJS(Driver.getDriver(),groceryPage.shavingNeedsAltBaslik);
        softAssert.assertEquals(groceryPage.shavingNeedsAltBaslik.getText(),"Shaving Needs");

        // Driver.closeDriver();
        softAssert.assertAll();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Ürün alt kartında ürün imglerinde slide barın çalıştığını doğrulamalıdır.")
    @Test(groups = {"Regression", "No role"})

    public void TC_08_27() {
        SoftAssert softAssert = new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("pickUrl"));
        homePage homePage = new homePage();
        groceryPage groceryPage = new groceryPage();
        homePage.homePageDropDownMenu.click();
        homePage.groceryDropDownMenu.click();
        groceryPage.fruitandVegetablesbutton.click();
        groceryPage.applesUrunu.click();
        groceryPage.slideBar.click();

        softAssert.assertTrue(groceryPage.slideBar.isDisplayed());

        softAssert.assertAll();

        Driver.closeDriver();

    }

}
