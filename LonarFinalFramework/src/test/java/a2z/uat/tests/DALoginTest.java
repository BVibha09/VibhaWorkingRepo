package a2z.uat.tests;

import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.DADashboard;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;

public class DALoginTest extends BaseClass {

	AmazonLogin applicationLogin;
	DADashboard daDashboard;

	@BeforeMethod
	public void beforeMethod(Method me) {
		applicationLogin = new AmazonLogin();
		System.out.println("\n" + "Starting test: " + me.getName() + "!");
	}
	
	@Test
	public void doLogin() throws IOException, InterruptedException {
		daDashboard = applicationLogin.daLogin();
		  System.out.println("Customer login successful!");
	  }
	
	@AfterMethod
	public void afterMethod() {
	}
}
