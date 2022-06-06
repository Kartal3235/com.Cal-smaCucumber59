package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HotelMycampPage;
import utilities.Driver;

public class HotelMyCampDefinitions {
    HotelMycampPage htmy=new HotelMycampPage();

    @Given("kullanici hotelmycamp anasayfasina gider")
    public void kullanici_hotelmycamp_anasayfasina_gider() {
        Driver.getDriver().get("https://www.hotelmycamp.com");
    }

    @Then("kullanici login butonuna basar")
    public void kullanici_login_butonuna_basar() {
    htmy.loginClick.click();
    }

    @When("kullanici username giris yapar")
    public void kullanici_username_giris_yapar() {
     htmy.username.sendKeys("manager");
    }

    @When("kullanici password giris yapar")
    public void kullanici_password_giris_yapar() {
        htmy.password.sendKeys("Manager1!");
    }

    @When("kullanici ikinci login tıklar")
    public void kullaniciIkinciLoginTıklar() {
        htmy.ikinciLoginClick.click();
    }

    @When("kullanici Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et")
    public void kullanici_degerleri_girildiginde_sayfaya_basarili_sekilde_girilebildigini_test_et() {

        Assert.assertTrue(htmy.sonucElementi.isDisplayed());

    }

    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
    Driver.closeDriver();
    }


}
