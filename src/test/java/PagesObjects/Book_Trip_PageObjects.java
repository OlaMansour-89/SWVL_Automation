package PagesObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;

public class Book_Trip_PageObjects extends DriverRegistry {
	public static void searchForTrip() throws InterruptedException {
		WebElement got_it_tv=DriverRegistry.driver.findElementById("got_it_tv");
		got_it_tv.click();
		
		WebElement where_to_TextBox=DriverRegistry.driver.findElementById("where_to");
		where_to_TextBox.click();
		
		//DriverRegistry.driver.wait(1000);
		WebElement dropoff_et=DriverRegistry.driver.findElementById("dropoff_et");
		dropoff_et.click();
		WebElement pickup_et=DriverRegistry.driver.findElementById("pickup_et");
		pickup_et.click();
		pickup_et.sendKeys("maadi smart village");
		WebElement pickup_listItem=DriverRegistry.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
		pickup_listItem.click();
		dropoff_et.click();
		
		dropoff_et.sendKeys("smart");
		WebElement dropoff_listItem=DriverRegistry.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
		dropoff_listItem.click();
		
		
		
		
	}
	public static void chooseNeededRoute() {
		WebElement example_view=DriverRegistry.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.view.ViewGroup");
		example_view.click();
		
		WebElement next_Day_Tab=DriverRegistry.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.widget.Button[2]");
		next_Day_Tab.click();
		
		WebElement trip_listItem=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup");
		trip_listItem.click();
	}
	public static void confirmTripDetails() {
		WebElement next_btn=driver.findElementById("next_btn");
		next_btn.click();
	}
	public static void tripBookedSuccessfully() {
		WebElement book_btn=driver.findElementById("book_btn");
		book_btn.click();
	
		WebElement bookedSuccessfullyTXT=driver.findElementById("title_tv");
		String successfullTXT=bookedSuccessfullyTXT.getText();
		assertTrue(successfullTXT.equals("Trip Successfully Booked"));
		WebElement done_btn=driver.findElementById("done_btn");
		done_btn.click();
		
		
	}
			
		
	
	}
