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
        // Write code here that turns the phrase above into concrete actions

        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

    }
    @Then("kullnici {int} saniye bekler")
    public void kullnici_saniye_bekler(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("kullinici shop sekmesine tiklar")
    public void kullinici_shop_sekmesine_tiklar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
         autoPage.shop.click();
        Thread.sleep(1000);
    }
    @When("kullanici Home sekmesine tiklar")
    public void kullanici_home_sekmesine_tiklar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
          autoPage.home.click();
          Thread.sleep(1000);

    }
    @When("kullanici anasayfada uc tane kaydirici oldugunu test eder")
    public void kullanici_anasayfada_uc_tane_kaydirici_oldugunu_test_eder() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
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
        // Write code here that turns the phrase above into concrete actions

         Thread.sleep(1000);

        actions.sendKeys(Keys.PAGE_DOWN).perform();


       // ReusableMethods.getScreenshot("3 tane Arrivals oldugunu gosterir");





    }
    @When("uc tane arrivals icermelidir")
    public void uc_tane_arrivals_icermelidir() {
        // Write code here that turns the phrase above into concrete actions

        int expectedArrivals=3;
        int actualArrivals=autoPage.arrivalsImage.size();
        Assert.assertEquals(expectedArrivals,actualArrivals);

    }

    @When("kullanici Arrivals sekmesine tiklar")
    public void kullanici_arrivals_sekmesine_tiklar() {
        // Write code here that turns the phrase above into concrete actions

        autoPage.book2.click();

    }
    @When("secilen kitapin sepete eklenip eklenecegi sayfaya gidip gidilmedigini test eder")
    public void secilen_kitapin_sepete_eklenip_eklenmedigini_test_eder() {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertTrue(autoPage.ikinciSayfaBook2.isDisplayed());

    }


    @When("description bolumunun gorunurlugu test edilir")
    public void kullanici_description_bolumunun_gorunur_oldugunu_test_eder() {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertTrue(autoPage.description.isDisplayed());

    }
    @When("kitap sekmesine basildiktan sonra kitap aciklamasi olmalidir")
    public void secilen_kitapin_icin_aciklama_bolumu_olmalidir() {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertTrue(autoPage.kitapAciklamasi.isDisplayed());



    }




    @When("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        // Write code here that turns the phrase above into concrete actions
        Driver.closeDriver();

    }


}
