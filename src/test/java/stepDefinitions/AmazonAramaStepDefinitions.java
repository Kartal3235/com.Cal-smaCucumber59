package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AmazonPage;

public class AmazonAramaStepDefinitions {
        AmazonPage amazonpage=new AmazonPage();

    @Then("kullanici {string} test eder")
    public void kullanici_test_eder(String istenenKelime) {
    Assert.assertTrue(amazonpage.baslıkTest.getText().contains(istenenKelime));
    }

    @Given("kullanici {string} sekmesine basin")
    public void kullanici_sekmesine_basin(String string) {
        amazonpage.giftCards.click();
    }

    @Then("kullanici Birthday butonuna basin")
    public void kullanici_birthday_butonuna_basin() {
    amazonpage.birthdayButonu.click();
    }

    @Then("kullanici Best Seller bolumunden ilk urunu tiklayin")
    public void kullanici_best_seller_bolumunden_ilk_urunu_tiklayin() {
    amazonpage.bestSelerİlkUrun.click();
    }

    @Then("kullanici Gift card details’den {int} $’i seci")
    public void kullanici_gift_card_details_den_$_i_seci(Integer istenenSayı) {
    amazonpage.griftCardDetail25.click();
    }

    @Then("kullanici Urun ucretinin {int}$ oldugunu test eder")
    public void kullanici_urun_ucretinin_$_oldugunu_test_eder(Integer int1) {

    }
}
