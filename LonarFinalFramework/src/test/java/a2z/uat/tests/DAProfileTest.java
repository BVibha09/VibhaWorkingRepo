package a2z.uat.tests;

import org.testng.annotations.Test;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.DADashboard;
import a2z.uat.pages.DAProfile;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;

public class DAProfileTest extends BaseClass 
{
 
	AmazonLogin applicationLogin;
	DADashboard daDashboard;
	DAProfile daProfile;

  @BeforeMethod
  public void beforeMethod(Method me) {
	  applicationLogin = new AmazonLogin();
	  daDashboard = new DADashboard();
	  System.out.println("\n" + "Starting test: " +me.getName() + "!");
  }

  @Test(priority=1)
  public void goToProfile() throws InterruptedException, IOException
  {
	  daDashboard.clickMenu();
	  daProfile = daDashboard.clickProfile();
	  daProfile.EditDAProfileValid();
	  daProfile.updateProfile();
		} 
  
  @AfterMethod
  public void afterMethod() 
  {
  }
  
}
