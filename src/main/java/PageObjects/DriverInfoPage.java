package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DriverInfoPage {

	WebDriver driver;

	public DriverInfoPage(WebDriver driver)
			{
				this.driver = driver;
				//PageFactory.initElements(driver, this);
			}
	
	// Identifying all the WebElements of this page 	
	//@FindBy(xpath=".//*[@id='txtUsername']")
	//WebElement Username;
		
	public void NavigateDriverToPage()
	{

		driver.findElement(By.xpath("//a[@title='Driver Info']")).click();

	}

	public void VerifyDriverInfolabel()
	{
		String drlbl=driver.findElement(By.xpath("//span[contains(text(),'Driver Information')]")).getText();

		if (drlbl.equalsIgnoreCase("Driver Information"))
		{
			System.out.println("Driver Information Label is displayed");
		}
		else
			{
				System.out.println("Driver info not displayed");
			}
	}
	
}
