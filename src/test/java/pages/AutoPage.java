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

    @FindBy(xpath = "//*[@id=\"aswift_6\"]")
    public WebElement iframe;

    @FindBy(xpath = "//*[@id=\"ad_iframe\"]")
    public WebElement iframeClose;

    @FindBy(xpath = "//*[@id=\"dismiss-button\"]")
    public WebElement carpi;

    @FindBy(xpath = "//*[@id=\"dismiss-button\"]")
    public WebElement closeButton;

    @FindBy(xpath = "(//*[@class=\"n2-ow\"])[2]")
    public WebElement threeButton;

    @FindBy(xpath = "//*[@class=\"n2-ss-slide-background-image n2-ss-slide-fill n2-ow\"]")
    public List<WebElement> slidersImage;

    @FindBy(xpath = "//*[@class=\"attachment-shop_catalog size-shop_catalog wp-post-image\"]")
    public List<WebElement> arrivalsImage;

    @FindBy(xpath = "(//*[@class=\"attachment-shop_catalog size-shop_catalog wp-post-image\"])[1]")
    public WebElement book1;

    @FindBy(xpath = "(//*[@class=\"attachment-shop_catalog size-shop_catalog wp-post-image\"])[2]")
    public WebElement book2;

    @FindBy(xpath = "//*[@class=\"woocommerce-breadcrumb\"]")
    public WebElement ikinciSayfaBook2;

    @FindBy(xpath = "//*[text()='Description']")
    public WebElement description;

    @FindBy(xpath = "//*[@class=\"single_add_to_cart_button button alt\"]")
    public WebElement sepeteEkleme;

    @FindBy(xpath = "//*[@class=\"amount\"]")
    public WebElement sepetSekmesi;

    @FindBy(xpath = "(//*[@class=\"column\"])[1]")
    public WebElement kitapAciklamasi;

    @FindBy(xpath = "//*[@class=\"attachment-shop_single size-shop_single wp-post-image\"]")
    public WebElement resim;

    @FindBy(xpath = "//*[@class=\"pp_close\"]")
    public WebElement resimKapatma;

    @FindBy(xpath = "//*[@class=\"reviews_tab\"]")
    public WebElement reviews;

    @FindBy(xpath = "(//*[@class=\"woocommerce-Price-amount amount\"])[2]")
    public WebElement kitapFiyati;

    @FindBy(xpath = "//*[@id=\"coupon_code\"]")
    public WebElement coupanCod;

    @FindBy(xpath = "(//*[@class=\"button\"])[1]")
    public WebElement coupanCodButton;
}
