package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PageObjects.AboutUSPage;
import PageObjects.LoginPage;
import TestBase.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AboutUs extends BaseClass{
	
	
		AboutUSPage ab = new AboutUSPage(driver);
		
	
	@Then("^Navigate to About us page$")
	public void navigate_to_About_us_page() throws Exception {
		System.out.println("Navigate to about us page");
		ab.navigateAboutUSpage();
	}

	@Then("^Verify About us icon is displayed$")
	public void verify_About_us_icon_is_displayed() throws Exception {
		
		ab.VerifyAboutUSIcon();

	}
	
	
		
}
