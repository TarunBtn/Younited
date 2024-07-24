package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoMyreactionsPage extends TestBase{
	//Page factory OR Object Repository
		@FindBy(xpath="//li[@class='breadcrumb-item active']")
		WebElement myReactionsLogo;
		
		@FindBy(xpath="//span[@class='fs-16']")
		WebElement suggestedResponses;
		
		@FindBy(id="reactions")
		WebElement myRunningReactions;
		
		@FindBy(id="reactionshistory")
		WebElement responseHistory;
		
		@FindBy(xpath="//button[@class='btn btn-secondary btn-sm reacties-sidebar-button close-button']")
		WebElement viewAssignment;
		
		@FindBy(xpath="//input[@class='custom-checkbox']")
		WebElement checkBox;
		
		@FindBy(xpath="//div[@class='multiselect__select']")
		WebElement clickStatusDropDown;
		
		@FindBy(xpath="//span[contains(text(),'Op gesprek')]")
		WebElement selectStatusDropDown;
		
		//Initialization
		public UlogoMyreactionsPage() {
			PageFactory.initElements(Driver, this);
		}
		
		//Actions
		public void clickMyReactionsLogo() {
			myReactionsLogo.click();
		}
		
		public void clickSuggestedResponses() {
			suggestedResponses.click();
		}
		
		public void clickMyRunningReactions() {
			myRunningReactions.click();
		}
		
		public void clickResponseHistory() {
			responseHistory.click();
		}
		
		public void clickViewAssignment() {
			viewAssignment.click();
		}
		
		public void clickCheckBox() {
			checkBox.click();
		}
		
		public void clickStatusDropDown() {
			clickStatusDropDown.click();
		}
		
		public void selectStatusDropDown() {
			selectStatusDropDown.click();
		}

}
