package a2z.uat.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.SupplierDashboard;
import a2z.uat.pages.SupplierNotifications;

public class SupplierNotificationsTest {
	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierNotifications supplierNotifications;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  supplierDashboard = new SupplierDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test
  public void verifySupplierNotifications() throws InterruptedException {
	  supplierNotifications =  supplierDashboard.clickNotification();
	  supplierNotifications.verifyNotifications();
  }

  @AfterMethod
  public void afterMethod() {
  }

}