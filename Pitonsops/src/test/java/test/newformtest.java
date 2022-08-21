package test;

import base.testbase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.homepage;
import pages.loginpage;
import pages.newformpage;
import pages.soplistpage;
import utilpac.testutil;

public class newformtest extends testbase {

	loginpage lgpg;
	homepage hmpg;
	newformpage newpg;
	soplistpage soplistpg;
	testutil tu;
	String sheetname = "addform";

	public newformtest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		tu = new testutil();
		soplistpg = new soplistpage();
		newpg = new newformpage();
		hmpg = new homepage();
		lgpg = new loginpage();
		lgpg.verifylogin();
		hmpg.verifypopscrollandclose();
		hmpg.clicksop();
		soplistpg.clicknewbutton();
	}

	@DataProvider
	public Object[][] getTestformdata() {
		Object data[][] = testutil.getTestData(sheetname);
		return data;
	}

	@Test(priority = 1, dataProvider = "getTestformdata")
	public void newsopgenerate(String Title1, String Docno,String 	Effectivedate, String ReviewDate,String RevNo, String Description, String Mnocopy, String Cnocopy,String Dnocopy,
			String Effcondate, String Effdisdate){
		String alertmsg = newpg.fillform(Title1, Docno, Effectivedate, ReviewDate, RevNo, Description, Mnocopy, Cnocopy, Dnocopy, Effcondate, Effdisdate);
		System.out.println(alertmsg);
		Assert.assertEquals(alertmsg, "×" +"Alert!\n" + 
				"The Sop Master has been saved successfully.");
	}

//	@AfterMethod
//	public void teardown() {
//		driver.quit();
//	}

}
