package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.testbase;

public class newformpage extends testbase {

	@FindBy(id = "title")
	WebElement title;

	@FindBy(id = "doc-no")
	WebElement docno;

	@FindBy(id = "effective-date")
	WebElement effectivedate;

	@FindBy(id = "review-date")
	WebElement reviewdate;

	@FindBy(id = "rev-no")
	WebElement revno;

	@FindBy(tagName = "iframe")
	WebElement descript;

	@FindBy(tagName = "body")
	WebElement body;

	@FindBy(id = "no-of-copies-master-copy")
	WebElement masterno;

	@FindBy(id = "rev-no-master-copy")
	WebElement masterrevno;

	@FindBy(id = "no-of-copies-controller-copy")
	WebElement contrno;

	@FindBy(id = "no-of-copies-display-copy")
	WebElement dispno;

	@FindBy(id = "effective-date-controller-copy")
	WebElement effecondate;

	@FindBy(id = "effective-date-display-copy")
	WebElement effedisdate;

	@FindBys(@FindBy(xpath = "//input[@name='dept_controller_copy[]']"))
	List<WebElement> controldept;

	@FindBys(@FindBy(xpath = "//input[@name='dept_display_copy[]']"))
	List<WebElement> displaydept;

	@FindBy(xpath = "//input[@id='dept-controller-copy-qa']")
	WebElement controlqa;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement Savebtn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertsuccessmsg;

	public newformpage() {
		PageFactory.initElements(driver, this);
	}

	public String fillform(String title1, String doc, String date1, String date2, String rev, String desc, String masno,
			String contrnocop, String dispnocop, String effecontroldate, String effedisplaydate) {
		title.sendKeys(title1);
		docno.sendKeys(doc);
		effectivedate.sendKeys(date1);
		reviewdate.sendKeys(date2);
		revno.sendKeys(rev);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(descript));
		driver.switchTo().frame(descript);
		body.sendKeys(desc);
		driver.switchTo().defaultContent();
		masterno.sendKeys(masno);
		for (int i = 0; i < controldept.size(); i++) {
			if (prop.getProperty("Controllerdept" + i).equalsIgnoreCase("QA")) {
				controldept.get(i).click();
			} else if (prop.getProperty("Controllerdept" + i).equalsIgnoreCase("Production")) {
				controldept.get(i).click();
			} else if (prop.getProperty("Controllerdept" + i).equalsIgnoreCase("Store")) {
				controldept.get(i).click();
			} else if (prop.getProperty("Controllerdept" + i).equalsIgnoreCase("Maintainance")) {
				controldept.get(i).click();
			}

		}

		for (int i = 0; i < displaydept.size(); i++) {
			if (prop.getProperty("Displaydept" + i).equalsIgnoreCase("QA")) {
				displaydept.get(i).click();
			} else if (prop.getProperty("Displaydept" + i).equalsIgnoreCase("Production")) {
				displaydept.get(i).click();
			} else if (prop.getProperty("Displaydept" + i).equalsIgnoreCase("Store")) {
				displaydept.get(i).click();
			} else if (prop.getProperty("Displaydept" + i).equalsIgnoreCase("Maintainance")) {
				displaydept.get(i).click();
			}
		}
		contrno.sendKeys(contrnocop);
		dispno.sendKeys(dispnocop);
		effecondate.sendKeys(effecontroldate);
		effedisdate.sendKeys(effedisplaydate);
		Savebtn.click();
		return alertsuccessmsg.getText();
	}

}
