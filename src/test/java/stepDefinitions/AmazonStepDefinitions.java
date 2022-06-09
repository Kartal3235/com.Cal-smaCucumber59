package stepDefinitions;

import io.cucumber.java.en.And;
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
    @Then("kullanici amazonda nutella aratir")
    public void kullanici_amazonda_nutella_aratir() {
    amazonpage.aramaKutusu.sendKeys("nutella"+Keys.ENTER);
    }

    @Then("sonuclarin nutella icerdiğini test eder")
    public void sonuclarin_nutella_icerdiğini_test_eder() {
   String actualSonuc=amazonpage.aramaSonucElementi.getText();
   String expectedSonuc="nutella";
   Assert.assertTrue(actualSonuc.contains(expectedSonuc));
    }
    @Given("kullanici amazonda java aratir")
    public void kullanici_amazonda_java_aratir() {
  amazonpage.aramaKutusu.sendKeys("java"+Keys.ENTER);
    }
    @Then("sonuclarin java icerdiğini test eder")
    public void sonuclarin_java_icerdiğini_test_eder() {
    String actualSonuc=amazonpage.aramaSonucElementi.getText();
    String expectedSonuc="java";
    Assert.assertTrue(actualSonuc.contains(expectedSonuc));
    }
    @Given("kullanici {string} aratir")
    public void kullanici_nutella_aratir(String istenenKelime) {
        amazonpage.aramaKutusu.sendKeys(istenenKelime+Keys.ENTER);
    }
    @Given("sonuclarin {string} icerdiğini test eder")
    public void sonuclarin_icerdiğini_test_eder(String istenenKelime) {
        String actualSonuc=amazonpage.aramaSonucElementi.getText();
        String expectedSonuc=istenenKelime;
        Assert.assertTrue(actualSonuc.contains(expectedSonuc));
    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }


    @And("url'nin {string} icerdiğini test eder")
    public void urlNinIcerdiğiniTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonpage.aramaKutusu.sendKeys(istenenKelime+Keys.ENTER);
    }

    @Then("kullanici {string} arama yapar")
    public void kullaniciAramaYapar(String istenenKelime) {
        amazonpage.aramaKutusu.sendKeys(istenenKelime+Keys.ENTER);
    }



    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        Assert.assertTrue(amazonpage.aramaSonucElementi.getText().contains(istenenKelime));
    }



}
