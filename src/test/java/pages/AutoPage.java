package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutoPage {

    public AutoPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//*[@href=\"https://practice.automationtesting.in/shop/\"])[1]")
    public WebElement shop;

    @FindBy(xpath = "//*[text()='Home']")
    public WebElement home;

    @FindBy(xpath = "//*[@d=\"M38 12.83L35.17 10 24 21.17 12.83 10 10 12.83 21.17 24 10 35.17 12.83 38 24 26.83 35.17 38 38 35.17 26.83 24z\"]")
    public WebElement gereksiz;

    @FindBy(xpath = "(//*[@class=\"n2-ow\"])[2]")
    public WebElement threeButton;

    @FindBy(xpath = "//*[@class=\"n2-ss-slide-background-image n2-ss-slide-fill n2-ow\"]")
    public List<WebElement> slidersImage;

    @FindBy(xpath = "//*[@class=\"attachment-shop_catalog size-shop_catalog wp-post-image\"]")
    public List<WebElement> arrivalsImage;

    @FindBy(xpath = "(//*[@class=\"attachment-shop_catalog size-shop_catalog wp-post-image\"])[2]")
    public WebElement book2;

    @FindBy(xpath = "//*[@class=\"woocommerce-breadcrumb\"]")
    public WebElement ikinciSayfaBook2;

    @FindBy(xpath = "//*[text()='Description']")
    public WebElement description;

    @FindBy(xpath = "//*[@class=\"single_add_to_cart_button button alt\"]")
    public WebElement sepet;

    @FindBy(xpath = "(//*[@class=\"column\"])[1]")
    public WebElement kitapAciklamasi;
}
