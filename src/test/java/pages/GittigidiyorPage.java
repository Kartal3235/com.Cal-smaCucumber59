package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GittigidiyorPage {
    public GittigidiyorPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[2]/div/div/div[2]/div/div[3]/div[1]/div[1]")
    public WebElement arananKelimeTest;
    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[4]/section[1]/section[2]")
    public WebElement cerezKapat;
    @FindBy(xpath = "//*[@id=\"1\"]/li[1]/article/div[2]/a/div/div[2]/header/hgroup/h2")
    public WebElement ilkUrun;
    @FindBy(xpath = "//*[@id=\"sp-desktopDescription\"]/div[1]/div/div/h3")
    public WebElement baslıkYazdır;
    @FindBy(xpath="//li[@style='box-sizing: border-box;']")
    public List<WebElement>urunOzellikList;
    @FindBy(xpath = "//*[@id=\"add-to-basket\"]")
    public WebElement sepeteEkle;
    @FindBy(xpath = "(//*[@id=\"sp-price-highPrice\"])[1]")
    public WebElement sayfaFıyatı;
    @FindBy(xpath = "//*[@id=\"header_wrapper\"]/div[4]/div[3]/a/div[2]")
    public WebElement sepetimTıkla;
    @FindBy(xpath = "//*[@id=\"cart-item-532498779\"]/div[1]/div[5]/div/div[1]/strong")
    public WebElement sepetFıyatı;
    @FindBy(xpath = "//*[@id=\"cart-item-532498779\"]/div[1]/div[3]/div/div[3]/div/div/a/i")
    public WebElement sepettenSilButon;
    @FindBy(xpath = "//*[@id=\"empty-cart-container\"]/div[1]/div[1]/div/div[2]/h2")
    public WebElement sepetBosYazısı;
}
