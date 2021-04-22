/****
 * selenium webDriver architecture 
 * selenium binding language - JAVA
 * JSON WIRE PROTOCOL
 * HTTP OVER HTTP SERVER - Browser drivers, real Browsers
 * 
 * 
 * screenShot capturing implement in ScreenshotsUtils
 * execution of JavaScript functions implemented in CommonUtils
 * delete browser cookes implemented in DriverUtils
 * capture pageTitle implemented in AssertionUtils
 * ASSERT VS VERIFY - assert if fails execution stops immediatiely but in verify it does not
 * SOFT VS HARD ASSERT - SOFT - error collected and execution continues but in HARD it stops immediately
 * 
 * VERIFCATION POINTS IMPLEMENTED - Check page title
 * check certain text
 * check certain element - button/dropdown
 * check CLick operation
 * check submit operation
 * check navigation from one link to another
 * 
 * WAIT implemented in WebElementUtils - webDriverWAit
 */

package com.automation.steps;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.pages.HomePage;
import com.automation.utils.ListenersUtils;
import cucumber.api.java.en.Given;
//import io.qameta.allure.Description;
@Test
@Listeners({ ListenersUtils.class })

public class HomePageSteps {
	HomePage homepage = new HomePage();

	
	//@Description("Verify hompage heatmap functionality")
	@Given("^User click on the heatMap on HomePage$")
	public void user_click_on_the_heatMap_on_HomePage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homepage.verifyUserOnHomePage();
		homepage.heatMap();
		homepage.switchtoMainPage();

	}
}
