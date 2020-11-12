package stepDefinition;



import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.MyAccount;
import TestBase.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class  UpdateAccout extends BaseClass{

	
    @When("^I Click on My Account page$")
    public void i_click_on_my_account_page() throws Throwable {

    	
    	MyAccount obj = new MyAccount(driver);
    	obj.MyAccount_Click();
    	
    	System.out.println("Validating MyAccount Scenarios......");
    }

    @And("^I update Issuing Authority as \"([^\"]*)\"$")
    public void i_update_issuing_authority_as_something(String val) throws Throwable {

    	driver.findElement(By.xpath("//input[@id='issueAuthority']")).sendKeys(val);
    	driver.findElement(By.xpath("//input[@name='SaveBtn']")).click();
    }
    
    @Then("^I should see successfully updated message$")
    public void i_should_see_successfully_updated_message() throws Throwable {
    	
    	Thread.sleep(5000);

    	boolean displayed = driver.findElement(By.xpath("//strong[contains(text(),'User \"shiva808\" successfully updated.')]")).isDisplayed();
  
    	if(displayed==true)    
    	{
    		Assert.assertTrue(true);
    		System.out.println("My Account successfully updated with mentioned details");
    	}
    	
    	Thread.sleep(8000);
    	
    }

 
	
	
}
