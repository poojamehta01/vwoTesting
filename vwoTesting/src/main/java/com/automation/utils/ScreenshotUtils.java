package com.automation.utils;
import static com.automation.utils.LogUtils.Log;
import static com.automation.utils.WebElementUtils.*;
import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;


import java.io.IOException;

public class ScreenshotUtils extends DriverUtils {
	public static void getScreenshot() throws IOException {
		Log.info("Take screenshot");
		
		File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\screenShots\\highlight.png"));
		Log.debug("screenshot taken successfully");

	}

}
