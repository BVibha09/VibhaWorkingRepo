package a2z.uat.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.AmazonLogout;
import a2z.uat.pages.AmazonHome;
import a2z.uat.pages.OrderPurchase;

public class CustomerNewSubscribeOrderTest extends BaseClass{
	
	AmazonLogin applicationLogin;
	AmazonHome customerHomePage;
	OrderPurchase customerNewOrder;
	AmazonLogout applicationLogout;
  
  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerHomePage= new AmazonHome();
	  customerNewOrder = new OrderPurchase();
	  applicationLogout = new AmazonLogout();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

 
  @Test(priority=1)
  public void Subscribe_New_Product() throws InterruptedException, IOException {
	  customerNewOrder = customerHomePage.clickCartIcon();
	  
	  customerNewOrder.PlaceNewSubscription();
	  
}
  
  @Test(priority=2)
  public void verifyOrderOnSuppAccount() throws InterruptedException, IOException
  {
	  customerNewOrder.copy_Name();
	  applicationLogin = applicationLogout.customerLogout();
	  applicationLogin.supplierLogin();
	  customerNewOrder.getSupplierOrderName();
	  customerNewOrder.verifyOrder();
	 //applicationLogout.supplierLogout();
  }
  
  @AfterMethod
  public void afterMethod() {
  }
  
}

