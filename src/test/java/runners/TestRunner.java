package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features",
        glue = "stepdefinitions",
        plugin = {"pretty",
               // "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
                "junit:target/JUnitReports/report.xml",
                "json:target/JSONReports/report.json",
                "html:target/HtmlReports1/report.html"},
        tags = "@Test")

public class TestRunner {


}