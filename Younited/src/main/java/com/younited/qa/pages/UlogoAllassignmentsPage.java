package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoAllassignmentsPage extends TestBase{
	//Pagefactory OR Object Repository
			@FindBy(id="filter-input")
			WebElement searchCompany;
			
			@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[2]/div/div/button")
			WebElement resetBtn;
			
			@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[3]/div/label")
			WebElement exactSearch;
			
			@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[4]/div/div[1]")
			WebElement clickSelectFilterDropDown;
			
			@FindBy(xpath="//*[@id=\"null-2\"]/span/span")
			WebElement selectFilterDropDown;
			
			@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[5]/div/div/div/div[1]")
			WebElement clickStatusDropDown;
			
			@FindBy(xpath="//*[@id=\"filter_opdracht-status-1\"]/span/span")
			WebElement selectStatus;
			
			
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
			
			public void clickFilterDropDown() {
				clickSelectFilterDropDown.click();
			}
			
			public void selectFilterDropDown() {
				selectFilterDropDown.click();
			}
			
			public void clickStatusDropDown() {
				clickStatusDropDown.click();
			}
			
			public void selectStatusDropDown() {
				selectStatus.click();
			}

}
