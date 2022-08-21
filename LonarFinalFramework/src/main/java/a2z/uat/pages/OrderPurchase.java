package a2z.uat.pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import a2z.uat.base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class OrderPurchase extends BaseClass{
	String app_name;
	String Cust_Name;
	
	@AndroidFindBy(xpath = "//android.widget.Image[@text='add circle outline']")
	private MobileElement increase_Qty;
	
	@AndroidFindBy(xpath = "//android.widget.Image[@text='remove circle outline']")
	private MobileElement decrease_Qty; 
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[10]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]")
	private MobileElement DelSchdl; 
	
	@AndroidFindBy(xpath ="//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]"
			+ "/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Image[1]")
	private MobileElement Alt_Days;
	
	@AndroidFindBy(xpath="//android.widget.Button[@index='2']")
	private MobileElement Delivery_Time;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Evening']")
	private MobileElement Change_Del_Time;

	@AndroidFindBy(xpath="//android.widget.Button[@text = 'Door Step']")
	private MobileElement Change_Del_Mode;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Place Order']")
	private MobileElement PlaceOrder;
	
	@AndroidFindBy(xpath="//android.widget.Image[@text='add_product_3']")
	private MobileElement Add_Product_toCart;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index='0']")
	private MobileElement Start_Date;
	
	@AndroidFindBy(xpath="//android.view.View[@text='15']")
	private MobileElement Select_Date;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View[1]")
	private MobileElement Subscribe_Button;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text = 'arrow back']")
	private MobileElement Back_Button;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='menu']")
	private MobileElement Menu;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Subscription today']")
	private MobileElement Subscription_home;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@text='close add']")
	private MobileElement AddWithPlusButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Meals']")
	private MobileElement Meals;
	
	@AndroidFindBy(xpath="//android.view.View[@text='(Lunch)']")
	private MobileElement Lunch;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Fruits']")
	private MobileElement Fruits;
	
	@AndroidFindBy(xpath="//android.view.View[@text='(Apples)']")
	private MobileElement Apples;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.app.Dialog[1]/android.view.View[1]/android.view.View[2]/android.view.View[5]/android.view.View[1]/android.widget.Button[1]")
	private MobileElement OKForSchedule;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[7]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]")
	private MobileElement Logout;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/android.view.View/android.view.View[1]\r\n" + 
			"")	
	private MobileElement sixthSubscribedElement;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Update']")
	private MobileElement UpdateButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Add From Existing Subscription']")
	private MobileElement existingSubscription;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View\r\n")
	private MobileElement SubscribedOrders;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='arrow forward']")
	private MobileElement GoToNextMonth;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='CLOSE']")
	private MobileElement CloseCalendar;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[5]/android.view.View[1]")
	private MobileElement suppLogout;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='arrow back']")
	private MobileElement subOrdersBackBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='arrow back']")
	private MobileElement addNewProdBackBtn;
	
	public OrderPurchase PlaceNewSubscription() throws InterruptedException 
	{
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(100, 900))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(100, 20))
		.release().perform();
		Thread.sleep(2000);
		click(Meals);
		click(Lunch);
		click(Subscribe_Button);
		click(Start_Date);
		click(GoToNextMonth);
		Thread.sleep(2000);
		click(Select_Date);
		Thread.sleep(2000);
		click(DelSchdl);
		click(Alt_Days);
		click(OKForSchedule);
		click(Delivery_Time);
		click(Change_Del_Time);
		click(PlaceOrder);
		Thread.sleep(3000);
		return this;	
	}
	
	public OrderPurchase deliverOnce() throws InterruptedException {
		click(AddWithPlusButton);
		Thread.sleep(2000);
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(100, 900))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(100, 20))
		.release().perform();
		click(Fruits);
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(100, 900))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(100, 20))
		.release().perform();
		click(Apples);
		click(Start_Date);
		click(CloseCalendar);
		click(Delivery_Time);
		click(Change_Del_Time);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[10]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button\r\n" + 
				"").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		click(Change_Del_Mode);
		click(PlaceOrder);
		Thread.sleep(5000);
		return this;
	}
	
	public OrderPurchase copy_Name() throws InterruptedException
	{	
		click(Back_Button);
		click(Menu);
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]").click();  //profile
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Cust_Name = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
				"").getText();
		click(Back_Button);
		return this;
	}
	
	public AmazonLogin Logout()
	{	click(Menu);
		click(Logout);
		return new AmazonLogin();
	}
	
	public OrderPurchase getSupplierOrderName()
	{
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View\r\n" + 
				"").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 app_name = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]\r\n").getText();
		return this;	
	}
	
	public SupplierDashboard verifyOrder()
	{
		assertTrue(app_name.contains(Cust_Name));
		
		System.out.println("Assertion passed: The last request received for the product for Customer: " +app_name);
		click(Back_Button);
		return new SupplierDashboard();
	}
		
	public AmazonHome updateOrder() throws InterruptedException 
	{
		click(Subscription_home);
		Thread.sleep(3000);
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(302, 1077))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(319, 0))
		.release().perform();
		
		String actual = sixthSubscribedElement.getText(); 
		System.out.println(actual);
		if(actual.contains("Active"))
		{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		click(sixthSubscribedElement);
		click(increase_Qty);
		click(decrease_Qty);
		click(DelSchdl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.CheckBox/android.widget.Button\r\n" + 
				"").click(); driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.app.Dialog[1]/android.view.View[1]/android.view.View[2]/android.view.View[5]/android.view.View[1]/android.widget.Button[1]").click();
		click(Delivery_Time);
		click(Change_Del_Time);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[12]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button\r\n" + 
				"").click();
		click(Change_Del_Mode);
		click(PlaceOrder);
		Thread.sleep(2000);
		System.out.println("The order has been updated successfully!!");
		click(subOrdersBackBtn);
		}
		else {
			System.out.println("The order is not Active..");
			click(subOrdersBackBtn);
		}
		return new AmazonHome();	
	}
	
	public AmazonHome updateOrderQuantity() throws InterruptedException
	{
		if(driver.findElements(By.xpath("//android.widget.Button[@text='Add From Existing Subscription']")).size()>0)
		{
			String initial = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\r\n" + 
					"").getText();
			System.out.println("The initial quantity of product is: " +initial);
			WebElement existing1 = driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]");
			existing1.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			click(increase_Qty);
			click(increase_Qty);
			click(decrease_Qty);
			click(UpdateButton);
			Thread.sleep(3000);
			String changed = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]\r\n" + 
					"").getText(); 
			System.out.println("The updated quantity is: " +changed);
			click(subOrdersBackBtn);
		}
		else {
			System.out.println("No existing Subscriptions");
			click(addNewProdBackBtn);
			click(subOrdersBackBtn);
		}
		return new AmazonHome();	
	}
}

