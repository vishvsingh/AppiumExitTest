package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.Base_Class;


import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import Base.LogReport;

public class hooks extends Base_Class {
	LogReport logger = new LogReport("Hooks");

	@Before
	public void startAppuim() {
		logger.log.info("Starting appium server.");
		start();
		logger.log.info("Started appium server.");
	}

	
	@After
	public void stop(Scenario result) {
		if (result.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) wd).getScreenshotAs(OutputType.BYTES);

			result.attach(screenshot, "image/png", "failed");
		}
		stopAppium();
		logger.log.info("stop appium");
		closeService();
		logger.log.info("close service");
	
	}

}
