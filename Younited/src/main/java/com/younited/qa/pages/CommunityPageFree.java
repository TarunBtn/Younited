package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class CommunityPageFree extends TestBase{
	//Page factory OR Object Repository
	@FindBy(id="filter-search-input")
	WebElement valueFilter;
	
	@FindBy(xpath="//*[@id=\"filter\"]/div[1]/div/span")
	WebElement cancelSign;
	
	@FindBy(id="dropdown-post-type")
	WebElement typeOfMessageDropDown;
	
	@FindBy(xpath="//*[@id='dropdown-post-type']/div/form/div[3]/label")
	WebElement selectTypeOfMessage;
	
	@FindBy(id="dropdown-interesse")
	WebElement areaOfInterestDropDown;
	
	@FindBy(xpath="//*[@id=\"dropdown-interesse\"]/div/form/div[8]/label")
	WebElement selectAreaOfInterestDropDown;
	
	@FindBy(xpath="//*[@id=\"dropdown-sector\"]/button")
	WebElement sectorTab;
	
	@FindBy(xpath="//*[@id=\"dropdown-sector\"]/div/form/div[2]/label")
	WebElement selectSector;
	
	@FindBy(xpath="//*[@id='dropdown-geplaast']/button")
	WebElement clickEveryoneNetwork;
	
	@FindBy(xpath="//*[@id=\"post-zichtbaarheidvanpost\"]/form/div[1]/label")
	WebElement selectOwnNetwork;
	
	@FindBy(xpath="//*[@id=\"post-zichtbaarheidvanpost\"]/form/div[2]/label")
	WebElement selectEveryOne;
	
	@FindBy(xpath="//*[@id=\"toggle-saved\"]/button")
	WebElement favoriteMessage;
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div[2]/a[1]")
	WebElement myNetworkBtn;
	
	
	//Initialization
	public CommunityPageFree () {
		PageFactory.initElements(Driver, this);
	}
	
	//Action
	public void clickValueFilter() {
		valueFilter.click();
	}
	
	public void enterValueFilter(String value) {
		valueFilter.sendKeys(value);
	}
	
	public void clickCancelSign() {
		cancelSign.click();
	}
	
	public void clickTypeOfMessageDropDown() {
		typeOfMessageDropDown.click();
	}
	
	public void selectTypeOfMessage() {
		selectTypeOfMessage.click();
	}
	
	public void clickAreaOfInterestDropDown() {
		areaOfInterestDropDown.click();
	}
	
	public void selectAreaOfInterestDropDown() {
		selectAreaOfInterestDropDown.click();
	}
	
	public void clickSectorTab() {
		sectorTab.click();
	}
	
	public void selectSector() {
		selectSector.click();
	}
	
	public void clickEveryoneDropDown() {
		clickEveryoneNetwork.click();
	}
	
	public void selectMyOwnNetwork() {
		selectOwnNetwork.click();
	}
	
	public void selectEveryoneNetwork() {
		selectEveryOne.click();
	}
	
	public void clickFouriteMessage() {
		favoriteMessage.click();
	}
	
	public MyNetworkPageFree clickMyNetworkBtn() {
		myNetworkBtn.click();
		return new MyNetworkPageFree();
	}

}
