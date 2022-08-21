package a2z.uat.tests;

import java.lang.reflect.Method;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.DADashboard;
import a2z.uat.pages.DADeliveryModification;


public class DADeliveryModificationTest 
{
	AmazonLogin applicationLogin;
	DADashboard daDashboard;
	DADeliveryModification daDeliveryModification;

	  @BeforeMethod
	  public void beforeMethod(Method me) {
		  applicationLogin = new AmazonLogin();
		  daDashboard = new DADashboard();
		  System.out.println("\n" + "Starting test: " +me.getName() + "!");
	  }
	  
	  @Test
	  public void DeliveryModification1() throws InterruptedException
	  {
		  daDeliveryModification=daDashboard.DeliveryModify();
		  daDeliveryModification.DeliveryModification();
	  }
	  
	  @AfterMethod
	  public void afterMethod() 
	  {
	  }
}
