package a2z.uat.tests;

import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.AmazonHome;
import a2z.uat.pages.AmazonProfile;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;

public class CustomerProfileTest extends BaseClass {
 
	AmazonHome customerHomePage;
	AmazonProfile customerProfile;

  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerHomePage= new AmazonHome();
	  customerProfile = new AmazonProfile();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  @Test(priority=0)
  public void valid_Profile_editing() throws InterruptedException, IOException
  {
	  customerHomePage.clickMenu();
	  customerProfile = customerHomePage.clickProfile();
	  customerProfile.CustomereditProfile();
  }
  
  @Test(priority=1)
  public void Invalid_Profile_Editing() throws IOException, InterruptedException {
	  customerHomePage.clickMenu();
	  customerProfile = customerHomePage.clickProfile();
	  customerProfile.CustomereditProfileInvalid();
  }
  
  @AfterMethod
  public void afterMethod() {
  }
  	
}

