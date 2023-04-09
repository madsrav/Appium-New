package apidemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchCall {
	
	public void launchCall() throws MalformedURLException
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 12);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability("appPackage","com.android.incallui");
		dc.setCapability("appActivity", "com.android.incallui.InCallActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		 
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.quit();
	}

}
