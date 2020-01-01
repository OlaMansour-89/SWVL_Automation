package PagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_PageObjects extends DriverRegistry{
	
	public static void signIn()  {
		if(driver.findElements( By.id("skip_btn") ).size() != 0) {
		driver.findElementById("skip_btn").click();
		
		WebElement expandable_input_view=driver.findElementById("expandable_input_view");
		expandable_input_view.click();
		waitForSetTime(1000L);
		WebElement country_DD_Arrow=driver.findElementById("flag_image_view");
		waitForElement(country_DD_Arrow).click();
		
		WebElement search_et_Countries=driver.findElementById("search_et");
		search_et_Countries.sendKeys("Egypt");
		
	    WebElement country_name_text_view=driver.findElementById("country_name_text_view");
	    country_name_text_view.click();
	    
		WebElement phone_edit_text=driver.findElementById("phone_edit_text");
		phone_edit_text.sendKeys("01021266749");
		
		WebElement next_btn=driver.findElementById("next_btn");
		next_btn.click();
		
		WebElement password_edit_text=driver.findElementById("password_edit_text");
		password_edit_text.sendKeys("Time2Work");
		next_btn.click();
		}
		else {
			WebElement expandable_input_view=driver.findElementById("expandable_input_view");
			expandable_input_view.click();
			waitForSetTime(1000L);
			WebElement country_DD_Arrow=driver.findElementById("flag_image_view");
			waitForElement(country_DD_Arrow).click();
			
			WebElement search_et_Countries=driver.findElementById("search_et");
			search_et_Countries.sendKeys("Egypt");
			
		    WebElement country_name_text_view=driver.findElementById("country_name_text_view");
		    country_name_text_view.click();
		    
			WebElement phone_edit_text=driver.findElementById("phone_edit_text");
			phone_edit_text.sendKeys("");
			
			WebElement next_btn=driver.findElementById("next_btn");
			next_btn.click();
			
			WebElement password_edit_text=driver.findElementById("password_edit_text");
			password_edit_text.sendKeys("");
			next_btn.click();	
		}
		
	}
	
	public void test() {
	
	}
	}


