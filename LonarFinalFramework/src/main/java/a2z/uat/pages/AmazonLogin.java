package a2z.uat.pages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import a2z.uat.base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AmazonLogin extends BaseClass {
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@index = '0']")
	private MobileElement Email;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText")
	private MobileElement Pwd;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'Sign In']")
	private MobileElement login;
	

public SupplierDashboard supplierLogin() throws IOException, InterruptedException{
	File f1 = new File("C://Users//Lenovo//git//LonarA2ZDailyFramework//LonarFinalFramework//src//main//resources//Login.csv");
	FileReader fr = new FileReader(f1);
	BufferedReader br = new BufferedReader(fr);
	
    CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
	CSVReader csvReader = new CSVReaderBuilder(fr)
							.withCSVParser(parser)
							.build();
	//Hold row of CSV read line
	String[] row;
	
	while((row = csvReader.readNext()) != null)
	{
		if(row.length>1) {
			Thread.sleep(2000);		
			click(mob);
			sendKeys(mob, row[0]);
			click(sendOTP);
			Thread.sleep(2000);
			sendKeys(OTP,  row[1]);
			click(signIn);
			Thread.sleep(2000);
		}
		else
		{
			break;
		}
	}
return new SupplierDashboard();
}

public DADashboard daLogin() throws IOException, InterruptedException{
	File f1 = new File("C://Users//Lenovo//git//LonarA2ZDailyFramework//LonarFinalFramework//src//main//resources//Login.csv");
	FileReader fr = new FileReader(f1);
	BufferedReader br = new BufferedReader(fr);
	
    CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
	CSVReader csvReader = new CSVReaderBuilder(fr)
							.withSkipLines(2)
							.withCSVParser(parser)
							.build();
	//Hold row of CSV read line
	String[] row;
	
	while((row = csvReader.readNext()) != null)
	{
		if(row.length>1) {
			Thread.sleep(2000);		
			click(mob);
			sendKeys(mob,  row[0]);
			click(sendOTP);
			Thread.sleep(2000);
			sendKeys(OTP,  row[1]);
			click(signIn);
			Thread.sleep(2000);
					}
		else
		{
			break;
		}
	}
return new DADashboard();
}

public AmazonHome customerLogin() throws InterruptedException, IOException {
	File f1 = new File("C://Users//Lenovo//git//LonarA2ZDailyFramework//LonarFinalFramework//src//main//resources//Login.csv");
	FileReader fr = new FileReader(f1);
	BufferedReader br = new BufferedReader(fr);
	
    CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
	CSVReader csvReader = new CSVReaderBuilder(fr)
							.withSkipLines(4)
							.withCSVParser(parser)
							.build();
	//Hold row of CSV read line
	String[] row;
	
	while((row = csvReader.readNext()) != null)
	{
		if(row.length>1) {
			Thread.sleep(2000);	
			click(mob);
			sendKeys(mob,  row[0]);
			click(sendOTP);
			Thread.sleep(2000);
			sendKeys(OTP,  row[1]);
			click(signIn);
			Thread.sleep(6000);
			}
		else
		{
			break;
		}
	}
return new AmazonHome();
}

public CustomerVacations signIN() throws InterruptedException, IOException {
	File f1 = new File("C://Users//Lenovo//git//LonarA2ZDailyFramework//LonarFinalFramework//src//main//resources//Login.csv");
	FileReader fr = new FileReader(f1);
	BufferedReader br = new BufferedReader(fr);
	
    CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
	CSVReader csvReader = new CSVReaderBuilder(fr)
							.withSkipLines(4)
							.withCSVParser(parser)
							.build();
	//Hold row of CSV read line
	String[] row;
	
	while((row = csvReader.readNext()) != null)
	{
		if(row.length>1) {
			Thread.sleep(2000);	
			click(mob);
			sendKeys(mob,  row[0]);
			click(sendOTP);
			Thread.sleep(2000);
			sendKeys(OTP,  row[1]);
			click(signIn);
			Thread.sleep(2000);
						}
		else
		{
			break;
		}
}
	return new CustomerVacations();
}

public SupplierDashboard supervisorLogin() throws IOException, InterruptedException{
	File f1 = new File("C://Users//Lenovo//git//LonarA2ZDailyFramework//LonarFinalFramework//src//main//resources//Login.csv");
	FileReader fr = new FileReader(f1);
	BufferedReader br = new BufferedReader(fr);
	
    CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
	CSVReader csvReader = new CSVReaderBuilder(fr)
							.withSkipLines(6)
							.withCSVParser(parser)
							.build();
	//Hold row of CSV read line
	String[] row;
	
	while((row = csvReader.readNext()) != null)
	{
		if(row.length>1) {
			Thread.sleep(2000);		
			click(mob);
			sendKeys(mob, row[0]);
			click(sendOTP);
			Thread.sleep(2000);
			sendKeys(OTP,  row[1]);
			click(signIn);
			Thread.sleep(2000);
		}
		else
		{
			break;
		}
	}
return new SupplierDashboard();
}
}
