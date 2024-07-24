package com.younited.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoMycompanyPage extends TestBase{
	//Pagefactory OR Object Repository
			@FindBy(xpath="//*[@id=\"my-companies\"]/div/div[1]/a")
			WebElement addNewCompany;
			
			@FindBy(id="bedrijfsnaam")
			WebElement enterCompanyName;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/div/div/form/div[1]/div[2]/div/div[2]/a/div[2]/span/span")
			WebElement companyNameTooltip;
			
			@FindBy(xpath="//select[@id='totaal_aantal_medewerkers']")
			WebElement employeeDropDown;
			
			@FindBy(xpath="//option[@id='51-100']")
			WebElement selectEmployee;
			
			@FindBy(xpath="//div[@class='multiselect__select']")
			WebElement sectorDropDown;
			
			@FindBy(xpath="//*[@id=\"sector-1\"]/span/span")
			WebElement selectSector;
			
			@FindBy(id="organisatie.websitelink")
			WebElement enterWebsite;
			
			@FindBy(xpath="//button[@class='btn btn-primary mr-sm-2 mb-2 mb-sm-0 d-inline-flex justify-content-center align-items-center']")
			WebElement saveBtn;
			
			@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[20]/div/a")
			WebElement cancelBtn;
			
			@FindBy(xpath="//span[text()='remove_circle_outline']")
			WebElement clickDeleteCompanySign;
			
			@FindBy(xpath="//*[@id=\"remove_company\"]/div/div/div[3]/button[1]")
			WebElement clickDeleteCompany;
			
			@FindBy(xpath="//button[@title='Nee, annuleren']")
			WebElement cancelDelete;
			
			//Initialization
			public UlogoMycompanyPage() {
				PageFactory.initElements(Driver, this);
			}
			
			//Action
			public void clickAddNewCompany() {
				addNewCompany.click();
			}
			
			public void enterCompanyName(String value) {
				enterCompanyName.sendKeys(value);
			}
			
			public void clickCompanyNameTooltip() {
				//companyNameTooltip.click();
				enterCompanyName.sendKeys(Keys.TAB);
			}
			
			public void clickEmployeeDropDown() {
				employeeDropDown.click();
			}
			
			public void selectEmployee() {
				selectEmployee.click();
			}
			
			public void clickSectorDropDown() {
				sectorDropDown.click();
			}
			
			public void selectSector() {
				selectSector.click();
			}
			
			public void clearWebsiteField() {
				enterWebsite.clear();
			}
			
			public void enterWebsiteUrl(String value) {
				enterWebsite.sendKeys(value);
			}
			
			public void clickSaveBtn() {
				saveBtn.click();
			}
			
			public void clickCancelBtn() {
				cancelBtn.click();
			}
			
			public void clickDeleteCompanySign() {
				clickDeleteCompanySign.click();
			}
			
			public void clickDeleteCompany() {
				clickDeleteCompany.click();
			}
			
			public void clickCancelDelete() {
				cancelDelete.click();
			}

}
