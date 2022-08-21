package a2z.uat.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.DSDashboard;
import a2z.uat.pages.DSDeliverySummary;
import a2z.uat.pages.SupplierCollectionSummary;
import a2z.uat.pages.SupplierDashboard;

public class DSDeliverySummaryTest {
	AmazonLogin applicationLogin;
	DSDashboard dsDashboard;
	DSDeliverySummary dsDeliverySummary;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	 dsDashboard = new DSDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test
  public void CancelAndConfirmSingleDelivery() throws InterruptedException {
	  dsDeliverySummary =  dsDashboard.clickDeliverySummary();
	  dsDeliverySummary.DeliveryCancellation();
	  dsDeliverySummary.DeliveryConfirmation();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
