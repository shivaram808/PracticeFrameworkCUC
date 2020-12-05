package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class BusSearchPage
{

	WebDriver driver;

	public BusSearchPage(WebDriver driver)
			{
				this.driver = driver;
				//PageFactory.initElements(driver, this);
			}

			public void searchFromtext(String FmBustxt) throws InterruptedException {
				driver.findElement(By.id("fromPlaceName")).sendKeys(FmBustxt);
				Thread.sleep(1000);
				List<WebElement> fm_bs = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
				int fm_sz = fm_bs.size();

				for (int i = 4; i == fm_sz; i++) {
					System.out.println(fm_bs.get(i).getText());
				}

//			public void searchToText(String ToBus) throws InterruptedException
//			{
//				driver.findElement(By.id("toPlaceName")).sendKeys(ToBus);
//				Thread.sleep(1000);
////				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//				driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
//
//				driver.findElement(By.id("txtJourneyDate")).click();
////				driver.findElement(By.name("txtJourneyDate")).sendKeys("30/11/2020");
//				driver.findElement(By.cssSelector("table[class=\"ui-datepicker-calendar\"]>tbody>tr:nth-child(2)>td:nth-child(4)>a\n")).click();
//				driver.findElement(By.id("searchBtn")).click();
//				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//			}
			}

}
