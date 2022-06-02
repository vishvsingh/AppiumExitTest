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

public class Animation_screen extends Base_Class {
	public Animation_screen() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);

	}

	AndroidTouchAction act = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
	private AndroidElement animationlink;
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Reversing\"]")
	private AndroidElement reversinglink;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Play\"]")
	private AndroidElement play;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Reverse\"]")
	private AndroidElement reverse;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	private AndroidElement titlereverseAnimation;
//This method click on Animation
	public void tapAnimationLink() {

		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(animationlink))).perform();
		// animationlink.click();
	}
	//This method click on reversing
	public void tapReverseLink() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Reversing\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(reversinglink))).perform();
	}
	//This method click on play
	public void tapplay() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.Button[@content-desc=\"Play\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(play))).perform();
	}
	//This method click on reverse
	public void tapreverse() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.Button[@content-desc=\"Reverse\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(reverse))).perform();

	}
	//This method check Assertion
	public String assertionreverseanimation() {
		String title = titlereverseAnimation.getText();
		return title;
	}
}
