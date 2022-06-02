package StepDefinition;

import org.testng.Assert;

import Base.Base_Class;
import Base.LogReport;
import Screens.Graphics_Screen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphicSteps extends Base_Class {
	LogReport logger = new LogReport("Graphics Screen Test");
	Graphics_Screen graphic;
	@Given("API demo application will be open")
	public void api_demo_application_will_be_open() {
		logger.log.info("API demo opened");
		setup();
	    
	}

	@Given("Tap on graphics section")
	public void tap_on_graphics_section() {
		logger.log.info("Tap on graphics");
		graphic= new Graphics_Screen();
		graphic.tapGraphicsLink();
	}

	@When("Tap on Arc section")
	public void tap_on_arc_section() {
		logger.log.info("Tap on Arcs");
		graphic= new Graphics_Screen();
		graphic.tapArcLink();
	}

	@Then("It should work as desired")
	public void it_should_work_as_desired() {
		logger.log.info("Checking assertion");
		Assert.assertEquals(graphic.assertionArc(),"Graphics/Arcs");
	   
	}

}
