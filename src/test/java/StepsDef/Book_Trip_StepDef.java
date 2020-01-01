package StepsDef;

import PagesObjects.Book_Trip_PageObjects;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;

public class Book_Trip_StepDef {
	
	@And ("I searched for the route")
	
	public void I_searched_for_the_route() throws Throwable {
		   Book_Trip_PageObjects.searchForTrip(); 
		}

	
	@When("^I click on the needed route$")
	public void I_click_on_the_needed_route() throws Throwable {
	   Book_Trip_PageObjects.chooseNeededRoute();
	}
    
@And ("^I confirmed the booking details$")
	
	public void I_confirmed_the_booking_details() throws Throwable {
		  Book_Trip_PageObjects.confirmTripDetails();
		}
	@Then("^the trip should be booked successfully$")
	public void the_trip_should_be_booked_successfully  () throws Throwable {
		Book_Trip_PageObjects.tripBookedSuccessfully();
	}
	}
