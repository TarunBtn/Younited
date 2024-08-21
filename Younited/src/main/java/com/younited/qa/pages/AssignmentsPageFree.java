package com.younited.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class AssignmentsPageFree extends TestBase{
	//Page factory OR Object Repository
			@FindBy(id="assignment-search")
			WebElement enterValue;
				
			@FindBy(xpath="//h5[normalize-space()='Medewerker Assignment Permission Test Done']")
			WebElement assignmentBox;
			
			@FindBy(xpath="//span[@class='d-flex']//span[contains(text(),'QA EngineerEight')]")
			WebElement selectValue;
				
			@FindBy(xpath="//span[@class='material-icons clear-icon']")
			WebElement clearFilter;
			
			@FindBy(xpath="//button[@class='btn btn-default-outline dropdown-toggle filter-not-applied filter-applied-not']")
			WebElement sector;
				
			@FindBy(xpath="//label[@for='Agrarisch / Visserij']")
			WebElement selectSector;
				
			@FindBy(xpath="//div[@id='dropdown-vakgebied']//button[@type='button']")
			WebElement discipline;
				
			@FindBy(xpath="//label[@for='vakgebied_Engineering']")
			WebElement selectDescipline;
				
			@FindBy(id="dropdown-skills-btn")
			WebElement skill;
				
			@FindBy(xpath="//input[@placeholder='Zoek een vaardigheid']")
			WebElement enterSkill;
				
			@FindBy(xpath="//strong[normalize-space()='Postman']")
			WebElement selectSkillToolTip;
				
			@FindBy(xpath="//div[@class='dropdown-menu dropdown-menu-lg-right dropdown-menu-xl-left show']//button[@type='button'][normalize-space()='Filters toepassen']")
			WebElement applySkillFilter;
				
			@FindBy(xpath="//a[normalize-space()='Filters wissen']")
			WebElement resetSkillFilter;
				
			@FindBy(linkText="Annuleren")
			WebElement cancelSkill;
				
			@FindBy(xpath="//div[@id='dropdown-assignment-type']//button[@type='button']")
			WebElement duration;
				
			@FindBy(xpath="//label[@for='3 tot 6 maanden']")
			WebElement selectDuration;
				
			@FindBy(xpath="//div[@id='dropdown-werkendenkniveau']//button[@type='button']")
			WebElement workAndThinkingLevel;
				
			@FindBy(xpath="//label[@for='HAVO']")
			WebElement selectWorkAndThinkingLevel;
				
			@FindBy(id="dropdown-uren-btn")
			WebElement hours;
				
			@FindBy(xpath="//div[@id='dropdown-uren']//div[@class='vue-slider-marks']//div[2]//div[1]")
			WebElement selectHours;
				
			@FindBy(id="dropdown-uren-apply")
			WebElement applyHoursFilter;
				
			@FindBy(id="dropdown-uren-reset")
			WebElement resetHoursFilter;
			
			@FindBy(id="dropdown-uren-cancel")
			WebElement cancelHours;
			
			@FindBy(id="dropdown-uurtarief-btn")
			WebElement hourlyRate;
				
			@FindBy(xpath="//div[@id='dropdown-uurtarief']//div[@class='vue-slider-marks']//div[4]//div[1]")
			WebElement selectHourlyRate;
				
			@FindBy(id="dropdown-uurtarief-apply")
			WebElement applyHourlyRateFilter;
				
			@FindBy(id="dropdown-uurtarief-reset")
			WebElement resetHourlyRateFilter;	
			
			@FindBy(id="dropdown-uurtarief-cancel")
			WebElement cancelHourlyRate;
			
			@FindBy(xpath="//button[@id='dropdown-location']")
			WebElement location;
				
			@FindBy(xpath="//input[@id='map']")
			WebElement enterLocation;
			
			@FindBy(xpath="//div[@class='dropdown-menu show']//div[@class='dropdown-divider']")
			WebElement enterLocationToolTip;
				
			@FindBy(xpath="//button[@id='dropdown-location-and-distance-apply']")
			WebElement applyLocationFilter;
				
			@FindBy(xpath="//button[@id='dropdown-location-and-distance-reset']")
			WebElement resetLocation;
			
			@FindBy(id="dropdown-location-and-distance-cancel")
			WebElement cancelLocation;
			
			@FindBy(xpath="//*[@id=\"toggle-bookmark\"]/button")
			WebElement viewMatches;
				
			@FindBy(xpath="//*[@id=\"toggle-saved\"]/button")
			WebElement favorites;
			
			@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select")
			WebElement sorting;
			
			@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[1]")
			WebElement publicationDateNewFirst;
			
			@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[2]")
			WebElement publicationDateOldFirst;
			
			@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[3]")
			WebElement atHourlyRate;
			
			@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[4]")
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
			
			public void clickAssignmentBox() {
				assignmentBox.click();
			}
			
			public void selectAssignmentsValue() {
				enterValue.sendKeys(Keys.TAB);
		
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
				//selectSkillToolTip.click();
				enterSkill.sendKeys(Keys.TAB);
			}
				
			public void applySkillFilter() {
				applySkillFilter.click();
			}
				
			public void clickResetFilterSkill() {
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
			
			public void enterLocationToolTip() {
				//enterLocation.sendKeys(Keys.TAB);
				enterLocationToolTip.click();
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
