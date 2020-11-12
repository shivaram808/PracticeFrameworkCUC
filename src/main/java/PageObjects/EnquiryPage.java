package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class EnquiryPage{

	WebDriver driver;
	
	public EnquiryPage(WebDriver driver)
			{
				this.driver = driver;
				//PageFactory.initElements(driver, this);
			}
	
	// Identifying all the WebElements of this page 	
	//@FindBy(xpath=".//*[@id='txtUsername']")
	//WebElement Username;
		
	public void VerifyEnquiryTab() 
	{
	
		driver.findElement(By.cssSelector("a[title=\"Enquiry\"]")).click();
		
		Boolean EnquiryTab_disp = driver.findElement(By.cssSelector("span[class=\"innerpageTitleHdead\"]")).isDisplayed();
		
		System.out.println("Enquiry Page is displayed : "+EnquiryTab_disp);
		
	}

		
}
