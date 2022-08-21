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


public class CustomerSearchAndDownloadInvoiceTest extends BaseClass{
	
	AmazonHome customerHomePage;
	CustomerInvoices customerInvoices;
  
  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerHomePage= new AmazonHome();
	  customerInvoices = new CustomerInvoices();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

  @Test(priority=0)
  public void Searching_Invoices() throws InterruptedException, IOException {
	  customerHomePage.clickInvoices();
	  customerInvoices.search_Invoice();
}
  
  @Test(priority=1)
  public void Download_Invoices() throws InterruptedException
  {
	  customerInvoices.download_Invoice();
  }
  
  @AfterMethod
  public void afterMethod() {
  }

}
