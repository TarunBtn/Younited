package com.younited.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoIntermediarycompaniesPage extends TestBase{
	//Pagefactory OR Object Repository
		@FindBy(xpath="//input[@id='filter-input']")
		WebElement searchCompany;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div[1]/div[2]/div/div/input")
		WebElement cancelSearch;
		
		@FindBy(xpath="//*[@id=\"my-companies\"]/div/div[1]/div[1]/a")
		WebElement addNewCompany;
		
		@FindBy(id="bedrijfsnaam")
		WebElement companyName;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/div/div/form/div[1]/div[2]/div/div[2]/a/div[2]/span/span")
		WebElement selectCompanyTooltip;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[6]/div[2]")
		WebElement aboutYourCompany;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[7]/div[2]/div/div/div[1]")
		WebElement sectorDropDown;
		
		@FindBy(xpath="//*[@id=\"sector-1\"]/span/span")
		WebElement selectSector;
		
		@FindBy(id="organisatie.websitelink")
		WebElement enterWebsite;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[20]/div/button")
		WebElement clickSaveBtn;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[20]/div/a")
		WebElement clickCancelBtn;
		
		@FindBy(xpath="//*[@id=\"data-body\"]/tr[1]/td[4]/span/a[1]/span")
		WebElement clickEditSign;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[19]/div/button")
		WebElement clickEditSaveBtn;
		
		@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[21]/div/a")
		WebElement clickEditCancel;
		
		@FindBy(xpath="//font[text()='remove_circle_outline']")
		WebElement clickDeleteSign;
		
		@FindBy(xpath="//*[@id=\"remove\"]/div/div/div[3]/button[2]")
		WebElement cancelDelete;
		
		@FindBy(xpath="//*[@id=\"remove_company\"]/div/div/div[3]/button[1]")
		WebElement clickDeleteCompany;
		
		//Initialization
		public UlogoIntermediarycompaniesPage() {
			PageFactory.initElements(Driver, this);
		}

		//Actions
		public void enterSearchCompany(String value) {
			searchCompany.sendKeys(value);
		}
		
		public void clickSearchCompany() {
			searchCompany.click();			
		}
		
		public void clickCancelSearch() {	
			cancelSearch.click();	
		}
		
		public void clickAddNewCompany() {
			addNewCompany.click();
		}
		
		public void enterCompanyName(String value) {
			companyName.sendKeys(value);
		}
		
		public void selectCompanyTooltip() {
			//selectCompanyTooltip.click();
			companyName.sendKeys(Keys.TAB);
		}
		
		public void aboutYourCompany(String value) {
			aboutYourCompany.sendKeys(value);
		}
		
		public void clickSectorDropDown() {
			sectorDropDown.click();
		}
		
		public void selectSector() {
			selectSector.click();
		}
			
		public void enterWebsite(String value) {
			enterWebsite.sendKeys(value);
		}
		
		public void clearWebsiteValue() {
			enterWebsite.clear();
		}
		
		public void clickSaveBtn() {
			clickSaveBtn.click();
		}
		
		public void clickCancelBtn() {
			clickCancelBtn.click();
		}
		
		public void clickEditBtn() {
			clickEditSign.click();
		}
		
		public void clearCompanyName(){
			companyName.clear();
		}

		public void clickSaveBtnEdit() {
			clickEditSaveBtn.click();
		}
		
		public void clickEditCancel() {
			clickEditCancel.click();
		}
		
		public void clickCancelDelete() {
			cancelDelete.click();
		}
		
		public void clickDeleteSign() {
			clickDeleteSign.click();
		}
		
		public void clickDeleteCompany() {
			clickDeleteCompany.click();
		}

}
