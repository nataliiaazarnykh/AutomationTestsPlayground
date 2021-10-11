package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import pagefactory.LoginCapisso_PF;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class CL1_LoginCapisso {
    private WebDriver driver;
    LoginCapisso_PF loginCapisso;
    String pathToLocalDriver;

    @Given("CL1 - user opens browser capisso")
    public void clch1_user_opens_browser_capisso() throws MalformedURLException {
        System.out.println("Inside step - user is on login page");
        pathToLocalDriver = "src/main/resources/drivers/operadriver.exe";
        System.setProperty("webdriver.opera.driver", pathToLocalDriver);
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("CL1 - user is on capisso login page capisso")
    public void clch1_user_is_on_capisso_login_page_capisso() throws InterruptedException {
        driver.navigate().to("https://capisso.staging.sentryc.com/login");
        Thread.sleep(3000);
    }

    @When("CL1 - user enters email capisso")
    public void clch1_user_enters_capisso_email_capisso() throws InterruptedException {
        loginCapisso = new LoginCapisso_PF(driver);
        //TODO: Enter here your email
        loginCapisso.enterEmailCapisso("");
        Thread.sleep(3000);
    }

    @And("CL1 - user enters password capisso")
    public void clch1_user_enters_capisso_password_capisso() throws InterruptedException {
        loginCapisso = new LoginCapisso_PF(driver);
        //TODO: Enter here your password
        loginCapisso.enterPasswordCapisso("");
        Thread.sleep(3000);
    }

    @And("CL1 - clicks on capisso login button capisso")
    public void clch1_clicks_on_capisso_login_button_capisso() {
        loginCapisso.clickOnLoginCapisso();
    }

    @Then("CL1 - user is navigated to capisso homepage capisso")
    public void clch1_user_is_navigated_to_capisso_homepage_capisso() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/dashboard']")).isDisplayed());
        Thread.sleep(2000);
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
