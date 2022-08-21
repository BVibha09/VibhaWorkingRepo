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
import a2z.uat.pages.AmazonProfile;
import a2z.uat.pages.CustomerVacations;


public class CustomerVacationsTest extends BaseClass{
	
	CustomerVacations customerVacations;
  
  @BeforeMethod
  public void beforeMethod(Method me) {
	  customerVacations = new CustomerVacations();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

  @Test(enabled=false)
  public void InvalidVacation() throws InterruptedException, IOException {
	  customerVacations.InvalidVacationCustTest();
}
  @Test(priority = 0)
  public void ValidVacation() throws InterruptedException
  {
	  customerVacations.set_Valid();
	  customerVacations.verify_Play_Sign_On_vacation();
  } 
  
  @Test(priority = 1)
  public void Change_Dates_Of_Vacation() throws InterruptedException
  {
	  customerVacations.update_Vacation();
  }
  
  @Test(priority = 2)
  public void cancel_Vacation() throws InterruptedException
  {
	  customerVacations.cancel_vac();
	  customerVacations.Verify_Cancellation();
  }
  
  @AfterMethod
  public void afterMethod() {
  }

}

