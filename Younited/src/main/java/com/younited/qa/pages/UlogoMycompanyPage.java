package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoMycompanyPage extends TestBase{
	//Pagefactory OR Object Repository
	@FindBy(xpath="//*[@id=\"my-companies\"]/div/div[1]/a")
	WebElement addNewCompany;
	
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/div/div/form/div[1]/div[2]/div/div[1]/input")
	WebElement enterCompanyName;
	
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/div/div/form/div[1]/div[2]/div/div[2]/a/div[2]/span/span")
	WebElement companyNameTooltip;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[7]/div[2]/div/div/div[1]")
	WebElement sectorDropDown;
	
	@FindBy(xpath="//*[@id=\"sector-1\"]/span/span")
	WebElement selectSector;
	
	@FindBy(id="websitelink")
	WebElement enterWebsite;
	
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[21]/div/button")
	WebElement saveBtn;
	
	@FindBy(xpath="//*[@id=\"data-body\"]/tr[1]/td[4]/span/a[2]/span")
	WebElement clickDeleteCompanySign;
	
	@FindBy(xpath="//*[@id=\"remove_company\"]/div/div/div[3]/button[1]")
	WebElement clickDeleteCompany;
	
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
		companyNameTooltip.click();
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
	
	public void clickDeleteCompanySign() {
		clickDeleteCompanySign.click();
	}
	
	public void clickDeleteCompany() {
		clickDeleteCompany.click();
	}

}
