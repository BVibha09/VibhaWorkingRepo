package a2z.uat.base;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class BaseClass {
	
	protected static AndroidDriver<WebElement> driver;
	  
	public BaseClass()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
  @BeforeTest
  public void beforeTest() {
	  try{
		  DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
			dc.setCapability(MobileCapabilityType.APPLICATION_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			dc.setCapability("appPackage", "in.amazon.mshop.android.shopping");
			dc.setCapability("appActivity", "com.amazon.mshop.navigation.MainActivity");
			dc.setCapability("unicodeKeyboard", true);
			dc.setCapability("resetKeyboard", true);

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver= new AndroidDriver<WebElement> (url,dc);
			String sessionId = driver.getSessionId().toString();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	  } catch (Exception e){
		  e.printStackTrace();
	  } 
  }
  
  public void waitForVisibility (MobileElement m){
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOf(m));
  }
  
  public void click(MobileElement m){
	  waitForVisibility(m);
	  m.click();
  }
  
  public void sendKeys(MobileElement m, String txt){
	  waitForVisibility(m);
	  m.sendKeys(txt);
	  System.out.println("Entered text is: " +txt);
  }
  
  public String getAttribute(MobileElement m, String attribute){
	  waitForVisibility(m);
	  return m.getAttribute(attribute);
  }
  
  public void clear(MobileElement m){
	  waitForVisibility(m);
	  m.clear();
	  
  }
  public void Scroll(){
	//Page Scroll
	  
		try {
			new TouchAction((PerformsTouchActions) driver).press(PointOption.point(100, 700))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(100, 20))
			.release().perform();
		}
		catch (Exception e) {
			System.out.println("Scroll not done");
		}
  }
 
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
