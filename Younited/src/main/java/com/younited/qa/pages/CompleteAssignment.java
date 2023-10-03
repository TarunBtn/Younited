package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.younited.qa.base.TestBase;

public class CompleteAssignment extends TestBase{
	//Page factory or Object Repository
	@FindBy(id="selected_company")
	WebElement companyDropDown;
	
	@FindBy(xpath="//*[@id=\"selected_company\"]/option[2]")
	WebElement selectCompany;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[10]/div[2]/div/div[1]")
	WebElement sectorDropDown;
	
	@FindBy(xpath="//*[@id=\"sector-12\"]/span/span")
	WebElement sectorSelect;
	
	@FindBy(id="werklocatie")
	WebElement workLocation;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[12]/div[2]/div[2]")
	WebElement workLocationTooltip;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[6]/div[2]/div[1]/div/button[2]")
	WebElement generateDescription;
	
	@FindBy(xpath="//*[@id=\"chatGPT-module___BV_modal_body_\"]/div[2]/div[4]/div/div[2]/div")
	WebElement useThisText;
	
	@FindBy(id="startdatumopdracht")
	WebElement clickStartDateDropDown;
	
	@FindBy(xpath="//*[@id=\"assignment\"]/div[5]/div/div/div/div[1]/button[3]/i")
	WebElement selectStartYear;
	
	@FindBy(xpath="//*[@id=\"assignment\"]/div[5]/div/div/div/div[2]/table/tbody/tr[1]/td[7]/div")
	WebElement selectStartDate;
	
	@FindBy(id="einddatumopdracht")
	WebElement endDateDropDown;
	
	@FindBy(xpath="//*[@id=\"assignment\"]/div[5]/div/div/div/div[1]/button[3]/i")
	WebElement selectEndYear;
	
	@FindBy(xpath="//*[@id=\"assignment\"]/div[5]/div/div/div/div[2]/table/tbody/tr[2]/td[1]/div")
	WebElement selectEndDate;
	
	@FindBy(xpath="//*[@id=\"aantaluurperweek\"]/div/div[2]/div[2]/div[1]")
	WebElement numberOfHours;
	
	@FindBy(xpath="//*[@id=\"uurtarief\"]/div/div[4]/div[1]")
	WebElement hourlyRateFromTo;
	
	@FindBy(name="opleidingsniveau")
	WebElement workingThinkingLevel;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[24]/div/button[2]")
	WebElement clickSaveButton;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/div/form/div[20]/div[2]/div/div/div[1]")
	WebElement clickFieldOfExpertise;
		
	@FindBy(xpath="//*[@id=\"vakgebied-6\"]/span/span")
	WebElement selectFieldOfExpertise;
	
	//Initialization
	public CompleteAssignment(){
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void selectCompany() {
		companyDropDown.click();
		selectCompany.click();
	}
	
	public void clickSectorDropDown() {
		sectorDropDown.click();
	}
	
	public void selectSectorFromDropDown() {
		sectorSelect.click();
	}
	
	public void selectWorkLocation() {
		workLocation.sendKeys("Punthorst, Netherlands");		
	}
	
	public void clickWorkLocationTooltip() {
		//workLocationTooltip.click();
	    Actions builder=new Actions(Driver);
	    builder.moveToElement(workLocationTooltip).build().perform();
		
	}
	
	public void clickGenerateDescription() {
		generateDescription.click();
	}
	
	public void clickUseThisText() {
		useThisText.click();
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
	
	public void selectWorkingThinkingLevel() {
		Select oSelect=new Select(workingThinkingLevel);
		oSelect.selectByIndex(4);
	}
	
	public void clickSaveButton() {
		clickSaveButton.click();
	}
	
	public void clickFieldOfExpertise() {
		clickFieldOfExpertise.click();
	}
	
	public void selectFieldOfExpertise() {
		selectFieldOfExpertise.click();
		
	}

}
