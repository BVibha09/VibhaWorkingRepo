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

public class CustomerAboutUsTabsTest extends BaseClass{
	
	AmazonHome customerHomePage;
	CustomerAboutUs customerAboutUs;
	
  
  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerHomePage= new AmazonHome();
	  customerAboutUs = new CustomerAboutUs();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test
  public void verifyInfoTabs() throws InterruptedException, IOException {
	  customerHomePage.clickMenu();
	  customerAboutUs= customerHomePage.clickAboutUs(); 
	  customerAboutUs.verifyTabs();
  }
  
  @AfterMethod
  public void afterMethod() {
  }

}

