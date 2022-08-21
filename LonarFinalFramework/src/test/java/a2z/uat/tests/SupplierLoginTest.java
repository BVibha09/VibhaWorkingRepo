package a2z.uat.tests;

import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.SupplierDashboard;
import a2z.uat.pages.AmazonLogin;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;

public class SupplierLoginTest extends BaseClass {

	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	
	@BeforeMethod
	public void beforeMethod(Method me) {
		applicationLogin = new AmazonLogin();
		System.out.println("\n" + "Starting test: " + me.getName() + "!");
	}
	
	@Test
	public void doLogin() throws IOException, InterruptedException {
		supplierDashboard = applicationLogin.supplierLogin();
		  
		  String actualDashboardTitle = supplierDashboard.getTitle();
		  String expectedDashboardTitle = "Dashboard";
		  AssertJUnit.assertEquals(actualDashboardTitle, expectedDashboardTitle);
		  System.out.println("Dashboard title is: " +actualDashboardTitle);
	  }
	
	@AfterMethod
	public void afterMethod() {
	}
}

