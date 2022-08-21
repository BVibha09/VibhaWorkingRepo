package a2z.uat.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.AmazonHome;
import a2z.uat.pages.OrderPurchase;
import a2z.uat.pages.CustomerNotification;

public class CustomerNotificationsTest extends BaseClass{
	
	AmazonHome customerHomePage;
	CustomerNotification customerNotifications;

  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerHomePage= new AmazonHome();
	  customerNotifications = new CustomerNotification();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

  @Test
  public void CustomerNotifications() throws InterruptedException, IOException {
	  customerNotifications	=  customerHomePage.clickNotifications();
	  
	  customerNotifications.verifyNotifications();
	   
  }
  
  @AfterMethod
  public void afterMethod() {
  }
}
