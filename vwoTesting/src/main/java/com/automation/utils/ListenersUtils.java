/****
 * OOPS CONCEPT - Method OVER RIDING
 * here ListenersUtils - subclass has same methods as ITestListener - super class
 * subclass over rides method of parent class without touching source code of parent class ... 
 * parent class does not have any control over the implemenation of subclass
 * applicable only to inherited methods, 
 * overriding method can have diff. return types, cannot have restrictive access modifier
 * final and static methods and constructor cant be overridden 
 */
package com.automation.utils;

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
