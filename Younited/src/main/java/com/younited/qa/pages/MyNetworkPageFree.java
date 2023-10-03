package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class MyNetworkPageFree extends TestBase{
	//PageFactory Or Object Repository
	@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[1]")
	WebElement myNetworkTab;
	
	@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[2]")
	WebElement myRequestsTab;
	
	@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[3]")
	WebElement suggestionsForYou;
	
	@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[4]")
	WebElement areaOfInterest;
	
	//Initialization
	public MyNetworkPageFree() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void clickMyNetworkTab() {
		myNetworkTab.click();
	}
	
	public void clickMyRequestsTab() {
		myRequestsTab.click();
	}
	
	public void clickSuggestionsForYouTab() {
		suggestionsForYou.click();
	}
	
	public void clickAreaOfInterest() {
		areaOfInterest.click();
	}

}
