package StepDefinition;

import org.testng.Assert;

import Base.Base_Class;
import Screens.Animation_screen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Base.LogReport;

public class AnimationSteps extends Base_Class {
	Animation_screen animation;
	LogReport logger = new LogReport("Animation Screen Test");
	@Given("First i click on apidemo")
	public void first_i_click_on_apidemo() {
		logger.log.info("API demo opened");
	    setup();
	}

	@Given("Click on animation section")
	public void click_on_animation_section() {
		logger.log.info("Tap on animation");
		animation=new Animation_screen();
		animation.tapAnimationLink();
	   
	}

	@Given("Click on reversing")
	public void click_on_reversing() {
		logger.log.info("Tap on reversing");
		animation=new Animation_screen();
		animation.tapReverseLink();
	}

	@Given("Click on Play button")
	public void click_on_play_button() {
		logger.log.info("Tap on play button");
		animation=new Animation_screen();
		animation.tapplay();
	}

	@When("Click on reverse  button")
	public void click_on_reverse_button() {
		logger.log.info("Tap on reverse button");
		animation=new Animation_screen();
		animation.tapreverse();
	}

	@Then("It should be on on expected page")
	public void it_should_be_on_on_expected_page() {
		logger.log.info("Checking assertion");
		Assert.assertEquals(animation.assertionreverseanimation(), "Animation/Reversing");
	    
	}
}
