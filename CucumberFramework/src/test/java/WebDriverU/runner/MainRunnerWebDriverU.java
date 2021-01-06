package WebDriverU.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/WebDriverU/Features/"},
		glue = {"WebDriverU.steps"},
		monochrome = true,
		tags = {}, 
		plugin = {"pretty", "html:target/cucumber", "html:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"})


public class MainRunnerWebDriverU {

}
