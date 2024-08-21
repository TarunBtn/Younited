package com.younited.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class EntrepreneursPageFree extends TestBase{
	//Page factory OR Object Repository
			@FindBy(xpath="//input[@id='filter-search-input']")
			WebElement findEntrepreneur;
			
			@FindBy(xpath="//span[@class='material-icons clear-icon']")
			WebElement clickCancel;
			
			@FindBy(xpath="//div[@id='dropdown-werkdenkniveau']//button[@type='button']")
			WebElement workingThinkingLevel;
			
			@FindBy(xpath="//label[@for='HAVO']")
			WebElement selectWorkingThinkingLevel;
			
			@FindBy(xpath="//div[@id='dropdown-vakgebied']//button[@type='button']")
			WebElement descipline;
			
			@FindBy(xpath="//label[@for='Engineering']")
			WebElement selectDescipline;
			
			@FindBy(xpath="//div[@id='dropdown-interessegebied']//button[@type='button']")
			WebElement areaOfInterest;
			
			@FindBy(xpath="//label[@for='interessegebied_Sales']")
			WebElement selectAreaOfInterest;
			
			@FindBy(xpath="//button[@id='dropdown-skills-btn']")
			WebElement skills;
			
			@FindBy(xpath="//input[@placeholder='Zoek een vaardigheid']")
			WebElement enterSkill;
			
			@FindBy(xpath="//*[@id=\"result-list-31667\"]/a/div[2]/span/span")
			WebElement selectSkill;
			
			@FindBy(xpath="/html/body/div[1]/main/div/nav/div[2]/div/div[4]/div/form/div[1]/div/div/div[2]/a/div[2]/span/span")
			WebElement selectSkillToolTip;
			
			@FindBy(xpath="//button[normalize-space()='Filters toepassen']")
			WebElement clickApplyFilter;
			
			@FindBy(xpath="//a[normalize-space()='Filters wissen']")
			WebElement clickResetFilter;
			
			@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select")
			WebElement clickSortingDropDown;
			
			@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[3]")
			WebElement selectSortingZtoA;
			
			@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[2]")
			WebElement selectSortingAtoZ;
			
			//Initialization
			public EntrepreneursPageFree() {
				PageFactory.initElements(Driver, this);
			}
			
			//Actions
			public void enterEntrepreneur(String value) {
				findEntrepreneur.sendKeys(value);
			}
			
			public void clickCancel() {
				clickCancel.click();
			}
			
			public void clickWorkingThinkingDropDown() {
				workingThinkingLevel.click();
			}
			
			public void selectWorkingThinkingLevel() {
				selectWorkingThinkingLevel.click();
			}
			
			public void clickDesciplineDropDown() {
				descipline.click();
			}
			
			public void selectDescipline() {
				selectDescipline.click();
			}
			
			public void clickAreaOfInterestDropDown() {
				areaOfInterest.click();
			}
			
			public void selectAreaOfInterest() {
				selectAreaOfInterest.click();
			}
			
			public void clickSkillsTab() {
				skills.click();
			}
			
			public void enterSkill() {
				enterSkill.click();
			}
			
			public void enterSkill(String value) {
				enterSkill.sendKeys(value);
			}
			
			public void selectSkillToolTip() {
				//selectSkillToolTip.click();
				enterSkill.sendKeys(Keys.TAB);
			}
			
			public void clickApplyFilter() {
				clickApplyFilter.click();
			}
			
			public void clickResetFilter() {
				clickResetFilter.click();
			}
			
			public void clickSortingDropDown() {
				clickSortingDropDown.click();
			}
			
			public void selectSortingZtoA() {
				selectSortingZtoA.click();
			}
			
		    public void selectSortingAtoZ() {
				selectSortingAtoZ.click();
			}

}
