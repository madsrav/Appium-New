package base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	public AndroidDriver driver;
	public DesiredCapabilities capabilities;
	public URL url;
	public AppiumDriverLocalService service;
	@Parameters({"deviceName","udid","androidversion","port"})
	@BeforeClass
	public void setCapabilites(String deviceName,String udid,String androidversion, String port ) throws MalformedURLException {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		capabilities.setCapability(MobileCapabilityType.UDID, udid);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, androidversion);
		capabilities.setCapability("automationName", "uiautomator2");
//		capabilities.setCapability("appActivity", ".ApiDemos");
//		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("chromedriverExecutable", "C:\\Users\\Sravan Kumar\\OneDrive\\Desktop\\NOTES\\APPIUM\\chromedriver.exe");
		capabilities.setCapability("appActivity", ".SplashActivity");
		capabilities.setCapability("appPackage", "com.androidsample.generalstore");

		url = new URL("http://127.0.0.1:"+port);
	}

	@Parameters("port")
	@BeforeMethod
	public void LaunchApp(String port) {

		
		//service = AppiumDriverLocalService.buildDefaultService();
		service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingPort(Integer.valueOf(port))
				.withTimeout(Duration.ofSeconds(300))
				.withLogFile(new File("./ServerLogs/New"+port+".Log"))
				);
		service.start();
		service.clearOutPutStreams();
		
		driver = new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void terminateServer()
	{
		service.stop();
	}
}


