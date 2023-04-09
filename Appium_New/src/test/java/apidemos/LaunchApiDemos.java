package apidemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.gestures.GesturesTest;
import com.google.common.collect.ImmutableMap;

import base.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pomPages.MainPage;

public class LaunchApiDemos extends BaseClass {
	
 
	GesturesTest gesture;
	@Test
	public void longPress() throws MalformedURLException, Exception
	{
		MainPage mp=new MainPage(driver);
		mp.getViewsText().click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
//		String an="text";
//		String av="WebView";
	//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))")).click();
	///	WebElement element=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='WebView']"));
		//gesture.scrollToElement(driver, element);
	//	driver.findElement(AppiumBy.accessibilityId("WebView")).click();
		Thread.sleep(3000);
		
	//	WebElement element1 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='I am some page content ']"));
		
		gesture=new GesturesTest();
	//	gesture.dragGestureWithCoordinates(driver, element);
	//	gesture.flingGesture(driver, element);
	//	gesture.longClickGestures(driver, element);
	//	gesture.scrollToElement(driver, element);
	
//		gesture.pinchOpenGesture(driver, element1);
//		gesture.pinchCloseGesture(driver, element1);
	
//		gesture.swipeLeftByCoordinates(driver, 350, 280, 650, 290);
//		Thread.sleep(3000);
//		gesture.swipeRightByCoordinates(driver, 350, 280, 650,290);
//	 
		WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[3]"));	
		gesture.swipeRight(driver, element);
	}
	
	

}
