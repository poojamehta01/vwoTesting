package com.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import io.qameta.allure.Attachment;

public class ListenersUtils extends DriverUtils implements ITestListener {
	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();

	}

//	//@Attachment(value = "page screenshot", type = "image/png")
//	public byte[] saveScreenshotPNG(WebDriver driver) {
//		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	}
//
//	//@Attachment(value = "{0}", type = "text/plain")
//	public static String saveTextLog(String message) {
//		return message;
//	}
//
//	@SuppressWarnings("static-access")
//	@Override
//	//public void onTestSuccess(ITestResult iTestResult) {
//		// TODO Auto-generated method stub
//		Object testClass = iTestResult.getInstance();
//		WebDriver driver = ((DriverUtils) testClass).getDriver();
//
//		if (driver instanceof WebDriver) {
//			saveScreenshotPNG(driver);
//		}
//		saveTextLog(getTestMethodName(iTestResult));
//	}
//
//	@Override
//	public void onTestFailure(ITestResult iTestResult) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void onTestStart(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//		
//	}
}
