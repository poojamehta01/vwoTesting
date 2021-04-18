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
