package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class AssignmentsPageFree extends TestBase{
	//Page factory OR Object Repository
	@FindBy(xpath="/html/body/div[1]/main/div/nav/div[1]/div[1]/div[1]/input")
	WebElement enterValue;
		
	@FindBy(xpath="/html/body/div[1]/main/div/nav/div[1]/div[1]/div[2]/a[1]/div[2]/div/div[1]/span/span")
	WebElement selectValue;
		
	@FindBy(xpath="//*[@id=\"filter\"]/div[1]/div[2]/span")
	WebElement clearFilter;
	
	@FindBy(id="dropdown-sector")
	WebElement sector;
		
	@FindBy(xpath="//*[@id=\"dropdown-sector\"]/div/form/div[3]/label")
	WebElement selectSector;
		
	@FindBy(xpath="//*[@id=\"dropdown-vakgebied\"]/button")
	WebElement discipline;
		
	@FindBy(xpath="//*[@id=\"dropdown-vakgebied\"]/div/form/div[8]/label")
	WebElement selectDescipline;
		
	@FindBy(id="dropdown-skills-btn")
	WebElement skill;
		
	@FindBy(xpath="/html/body/div[1]/main/div/nav/div[2]/div/div[1]/div[3]/div/form/div[1]/div[1]/div/div[1]/input")
	WebElement enterSkill;
		
	@FindBy(xpath="/html/body/div[1]/main/div/nav/div[2]/div/div[1]/div[3]/div/form/div[1]/div[1]/div/div[2]/a/div[2]")
	WebElement selectSkillToolTip;
		
	@FindBy(xpath="//*[@id=\"dropdown-skills\"]/div/form/div[5]/button")
	WebElement applySkillFilter;
		
	@FindBy(linkText="Filters wissen")
	WebElement resetSkillFilter;
		
	@FindBy(linkText="Annuleren")
	WebElement cancelSkill;
		
	@FindBy(xpath="//*[@id=\"dropdown-assignment-type\"]/button")
	WebElement duration;
		
	@FindBy(xpath="//*[@id=\"dropdown-assignment-type\"]/div/form/div[3]/label")
	WebElement selectDuration;
		
	@FindBy(xpath="//*[@id=\"dropdown-werkendenkniveau\"]/button")
	WebElement workAndThinkingLevel;
		
	@FindBy(xpath="//*[@id=\"dropdown-werkendenkniveau\"]/div/form/div[4]/label")
	WebElement selectWorkAndThinkingLevel;
		
	@FindBy(id="dropdown-uren-btn")
	WebElement hours;
		
	@FindBy(xpath="//*[@id=\"dropdown-uren\"]/div/form/div[1]/div/div[2]/div[2]/div[1]")
	WebElement selectHours;
		
	@FindBy(id="dropdown-uren-apply")
	WebElement applyHoursFilter;
		
	@FindBy(id="dropdown-uren-reset")
	WebElement resetHoursFilter;
	//
	@FindBy(id="dropdown-uren-cancel")
	WebElement cancelHours;
	
	@FindBy(id="dropdown-uurtarief-btn")
	WebElement hourlyRate;
		
	@FindBy(xpath="//*[@id=\"dropdown-uurtarief\"]/div/form/div[1]/div/div[2]/div[4]/div[1]")
	WebElement selectHourlyRate;
		
	@FindBy(id="dropdown-uurtarief-apply")
	WebElement applyHourlyRateFilter;
		
	@FindBy(id="dropdown-uurtarief-reset")
	WebElement resetHourlyRateFilter;	
	//
	@FindBy(id="dropdown-uurtarief-cancel")
	WebElement cancelHourlyRate;
	
	@FindBy(xpath="//*[@id=\"custom-location-and-distance-location\"]/span")
	WebElement location;
		
	@FindBy(id="map")
	WebElement enterLocation;
		
	@FindBy(id="dropdown-location-and-distance-apply")
	WebElement applyLocationFilter;
		
	@FindBy(id="dropdown-location-and-distance-reset")
	WebElement resetLocation;
	//
	@FindBy(id="dropdown-location-and-distance-cancel")
	WebElement cancelLocation;
	
	@FindBy(xpath="//*[@id=\"toggle-bookmark\"]/button")
	WebElement viewMatches;
		
	@FindBy(xpath="//*[@id=\"toggle-saved\"]/button")
	WebElement favorites;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div[3]/select")
	WebElement sorting;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div[3]/select/option[1]")
	WebElement publicationDateNewFirst;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div[3]/select/option[2]")
	WebElement publicationDateOldFirst;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div[3]/select/option[3]")
	WebElement atHourlyRate;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div[3]/select/option[4]")
	WebElement byNumberOfHours;
	
		
	//Initialization
	public AssignmentsPageFree() {
		PageFactory.initElements(Driver, this);
	}
		
	//Actions
	public String assignmentsPageTitle() {
		return Driver.getTitle();
	}
	
	public void enterAssignmentsName(String value) {
		enterValue.sendKeys(value);
	}
	
	public void selectAssignmentsValue() {
		selectValue.click();
	}
	
	public void clearAssignmentsFilter() {
		clearFilter.click();
	}
	
	public void clickSectorTab() {
		sector.click();
	}
		
	public void selectSector() {
		selectSector.click();
	}
		
	public void clickDescipline() {
		discipline.click();
	}
		
	public void selectDescipline() {
		selectDescipline.click();
	}
		
	public void clickSkillTab() {
		skill.click();
	}
		
	public void enterSkill() {
		enterSkill.click();	
		//enterSkill.sendKeys(Keys.TAB);
	}
	
	public void enterSkillValue(String value) {
		enterSkill.sendKeys(value);
	}
		
	public void selectSkillToolTip() {
		selectSkillToolTip.click();
	}
		
	public void applySkillFilter() {
		applySkillFilter.click();
	}
		
	public void clickClearFilterSkill() {
		resetSkillFilter.click();
	}
		
	public void clickCancelSkill() {
		cancelSkill.click();
	}
		
	public void clickDuration() {
		duration.click();
	}
		
	public void selectDuration() {
		selectDuration.click();
	}
		
	public void clickWorkAndThinkingLevel() {
		workAndThinkingLevel.click();
	}
		
	public void selectWorkAndThinkingLevel() {
		selectWorkAndThinkingLevel.click();
	}
		
	public void clickHoursTab() {
		hours.click();
	}
	public void selectHours() {
		selectHours.click();
	}
		
	public void applyHoursFilter() {
		applyHoursFilter.click();
	}
		
	public void resetHoursFilter() {
		resetHoursFilter.click();
	}
	//
	public void clickCancelHours() {
		cancelHours.click();
	}
		
	public void clickHourlyRateTab() {
		hourlyRate.click();
	}
		
	public void selectHourlyRate() {
		selectHourlyRate.click();
	}
		
	public void applyHourlyRateFilter() {
		applyHourlyRateFilter.click();
	}
		
	public void resetHourlyRateFilter() {
		resetHourlyRateFilter.click();
	}
	//
	public void clickCancelHourlyRate() {
		cancelHourlyRate.click();
	}
		
	public void clickLocationTab() {
		location.click();
	}
	
	public void locationRemove() {
		enterLocation.clear();
	}
		
	public void enterLocation(String value) {
		enterLocation.sendKeys(value);
	}
		
	public void applyLocationFilter() {
		applyLocationFilter.click();
	}
		
	public void resetLocation() {
		resetLocation.click();
	}
	//
	public void clickCancelLocation() {
		cancelLocation.click();
	}
		
	public void clickViewMatches() {
		viewMatches.click();
	}
		
	public void clickFavorites() {
		favorites.click();
	}
	
	public void clickSortingDropDown() {
		sorting.click();
	}
	
	public void selectPublicationDateNewFirst() {
		publicationDateNewFirst.click();
	}
	
	public void selectPublicationDateOldFirst() {
		publicationDateOldFirst.click();
	}
	
	public void selectAtHourlyRate() {
		atHourlyRate.click();
	}
	
	public void selectByNumberOfHours() {
		byNumberOfHours.click();
	}

}
