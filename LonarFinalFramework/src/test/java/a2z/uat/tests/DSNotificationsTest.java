package a2z.uat.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.DSDashboard;
import a2z.uat.pages.DSNotifications;


public class DSNotificationsTest {
	AmazonLogin applicationLogin;
	DSDashboard dsDashboard;
	DSNotifications dsNotifications;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	 dsDashboard = new DSDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test
  public void verifySupplierNotifications() throws InterruptedException {
	 dsNotifications =  dsDashboard.clickNotification();
	  dsNotifications.verifyNotifications();
  }

  @AfterMethod
  public void afterMethod() {
  }

}