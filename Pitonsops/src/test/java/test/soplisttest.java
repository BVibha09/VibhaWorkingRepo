package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.testbase;
import pages.homepage;
import pages.loginpage;
import pages.newformpage;

import pages.soplistpage;
import utilpac.testutil;

public class soplisttest extends testbase {

	loginpage lgpg;
	homepage hmpg;
	newformpage newpg;
	soplistpage soplistpg;
	testutil tu;


	public soplisttest() {
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
	}

	@Test(priority = 1)
	public void newclick() {
		newpg = soplistpg.clicknewbutton();
	}

}
