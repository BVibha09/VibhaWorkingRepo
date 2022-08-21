package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.testbase;
import pages.editsoppage;
import pages.homepage;
import pages.loginpage;
import pages.newformpage;
import pages.soplistpage;
import utilpac.testutil;

public class homepagetest extends testbase {

	loginpage lgpg;
	homepage hmpg;
	newformpage newpg;
	soplistpage soplistpg;
	editsoppage editpg;
	testutil tu;

	public homepagetest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		tu = new testutil();
		editpg = new editsoppage();
		soplistpg=new soplistpage();
		hmpg = new homepage();
		lgpg = new loginpage();
		lgpg.verifylogin();
	}

//	@Test(priority = 1)
//	public void scrollandclose() {
//		hmpg.verifypopscrollandclose();
//	}
//
//	@Test(priority = 2)
//	public void dashboardclick() {
//		hmpg.verifypopscrollandclose();
//		hmpg.clickondashboard();
//		String s1 = hmpg.verifypopopen();
//		Assert.assertEquals(s1, "Following SOPs need to Update");
//		
//	}

//	@Test(priority = 1)
//	public void sopclick() {
//		hmpg.verifypopscrollandclose();
//		soplistpg = hmpg.clicksop();
//		Assert.assertTrue(true, "SOP Master\n" + "New");
//	}
	
	
	@Test(priority=2)
	public void editclicktry() {
		editpg=hmpg.clickonedit1();
	}



}
