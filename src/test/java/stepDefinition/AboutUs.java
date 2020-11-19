package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PageObjects.AboutUSPage;
import PageObjects.LoginPage;
import TestBase.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.sql.SQLOutput;
import java.util.List;

public class AboutUs extends BaseClass{
	
	
		AboutUSPage ab = new AboutUSPage(driver);
		
	
	@Then("^Navigate to About us page$")
	public void navigate_to_About_us_page() throws Exception {

		System.out.println("This is Nandus sout");

		ab.navigateAboutUSpage();
	}

	@Then("^Verify About us icon is displayed$")
	public void verify_About_us_icon_is_displayed() throws Exception {
		
		ab.VerifyAboutUSIcon();

	}

	@Given("^Verify if \"([^\"]*)\" service is available$")
	public void verify_if_service_is_available(String BusType) throws Exception {

		WebElement mytbl=driver.findElement(By.cssSelector("table[class=\"boxborderTd\"]>tbody"));
		List<WebElement> row_tab= driver.findElements(By.cssSelector("table[class=\"boxborderTd\"]>tbody>tr"));
		int row_cnt = row_tab.size();
		System.out.println("row_cnt is: "+row_cnt);
		for (int row=0;row<row_cnt;row++)
		{
			List<WebElement> col_row=row_tab.get(row).findElements(By.cssSelector("table[class=\"boxborderTd\"]>tbody>tr>td"));
			int col_cnt=col_row.size();
//            System.out.println("no. of cell in row "+row+ " are "+col_cnt);

			for(int col=0; col<col_cnt; col++)
			{
				String celtxt = col_row.get(col).getText();

				if (celtxt.equalsIgnoreCase(BusType))
				{
					System.out.println(celtxt);
					break;
				}//                System.out.println("cel val of the row num "+ row +" and col num "+col+ " is "+celtxt);

			}
//            System.out.println("----- end -----");
		}
	}


	@Given("^Fetch no of available serices for bus : \"([^\"]*)\"$")
	public void fetch_no_of_available_serices_for_bus(String BusType) throws Exception {

		String NoOFBusses = driver.findElement(By.xpath("//td[text()='"+BusType+"']//parent::tr/td[3]")).getText();
		System.out.println("Number of busses vailable for - " +BusType+ " : "+NoOFBusses);
	}
	
	
		
}
