/******
 * POM - PAGE OBJECT MODEL
 * this is a page class
 here i have used xpath to locae the elements 
 OOP CONCEPT USED - ABSTRACTION - i have used this locators in test but we cant see these locators in test, i.e they are hidden
 ABSTRACTION - HIDE implementation of internal details and just show functionality 
 
 all classes are example of encapsulation
 H OOP CONCEPT USED - ENCAPSULATION - data members are declared using @FindBy 
 ie. ALL VARIABLES - PRIVATE, METHODS - PUBLIC
 and intialization of data members is done using constructor to utilize those in methods
 
 LOCATOR Ex - by.id/name/cssSelector/classNam/tagName/xpath
 
 *****/
 

package com.automation.pages;

import static com.automation.utils.LogUtils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import io.qameta.allure.Step;

import static com.automation.utils.AssertionUtils.*;
import static com.automation.utils.CommonUtils.*;
import static com.automation.utils.ConfigUtils.*;
import static com.automation.utils.DriverUtils.*;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//button[text()='View heatmap']")
	private WebElement heatMapButton;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextBox;
	@FindBy(xpath = "//span[text()='Next']/following-sibling::div")
	private WebElement NextButton;

	//@Step("verify User On HomePage")
	public void verifyUserOnHomePage() {
		assertPageTitle(getPropertyByKey("appLoad.title"));
		Log.debug("application launched successfully");
////		assertPresent(heatMapButton);
//		assertPageTitle(getPropertyByKey("HomePage.title"));
//		Log.debug("Home Page Title found");
	}

	//@Step("Clicking on heatMap button")
	public void heatMap() {

		Log.debug("Clicking on heatMap button");

		clickOnElement(heatMapButton);
		Log.debug("Clicked heatMapButton");

	}

	//@Step("Switching to  Main Page")
	public void switchtoMainPage() {

		Log.debug("Switching to  Main Page");

		switchWindow();
		Log.debug("Switched to Main Page");

	}
}
