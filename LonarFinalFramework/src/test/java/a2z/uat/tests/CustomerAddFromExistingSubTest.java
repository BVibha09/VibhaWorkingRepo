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

public class CustomerAddFromExistingSubTest extends BaseClass{
	
	AmazonHome customerHomePage;
	OrderPurchase updateExisting;
	
  
  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerHomePage = new AmazonHome();
	  updateExisting = new OrderPurchase();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test(priority=5)
  public void add_From_Existing_product() throws InterruptedException, IOException {
	  updateExisting = customerHomePage.clickCartIcon(); 
	  updateExisting.updateOrderQuantity();
  }
  
  @AfterMethod
  public void afterMethod() {
  }
}

