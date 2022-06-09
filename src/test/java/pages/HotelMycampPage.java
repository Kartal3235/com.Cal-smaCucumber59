package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMycampPage {
    public HotelMycampPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement loginClick;
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement ikinciLoginClick;
    @FindBy(xpath = "(//*[text()='ListOfUsers'])[2]")
    public WebElement sonucElementi;
    @FindBy(xpath = "//*[@id=\"divMessageResult\"]/div/span")
    public WebElement tekrarDeneyinizText;
}
