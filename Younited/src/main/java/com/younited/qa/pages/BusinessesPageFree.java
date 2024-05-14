package com.younited.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class BusinessesPageFree extends TestBase{
	//PageFactory OR Object Repository
    @FindBy(id="company-search")
    WebElement filterValue;
    
    @FindBy(xpath="/html/body/div[1]/main/div/nav/div[1]/div[1]/div[2]/a[2]/div[2]/div/span")
    WebElement filterValueTooltip;
    
    @FindBy(xpath="//*[@id=\"filter\"]/div[1]/div[2]/span")
    WebElement removeFilter;

	@FindBy(xpath="//*[@id=\"dropdown-sector\"]/button")
	WebElement sectorDropDown;
	
	@FindBy(xpath="//*[@id=\"dropdown-sector\"]/div/form/div[3]/label")
	WebElement selectSector;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select")
	WebElement sortingDropDown;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[1]")
	WebElement sortingAtoZ;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[2]")
	WebElement sortingZtoA;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[3]")
	WebElement locationAtoZ;
	
	@FindBy(xpath="//*[@id=\"assignment-sorting\"]/div/select/option[4]")
	WebElement locationZtoA;
	
	//Initialization
	public BusinessesPageFree() {
		PageFactory.initElements(Driver, this);
	}
	
	//Actions
	public void filterValue(String value) {
		filterValue.sendKeys(value);
	}
	
	public void filterValueTooltip() {
		//filterValueTooltip.click();
		filterValue.sendKeys(Keys.TAB);
	}
	
	public void removeFilter() {
		removeFilter.click();
	}
	
	public void clickSector() {
		sectorDropDown.click();
	}
	
	public void selectSector() {
		selectSector.click();
	}
	
	public void clickSortingDropDown() {
		sortingDropDown.click();
	}
	
	public void sortingZtoA() {
		sortingZtoA.click();
	}
	
	public void sortingLocationAtoZ() {
		locationAtoZ.click();
	}
	
	public void sortingLocationZtoA() {
		locationZtoA.click();
	}
	
	public void sortingAtoZ() {
		sortingAtoZ.click();
	}

}
