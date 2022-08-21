package a2z.uat.tests;
import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.SupplierCollectionSummary;
import a2z.uat.pages.SupplierDashboard;
import a2z.uat.pages.SupplierDeliverySummary;

public class SupplierDeliverySummaryTest {
	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierDeliverySummary supplierDeliverySummary;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  supplierDashboard = new SupplierDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test
  public void verifysupplierDeliverySummary() throws InterruptedException {
	  supplierDeliverySummary =  supplierDashboard.clickDeliverySummary();
	  supplierDeliverySummary.updateDeliverySummary();
  }

  @AfterMethod
  public void afterMethod() {
  }

}