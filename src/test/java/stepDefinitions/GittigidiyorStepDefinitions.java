package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.GittigidiyorPage;
import utilities.Driver;

import java.io.*;
import java.util.List;

public class GittigidiyorStepDefinitions {

    GittigidiyorPage gdyp=new GittigidiyorPage();

    @Then("kullanici {string} aratir")
    public void kullanici_aratir(String string) {
    gdyp.aramaKutusu.sendKeys("Bilgisayar"+ Keys.ENTER);
    }

    @Then("kullanici {string} test eder")
    public void kullanici_test_eder(String string) {
    String actualYazı=gdyp.arananKelimeTest.getText();
    String expectedYazı="Bilgisayar";
        Assert.assertTrue(actualYazı.contains(expectedYazı));
    }

    @Then("kullanici {string} secer")
    public void kullanici_secer(String string) {
        //JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        //jse.executeScript("arguments[0].scrollIntoView(true);",gdyp.ilkUrun);
        gdyp.ilkUrun.click();
    }

    @Then("kullanici urun bilgisini yazdırır")
    public void kullanici_urun_bilgisini_yazdırır()  {
        String dosyaYolu="src/Resources/urunOzellik.txt";
        List<WebElement>urunList=gdyp.urunOzellikList;
        try {
            FileWriter fw=new FileWriter(dosyaYolu);
            fw.write(String.valueOf(urunList.stream().map(WebElement::getText)));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Then("kullanici {string} sepete ekler")
    public void kullanici_sepete_ekler(String string) {
    gdyp.sepeteEkle.click();
    }

    @Then("kullanici {string} fiyat dogrulugunu karşılaştırır")
    public void kullanici_fiyat_dogrulugunu_karşılaştırır(String string) {
    String sayfaFıyat=gdyp.sayfaFıyatı.getText();
    String sepetFıyat=gdyp.sepetFıyatı.getText();
    Assert.assertEquals(sepetFıyat,sayfaFıyat);
    }

    @Then("kullanici {string} sepetten silerek sepetin boş oldugunu kontrol eder")
    public void kullanici_sepetten_silerek_sepetin_boş_oldugunu_kontrol_eder(String string) {
    gdyp.sepettenSilButon.click();
    Assert.assertTrue(gdyp.sepetBosYazısı.isDisplayed());
    }
}
