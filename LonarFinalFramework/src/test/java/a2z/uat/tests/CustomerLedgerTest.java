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
import a2z.uat.pages.AmazonHome;
import a2z.uat.pages.CustomersLedger;


public class CustomerLedgerTest extends BaseClass{
	
	AmazonHome customerHomePage;
	CustomersLedger customerLedger;

  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerHomePage= new AmazonHome();
	  customerLedger = new CustomersLedger();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

  @AfterMethod
  public void afterMethod() {
  }
  
  @Test
  public void CustomerLedger() throws InterruptedException, IOException {

	  customerHomePage.clickMenu();
	  customerLedger = customerHomePage.clickLedger();
	  customerLedger.verifyLedger();
}

}
