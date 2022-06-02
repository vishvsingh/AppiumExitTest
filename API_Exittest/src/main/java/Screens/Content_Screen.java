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

public class Content_Screen extends Base_Class {
	public Content_Screen() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);

	}

	AndroidTouchAction act = new AndroidTouchAction(wd);
	WebDriverWait wait = new WebDriverWait(wd, 20);
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Content\"]")
	private AndroidElement contentlink;
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Assets\"]")
	private AndroidElement Assetslink;
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Read Asset\"]")
	private AndroidElement ReadAssetslink;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	private AndroidElement titleReadAssets;
	//This method click on content
	public void tapcontent() {

		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Content\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(contentlink))).perform();
	}
	//This method click on Assets
	public void tapAssets() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Assets\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(Assetslink))).perform();
	}
	//This method click on ReadAssets
	public void tapRead() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"Read Asset\"]")));
		act.tap(TapOptions.tapOptions().withElement(ElementOption.element(ReadAssetslink))).perform();
	}
	//This method check Assertion
	public String assertionReadAssets() {
		String title = titleReadAssets.getText();
		return title;
	}
}
