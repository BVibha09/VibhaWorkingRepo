package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.testbase;

public class homepage extends testbase {

	@FindBy(xpath = "//div[@id='sopresult1']//h4[@class='modal-title']")
	WebElement sopspopup;

	@FindBy(xpath = "//div[@id='sopresult1']//button[@class='btn btn-default']")
	WebElement upclose;

	@FindBy(xpath = "//div[@id='pro']//button[@class='btn btn-default']")
	WebElement mlclose;

	@FindBy(xpath = "//div[@id='annexures']//button[@class='btn btn-default']")
	WebElement anclose;

	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logout;

	@FindBy(xpath = "//ul[@class='sidebar-menu']//a[@href='/adtest/pages/home']")
	WebElement dashboard;

	@FindBys(@FindBy(xpath = "//table[@id='customers']//a[@class='fa fa-pencil fa-fw']"))
	List<WebElement> allElements;

	@FindBy(xpath = "//span[contains(text(),'SOP')]")
	WebElement sopmenu;

	@FindBy(xpath = "//a[contains(text(),'QA')]")
	WebElement qasubmenu;

	@FindBy(xpath = "//a[contains(text(),'QC')]")
	WebElement qcsubmenu;

	@FindBy(xpath = "//a[contains(text(),'Store')]")
	WebElement storesubmenu;
	@FindBy(xpath = "//a[contains(text(),'Production')]")
	WebElement prodsubmenu;
	@FindBy(xpath = "//a[contains(text(),'Maintainance')]")
	WebElement maintsubmenu;

	@FindBy(xpath = "//h1[contains(text(),'SOP Master')]")
	WebElement soplist;

	@FindBy(xpath = "//tr[137]//td[7]//a[1]")
	WebElement clickforedit;
	String beforedit = "//tr[";
	String afteredit = "]//td[7]//a[1]";

	public homepage() {
		PageFactory.initElements(driver, this);
	}

	public String verifypopopen() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(sopspopup));
		return sopspopup.getText();
	}



	public editsoppage clickonedit1() {
		WebElement clickonedit = driver.findElement(By.xpath(beforedit + prop.getProperty("editno") + afteredit));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(clickonedit));
		clickonedit.click();
		return new editsoppage();
	}

	public void verifypopscrollandclose() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", upclose);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(upclose));
		upclose.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		mlclose.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getClass());
		}
		anclose.click();
		//below line is just for sample
		System.out.println("This is test");
	}

	public void clickondashboard() {
		dashboard.click();
	}

	public soplistpage clicksop() {
		sopmenu.click();
		if (prop.getProperty("SOP").equalsIgnoreCase("QA")) {
			qasubmenu.click();
		} else if (prop.getProperty("SOP").equalsIgnoreCase("Production")) {
			prodsubmenu.click();
		} else if (prop.getProperty("SOP").equalsIgnoreCase("QC")) {
			qcsubmenu.click();
		} else if (prop.getProperty("SOP").equalsIgnoreCase("Store")) {
			storesubmenu.click();
		} else if (prop.getProperty("SOP").equalsIgnoreCase("Maintainance")) {
			maintsubmenu.click();
		} else {
			System.out.println("List of SOP Summary can't open");
		}
		return new soplistpage();
	}

}
