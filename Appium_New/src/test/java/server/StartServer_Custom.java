package server;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

	public class StartServer_Custom {

		AppiumDriverLocalService server;

		@BeforeMethod
		public void startServer() {
			server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//					.withAppiumJS(new File("C:\\Users\\haris\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
					.usingPort(4723)
					.withLogFile(new File("../APPIUM_NEW/serverLogs/New.log"))
					.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
					.withTimeout(Duration.ofSeconds(300L))
					);
			server.start();
			server.clearOutPutStreams();
		}

		@Test
		public void launchApiDemo() throws MalformedURLException {
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

			desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Harish's F23");
			desiredCapabilities.setCapability(MobileCapabilityType.UDID, "RZCT406BZQM");
			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
			desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
			desiredCapabilities.setCapability("appActivity", ".ApiDemos");


			URL url = new URL("http://localhost:4723");
			AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
		}

		@AfterMethod
		public void stopServer() {
			server.stop();
		}

	}

