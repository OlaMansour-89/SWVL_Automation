package StepsDef;

import PagesObjects.Book_Trip_PageObjects;
import PagesObjects.Cancel_Trip_PageObjects;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cancel_Trip_StepDef {
	@When("^I navigate to my trips$")
	public void I_navigate_to_my_trips() throws Throwable {
	   Cancel_Trip_PageObjects.navigateToMyTrips();
	   
	}
@And ("^I found the already booked trip$")
	
	public void I_found_the_already_booked_trip() throws Throwable {
		 Cancel_Trip_PageObjects.findTrip();
		}
@And ("^I clicked cancel trip$")

public void I_clicked_cancel_trip() throws Throwable {
	  Cancel_Trip_PageObjects.cancelTrip();
	}
@Then("^the trip should be cancelled$")
public void the_trip_should_be_cancelled () throws Throwable {
	Cancel_Trip_PageObjects.checkTripIsCancelled();
}	

}
