package a2z.uat.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.SupplierCity;
import a2z.uat.pages.SupplierDashboard;
import a2z.uat.pages.SupplierState;

public class SupplierStateTest extends BaseClass {
	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierState supplierState;
	
	@BeforeMethod
	public void beforeMethod(Method me) {
		applicationLogin = new AmazonLogin();
		supplierDashboard = new SupplierDashboard();
		System.out.println("\n" + "Starting test: " + me.getName() + "!");
	}

	@AfterMethod
	public void afterMethod() {
	}

	@Test(priority=0)
	public void Add_State() throws InterruptedException, IOException {
		supplierState = supplierDashboard.clickState();
		supplierState.AddState();
	}
	@Test(priority=1)
	public void Edit_State() throws InterruptedException, IOException {
		supplierState = supplierDashboard.clickState();
		supplierState.EditState();
	}
}