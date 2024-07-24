package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoAllassignmentsPage extends TestBase{
	//Pagefactory OR Object Repository
		@FindBy(id="filter-input")
		WebElement searchCompany;
		
		@FindBy(xpath="//button[@class='btn btn-secondary btn-primary common-reset-button']")
		WebElement resetBtn;
		
		@FindBy(xpath="//label[@class='ml-5 pl-3 mt-2']")
		WebElement exactSearch;
		
		@FindBy(xpath="//div[3]//div[1]//select[1]")
		WebElement clickStatusDropDown;
		
		@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[2]")
		WebElement selectStatus;
		
		@FindBy(xpath="//*[@id=\"initial-sort-select\"]/option[1]")
		WebElement resetStatusDropDown;
		
		@FindBy(xpath="//div[@class='multiselect__select']")
		WebElement clickSelectFilterDropDown;
		
		@FindBy(xpath="//span[contains(text(),'Werk- en denkniveau')]")
		WebElement selectFilterDropDown;
		
		//Initialization
		public UlogoAllassignmentsPage() {
			PageFactory.initElements(Driver, this);
		}
		
		//Actions
		public void enterSearchCompany(String value) {
			searchCompany.sendKeys(value);
		}
		
		public void clickResetCompany() {
			resetBtn.click();
		}
		
		public void clickExactSearch() {
			exactSearch.click();
		}
		
		public void clickStatusDropDown() {
			clickStatusDropDown.click();
		}
		
		public void selectStatusDropDown() {
			selectStatus.click();
		}
		
		public void clickResetStatusDropDown() {
			resetStatusDropDown.click();
		}
		
		public void clickFilterDropDown() {
			clickSelectFilterDropDown.click();
		}
		
		public void selectFilterDropDown() {
			selectFilterDropDown.click();
		}

}
