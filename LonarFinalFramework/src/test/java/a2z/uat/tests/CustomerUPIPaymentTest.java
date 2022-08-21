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
import a2z.uat.pages.CustomerInvoices;
import a2z.uat.pages.AmazonProfile;


public class CustomerUPIPaymentTest extends BaseClass{
	
	AmazonHome customerHomePage;
	CustomerInvoices customerInvoices;
  
  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerHomePage= new AmazonHome();
	  customerInvoices = new CustomerInvoices();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

  @Test
  public void UPI_Payment() throws InterruptedException, IOException {
	  customerInvoices = customerHomePage.clickInvoices();
	  
	  customerInvoices.pay_UPI();
}
  
  @AfterMethod
  public void afterMethod() {
  }

}
