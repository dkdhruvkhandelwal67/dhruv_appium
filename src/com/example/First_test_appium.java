package com.example;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class First_test_appium {

	//Create an instance for appium driver
	AppiumDriver<WebElement> driver ;
	String APP_ACTIVITY;
	String APP_PACKAGE;

	@BeforeTest
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		//test.setCapability(MobileCapabilityType.APP_PACKAGE, "com.veronicaapps.veronica.simplecalculator");
		//test.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.veronicaapps.veronica.simplecalculator.MainActivity");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability(MobileCapabilityType.VERSION, "5.1.1");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		caps.setCapability("avd", "test");

		APP_ACTIVITY ="com.xlythe.calculator.material.Calculator";
//		APP_ACTIVITY = "com.veronicaapps.veronica.simplecalculator.MainActivity";
		APP_PACKAGE = "com.android2.calculator3";
		//test.setCapability("appPackage", "com.veronicaapps.veronica.simplecalculator");
		//test.setCapability("appActivity", ".MainActivity");

		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);


	}

	//	    public interface AndroidMobileCapabilityType extends CapabilityType {
	//	          String APP_ACTIVITY = "com.veronicaapps.veronica.simplecalculator.MainActivity";
	//	          String APP_PACKAGE = "com.mobile1.marketips.mobsso1mobile";
	//	    }

	@Test
	public void test() throws Exception
	{

		Assert.assertNotNull(driver.getContext());
//		driver.findElement(By.id("com.mobile1.marketips.mobo1mobile:id/buttonandroid.widget.Button")).click();



	}

}