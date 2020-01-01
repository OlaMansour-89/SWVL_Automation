package PagesObjects;


import static java.time.Duration.ofMillis;
import static org.junit.Assert.assertTrue;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class DriverRegistry {
	public static AndroidDriver driver;
	private static AppiumDriverLocalService server;
    private static final long WEB_DRIVER_WAIT_TIMEOUT_IN_SECONDS = 120L;

	
	//public static void startAppiumServer() {
	//AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
	// Use any port, in case the default 4723 is already taken (maybe by another Appium server)
	//serviceBuilder.usingAnyFreePort();
	// Tell serviceBuilder where node is installed. Or set this path in an environment variable named NODE_PATH
	//serviceBuilder.usingDriverExecutable(new File("/usr/local/bin/node"));
	// Tell serviceBuilder where Appium is installed. Or set this path in an environment variable named APPIUM_PATH
	//serviceBuilder.withAppiumJS(new File("/usr/local/bin/appium"));
	// The XCUITest driver requires that a path to the Carthage binary is in the PATH variable. I have this set for my shell, but the Java process does not see it. It can be inserted here.
	//HashMap<String, String> environment = new HashMap();
	//environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
	//serviceBuilder.withEnvironment(environment);

	//server = AppiumDriverLocalService.buildService(serviceBuilder);
	//server.start();
	//}

	
	public static void startSession() {
		
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("deviceName", "Android Emulator");
	caps.setCapability("platformName", "Android");
	caps.setCapability("app","/Users/user/Documents/SWVL_Automation/App_Repo/Swvl Bus Booking App_v5.7.1_apkpure.com.apk" );
	caps.setCapability("appPackage", "io.swvl.customer");
	caps.setCapability("appActivity", "io.swvl.customer.features.LaunchScreenActivity");
	caps.setCapability("autoGrantPermissions", "true");
	caps.setCapability("fullReset", true);
	driver = new AndroidDriver(caps);
	 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}


	public static void endSession() {
	try {
	driver.quit();
	} catch (Exception ign) {}
	}

	
	public static void stopAppiumServer() {
	server.stop();
	}

	public void test() {
	// test code goes here
	assertTrue(true);
	}
	static WebElement waitForElement(WebElement element) {
        final WebDriverWait wait = new WebDriverWait(driver, WEB_DRIVER_WAIT_TIMEOUT_IN_SECONDS);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }
	static void waitForSetTime(Long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	 
	static void swipeUp (WebElement element) {
		
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		int endY=size.height / 2;
		new TouchAction(driver).longPress(element).moveTo(900,endY).release().perform();
    }
	 }



