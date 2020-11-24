package stepDefinition;

import PageObjects.AboutUSPage;
import PageObjects.CancelPage;
import TestBase.BaseClass;
import cucumber.api.java.en.Then;

public class CancelTicket extends BaseClass
{

	CancelPage cl=new CancelPage(driver);

	@Then("^Navigate to Cancel Tickets page$")
	public void navigate_to_Cancel_Tickets_page() throws Exception {
	cl.VerifyCancelTicket();
	}

	@Then("^Verify Cancel Ticket icon is displayed$")
	public void verify_Cancel_Ticket_icon_is_displayed() throws Exception {

	}
	
	
		
}
