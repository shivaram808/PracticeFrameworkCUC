package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CancelPage {

	WebDriver driver;

	public CancelPage(WebDriver driver)
			{
				this.driver = driver;
				//PageFactory.initElements(driver, this);
			}
	
	// Identifying all the WebElements of this page 	
	//@FindBy(xpath=".//*[@id='txtUsername']")
	//WebElement Username;
		
	public void VerifyCancelTicket() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[title=\"Cancelled Services\"]")).click();
		Thread.sleep(3000);
		WebElement cantxt=driver.findElement(By.cssSelector("[class=\"innerpageTitleHdead\"]"));
		Boolean canT=cantxt.getText().equalsIgnoreCase("Cancelled Services");
		System.out.println("Text for cancel is disp: "+canT);
	}
	

}
