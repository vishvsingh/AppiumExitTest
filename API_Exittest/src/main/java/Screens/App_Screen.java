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

public class App_Screen extends Base_Class {
	public App_Screen() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);

	}

	AndroidTouchAction act = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"App\"]")
	private AndroidElement Applink;
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Action Bar\"]")
	private AndroidElement actionBarlink;
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Action Bar Tabs\"]")
	private AndroidElement actionBartablink;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	private AndroidElement titleActionbar;
	//This method click on App
	public void tapAppLink() {

		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(Applink))).perform();
	}
	//This method click on Action bar
	public void tapActionLink() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Action Bar\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(actionBarlink))).perform();
	}
	//This method click on Action bar tab
	public void tapActionBarLink() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//android.widget.TextView[@content-desc=\"Action Bar Tabs\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(actionBartablink))).perform();
	}
	//This method check Assertion
	public String assertionaction() {
		String title = titleActionbar.getText();
		return title;

	}
}
