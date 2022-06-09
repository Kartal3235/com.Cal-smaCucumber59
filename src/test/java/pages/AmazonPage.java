package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {


    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "//title")
    public WebElement baslıkTest;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
    public WebElement giftCards;
    @FindBy(xpath = "//*[@id=\"contentGrid_235206\"]/div/div[2]/div[2]/div/div/a")
    public WebElement birthdayButonu;
    @FindBy(xpath = "(//*[@id=\"acs-product-block-0\"]/div[1]/a/img)[1]")
    public WebElement bestSelerİlkUrun;
    @FindBy(xpath = "//*[@id=\"a-autoid-28\"]")
    public WebElement griftCardDetail25;
}

