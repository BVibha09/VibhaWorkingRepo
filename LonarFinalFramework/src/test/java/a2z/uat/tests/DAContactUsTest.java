package a2z.uat.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.DAContactUs;
import a2z.uat.pages.DADashboard;


public class DAContactUsTest 
{
	AmazonLogin applicationLogin;
	DADashboard daDashboard;
	DAContactUs daContactUs;
	
	  @BeforeMethod
	  public void beforeMethod(Method me) {
		  applicationLogin = new AmazonLogin();
		  daDashboard = new DADashboard();
		  System.out.println("\n" + "Starting test: " +me.getName() + "!");
	  }
	  
	  @Test
	  public void ContactUsMenu() throws InterruptedException
	  {
		  daContactUs=  daDashboard.clickSupport1();
		  daContactUs.ContactMenu();
	  }
	  
	  @AfterMethod
	  public void afterMethod() 
	  {
	  }
}
