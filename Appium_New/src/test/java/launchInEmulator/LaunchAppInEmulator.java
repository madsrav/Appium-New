package launchInEmulator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchAppInEmulator {
	@Test
	public void launchAppInEmulatorTest() throws MalformedURLException
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Sravan Kumar\\OneDrive\\Desktop\\NOTES\\APPIUM\\ApiDemos-debug.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		 
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.quit();
	}

}
