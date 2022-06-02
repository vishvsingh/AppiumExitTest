package StepDefinition;

import org.testng.Assert;

import Base.Base_Class;
import Base.LogReport;
import Screens.App_Screen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppSteps extends Base_Class {
	LogReport logger = new LogReport("App Screen Test");
	App_Screen app;
	@Given("Launch ApiDEmo Application")
	public void launch_api_d_emo_application() {
		logger.log.info("API demo opened");
		setup();
	    
	}

	@Given("Touch on App section")
	public void touch_on_app_section() {
		logger.log.info("Tap on App");
		app=new App_Screen();
		app.tapAppLink();
	   
	}

	@Given("Touch on Action Bar section")
	public void touch_on_action_bar_section() {
		logger.log.info("Tap on Action Bar");
		app=new App_Screen();
		app.tapActionLink();
	}

	@When("Touch on Action Bar Tabs section")
	public void touch_on_action_bar_tabs_section() {
		logger.log.info( "Tap on Action Bar Tab");
		app=new App_Screen();
		app.tapActionBarLink();
	}

	@Then("It should on Expected page")
	public void it_should_on_expected_page() {
		logger.log.info("Checking assertion");
        Assert.assertEquals((app.assertionaction()), "App/Action Bar/Action Bar Tabs");
	}
}
