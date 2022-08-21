package a2z.uat.pages;

import java.time.Duration;

import a2z.uat.base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AmazonLogout extends BaseClass{
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'menu']")
	private MobileElement menu;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View")
	private MobileElement panel;
	
	@AndroidFindBy(xpath = "//android.view.View[@text = 'Logout']")
	private MobileElement logoutMenu;
	
	public AmazonLogin supplierLogout() throws InterruptedException {
		click(menu);
		Thread.sleep(5000);
		if (panel != null) {
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(100, 1452)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(100, 0)).release().perform();
		}
		Thread.sleep(5000);
		click(logoutMenu);
		return new AmazonLogin();
		}

	public AmazonLogin daLogout() throws InterruptedException {
		click(menu);
		Thread.sleep(1000);
		click(logoutMenu);
		return new AmazonLogin();
		}
	
	public AmazonLogin customerLogout() throws InterruptedException {
		click(menu);
		click(logoutMenu);
		return new AmazonLogin();
		}
	
	public AmazonLogin supervisorLogout() throws InterruptedException {
		click(menu);
		click(logoutMenu);
		return new AmazonLogin();
		}
}
