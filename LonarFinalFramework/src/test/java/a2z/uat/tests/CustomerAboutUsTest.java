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
import a2z.uat.pages.CustomerAboutUs;
import a2z.uat.pages.AmazonHome;

public class CustomerAboutUsTest extends BaseClass{
	
	AmazonLogin applicationLogin;
	CustomerAboutUs customerAboutUs;
	AmazonHome customerHomePage;
  
  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerHomePage= new AmazonHome();
	  customerAboutUs = new CustomerAboutUs();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test
  public void verifySocialMedia()
  {
	  customerHomePage.clickMenu();
	  customerAboutUs= customerHomePage.clickAboutUs(); 
	  customerAboutUs.verifySocialMedia();
  }
  
  
  @AfterMethod
  public void afterMethod() {
  }
}
