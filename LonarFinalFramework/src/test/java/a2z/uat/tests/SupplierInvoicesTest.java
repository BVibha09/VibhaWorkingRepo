package a2z.uat.tests;

import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.SupplierDashboard;
import a2z.uat.pages.SupplierInvoices;

import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;

public class SupplierInvoicesTest {
	

	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierInvoices supplierInvoices;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  supplierDashboard = new SupplierDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test
  public void verifyPayment() throws InterruptedException {
	  supplierInvoices =  supplierDashboard.clickInvoices();
	  supplierInvoices.verifyInvoiceStatus();
  }

  @AfterMethod
  public void afterMethod() {
  }

}

