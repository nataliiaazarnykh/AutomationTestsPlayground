package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginProtego_PF {
    final String email = "nataliia.azarnykh+staging@sentryc.com";
    WebDriver driver;
    @FindBy(name = "email")
    @CacheLookup
    WebElement txt_email_protego;

    @FindBy(name = "password")
    @CacheLookup
    WebElement txt_password_protego;

    @FindBy(xpath = "//*[contains(text(), 'Log in')]")
    @CacheLookup
    WebElement btn_login_protego;

    @FindBy(xpath = "//*[contains(text(), 'Forgot your Password?')]")
    @CacheLookup
    WebElement btn_forgot_password;

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[1]/div[2]/form/div[1]/div/div/fieldset")
    @CacheLookup
    WebElement txt_forgot_password_email_field;

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[1]/div[2]/form/div[2]/div/button")
    @CacheLookup
    WebElement btn_send;

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[1]/div[2]/div[3]/a/button")
    @CacheLookup
    WebElement btn_back_to_login;


    public LoginProtego_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmailProtego(String email) {
        txt_email_protego.sendKeys(email);
    }

    public void enterPasswordProtego(String password) {
        txt_password_protego.sendKeys(password);
    }

    public void clickOnLoginProtego() {
        btn_login_protego.click();
    }

}
