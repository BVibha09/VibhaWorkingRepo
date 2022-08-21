package a2z.uat.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a2z.uat.base.BaseClass;
import a2z.uat.pages.AmazonLogin;
import a2z.uat.pages.SupplierDashboard;
import a2z.uat.pages.SupplierUser;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SupplierUserTest extends BaseClass {
	AmazonLogin applicationLogin;
	SupplierDashboard supplierDashboard;
	SupplierUser supplierUser;

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
	public void Add_User1() throws InterruptedException, IOException {
		supplierUser = supplierDashboard.clickUser();
		supplierUser.AddUser();
	}
	@Test(priority=1)
	public void Edit_User() throws InterruptedException, IOException {
		supplierUser = supplierDashboard.clickUser();
		supplierUser.EditInfoUser();
	}

}
