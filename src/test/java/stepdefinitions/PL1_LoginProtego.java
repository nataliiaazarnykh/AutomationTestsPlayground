package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import pagefactory.LoginProtego_PF;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class PL1_LoginProtego {

    private WebDriver driver;
    LoginProtego_PF loginProtego;
    String pathToLocalDriver;

    @Given("PL1 - producer opens browser")
    public void pl1_producer_opens_browser() throws MalformedURLException {
        System.out.println("Inside step - user is on login page");
        pathToLocalDriver = "src/main/resources/drivers/operadriver.exe";
        System.setProperty("webdriver.opera.driver", pathToLocalDriver);
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("PL1 - producer opens protego login page")
    public void pl1_producer_opens_protego_login_page() throws InterruptedException {
        driver.navigate().to("https://capisso.staging.sentryc.com/login");
        Thread.sleep(3000);
    }

    @And("PL1 - producer enters email")
    public void pl1_producer_enters_email() throws InterruptedException {
        loginProtego = new LoginProtego_PF(driver);
        //TODO: Enter here your email
        loginProtego.enterEmailProtego("");
        Thread.sleep(3000);
    }

    @And("PL1 - producer enters password")
    public void pl1_producer_enters_password() throws InterruptedException {
        //TODO: Enter here your password
        loginProtego.enterPasswordProtego("");
        Thread.sleep(3000);
    }

    @And("PL1 - producer clicks on login button")
    public void clch1_clicks_on_capisso_login_button_capisso() {
        loginProtego.clickOnLoginProtego();
    }

    @Then("PL1 - producer is navigated to protego homepage")
    public void clch1_user_is_navigated_to_capisso_homepage_capisso() throws InterruptedException {
        driver.navigate().to("https://app.staging.sentryc.com/inbox");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Results')]")).isDisplayed());
        Thread.sleep(2000);
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
