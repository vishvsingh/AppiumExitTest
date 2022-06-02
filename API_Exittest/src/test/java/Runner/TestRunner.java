package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "./src/test/java/Features",
		
		glue = {"StepDefinition","Hooks"},
		
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		tags = "@Tag"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
