package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PageObjects.LoginPage;
import TestBase.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VerifyLogin extends BaseClass{

	
	@Given("^Login to TS RTC website using valid username and password$")
		public void login_to_TS_RTC_website_using_valid_username_and_password() throws Exception {
		
			LoginPage lp = new LoginPage(driver);
			lp.login();
			
			System.out.println("Validating User Login Scenarios......");	
			// Create a constructor and shift this message to the constructor

		}

		@Then("^TSRTC Home page should be displayed$")
		public void tsrtc_Home_page_should_be_displayed() throws Exception {
			
			WebElement Logout_btn = driver.findElement(By.linkText("Logout"));
			
			if(Logout_btn.isDisplayed())
			{
				System.out.println("Login Successfull!!");
			}
		}
	
	
		
}
