package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AboutUSPage{

	WebDriver driver;
	
	public AboutUSPage(WebDriver driver)
			{
				this.driver = driver;
				//PageFactory.initElements(driver, this);
			}
	
	// Identifying all the WebElements of this page 	
	//@FindBy(xpath=".//*[@id='txtUsername']")
	//WebElement Username;
		
	public void VerifyAboutUSIcon()
	{
		Boolean Aboutus_disp = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[1]/span[1]")).isDisplayed();
		
		System.out.println("About us is displayed :  "+ Aboutus_disp);
		
	}
	
	public void navigateAboutUSpage()
	{
		driver.get("https://www.tsrtconline.in/oprs-web/home/aboutus.do");
	}
	
}
