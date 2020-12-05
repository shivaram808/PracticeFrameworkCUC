package stepDefinition;

import PageObjects.BusBookingPage;
import PageObjects.BusSearchPage;
import TestBase.BaseClass;
import cucumber.api.java.en.Then;

public class BusSearch extends BaseClass
{

	BusSearchPage busSearchPage = new BusSearchPage(driver);
	@Then("^Search a bus starting text for From location \"([^\"]*)\"$")
	public void search_a_bus_starting_text_for_From_location(String FmBustxt) throws Exception {
busSearchPage.searchFromtext(FmBustxt);
	}

	@Then("^Search a bus starting text for To location \"([^\"]*)\"$")
	public void search_a_bus_starting_text_for_To_location(String arg1) throws Exception {

	}


}
