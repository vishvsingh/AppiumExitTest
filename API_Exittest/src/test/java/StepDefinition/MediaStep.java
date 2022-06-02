package StepDefinition;

import org.testng.Assert;

import Base.Base_Class;
import Base.LogReport;
import Screens.Media_Screen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MediaStep extends Base_Class {
	LogReport logger = new LogReport("Media Screen Test");
	Media_Screen media;
	@Given("Open Api demo apk")
	public void open_api_demo_apk() {
		logger.log.info("API demo opened");
		setup();
	   
	}

	@Given("Click on media section")
	public void click_on_media_section() {
	  logger.log.info("Tap on Media");
	  media=new Media_Screen();
	  media.tapmedia();
	}

	@When("Click on vedioview section")
	public void click_on_vedioview_section() {
		logger.log.info("Tap on VideoView");
		media=new Media_Screen();
		media.tapvedio();
	}

	@Then("It would be on expected page")
	public void it_would_be_on_expected_page() {
		logger.log.info("Checking assertion");
		Assert.assertEquals((media.assertionvedio()), "Media/VedeoView");
	}


}
