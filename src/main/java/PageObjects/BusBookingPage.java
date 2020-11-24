package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class BusBookingPage {

	WebDriver driver;

	public BusBookingPage(WebDriver driver)
			{
				this.driver = driver;
				//PageFactory.initElements(driver, this);
			}
	

			public void selectBus(String Busno) throws InterruptedException {


				driver.findElement(By.id("fromPlaceName")).sendKeys("Hyderabad");
				Thread.sleep(500);
				driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.TAB);
				driver.findElement(By.id("toPlaceName")).sendKeys("Vijayawada");
				Thread.sleep(500);
				driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);

				driver.findElement(By.id("txtJourneyDate")).click();
//        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[7]")).click();

				driver.findElement(By.cssSelector("table[class=\"ui-datepicker-calendar\"]>tbody>tr:nth-child(2)>td:nth-child(4)>a\n")).click();

//        driver.findElement(By.xpath("//*[@id='txtReturnJourneyDate']")).click();
//        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[7]")).click();
				driver.findElement(By.id("searchBtn")).click();
				Thread.sleep(3000);

				driver.findElement(By.id("BtFid")).click();
				driver.findElement(By.cssSelector("input[name=\"NON A/C CLASS\"]")).click();

				driver.findElement(By.id("BpFid")).click();

//        Approach 1
				List<WebElement> drp_vals = driver.findElements(By.cssSelector("[class=\"selectBox selectBoxs\"]>div>ul>li"));
				int dp_vl = drp_vals.size();

				for (int i=0; i<dp_vl;i++)
				{
					String txt_drp=drp_vals.get(i).getText();
					System.out.println(txt_drp);

					if (txt_drp.equalsIgnoreCase("KPHB COLONY"))
					{
						drp_vals.get(i).click();
					}
				}
//approach 1 end

//        approach 2
				driver.findElement(By.xpath("//span[text()='MIYAPUR']")).click();
				System.out.println("selected boarding");

				driver.findElement(By.xpath("//span[text()='KPHB COLONY']/span")).click();
				driver.findElement(By.xpath("//div[contains(text(),'"+Busno+"')]//parent::div//parent::div/div/input[@type='button']")).click();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//select[@name='onwardBoardId']")).click();

				Thread.sleep(9000);



			}
		

	
}
