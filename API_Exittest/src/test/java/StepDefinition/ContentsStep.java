package StepDefinition;

import org.testng.Assert;

import Base.Base_Class;
import Base.LogReport;
import Screens.Content_Screen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContentsStep extends Base_Class {
	LogReport logger = new LogReport("Content Screen Test");
	Content_Screen cont;
	@Given("Simpaly open apidemo application")
	public void simpaly_open_apidemo_application() {
		logger.log.info("API demo opened");
	   setup();
	}

	@Given("Click on the content section")
	public void click_on_the_content_section() {
		logger.log.info("Tap on content");
		cont=new Content_Screen();
		cont.tapcontent();

	}

	@Given("Click on Assets Section")
	public void click_on_assets_section() {
		logger.log.info("Tap on Assets");
		cont=new Content_Screen();
		cont.tapAssets();
	}

	@When("Click on Read Assets secion")
	public void click_on_read_assets_secion() {
		logger.log.info("Tap on Read Assets");
		cont=new Content_Screen();
		cont.tapRead();
	}

	@Then("Expected page will be open")
	public void expected_page_will_be_open() {
		logger.log.info("Checking assertion");
	    Assert.assertEquals((cont.assertionReadAssets()),"Content/Assets/Read Asset");
	}
}
