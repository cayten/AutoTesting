package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class AutoStepDefinition {

    AutoPage autoPage=new AutoPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {


        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

    }
    @Then("kullnici {int} saniye bekler")
    public void kullnici_saniye_bekler(Integer int1) {


    }
    @When("kullinici shop sekmesine tiklar")
    public void kullinici_shop_sekmesine_tiklar() throws InterruptedException {

        Thread.sleep(1000);
       /* if(autoPage.closeButton.isDisplayed()==true){
            Driver.getDriver().switchTo().frame(autoPage.iframeClose);
            Thread.sleep(1000);
            autoPage.closeButton.click();
            Thread.sleep(1000);
            Driver.getDriver().switchTo().defaultContent();
            Thread.sleep(1000);
            autoPage.shop.click();

        } else if (!(autoPage.closeButton.isDisplayed())) {

            autoPage.shop.click();
        }*/
        ReusableMethods.clickWithJS(autoPage.shop);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitAndClick(autoPage.shop,5);

    }
    @When("kullanici Home sekmesine tiklar")
    public void kullanici_home_sekmesine_tiklar() throws InterruptedException {



         /* if(autoPage.carpi.isDisplayed()){
              Driver.getDriver().switchTo().frame(autoPage.iframe);
              Thread.sleep(1000);
              autoPage.carpi.click();
              Thread.sleep(1000);
              Driver.getDriver().switchTo().defaultContent();
              autoPage.home.click();

          } else if (!(autoPage.carpi.isDisplayed())) {

              autoPage.home.click();
          }
          */
        ReusableMethods.clickWithJS(autoPage.home);
       // Driver.getDriver().navigate().refresh();
       // ReusableMethods.waitAndClick(autoPage.home,5);


    }
    @When("kullanici anasayfada uc tane kaydirici oldugunu test eder")
    public void kullanici_anasayfada_uc_tane_kaydirici_oldugunu_test_eder() throws InterruptedException {


        autoPage.threeButton.click();
         Thread.sleep(1000);
       autoPage.threeButton.click();
        Thread.sleep(1000);
       autoPage.threeButton.click();
        Thread.sleep(1000);

        int expectedSlider=3;
        int actualSlider=autoPage.slidersImage.size();
        Assert.assertEquals(expectedSlider,actualSlider);

    }

    @When("kullanici anasayfada uc tane arrivals oldugunu test eder")
    public void kullanici_anasayfada_uc_tane_arrivals_oldugunu_test_eder() throws IOException, InterruptedException {


        actions.sendKeys(Keys.PAGE_DOWN).perform();


       // ReusableMethods.getScreenshot("3 tane Arrivals oldugunu gosterir");





    }
    @When("uc tane arrivals icermelidir")
    public void uc_tane_arrivals_icermelidir() {


        int expectedArrivals=3;
        int actualArrivals=autoPage.arrivalsImage.size();
        Assert.assertEquals(expectedArrivals,actualArrivals);

    }

    @When("kullanici Arrivals sekmesine tiklar")
    public void kullanici_arrivals_sekmesine_tiklar() {


        autoPage.book2.click();




    }
    @When("secilen kitapin sepete eklenip eklenecegi sayfaya gidip gidilmedigini test eder")
    public void secilen_kitapin_sepete_eklenip_eklenmedigini_test_eder() {


        Assert.assertTrue(autoPage.ikinciSayfaBook2.isDisplayed());

    }


    @When("description bolumunun gorunurlugu test edilir")
    public void kullanici_description_bolumunun_gorunur_oldugunu_test_eder() {


        Assert.assertTrue(autoPage.description.isDisplayed());

    }
    @When("kitap sekmesine basildiktan sonra kitap aciklamasi olmalidir")
    public void secilen_kitapin_icin_aciklama_bolumu_olmalidir() {


        Assert.assertTrue(autoPage.kitapAciklamasi.isDisplayed());

    }

    @And(("kullanici kitap resmine tiklar ve kapatir"))
    public void kullanici_kitap_resmine_tiklar_ve_kapatir() throws InterruptedException {

        autoPage.resim.click();
        Thread.sleep(1000);
        autoPage.resimKapatma.click();

    }
    @When("kullanici reviews bolumunun gorunurlugunu test eder")
    public void kullanici_reviews_bolumunun_gorunurlugunu_test_eder() {

        Assert.assertTrue(autoPage.reviews.isDisplayed());


    }


    @When(("kullanici kitabi sepete ekler"))
    public void kullanici_kitabi_sepete_ekler()  {

        /*for (int i = 1; i <25 ; i++) {
            if (i<25){
                autoPage.sepeteEkleme.click();
            } else if (i>=25) {
                autoPage.sepetSekmesi.click();

            }


        }*/
        autoPage.sepeteEkleme.click();



    }
    @When("kitabin stok sayisi kadar sepete ekler")
    public void kitabin_stok_sayisi_kadar_sepete_ekler() {



    }

    @And(("kullanici sepete tiklar"))
    public void kullanici_sepete_tiklar()  {


        autoPage.sepetSekmesi.click();

    }
    @When("kullanici kupon kodu girer")
    public void kullanici_kupon_kodu_girer() {
        autoPage.coupanCod.sendKeys("krishnasakinala");
        ReusableMethods.waitAndClick(autoPage.coupanCod,5);




    }
    @When("kullanici aply coupon sekmesine tiklar")
    public void kullanici_aply_coupon_sekmesine_tiklar() {

        autoPage.coupanCodButton.click();


    }
    @When("kuponun {int} lira uzeri kitaplarda gecerli oldugu test edilir")
    public void kuponun_lira_uzeri_kitaplarda_gecerli_oldugu_test_edilir(Integer int1) {
        Driver.getDriver().navigate().back();
        autoPage.book1.click();



    }

    @When("kitabin fiyatinin gorunurlugu test edilir")
    public void kitabin_fiyatinin_gorunurlugu_test_edilir() {

        Assert.assertTrue(autoPage.kitapFiyati.isDisplayed());



    }

    @When(("bir onceki sayfaya donulur"))
    public void bir_onceki_sayfaya_donulur()  {


        Driver.getDriver().navigate().back();

    }




    @When("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {

        Driver.closeDriver();

    }


}
