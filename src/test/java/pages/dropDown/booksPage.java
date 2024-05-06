package pages.dropDown;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.profile.profilPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class booksPage {
    public booksPage() {
        PageFactory.initElements(Driver.getDriver("browser"), this);
    }

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksDropDown;

    @FindBy(xpath = "//div[@class='flex items-center justify-between mb-7 ']")
    public List<WebElement> booksBasliklar ;

    @FindBy(xpath = "//h3[.='Popular Products']")
    public WebElement popularProducts;

    @FindBy(xpath = "(//div[@class='w-full'])[1]//img")
    public List<WebElement> popularKitaplarImages;

    @FindBy(xpath = "(//div[@class='w-full'])[1]//header/a")
    public List<WebElement> popularKitaplarIsimler;

    @FindBy(xpath = "(//div[@class='w-full'])[1]//header/div")
    public List<WebElement> popularKitaplarFiyatlar;

    @FindBy(xpath = "//h3[.='Which Book You Like to See?']")
    public WebElement whichBookHeader ;

    @FindBy(xpath = "//div[@id='category-card-menu']/div/div")
    public List<WebElement> whichBookList ;

    @FindBy(xpath = "//h3[.='Top Authors']")
    public WebElement topAuthors ;

    @FindBy(xpath = "(//div[@class='swiper-wrapper'])[3]//img")
    public List<WebElement> yazarTumImages ;

    @FindBy(xpath = "(//div[@class='swiper-wrapper'])[3]//span[@class='block text-center font-semibold text-heading transition-colors group-hover:text-orange-500']")
    public List<WebElement> yazarIsimleri ;

    @FindBy(xpath = "(//span[contains(text(),'Next')])[2]")
    public WebElement nextYazar ;



}
