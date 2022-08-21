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
import a2z.uat.pages.CustomerDeliveryQtyHomePage;
import a2z.uat.pages.AmazonHome;
import a2z.uat.pages.AmazonProfile;


public class CustomerUpdateDeliveryQtyTest extends BaseClass{

	AmazonHome customerHomePage;
	CustomerDeliveryQtyHomePage customerDeliveryQtyHomePage;
	
  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerHomePage= new AmazonHome();
	  customerDeliveryQtyHomePage = new CustomerDeliveryQtyHomePage();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

  @Test(priority =0)
  public void Increase_Qty_Double() throws InterruptedException, IOException {
	  customerDeliveryQtyHomePage = customerHomePage.clickFutureDate();
	 // customerDeliveryQtyHomePage.increase_qty_beyond_Double();
  }  
	 
  @Test(priority=1)
 public void Decrease_qty_to_Zero() throws InterruptedException
	  {
	  customerDeliveryQtyHomePage.decrease_qty_to_Zero();
	  }
  
  @AfterMethod
  public void afterMethod() {
  }
}

