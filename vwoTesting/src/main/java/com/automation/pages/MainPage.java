package com.automation.pages;

import static com.automation.utils.LogUtils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utils.AssertionUtils.*;
import static com.automation.utils.CommonUtils.*;
import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.DriverUtils.*;

//import io.qameta.allure.Step;

public class MainPage {

	public MainPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// @FindBy(xpath = "//span[text()='Element List']")
	// @FindBy(xpath = "//div[@id='option-section']//div[6]")
	@FindBy(xpath = "//div[@type='5']")
	private WebElement elementList;
	@FindBy(xpath = "//td[text()='Try VWO For Free']")
	private WebElement tryFreeEL;
	@FindBy(xpath = "//button[text()='Try VWO For Free']")
	private WebElement tryFreeButton;
	@FindBy(xpath = "//iframe[@id='heatmap-iframe']")
	private WebElement heatFrame;
	@FindBy(xpath = "//iframe[@id='element-list-iframe']")
	private WebElement elementListframe;

	//@Step("verify User O nMainPage")
	public void verifyUserOnMainPage() {

		assertPageTitle(getPropertyByKey("MainPage.title"));
		Log.debug("Main Page Title found");
	}

	//@Step("switching to Heatmap Frame")
	public void switchtoHeatmapFrame() {
		Log.debug("switching to Heatmap Frame");
		switchFrame(heatFrame);

	}

	//@Step("switching to elementList Frame")
	public void switchtoElemetListFrame() {
		switchDefaultFrame();
		Log.debug("switching to elementList Frame");
		switchFrame(elementListframe);

	}

	//@Step("Clicks on elementList")
	public void clicksOnElementList() throws InterruptedException {
		// TODO Auto-generated method stub

		// assertPresent(elementList);

		clickOnElement(elementList);
		Log.debug("Clicks on elementList");

	}

	//@Step("Clicks on tryFreeEL in Element List")
	public void clicksOntryFreeEL() {
		// assertPresent(tryFreeEL);
		clickOnElement(tryFreeEL);
		Log.debug("Clicks on tryFreeEL in Element List");

	}

	//@Step("Verify button is highlighted")
	public void highlightTryFree() throws InterruptedException {
		switchDefaultFrame();
		highlight(tryFreeButton);
		assertPresent(tryFreeButton);
	}

}
