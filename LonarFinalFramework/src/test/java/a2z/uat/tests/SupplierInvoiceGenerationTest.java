package a2z.uat.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.SupplierDashboard;
import a2z.uat.pages.SupplierInvoiceGeneration;
import a2z.uat.pages.AmazonLogin;



public class SupplierInvoiceGenerationTest {
	
	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierInvoiceGeneration supplierInvoiceGeneration;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  supplierDashboard = new SupplierDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test(priority=1)
  public void goToInvoiceGeneration() throws InterruptedException {
	  supplierDashboard.clickMenu();
	  supplierInvoiceGeneration = supplierDashboard.clickInvoiceGeneration();
	 System.out.println("You are on invoice generation page!");
	 supplierInvoiceGeneration.generateInvoiceForAll();
	 
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}

