package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import utilpac.testutil;

public class testbase {
	public static WebDriver driver;
	public static Properties prop;
	
	@FindBy(xpath = "//input[@name='username']")
	static WebElement user;

	@FindBy(xpath = "//input[@name='password']")
	static WebElement pwd;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	static WebElement login;

	
	public testbase() {
		try {
			prop = new Properties();
			FileInputStream ip  = new FileInputStream("C:\\Users\\UE\\eclipse-workspace\\Pitonsops\\src\\main\\java\\configprop\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}	
		}

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "D:\\SOFT\\chromedriver_win32\\chromedriver.exe");
		// ChromeOptions options = new ChromeOptions();
		// options.setPageLoadStrategy(PageLoadStrategy.NONE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testutil.Page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testutil.Implicitly_wait, TimeUnit.SECONDS);

		driver.get(prop.getProperty("URL"));
	}
	
	public static void login(String username, String password) {
		user.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
	}
	}


