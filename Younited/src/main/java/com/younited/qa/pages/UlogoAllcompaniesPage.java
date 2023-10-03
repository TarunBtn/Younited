package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoAllcompaniesPage extends TestBase{
	//Pagefactory OR Object Repository
			@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[1]/a")
			WebElement addNewCompany;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/div/div/form/div[1]/div[2]/div/div[1]/input")
			WebElement enterCompanyName;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/div/div/form/div[1]/div[2]/div/div[2]/a/div[2]/span/span")
			WebElement selectCompanyTooltip;
			
			@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[7]/div[2]/div/div/div[1]")
			WebElement clickSectorDropDown;
			
			@FindBy(xpath="//*[@id=\"sector-1\"]/span/span")
			WebElement selectSector;
			
			@FindBy(id="websitelink")
			WebElement enterWebsite;
			
			@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[21]/div/button")
			WebElement clickSaveBtn;
			
			@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[21]/div/a")
			WebElement clickCancelBtn;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div[1]/div[2]/select")
			WebElement verifiedCompanyDropDown;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div[1]/div[2]/select/option[1]")
			WebElement allCompany;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div[1]/div[2]/select/option[2]")
			WebElement verifiedCompany;
			
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div/div/div/div/div[1]/div[2]/select/option[3]")
			WebElement notVerifiedCompany;
			
			@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[3]/div/label")
			WebElement searchDeletedCompany;
			
			@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[4]/div/div[1]/label")
			WebElement exactMatch;
			
			@FindBy(id="filter-input")
			WebElement companyNameFilter;
			
			@FindBy(xpath="//*[@id=\"my-companies\"]/div/div/div/div/div[1]/div[4]/div/div[2]/div/button")
			WebElement resetCompany;
			
			@FindBy(xpath="//*[@id=\"data-body\"]/tr[1]/td[1]/a")
			WebElement companyLink;
			
			//Initialization
			public UlogoAllcompaniesPage() {
				PageFactory.initElements(Driver, this);
			}
			
			//Actions
			public void clickAddNewCompany() {
				addNewCompany.click();
			}
			
			public void enterCompanyName(String value) {
				enterCompanyName.sendKeys(value);
			}
			
			public void selectCompanyTooltip() {
				selectCompanyTooltip.click();
			}
			
			public void clickSectorDropDown() {
				clickSectorDropDown.click();
			}
			
			public void selectSectorCompany() {
				selectSector.click();
			}
			
			public void clearWebsiteField() {
				enterWebsite.clear();
			}
			
			public void enterWebsite(String value) {
				enterWebsite.sendKeys(value);
			}
			
			public void clickSaveBtn() {
				clickSaveBtn.click();
			}
			
			public void clickCancelBtn() {
				clickCancelBtn.click();
			}
			
			public void clickVerifiedCompanyDropDown() {
				verifiedCompanyDropDown.click();
			}
			
			public void selectVerifiedCompany() {
				verifiedCompany.click();
			}
			
			public void selectNotVerifiedCompany() {
				notVerifiedCompany.click();
			}
			
			public void selectAllCompany() {
				allCompany.click();
			}
			
			public void clickSearchDeletedCompany() {
				searchDeletedCompany.click();
			}
			
			public void clickExactMatch() {
				exactMatch.click();
			}
			
			public void enterValueCompanyFilter(String value) {
				companyNameFilter.sendKeys(value);
			}
			
			public void clickResetCompanyFilter() {
				resetCompany.click();
			}
			
			public String companyLink() {
				return companyLink.getText();
				
			}

}
