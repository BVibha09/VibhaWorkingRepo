package pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.testbase;

public class loginpage extends testbase {

	@FindBy(xpath = "//input[@name='username']")
	WebElement user;

	@FindBy(xpath = "//input[@name='password']")
	WebElement pwd;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement login;

	@FindBy(xpath = "//div[@id='sopresult1']//h4[@class='modal-title']")
	WebElement sopspopup;

	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logout;

	public loginpage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginpageTitle() {
		return driver.getTitle();

	}

	public homepage verifylogin() {
		if (prop.getProperty("Login").equalsIgnoreCase("Admin")) {
			login(prop.getProperty("admin"), prop.getProperty("adminpw"));
		} else if (prop.getProperty("Login").equalsIgnoreCase("QAManager")) {
			login(prop.getProperty("QAManager"), prop.getProperty("QAManagerpw"));
		} else if (prop.getProperty("Login").equalsIgnoreCase("QCManager")) {
			login(prop.getProperty("QCManager"), prop.getProperty("QCManagerpw"));
		} else if (prop.getProperty("Login").equalsIgnoreCase("QCUser")) {
			login(prop.getProperty("QCUser"), prop.getProperty("QCUserpw"));
		} else if (prop.getProperty("Login").equalsIgnoreCase("ProductionManager")) {
			login(prop.getProperty("ProductionManager"), prop.getProperty("ProductionManagerpw"));
		} else if (prop.getProperty("Login").equalsIgnoreCase("ProductionUser")) {
			login(prop.getProperty("ProductionUser"), prop.getProperty("ProductionUserpw"));
		} else if (prop.getProperty("Login").equalsIgnoreCase("StoreUser")) {
			login(prop.getProperty("StoreUser"), prop.getProperty("StoreUserpw"));
		} else {
			System.out.println("Login failed");
		}
		return new homepage();
	}

//	public String verifylogin(String Username, String Password) {
//	if (prop.getProperty("Login").equalsIgnoreCase("Prasad")) {
//	login(Username, Password);
//	}
//	WebDriverWait wait = new WebDriverWait(driver, 20);
//	wait.until(ExpectedConditions.visibilityOf(sopspopup));
//	return sopspopup.getText();
//	}

	/*
	 * public String verifypopopen() { WebDriverWait wait = new
	 * WebDriverWait(driver, 20);
	 * wait.until(ExpectedConditions.visibilityOf(sopspopup)); return
	 * sopspopup.getText(); }
	 */

	public void logout() {
		logout.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
