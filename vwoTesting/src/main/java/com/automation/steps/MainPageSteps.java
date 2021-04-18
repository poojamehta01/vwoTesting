package com.automation.steps;

import com.automation.pages.MainPage;
import com.automation.utils.ListenersUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import io.qameta.allure.Description;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Listeners({ ListenersUtils.class })
public class MainPageSteps {
	MainPage mainpage = new MainPage();

	//@Description("Verify mainpage element list functionality-1")
	@Then("^Verify user is on MainPage$")
	public void verify_user_is_on_MainPage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mainpage.verifyUserOnMainPage();
		mainpage.switchtoHeatmapFrame();
	}

	//@Description("Verify mainpage element list functionality-2")
	@Then("^User clicks on elementList$")
	public void user_clicks_on_elementList() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mainpage.verifyUserOnMainPage();
		mainpage.clicksOnElementList();

	}

	@Then("^Verify elementList is open successfully$")
	public void verify_elementList_is_open_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		mainpage.switchtoElemetListFrame();

	}

	@When("^User clicks TryforFree Text$")
	public void user_clicks_TryforFree_Text() throws Throwable {
		mainpage.clicksOntryFreeEL();
	}

	@Then("^Verify TryforFree is highlighted successfully$")
	public void verify_TryforFree_is_highlighted_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mainpage.highlightTryFree();

	}

}
