package a2z.uat.tests;

import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.AmazonLogout;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.lang.reflect.Method;
import org.testng.annotations.AfterClass;

public class DALogoutTest extends BaseClass {
 
	AmazonLogin applicationLogin;
	AmazonLogout applicationLogout;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  applicationLogout = new AmazonLogout();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test(priority=1)
  public void doLogout() throws InterruptedException, IOException {
	  applicationLogin = applicationLogout.daLogout();
  }  

  @AfterMethod
  public void afterMethod() {
  }
 
}

