package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationsPage;
import utilities.Driver;

public class AutomationstepDefinitions {

    AutomationsPage autopage=new AutomationsPage();
        Faker fake=new Faker();

    @Given("kullanici sign in linkine tiklar")
    public void kullanici_sign_in_linkine_tiklar() {
        autopage.signInClick.click();
    }

    @Given("kullanici Create and account bölümüne email adresi girer")
    public void kullanici_create_and_account_bölümüne_email_adresi_girer() {
    autopage.createAndAccount.sendKeys(fake.internet().emailAddress());
    }

    @Given("kullanici Create an Account butonuna basar")
    public void kullanici_create_an_account_butonuna_basar() {
    autopage.createAndAccountButonClick.click();
    }

    @Given("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullanici_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
    Select select=new Select(autopage.state);
    Actions action=new Actions(Driver.getDriver());
    autopage.genderClick.click();
    autopage.firtname.sendKeys(fake.name().firstName());
    autopage.lastname.sendKeys(fake.name().lastName());
    autopage.passWord.sendKeys(fake.internet().emailAddress());
    action.sendKeys(autopage.days,"2").perform();
    action.sendKeys(autopage.months,"10").perform();
    action.sendKeys(autopage.years).sendKeys("2021").perform();
    autopage.yourFirstName.sendKeys(fake.name().firstName());
    autopage.yourLastName.sendKeys(fake.name().lastName());
    autopage.yourCompany.sendKeys(fake.country().countryCode2());
    autopage.yourAddress.sendKeys(fake.address().fullAddress());
    autopage.yourAddress2.sendKeys(fake.address().secondaryAddress());
    autopage.city.sendKeys(fake.address().city());
    autopage.state.sendKeys("Arizona"+ Keys.ENTER);
    autopage.postaCode.sendKeys(fake.address().zipCode());
    autopage.country.sendKeys(fake.country().name());
    autopage.other.sendKeys("dsaFDSGDS"+Keys.ENTER);
    autopage.homePhone.sendKeys(fake.phoneNumber().phoneNumber());
    autopage.mobilePhone.sendKeys(fake.phoneNumber().cellPhone());
    autopage.alias.sendKeys("asDFEFDSA"+Keys.ENTER);

    }

    @Given("kullanici Register butonuna basar")
    public void kullanici_register_butonuna_basar() {
    autopage.register.click();
    }

    @Then("kullanici hesap olustugunu test eder")
    public void kullanici_hesap_olustugunu_test_eder() {

    }

}
