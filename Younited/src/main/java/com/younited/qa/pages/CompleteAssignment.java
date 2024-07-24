package com.younited.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.younited.qa.base.TestBase;

public class CompleteAssignment extends TestBase{
	//Page factory or Object Repository
			@FindBy(xpath="//*[@id=\"assignment-add\"]/span[2]/div/span/div[2]/form/div[1]/div[2]/div/div/div[1]")
			WebElement companyDropDown;
			
			@FindBy(xpath="//*[@id=\"opdracht.selected_company-3\"]/span/span")
			WebElement selectCompany;
			
			@FindBy(xpath="//input[@id='opdracht.naamopdracht']")
			WebElement assignmentName;
			
			@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[10]/div[2]/div/div[1]")
			WebElement sectorDropDown;
			
			@FindBy(xpath="//*[@id=\"sector-1\"]/span/span")
			WebElement sectorSelect;
			
			@FindBy(xpath="//div[@data-vv-as='Vakgebied']//div[@class='multiselect__select']")
			WebElement disciplineDropDown;
			
			@FindBy(xpath="//span[contains(text(),'Engineering')]")
			WebElement selectDescipline;
			
			@FindBy(xpath="//input[@id='opdracht.plaatsvanopdracht']")
			WebElement workLocation;
			
			@FindBy(xpath="//*[@id=\"assignment-add\"]/span[2]/div/span/div[2]/form")
			WebElement workLocationTooltip;
			
			@FindBy(xpath="//div[@aria-owns='listbox-opdracht.opleidingsniveau']//div[@class='multiselect__select']")
			WebElement workingThinkingLevel;
			
			@FindBy(xpath="//*[@id=\"opdracht.opleidingsniveau-3\"]/span")
			WebElement selectWorkingThinkingLevel;
			
			@FindBy(xpath="//input[@id='suggestionsForJobTitle']")
			WebElement profile;
			
			@FindBy(xpath="//span[@data-text='Database administrator (m/v/x)']//strong//font//font[contains(text(),'Database')]")
			WebElement profileTooltip;
			
			@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[6]/div[2]/div[1]/div/button[2]")
			WebElement generateDescription;
			
			@FindBy(xpath="//*[@id=\"chatGPT-module___BV_modal_body_\"]/div[2]/div[3]/div/div[2]/div")
			WebElement useThisText;
			
			@FindBy(xpath="/html/body/div[8]/div[1]/div/div/div/div[2]/div[3]/div/div[2]/div")
			WebElement useThisTextOne;
			
			@FindBy(xpath="//div[@id='opdracht.startdatumopdracht']//div//div[@class='dp__input_wrap']//div//*[name()='svg']")
			WebElement clickStartDateDropDown;
			
			@FindBy(xpath="//*[@id=\"assignment\"]/div[7]/div/div/div/div[1]/button[4]/i")
			WebElement selectStartYear;
			
			@FindBy(xpath="/html/body/div[1]/div/div[1]/span[2]/div/span/form/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div[5]/div[3]/div")
			WebElement selectStartDate;
			
			@FindBy(xpath="/html/body/div[1]/div/div[1]/span[2]/div/span/form/div[2]/div[2]/div/div[1]/div/div/div/input")
			WebElement endDateDropDown;
			
			@FindBy(xpath="//*[@id=\"assignment\"]/div[7]/div/div/div/div[1]/button[3]/i")
			WebElement selectEndYear;
			
			@FindBy(xpath="/html/body/div[1]/div/div[1]/span[2]/div/span/form/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div[5]/div[4]/div")
			WebElement selectEndDate;
			
			@FindBy(xpath="//*[@id=\"aantaluurperweek\"]/div/div[2]/div[2]/div[1]")
			WebElement numberOfHours;
			
			@FindBy(xpath="//*[@id=\"uurtarief\"]/div/div[4]/div[1]")
			WebElement hourlyRateFromTo;
			
			@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[24]/div/button[2]")
			WebElement clickSaveButton;
			
			@FindBy(xpath="//button[@class='btn btn-secondary btn-sm btn btn-primary next-btn']")
			WebElement nextBtn;
			
			@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[20]/div[2]/div/div/div[1]")
			WebElement clickFieldOfExpertise;
				
