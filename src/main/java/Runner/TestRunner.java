package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\niksa\\eclipse-workspace\\Cucumber\\src\\main\\java\\Features\\login.feature", 
		glue = {"stepDefinitions" }, 
		format = { "pretty", "html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml" },
		dryRun=false,
		monochrome = true
				)

public class TestRunner {

}
