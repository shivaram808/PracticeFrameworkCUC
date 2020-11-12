package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage{

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
			{
				this.driver = driver;
				//PageFactory.initElements(driver, this);
			}
	
	// Identifying all the WebElements of this page 	
	//@FindBy(xpath=".//*[@id='txtUsername']")
	//WebElement Username;
		
	public void login()
	{
		driver.findElement(By.name("userName")).sendKeys("shiva808");
		driver.findElement(By.name("password")).sendKeys("Shiva@689");
		driver.findElement(By.name("submitBtn")).click();
		
	}
	
}
