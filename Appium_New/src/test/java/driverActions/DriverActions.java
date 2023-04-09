package driverActions;

import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import base.BaseClass;

public class DriverActions extends BaseClass {
@Test
	public void driverActionsTest() throws InterruptedException {
		// to chcek whether app is installed or not
		boolean result = driver.isAppInstalled("io.appium.android.apis");
		System.out.println(result);

		// to check app status
		System.out.println(driver.queryAppState("io.appium.android.apis"));
		
		//to activate another app in between
		driver.activateApp("com.miui.calculator");
		
		//to make any app run in background for particular time period
		driver.runAppInBackground(Duration.ofSeconds(10));
		driver.activateApp("io.appium.android.apis");
		System.out.println(driver.queryAppState("com.miui.calculator"));
		
		//to terminate app
		driver.terminateApp("com.miui.calculator");
		
		Thread.sleep(3000);
		//to rotate the app
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		
		//to open notifications in mobile
		driver.openNotifications();

	}

}
