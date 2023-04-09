package com.generalStore;

import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.AppiumBy;

public class PrintToastMsgTest extends BaseClass{

	@Test
	public void toastmsgTest()
	{
		driver.findElement(AppiumBy.id("spinnerCountry")).click();
		String an="text";
		String av="China";
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))")).click();
		driver.findElement(AppiumBy.id("btnLetsShop")).click();
		
		String toast1 = driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getText();
		
		System.out.println(toast1);
		
		driver.findElement(AppiumBy.id("nameField")).sendKeys("sravs");
		driver.findElement(AppiumBy.id("btnLetsShop")).click();
		driver.findElement(AppiumBy.id("appbar_btn_cart")).click();
		String toast2 = driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getText();
		System.out.println(toast2);
		
	}
	

}
