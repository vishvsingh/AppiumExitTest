package Base;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Base_Class {
public static AppiumDriver<MobileElement> wd=null;
public static AppiumDriverLocalService service;

// start appium server
public void start() {
	service = AppiumDriverLocalService.buildDefaultService();
	service.start();
}
	
	
	//Capabilities for app
	public static void setup()
	{
		DesiredCapabilities capabs=new DesiredCapabilities();
		capabs.setCapability("platformVersion", "8.1");
		capabs.setCapability("platformName", "Android");
		capabs.setCapability("deviceName", "Android");
		capabs.setCapability("appPackage", "io.appium.android.apis");
		capabs.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		capabs.setCapability("app", "./Application/ApiDemos.apk");
		capabs.setCapability("isHeadless", true);
		capabs.setCapability("avdArgs", "-no-window");
	
	
	//server Path
	try {
	  wd=new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabs);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}}
	// stop appium
		public void stopAppium() {
			wd.quit();
		}

		// stop appium service
		public void closeService() {
			service.stop();
		}



}
