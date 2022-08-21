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
import a2z.uat.pages.AmazonHome;
import a2z.uat.pages.OrderPurchase;
import a2z.uat.pages.AmazonProfile;

public class CustomerUpdatePlacedSubTest extends BaseClass{
	
	OrderPurchase customerNewOrder;
  
  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerNewOrder = new OrderPurchase();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

  @Test(priority=1)
  public void update_Product_Info() throws InterruptedException, IOException {
	  
	  customerNewOrder.updateOrder();
  }
  
  @AfterMethod
  public void afterMethod() {
  }
}
