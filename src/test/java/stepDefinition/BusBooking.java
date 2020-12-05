package stepDefinition;

import PageObjects.AboutUSPage;
import PageObjects.BusBookingPage;
import TestBase.BaseClass;
import cucumber.api.java.en.Then;

public class BusBooking extends BaseClass{

	BusBookingPage busBookingPage = new BusBookingPage(driver);

	@Then("^Search a bus by From location \"([^\"]*)\"$")
	public void search_a_bus_by_From_location(String FmBus) throws Exception {
		busBookingPage.searchFromBus(FmBus);
	}

	@Then("^Search a bus by To location \"([^\"]*)\"$")
	public void search_a_bus_by_To_location(String ToBus) throws Exception {
		busBookingPage.searchToBus(ToBus);
	}

	@Then("^Filter by BusType as \"([^\"]*)\"$")
	public void filter_by_BusType_as(String BType) throws Exception {
		busBookingPage.busType(BType);
	}

	@Then("^Filter by BusBoarding Point \"([^\"]*)\"$")
	public void filter_by_BusBoarding_Point(String BPoint) throws Exception {
		busBookingPage.boardingPoint(BPoint);
	}


	@Then("^Click on Select Seats button using bus no \"([^\"]*)\"$")
	public void click_on_Select_Seats_button_using_bus_no(String BusNo) throws Exception
	{
		busBookingPage.selectBus(BusNo);
	}
}
