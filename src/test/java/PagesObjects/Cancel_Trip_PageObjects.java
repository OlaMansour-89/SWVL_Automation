package PagesObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cancel_Trip_PageObjects extends DriverRegistry {

	public static void navigateToMyTrips() {
		WebElement got_it_tv=DriverRegistry.driver.findElementById("got_it_tv");
		got_it_tv.click();
		WebElement menu_iv=DriverRegistry.driver.findElementById("menu_iv");
		menu_iv.click();
		WebElement myTrips_ListItem=DriverRegistry.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.P[1]/android.widget.CheckedTextView");
		myTrips_ListItem.click();
		
	}
	public static void findTrip() {
		WebElement ride_card_view=driver.findElementById("ride_card_view");
		ride_card_view.click();	
		
		
	}
	public static void cancelTrip() {
		WebElement captain_layout=DriverRegistry.driver.findElementById("captain_layout");
		swipeUp(captain_layout);
		WebElement cancel_booking_iv=DriverRegistry.driver.findElementById("cancel_booking_iv");
		cancel_booking_iv.click();	
		WebElement confirm_btn=DriverRegistry.driver.findElementById("confirm_btn");
		confirm_btn.click();		
		
	}
	public static void checkTripIsCancelled() {
		WebElement change_Plan_list=DriverRegistry.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[6]");
		change_Plan_list.click();
		
		assertTrue(driver.findElements( By.id("ride_card_view") ).size() == 0);

	}

}
