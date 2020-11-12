package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class MyAccount{

	 WebDriver driver;
	
	public MyAccount(WebDriver driver)
			{
				this.driver = driver;
				//PageFactory.initElements(driver, this);
			}
	
	// Identifying all the WebElements of this page 	
	//@FindBy(xpath=".//*[@id='txtUsername']")
	//WebElement Username;
		
	public void MyAccount_Click() 
	{
		driver.findElement(By.linkText("My Account")).click();
		
	}

	
	}
		

