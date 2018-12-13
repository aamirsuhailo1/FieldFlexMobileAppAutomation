package com.walmart.fieldflex.FieldFlexAppAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FieldFlex_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "vivo 1601");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0");
		caps.setCapability("appPackage", "com.android.contacts");
		caps.setCapability("appActivity", "com.android.contacts.DialtactsContactsEntryActivity");
		AndroidDriver driver;
		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			Thread.sleep(10000);
			String searchContact = "Asma";
			MobileElement contactList = (MobileElement) driver.findElement(By.id("android:id/list"));
			
			//com.android.contacts:id/contacts_list_view
			MobileElement trgtcontact = ((AndroidElement) contactList)
					.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
							+ "new UiSelector().text(\""+searchContact+"\"));");
			trgtcontact.click();

			Thread.sleep(30000);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	
	
}

