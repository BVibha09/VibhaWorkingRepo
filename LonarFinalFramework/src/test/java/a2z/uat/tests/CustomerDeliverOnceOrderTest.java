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
import a2z.uat.pages.CustomerAboutUs;
import a2z.uat.pages.AmazonHome;
import a2z.uat.pages.OrderPurchase;

public class CustomerDeliverOnceOrderTest extends BaseClass{
	
	AmazonLogin applicationLogin;
	AmazonHome customerHomePage;
	OrderPurchase customerNewOrder;
	AmazonLogout applicationLogout;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  customerHomePage= new AmazonHome();
	  customerNewOrder = new OrderPurchase();
	  applicationLogout = new AmazonLogout();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test(priority=3)
  public void Del_Once_Order() throws InterruptedException, IOException  {
	  //customerHomePage = applicationLogin.customerLogin(); 
	  customerHomePage.clickSubscription();
	  customerNewOrder.deliverOnce();
	   } 
  
  @Test(priority=4)
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

