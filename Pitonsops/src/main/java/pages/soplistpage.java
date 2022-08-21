package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.testbase;

public class soplistpage extends testbase {

	@FindBy(xpath = "//input[@name='search']")
	WebElement searchfilter;

	@FindBy(xpath = "//a[contains(text(),'New')]")
	WebElement newbutton;

	public soplistpage() {
		PageFactory.initElements(driver, this);
	}

	public void filtersearch() {

	}
	public newformpage clicknewbutton() {
		newbutton.click();
		return new newformpage();
	}


}
