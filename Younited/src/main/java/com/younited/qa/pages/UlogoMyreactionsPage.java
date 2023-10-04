package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoMyreactionsPage extends TestBase{
	//Page factory OR Object Repository
			@FindBy(id="leadconceptreactions")
			WebElement suggestedResponses;
			
			@FindBy(id="reactions")
			WebElement myRunningReactions;
			
			@FindBy(id="reactionshistory")
			WebElement responseHistory;
			
			//Initialization
			public UlogoMyreactionsPage() {
				PageFactory.initElements(Driver, this);
			}
			
			//Actions
			public void clickSuggestedResponses() {
				suggestedResponses.click();
			}
			
			public void clickMyRunningReactions() {
				myRunningReactions.click();
			}
			
			public void clickResponseHistory() {
				responseHistory.click();
			}

}
