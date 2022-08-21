package a2z.uat.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.DAChat;
import a2z.uat.pages.DADashboard;


public class DAChatTest 
{
	AmazonLogin applicationLogin;
	DADashboard daDashboard;
	DAChat daChat;
	  
	  @BeforeMethod
	  public void beforeMethod(Method me) {
		  applicationLogin = new AmazonLogin();
		  daDashboard = new DADashboard();
		  System.out.println("\n" + "Starting test: " +me.getName() + "!");
	  }
	  
	  @Test
	  public void ChatOption()
	  {
		  daChat=  daDashboard.clickSupport();
		  daChat.ChatMenu();
	  }
	  
	  @AfterMethod
	  public void afterMethod() 
	  {
	  }
}
