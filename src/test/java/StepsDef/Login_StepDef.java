package StepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import PagesObjects.DriverRegistry;
import PagesObjects.Login_PageObjects;
public class Login_StepDef {
	
	
	@Given("I am an alredy registered user to SWVL app")
	public void I_am_an_alredy_registered_user_to_SWVL_app()throws Throwable {
		DriverRegistry.startSession();
		
	}
	
	
	@And("I logged in successfully")
	public void I_logged_in_successfully_to_SWVL_app()throws Throwable {
	Login_PageObjects.signIn();
	}
	
	
	
}
