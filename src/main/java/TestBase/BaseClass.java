package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
	
	public static WebDriver driver;


	public static void InitializeDriver() throws Exception
	{
		
		
		
		System.setProperty("webdriver.gecko.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
		//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\nisum\\git\\Cucumber_Maven_Pageobjects\\CucumberMVNPageObj\\geckodriver.exe");
		//	driver = new FirefoxDriver();
		
		
		driver.get("https://tsrtconline.in/oprs-web/login/show.do");
		driver.manage().window().maximize();
		System.out.println("Site launched successfully!!");
		Thread.sleep(5000);
		
	}
	
	
	

	public void CloseDriver()
	{
		driver.close();
	}
	

}
