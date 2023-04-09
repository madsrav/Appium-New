package com.gestures;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class GesturesTest {
	
	public void longClickGestures(AppiumDriver driver, WebElement element) throws InterruptedException
	{
		driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"duration", 2000
			));
	}

	public void dragGestureWithCoordinates(AppiumDriver driver, WebElement element) throws InterruptedException
	{
	 driver.executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "endX", 650,
			    "endY", 1000
			));
	}
	
	public void clickGestures(AppiumDriver driver, RemoteWebElement element) throws InterruptedException
	{
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()
				));
	}
	
	public void flingGesture(AppiumDriver driver, WebElement element)
	{
		boolean canScorllMore=true;
		boolean canScrollMore = (Boolean) driver.executeScript("mobile: flingGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "direction", "down",
			    "speed", 1500
			));	
	}
	public void pinchOpenGesture(AppiumDriver driver, WebElement element)
	{
		  driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"duration",2000,
			    "percent", 0.75
			));
	}
	public void pinchCloseGesture(AppiumDriver driver, WebElement element)
	{
		 driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"duration",2000,
			    "percent", 0.75
			));
	}
	
	public void scrollToElement(AppiumDriver driver, WebElement element)
	{
		boolean canScorllMore=true;
		boolean canScrollMore =(boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
			    "direction", "down",
			    "percent", 3.0
			));
	}
	
	public void swipeLeft(AppiumDriver driver, WebElement element)
	{
			driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
			    "direction", "left",
			    "percent", 0.75
			));
	}
	public void swipeLeftByCoordinates(AndroidDriver driver,int left, int top,int width,int height)
	{
			driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", left, "top", top, "width", width, "height", height,
			    "direction", "left",
			    "percent", 0.75
			));
	}
	
	public void swipeRight(AndroidDriver driver, WebElement element)
	{
			driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
			    "direction", "right",
			    "percent", 0.75
			));
	}
	public void swipeRightByCoordinates(AndroidDriver driver,int left, int top,int width,int height)
	{
			driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", left, "top", top, "width", width, "height", height,
			    "direction", "right",
			    "percent", 0.75
			));
	}



	
}
