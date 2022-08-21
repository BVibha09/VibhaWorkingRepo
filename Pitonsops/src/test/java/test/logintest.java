package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.testbase;
import pages.homepage;
import pages.loginpage;
import utilpac.testutil;

public class logintest extends testbase {
	String sheetname = "login";
	loginpage lgpg;
	homepage hmpg;
	testutil tu;

	public logintest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		tu = new testutil();
		lgpg = new loginpage();

	}

	@Test(priority = 1)
	public void loginpageTitleTest() {
		String title = lgpg.validateLoginpageTitle();
		Assert.assertEquals(title, "Catalyst");
	}

	@Test(priority = 2)
	public void loginmethod() {
		hmpg = lgpg.verifylogin();
		Assert.assertTrue(true, "Following SOPs need to Update");
	}

//	@DataProvider
//	public Object[][] loginwithuser() {
//		Object data[][] = testutil.getTestData(sheetname);
//		return data;
//	}
//
//	@Test(priority = 2, dataProvider = "loginwithuser")
//	public void loginmethod(String Username, String Password) {
//		String s1 = lgpg.verifylogin(Username, Password);
//		Assert.assertEquals(s1, "Following SOPs need to Update");
//	}

	// @AfterMethod
	// public void teardown() {
	// driver.quit();
	// }
}
