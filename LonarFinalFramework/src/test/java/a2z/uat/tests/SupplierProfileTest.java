package a2z.uat.tests;

import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.SupplierDashboard;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.SupplierProfile;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;

public class SupplierProfileTest extends BaseClass {
 
	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierProfile supplierProfile ;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  supplierDashboard = new SupplierDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test(priority=1)
  public void goToProfile() throws InterruptedException, IOException {
	  supplierDashboard.clickMenu();
	  Thread.sleep(2000);
	  supplierProfile = supplierDashboard.clickProfile();
	  Thread.sleep(2000);
	 supplierProfile.editProfile(); 
	 supplierProfile.editProfileInvalid();
  }  

  @AfterMethod
  public void afterMethod() {
  }

  
  
}
