package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationsPage {
    public AutomationsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    public WebElement signInClick;
    @FindBy(xpath = "//*[@id=\"email_create\"]")
    public WebElement createAndAccount;
    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    public WebElement createAndAccountButonClick;
    @FindBy(xpath = "//*[@id=\"id_gender1\"]")
    public WebElement genderClick;
    @FindBy(xpath = "//*[@id=\"customer_firstname\"]")
    public WebElement firtname;
    @FindBy(xpath = "//*[@id=\"customer_lastname\"]")
    public WebElement lastname;
    @FindBy(xpath = "//*[@id=\"passwd\"]")
    public WebElement passWord;
    @FindBy(xpath = "//*[@id=\"days\"]")
    public WebElement days;
    @FindBy(xpath = "//*[@id=\"months\"]")
    public WebElement months;
    @FindBy(xpath = "//*[@id=\"years\"]")
    public WebElement years;
    @FindBy(xpath = "//*[@id=\"firstname\"]")
    public WebElement yourFirstName;
    @FindBy(xpath = "//*[@id=\"lastname\"]")
    public WebElement yourLastName;
    @FindBy(xpath = "//*[@id=\"company\"]")
    public WebElement yourCompany;
    @FindBy(xpath = "//*[@id=\"address1\"]")
    public WebElement yourAddress;
    @FindBy(xpath = "//*[@id=\"address2\"]")
    public WebElement yourAddress2;
    @FindBy(xpath = "//*[@id=\"city\"]")
    public WebElement city;
    @FindBy(xpath = "//*[@id=\"uniform-id_state\"]")
    public WebElement state;
    @FindBy(xpath = "//*[@id=\"postcode\"]")
    public WebElement postaCode;
    @FindBy(xpath = "//*[@id=\"uniform-id_country\"]")
    public WebElement country;
    @FindBy(xpath = "//*[@id=\"other\"]")
    public WebElement other;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    public WebElement homePhone;
    @FindBy(xpath = "//*[@id=\"phone_mobile\"]")
    public WebElement mobilePhone;
    @FindBy(xpath = "//*[@id=\"alias\"]")
    public WebElement alias;
    @FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
    public WebElement register;
}
