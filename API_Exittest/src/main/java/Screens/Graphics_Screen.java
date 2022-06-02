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

public class Graphics_Screen extends Base_Class {
	public Graphics_Screen() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);

	}

	AndroidTouchAction act = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Graphics\"]")
	private AndroidElement graphicslink;
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Arcs\"]")
	private AndroidElement Arclink;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	private AndroidElement titleArc;
	//This method click on Graphics
	public void tapGraphicsLink() {

		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(graphicslink))).perform();
	}
	//This method click on Arc
	public void tapArcLink() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Arcs\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(Arclink))).perform();
	}
	//This method check Assertion
	public String assertionArc() {
		String title = titleArc.getText();
		return title;

	}

}
