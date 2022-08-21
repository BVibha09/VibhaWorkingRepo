package a2z.uat.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.DADashboard;
import a2z.uat.pages.DAMulDeliveryCancel;

public class DAMulDeliveryCancelTest 
{
	AmazonLogin applicationLogin;
	DADashboard daDashboard;
	DAMulDeliveryCancel daMulDeliveryCancel;
	
	  @BeforeMethod
	  public void beforeMethod(Method me) {
		  applicationLogin = new AmazonLogin();
		  daDashboard = new DADashboard();
		  System.out.println("\n" + "Starting test: " +me.getName() + "!");
	  }
	   
	  @Test
	  public void MuldeliveryCancel() throws InterruptedException
	  {
		  daMulDeliveryCancel=daDashboard.DeliveryModify1();
		  daMulDeliveryCancel.MulDeliveryCancel();		 
	  }
	  
	  @AfterMethod
	  public void afterMethod() 
	  {
	  }
}

