package a2z.uat.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.DSCollectionSummary;
import a2z.uat.pages.DSDashboard;

public class DSCollectionSummaryTest {
	AmazonLogin applicationLogin;
	DSDashboard dsDashboard;
	DSCollectionSummary dsCollectionSummary;
 
  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  dsDashboard = new DSDashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }
  
  @Test
  public void verifyDSCollectionSummary() throws InterruptedException {
	  dsCollectionSummary =  dsDashboard.clickCollectionSummary();
	  dsCollectionSummary.updateCollectionQty();
  }

  @AfterMethod
  public void afterMethod() {
  }

}

