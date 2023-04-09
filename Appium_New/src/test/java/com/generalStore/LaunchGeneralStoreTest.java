package com.generalStore;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.AppiumBy;

public class LaunchGeneralStoreTest extends BaseClass {
	@Test
	public void generalStoreTest() throws InterruptedException
	{
		driver.findElement(AppiumBy.id("spinnerCountry")).click();
		String an="text";
		String av="India";
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))")).click();
		driver.findElement(AppiumBy.id("nameField")).sendKeys("sravs");
		driver.findElement(AppiumBy.id("btnLetsShop")).click();
		//android.widget.TextView[@text='Air Jordan 4 Retro']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@text='ADDED TO CART']
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")).click();
		driver.findElement(AppiumBy.id("appbar_btn_cart")).click();
		driver.findElement(AppiumBy.id("btnProceed")).click();
		
		Thread.sleep(3000);
		
		Set<String> contexthandles = driver.getContextHandles();
		System.out.println(contexthandles.size());
		for (String handle : contexthandles) {
			
			System.out.println(handle);
		}
		Thread.sleep(3000);
		driver.context("WEBVIEW_com.androidsample.generalstore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium.dev",Keys.ENTER);	
	}

}
