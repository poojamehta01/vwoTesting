package com.automation.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.ConfigUtils.loadProperties;

/**
 * DriverUtils: Utility methods for invoking webdriver instance and performing
 * operations on selenium webdriver Available Utils : initDiver(), getDriver(),
 * tearDown()
 */
public class DriverUtils extends LogUtils {
	static WebDriver driver;

	public static void initDriver() {
		Log.debug("Initializing the webDrvier");
		loadProperties();
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().deleteAllCookies();
		// driver.get("chrome://settings/clearBrowserData");
		driver.manage().window().maximize();
		driver.get(getPropertyByKey("application.url"));
	}

	public static WebDriver getDriver() {

		if (driver == null) {
			initDriver();
		}
		return driver;
	}

	public static void tearDown() {
		Log.debug("Closing the webDrvier");
		driver.quit();
		driver = null;
	}

	public static void alert() {

		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
		Log.debug("User clicks ok");
	}

	public static void switchWindow() {
		Log.debug("performing windwow switch");
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);

		}

	}

	public static void switchFrame(WebElement element) {
		Log.debug("performing frame switch");
		driver.switchTo().frame(element);

	}

	public static void switchDefaultFrame() {
		Log.debug("performing frame switch");
		driver.switchTo().defaultContent();

	}

	public static void highlight(WebElement element) {
		Log.debug("performing active element switch");
		driver.switchTo().activeElement();

	}
}