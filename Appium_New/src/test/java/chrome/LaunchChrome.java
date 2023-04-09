package chrome;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchChrome {
	@Test
	public void launchChrome() throws MalformedURLException
	{

	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME ,"Vinay");
	capabilities.setCapability(MobileCapabilityType.UDID, "76c09ba");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0.1");
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	capabilities.setCapability("noReset", true);
	capabilities.setCapability("unlockType", "pattern");
	capabilities.setCapability("unlockKey", "14863");
	
	capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	capabilities.setCapability("chromedriverExecutable", "C:\\Users\\Sravan Kumar\\OneDrive\\Desktop\\NOTES\\APPIUM\\chromedriver.exe");
	
	URL url= new URL("http://127.0.0.1:4723/wd/hub");
	RemoteWebDriver driver= new AndroidDriver(url,capabilities);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://www.fb.com");
	
	}
}
