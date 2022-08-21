package a2z.uat.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import a2z.uat.base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AmazonProfile extends BaseClass{
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
			"")
	private MobileElement Supp_Code;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]")
	private MobileElement Name;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
	private MobileElement flatNo;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
	private MobileElement detailAddress;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
	private MobileElement landmark;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
	private MobileElement pinCode;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
	private MobileElement area;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View")
	private MobileElement profilePanel;
	
	@AndroidFindBy(xpath = "//android.view.View[8]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")
	private MobileElement state;
	
	@AndroidFindBy(xpath = "//android.view.View[9]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")
	private MobileElement city;
	
	@AndroidFindBy(xpath = "//android.app.Dialog/android.view.View[1]/android.widget.Button[1]")
	private MobileElement stateCityValue;
	
	@AndroidFindBy(xpath = "//android.view.View[10]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
	private MobileElement emailId;
	
	@AndroidFindBy(xpath = "//android.view.View[12]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
	private MobileElement alternateNo;
	
	@AndroidFindBy(xpath= "//android.view.View[2]/android.widget.Button[@text = 'Update']")
	private MobileElement updateBtn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='arrow back']")
	private MobileElement BackBtn;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View")
	private MobileElement Dashboard;
	
	//Invalid data
	@AndroidFindBy(xpath = "//android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")
	private MobileElement state1;
	
	@AndroidFindBy(xpath = "//android.view.View[8]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")
	private MobileElement city1;
	
	@AndroidFindBy(xpath = "//android.view.View[9]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
	private MobileElement emailId1;
	
	@AndroidFindBy(xpath = "//android.view.View[11]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
	private MobileElement alternateNo1;
	
	//Customer

	@AndroidFindBy(xpath = "//android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")
	private MobileElement CustState;
	
	@AndroidFindBy(xpath = "//android.app.Dialog/android.view.View[1]/android.widget.Button[1]")
	private MobileElement  CustSelect_State;
	
	@AndroidFindBy(xpath = "//android.view.View[8]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.Button[1]")
	private MobileElement  CustCity;
	
	@AndroidFindBy(xpath = "//android.app.Dialog/android.view.View[1]/android.widget.Button[1]")
	private MobileElement  CustSelect_City;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[9]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button")
	private MobileElement  CustBilling_cycle;
	
	@AndroidFindBy(xpath = "//android.view.View[10]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]")
	private MobileElement  CustEmail_id;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[11]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText")
	private MobileElement  CustMob_no;
	
	@AndroidFindBy(xpath = "//android.view.View[12]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]")
	private MobileElement  CustAlt_no;


	public AmazonHome CustomereditProfile() throws InterruptedException, IOException{
		File f1 = new File("C://Users//Lenovo//git//LonarA2ZDailyFramework//LonarFinalFramework//src//main//resources//TestData.csv");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
		CSVReader csvReader = new CSVReaderBuilder(fr)
								.withSkipLines(71)
								.withCSVParser(parser)
								.build();
		//Hold row of CSV read line
		String[] row;
		
		while((row = csvReader.readNext()) != null)
		{
			if(row.length>1) {
				Thread.sleep(2000);
				boolean found = driver.getPageSource().contains("Profile");
				if (found) {  	
						Supp_Code.clear();
						sendKeys(Supp_Code, row[0]);
					
						Name.clear();
						sendKeys(Name, row[1]);
							clear(flatNo);
							sendKeys(flatNo, row[2]);
							clear(detailAddress);
							sendKeys(detailAddress,  row[3]);
							clear(landmark);
							sendKeys(landmark,  row[4]);
							clear(pinCode);
							sendKeys(pinCode,  row[5]);
							clear(area);
							sendKeys(area,  row[6]);
							
							if (profilePanel != null) {
								new TouchAction((PerformsTouchActions) driver).press(PointOption.point(100, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(100, 0)).release().perform();
								}
								Thread.sleep(3000);	
								
								click(CustState);
								click(CustSelect_State);
								click(CustCity);
								click(CustSelect_City);
								clear(CustEmail_id);
								sendKeys(CustEmail_id,  row[7]);
								clear(CustAlt_no);
								sendKeys(CustAlt_no,  row[8]);
								if (updateBtn.isEnabled()) {
									System.out.println("You entered valid data");
									click(updateBtn);

									waitForVisibility(Dashboard);
									String s = Dashboard.getText();
									assertEquals(s, "User Summary");
									System.out.println("Assertion pass: Profile edited successfully");
								} else {
									boolean isEnabled = updateBtn.isEnabled();
									assertFalse(isEnabled);
									System.out.println("You entered invalid data");
									click(BackBtn);
								}
							} 
							else {
								System.out.printf("Edit customer profile functionality is not working for " + row[0]);
								break;
							    }
							}
							else
							{
								break;
							}
						}
						br.close();
		return new AmazonHome();
	}
	
	public AmazonHome CustomereditProfileInvalid() throws InterruptedException, IOException{
		File f1 = new File("C://Users//Lenovo//git//LonarA2ZDailyFramework//LonarFinalFramework//src//main//resources//TestData.csv");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
		CSVReader csvReader = new CSVReaderBuilder(fr)
								.withSkipLines(74)
								.withCSVParser(parser)
								.build();
		//Hold row of CSV read line
		String[] row;
		
		while((row = csvReader.readNext()) != null)
		{
			if(row.length>1) {
				Thread.sleep(2000);
				boolean found = driver.getPageSource().contains("Profile");
				if (found) {  		
					Supp_Code.clear();
					sendKeys(Supp_Code, row[0]);
				
					Name.clear();
					sendKeys(Name, row[1]);
						clear(flatNo);
						sendKeys(flatNo, row[2]);
						clear(detailAddress);
						sendKeys(detailAddress,  row[3]);
						clear(landmark);
						sendKeys(landmark,  row[4]);
						clear(pinCode);
						sendKeys(pinCode,  row[5]);
						clear(area);
						sendKeys(area,  row[6]);
							
							if (profilePanel != null) {
								new TouchAction((PerformsTouchActions) driver).press(PointOption.point(100, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(100, 0)).release().perform();
								}
								Thread.sleep(3000);	
								
								click(CustState);
								click(CustSelect_State);
								click(CustCity);
								click(CustSelect_State);
								clear(CustEmail_id);
								sendKeys(CustEmail_id,  row[7]);
								clear(CustAlt_no);
								sendKeys(CustAlt_no,  row[8]);
								if (updateBtn.isEnabled()) {
									System.out.println("You entered valid data");
									click(updateBtn);

									waitForVisibility(Dashboard);
									String s = Dashboard.getText();
									assertEquals(s, "User Summary");
									System.out.println("Assertion pass: Profile edited successfully");
								} else {
									boolean isEnabled = updateBtn.isEnabled();
									assertFalse(isEnabled);
									System.out.println("You entered invalid data");
									click(BackBtn);
								}
							} 
							else {
								System.out.printf("Edit customer profile functionality is not working for " + row[0]);
								break;
							    }
							}
							else
							{
								break;
							}
						}
						br.close();
		return new AmazonHome();
	}
}
