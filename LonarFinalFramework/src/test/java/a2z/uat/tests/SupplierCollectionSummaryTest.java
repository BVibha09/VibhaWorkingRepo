package a2z.uat.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.SupplierCollectionSummary;
import a2z.uat.pages.SupplierDashboard;

public class SupplierCollectionSummaryTest {
	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierCollectionSummary supplierCollectionSummary;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  supplierDashboard = new SupplierDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test
  public void verifySupplierCollectionSummary() throws InterruptedException {
	  supplierCollectionSummary =  supplierDashboard.clickCollectionSummary();
	  supplierCollectionSummary.updateCollectionQty();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
