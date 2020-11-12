package stepDefinition;


import PageObjects.EnquiryPage;

import TestBase.BaseClass;

import cucumber.api.java.en.Then;

public class EnquiryTab extends BaseClass{
	
	
		EnquiryPage obj = new EnquiryPage(driver);
		
	
		@Then("^click on Enquiry link$")
		public void click_on_Enquiry_link() throws Exception {
			
			obj.VerifyEnquiryTab();
		   
		}

		@Then("^verify whether Enquiry page is displayed or not$")
		public void verify_whether_Enquiry_page_is_displayed_or_not() throws Exception {
		    
		}

	
		
}
