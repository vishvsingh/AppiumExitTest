package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base_Class;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Media_Screen extends Base_Class {
	public Media_Screen() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);

	}

	AndroidTouchAction act = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Media\"]")
	private AndroidElement medialink;
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"VideoView\"]")
	private AndroidElement vediolink;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	private AndroidElement titlevedio;
	//This method click on Media
	public void tapmedia() {

		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Media\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(medialink))).perform();
	}
	//This method click on video
	public void tapvedio() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"VideoView\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(vediolink))).perform();
	}
//This method check Assertion
	public String assertionvedio() {
		String title = titlevedio.getText();
		return title;
	}
}
