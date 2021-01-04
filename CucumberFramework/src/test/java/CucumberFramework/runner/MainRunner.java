package CucumberFramework.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/CucumberFramework/featureFiles/"},
		glue = {"CucumberFramework.steps"},
		monochrome = true,
		tags = {}, 
		plugin = {"pretty", "html:target/cucumber", "html:target/cucumber.json"})

public class MainRunner {

}
