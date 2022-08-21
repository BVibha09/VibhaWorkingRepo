package a2z.uat.pages;

import java.time.Duration;
import a2z.uat.base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AmazonHome extends BaseClass{
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'menu']")
	private MobileElement menu;
	
	@AndroidFindBy(xpath = "//android.view.View[@text = 'Profile']")
	private MobileElement profile;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]\r\n" + 
			"")
	private MobileElement Ledger;
	
	@AndroidFindBy(xpath = "//android.widget.Image[@text='notifications']")
	private MobileElement Notifications;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View\r\n" + 
			"")
	private MobileElement NotificationsCount;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='arrow back']")
	private MobileElement BackArrow;

	@AndroidFindBy(xpath="//android.view.View[@text='Subscription today']")
	private MobileElement Subscription_home;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View[4]/android.view.View/android.view.View[1]\r\n" + 
			"")
	private MobileElement AboutUs;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Invoices calendar']")
	private MobileElement Invoices_Home;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Home home']")
	private MobileElement Home_Page;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View\r\n")
	private MobileElement DatePicker_Home;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\r\n" + 
			"")
	private MobileElement ProductQty;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]\r\n")
	private MobileElement product1;
	
	@AndroidFindBy(xpath="//android.widget.Image[@text='add_product_3']")
	private MobileElement Add_Product_toCart;
	
	public String getText(){
		return getAttribute(NotificationsCount, "text");	
	}
	
	public String getTextHome(){
		String text = Home_Page.getText();
		return getAttribute(Home_Page, text);	
	}
	
	public OrderPurchase clickCartIcon() throws InterruptedException
	{
		click(Add_Product_toCart);
		Thread.sleep(2000);
		return new OrderPurchase();
	}

	public AmazonHome clickMenu(){
		waitForVisibility(menu);
		click(menu);
		return this;
	}
	
	public AmazonProfile clickProfile(){
		click(profile);
		return new AmazonProfile();
	}
	
	public CustomersLedger clickLedger() throws InterruptedException
	{
		click(Ledger);
		Thread.sleep(3000);
		return new CustomersLedger();
	}
	
	public CustomerNotification clickNotifications() throws InterruptedException
	{
		click(Notifications);
		Thread.sleep(3000);
		return new CustomerNotification();	
	}
	
	public AmazonHome notifCount()
	{
		click(NotificationsCount);
		return new AmazonHome();	
	}
	
	public AmazonHome backArrow()
	{
		click(BackArrow);
		return new AmazonHome();
	}
	
	public AmazonHome clickSubscription() throws InterruptedException
	{
		click(Subscription_home);
		Thread.sleep(2000);
		return this;	
	}
	public CustomerAboutUs clickAboutUs()
	{
		click(AboutUs);
		waitForVisibility(BackArrow);
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(100, 500))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(100, 20))
		.release().perform();
		return new CustomerAboutUs();	
	}
	
	public CustomerInvoices clickInvoices() throws InterruptedException
	{
		click(Invoices_Home);
		Thread.sleep(2000);
		return new CustomerInvoices();	
	}
	
	public CustomerVacations homePage()
	{
		Boolean isHomePage = Home_Page.isDisplayed();
		return new CustomerVacations();
	} 
	
	public CustomerVacations clickDatePicker()
	{
		click(DatePicker_Home);
		return new CustomerVacations();
	}
	
	public CustomerDeliveryQtyHomePage clickFutureDate() throws InterruptedException
	{
		waitForVisibility(DatePicker_Home);
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(626, 233))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(173, 226))
		.release().perform();
		driver.findElementByXPath("//android.view.View[@bounds = '[140,202][214,258]']").click();
		return new CustomerDeliveryQtyHomePage();
	}
	
}
