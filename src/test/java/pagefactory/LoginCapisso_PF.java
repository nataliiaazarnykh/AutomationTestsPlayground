package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCapisso_PF {

    final String email = "nataliia.azarnykh@sentryc.com";
    WebDriver driver;

    @FindBy(name = "email")
    @CacheLookup
    WebElement txt_email_capisso;

    @FindBy(name = "password")
    @CacheLookup
    WebElement txt_password_capisso;

    @FindBy(xpath = "//*[contains(text(), 'Log in')]")
    @CacheLookup
    WebElement btn_login_capisso;

    public LoginCapisso_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickOnLoginCapisso() {
        btn_login_capisso.click();
    }

    public void enterPasswordCapisso(String password) {
        txt_password_capisso.sendKeys(password);
    }

    public void enterEmailCapisso(String randomEmail) {
        txt_email_capisso.sendKeys(randomEmail);
    }
}