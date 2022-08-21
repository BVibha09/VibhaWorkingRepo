package a2z.uat.tests;

import java.io.IOException;
import java.lang.reflect.Method;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import a2z.uat.base.BaseClass;
import a2z.uat.pages.CustomerCancelSubscription;
import a2z.uat.pages.AmazonHome;
import a2z.uat.pages.AmazonLogin;


public class CustomerCancelSubscriptionTest extends BaseClass{
	
	AmazonLogin applicationLogin;
	AmazonHome customerHomePage;
	CustomerCancelSubscription customerCancelSubscription;
	
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  customerHomePage = new AmazonHome();
	  customerCancelSubscription = new CustomerCancelSubscription();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

  @Test
  public void cancel_sub() throws InterruptedException, IOException {
	  customerHomePage.clickSubscription();
	  customerCancelSubscription.cancel();
}
  
  @AfterMethod
  public void afterMethod() {
  }
}


