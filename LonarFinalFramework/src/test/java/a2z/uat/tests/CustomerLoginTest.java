package a2z.uat.tests;

import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.AmazonHome;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;

public class CustomerLoginTest extends BaseClass {

	AmazonLogin applicationLogin;
	AmazonHome customerHomePage;

	@BeforeMethod
	public void beforeMethod(Method me) {
		applicationLogin = new AmazonLogin();
		System.out.println("\n" + "Starting test: " + me.getName() + "!");
	}
	
	@Test
	public void doLogin() throws InterruptedException, IOException {
		customerHomePage = applicationLogin.customerLogin();
		  System.out.println("Customer login successful!");
	  }
	
	@AfterMethod
	public void afterMethod() {
	}
}

