package WebDriverU.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/WebDriverU/Features2/"}, // location of feature files
		glue = {"WebDriverU.steps"},			// Location of Step File
		monochrome = true,						// Leave it as true since, console output is more readable
		dryRun = false,							// Leave as false. If you set to true, it will NOT execute the code inside the Step definition
		tags = {}, 				// Leave Empty if you want to run through all Scenarios. Filters only the test we want to run ... aka we tag only the scenarios we want to run
		plugin = {"pretty", 
				"html:target/cucumber", 
				"html:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/report2.html"})

public class RunnerButtonClicks {

}
