package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoUsermanagementPage extends TestBase{
	//Pagefactory OR Object Repository
			@FindBy(xpath="(//input[@id='filter-input'])[1]")
			WebElement searchName;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/button")
			WebElement resetSearchName;
			
			@FindBy(xpath="(//input[@id='filter-input'])[2]")
			WebElement emailAddress;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/div/button")
			WebElement resetEmailAddress;
			
			@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div/div[1]/div[3]/div/label")
			WebElement exactSearch;
			
			@FindBy(id="initial-sort-select")
			WebElement clickRoleDropDown;
			
			@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[2]")
			WebElement selectRole;
			
			@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[1]")
			WebElement resetRole;
			
			@FindBy(xpath="(//select[@id='initial-sort-select'])[2]")
			WebElement clickEverythingDropDown;
			
			@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[1]")
			WebElement selectEverything;
			
			@FindBy(xpath="(//option[@value='true'])[1]")
			WebElement selectOnlyAvailable;
			
			@FindBy(id="dropdown-vakgebied-btn")
			WebElement clickDesciplineDropDown;
			
			@FindBy(xpath="//*[@id=\"dropdown-vakgebied-profile\"]/div/form/div[7]/label")
			WebElement selectDescipline;
			
			@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div/div[2]/div[3]/div/label")
			WebElement elevatorPitch;
			
			@FindBy(id="dropdown-skills-btn")
			WebElement skillsTab;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div/div[1]/div[5]/div/div/form/div[1]/div/div/div[1]/input")
			WebElement enterValueSkills;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div/div[1]/div[5]/div/div/form/div[1]/div/div/div[2]/a/div[2]/span/span")
			WebElement selectTooltipSkills;
			
			@FindBy(xpath="//*[@id=\"dropdown-user-profile\"]/div/form/div[4]/button")
			WebElement clickApplyFilterSkills;
			
			@FindBy(xpath="//*[@id=\"dropdown-user-profile\"]/div/form/div[4]/a[2]")
			WebElement clickResetFilterSkills;
			
			@FindBy(xpath="//*[@id=\"dropdown-user-profile\"]/div/form/div[4]/a[1]")
			WebElement cancelSkills;
			
			
			//Initialization
			public UlogoUsermanagementPage() {
				PageFactory.initElements(Driver, this);
			}
			
			//Actions
			public void enterSearchName(String value) {
				searchName.sendKeys(value);
			}
			
			public void clickResetSearchName() {
				resetSearchName.click();
			}
			
			public void enterEmailAddress(String value) {
				emailAddress.sendKeys(value);
			}
			
			public void clickExactSearch() {
				exactSearch.click();
			}
			
			public void clickResetEmailAddress() {
				resetEmailAddress.click();
			}
			
			public void clickRoleDropDown() {
				clickRoleDropDown.click();
			}
			
			public void selectRole() {
				selectRole.click();
			}
			
			public void selectResetRole() {
				resetRole.click();
			}
			
			public void clickEverythingDropDown() {
				clickEverythingDropDown.click();
			}
			
			public void selectOnlyAvailable() {
				selectOnlyAvailable.click();
			}
			
			public void selectEverything() {
				selectEverything.click();
			}
			
			public void clickDesciplineDropDown() {
				clickDesciplineDropDown.click();
			}
			
			public void selectDescipline() {
				selectDescipline.click();
			}
			
			public void clickElevatorPitch() {
				elevatorPitch.click();
			}
			
			public void clickSkillsTab() {
				skillsTab.click();
			}
			
			public void enterValueSkills(String value) {
				enterValueSkills.sendKeys(value);
			}
			
			public void selectTooltipSkills() {
				selectTooltipSkills.click();
			}
			
			public void clickApplyFilterSkills() {
				clickApplyFilterSkills.click();
			}
			
			public void clickResetFilterSkills() {
				clickResetFilterSkills.click();
			}
			
			public void clickCancelSkills() {
				cancelSkills.click();
			}

}
