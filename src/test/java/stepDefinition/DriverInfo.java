package stepDefinition;

import PageObjects.AboutUSPage;
import PageObjects.DriverInfoPage;
import TestBase.BaseClass;
import cucumber.api.java.en.Then;

public class DriverInfo extends BaseClass
{


	DriverInfoPage di = new DriverInfoPage(driver);

	@Then("^Navigate to Driver Info page$")
	public void navigate_to_Driver_Info_page() throws Exception
	{
	di.NavigateDriverToPage();
	}

	@Then("^Verify Driver Information label is displayed$")
	public void verify_Driver_Information_label_is_displayed() throws Exception
	{
	di.VerifyDriverInfolabel();
	}

}
