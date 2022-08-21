package a2z.uat.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.SupplierCustomerLedger;
import a2z.uat.pages.SupplierDashboard;

public class SupplierCustomerLedgerTest {
	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierCustomerLedger supplierCustomerLedger;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  supplierDashboard = new SupplierDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test
  public void verifyCustomerLedger() throws InterruptedException {
	  supplierCustomerLedger =  supplierDashboard.clickCustomerLedger();
	  supplierCustomerLedger.verifyCustLedger();
  }

  @AfterMethod
  public void afterMethod() {
  }

}