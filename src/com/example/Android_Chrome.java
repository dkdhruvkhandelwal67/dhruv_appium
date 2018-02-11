package com.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class Android_Chrome {
//	WebDriver driver;
	public  AndroidDriver driver;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		
		//Created object of DesiredCapabilities class
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("appium-version", "1.4.16.1");
		
		capabilities.setCapability("platformVersion", "5.1");
		//The kind of mobile device or emulator to use - iPad Simulator, iPhone Retina 4-inch, Android Emulator, Galaxy S4 etc
		//Find your device name by running command 'adb devices' from command prompt
		capabilities.setCapability("deviceName", "TA64302BY7");
	
		//Which mobile OS platform to use - iOS, Android, or FirefoxOS
		capabilities.setCapability("platformName", "Android");
		
		//Java package of the Android app you want to run- Ex: com.example.android.myApp
		//For Android calculator app, package name is 'com.android.calculator2'
		capabilities.setCapability("appPackage", "com.android.chrome");

		//Activity name for the Android activity you want to launch from your package
		//For Android calculator app, Activity name is 'com.android.calculator2.Calculator'
		capabilities.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");
		
		// Initialize the driver object with the URL to Appium Server and pass capabilities
//		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void Sum() throws InterruptedException {
		System.out.println("Start my TEST");
		driver.get("https://www.apple.com/");
		driver.findElement(By.xpath("//span[@class=\'ac-gn-menuicon-bread ac-gn-menuicon-bread-top\']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class=\'ac-gn-menuicon-bread ac-gn-menuicon-bread-top']")).click();
		driver.navigate().refresh();
		
		
		
		
	}

	@AfterTest
	public void End() throws InterruptedException {
		Thread.sleep(6000);
		driver.quit();
	}
}