package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class EntrepreneursPageFree extends TestBase{
	//Page factory OR Object Repository
	@FindBy(xpath="//*[@id=\"filter-search-input\"]")
	WebElement findEntrepreneur;
	
	@FindBy(xpath="//*[@id=\"filter\"]/div[1]/div/span")
	WebElement clickCancel;
	
	@FindBy(xpath="//*[@id=\"dropdown-werkdenkniveau\"]/button")
	WebElement workingThinkingLevel;
	
	@FindBy(xpath="//*[@id=\"dropdown-werkdenkniveau\"]/div/form/div[4]/label")
	WebElement selectWorkingThinkingLevel;
	
	@FindBy(xpath="//*[@id=\"dropdown-vakgebied\"]/button")
	WebElement descipline;
	
	@FindBy(xpath="//*[@id=\"dropdown-vakgebied\"]/div/form/div[7]/label")
	WebElement selectDescipline;
	
	@FindBy(xpath="//*[@id=\"dropdown-interessegebied\"]/button")
	WebElement areaOfInterest;
	
	@FindBy(xpath="//*[@id=\"dropdown-interessegebied\"]/div/form/div[8]/label")
	WebElement selectAreaOfInterest;
	
	@FindBy(xpath="//*[@id=\"dropdown-skills-btn\"]")
	WebElement skills;
	
	@FindBy(xpath="/html/body/div[1]/main/div/nav/div[2]/div/div[4]/div/form/div[1]/div/div/div[1]/input")
	WebElement enterSkill;
	
	@FindBy(xpath="//*[@id=\"result-list-31667\"]/a/div[2]/span/span")
	WebElement selectSkill;
	
	@FindBy(xpath="/html/body/div[1]/main/div/nav/div[2]/div/div[4]/div/form/div[1]/div/div/div[2]/a/div[2]/span/span")
	WebElement selectSkillToolTip;
	
	@FindBy(xpath="//*[@id=\"dropdown-skills\"]/div/form/div[4]/button")
	WebElement clickApplyFilter;
	
	@FindBy(xpath="//*[@id=\"dropdown-skills\"]/div/form/div[4]/a[2]")
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
		selectSkillToolTip.click();
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