			@FindBy(xpath="//*[@id=\"vakgebied-6\"]/span/span")
			WebElement selectFieldOfExpertise;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/form/span[3]/div[2]/div/div[2]/div[1]/input")
			WebElement skillsField;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/form/span[3]/div[2]/div/div[2]/div[2]/a[1]/div[2]/span/span")
			WebElement skillsFieldToolTip;
			
			@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/span[3]/div[2]/div/form/div/div/div[2]/div[1]/label")
			WebElement unSelectSkillsOne;
			
			@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/span[3]/div[2]/div/form/div/div/div[2]/div[2]/label")
			WebElement unSelectSkillsTwo;
			
			@FindBy(xpath="/html/body/div[1]/div/div[1]/span[2]/div/span/div[2]/form/div[4]/div[2]/div/span[2]/div/div/div/input")
			WebElement clickVisibleDateTo;
			
			@FindBy(xpath="/html/body/div[1]/div/div[1]/span[2]/div/span/div[2]/form/div[4]/div[2]/div/span[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div[5]/div[4]/div")
			WebElement selectVisibleDateTo;
			
			//Initialization
			public CompleteAssignment(){
				PageFactory.initElements(Driver, this);
			}
			
			//Actions
			public void clickCompanyDropDown() {
				companyDropDown.click();		
			}
			
			public void selectCompany() {
				selectCompany.click();
			}
			
			public void assignmentName(String value) {
				assignmentName.sendKeys(value);		
			}
			
			public void clickSectorDropDown() {
				sectorDropDown.click();
			}
			
			public void selectSectorFromDropDown() {
				sectorSelect.click();
			}
			
			public void clickDesciplineDropDown() {
				disciplineDropDown.click();
			}
			
			public void selectDescipline() {
				selectDescipline.click();
			}
			
			public void clickWorkLocation() {
				workLocation.click();
			}
			
			public void selectWorkLocation(String value) {
				workLocation.sendKeys(value);		
			}
			
			public void clickWorkLocationTooltip() {
				//workLocationTooltip.click();
			    //Actions builder=new Actions(Driver);
			    //builder.moveToElement(workLocationTooltip).build().perform();
				workLocation.sendKeys(Keys.TAB);
				
			}
			
			public void clickProfileField() {
				profile.click();
			}
			
			public void enterProfile(String value) {
				profile.sendKeys(value);
			}
			
			public void clickProfileTooltip() {
				//profileTooltip.click();
				profile.sendKeys(Keys.TAB);
			}
			
			public void clickGenerateDescription() {
				generateDescription.click();
			}
			
			public void clickUseThisText() {
				useThisText.click();
			}
			
			public void clickUseThisTextOne() {
				useThisTextOne.click();
			}
			
			public void clickStartDateDropDown() {
				clickStartDateDropDown.click();			
			}
			
			public void selectStartYear() {
				selectStartYear.click();
			}
			
			public void selectStartDate() {
				selectStartDate.click();
			} 
			
			public void clickEndDateDropDown() {
				endDateDropDown.click();
			}
			
			public void selectEndYear() {
				selectEndYear.click();
			}
			
			public void selectEndDate() {
				selectEndDate.click();
			}
			
			public void selectNumberOfHours() {
				numberOfHours.click();
			}
			
			public void selectHourlyRateFromTo() {
				hourlyRateFromTo.click();
			}
			
			public void clickWorkingThinkingLevel() {
				workingThinkingLevel.click();
			}
			
			public void selectWorkingThinkingLevel() {
				selectWorkingThinkingLevel.click();
			}
			
			public void clickSaveButton() {
				clickSaveButton.click();
			}
			
			public void clickNextButton() {
				nextBtn.click();
			}
			
			public void clickFieldOfExpertise() {
				clickFieldOfExpertise.click();
			}
			
			public void selectFieldOfExpertise() {
				selectFieldOfExpertise.click();	
			}
			
			public void clickSkillsField() {
				skillsField.click();
			}
			
			public void enterSkills(String value) {
				skillsField.sendKeys(value);
			}
			
			public void skillsToolTip() {
				skillsFieldToolTip.click();
			}
			
			public void unSelectSkillsOne() {
				unSelectSkillsOne.click();
			}
			
			public void unSelectSkillsTwo() {
				unSelectSkillsTwo.click();
			}
			
			public void clickVisibleDateTo() {
				clickVisibleDateTo.click();
			}
			
			public void selectVisibleDateTo() {
				selectVisibleDateTo.click();
			}
}
