package stepDefinition;

import PageObjects.AboutUSPage;
import PageObjects.BusBookingPage;
import TestBase.BaseClass;
import cucumber.api.java.en.Then;

public class BusBooking extends BaseClass{

	BusBookingPage busBookingPage = new BusBookingPage(driver);

	@Then("^Search a bus in booking page$")
	public void search_a_bus_in_booking_page() throws Exception {

	}

	@Then("^Click on Select Seats button using bus no \"([^\"]*)\"$")
	public void click_on_Select_Seats_button_using_bus_no(String BusNo) throws Exception
	{
		busBookingPage.selectBus(BusNo);
	}
}
