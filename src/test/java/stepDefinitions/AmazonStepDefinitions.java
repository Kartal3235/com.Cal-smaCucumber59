package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonpage=new AmazonPage();

    @Given("kullanici amazon anasayfasina gider")
    public void kullanici_amazon_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici amazonda flower aratir")
    public void kullanici_amazonda_flower_aratir() {
    amazonpage.aramaKutusu.sendKeys("flower"+ Keys.ENTER);
    }

    @Then("sonuclarin flower icerdiğini test eder")
    public void sonuclarin_flower_icerdiğini_test_eder() {
    String actualSonuc=amazonpage.aramaSonucElementi.getText();
    String expectedKelime="flower";
        Assert.assertTrue(actualSonuc.contains(expectedKelime));
    }

    @Then("sayfayı kapatir")
    public void sayfayı_kapatir() {
    Driver.closeDriver();
    }
}
