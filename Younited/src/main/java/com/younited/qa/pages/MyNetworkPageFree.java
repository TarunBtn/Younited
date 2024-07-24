package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class MyNetworkPageFree extends TestBase{
	//PageFactory Or Object Repository
			@FindBy(xpath="//input[@id='filter-search-input']")
		    WebElement searchValue;
		
		    @FindBy(xpath="//span[@class='material-icons clear-icon']")
		    WebElement cancelSearch;
		    
		    @FindBy(xpath="//button[@class='btn btn-default-outline dropdown-toggle btn-word-break']")
		    WebElement typeMessageDropDown;
		    
		    @FindBy(xpath="//label[@class='form-check-label text-break' and @for='post_type_Hulpvraag']")
		    WebElement selectMessage;
		    
		    @FindBy(xpath="//button[@class='btn btn-default-outline dropdown-toggle']")
		    WebElement areaOfInterestDropDown;
		    
		    @FindBy(xpath="//label[@class='form-check-label text-break' and @for='interessegebieden_Netwerken']")
		    WebElement selectAreaOfInterest;
		    
		    @FindBy(xpath="//div[@id='dropdown-sector']")
		    WebElement sectorDropDown;
		    
		    @FindBy(xpath="//label[@for='sector_Agrarisch / Visserij']")
		    WebElement selectSector;
		    
		    @FindBy(xpath="//div[@id='dropdown-geplaast']")
		    WebElement everyOneDropDown;
		    
		    @FindBy(xpath="//label[@for='Mijn eigen netwerk']")
		    WebElement selectEveryOneMyOwnNetwork;
		    
		    @FindBy(xpath="//label[@for='Iedereen']")
		    WebElement selectEveryOneEveryOne;
		    
		    @FindBy(xpath="//div[@id='toggle-saved']")
		    WebElement favouritesPosts;
		    
		    @FindBy(xpath="//a[@href='/mijn-netwerk' and @class='btn btn-secondary mr-3 inverted-btn-outline']")
		    WebElement myNetworkBtn;
		    
		    @FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[1]")
			WebElement myNetworkTab;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[2]")
			WebElement myRequestsTab;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[3]")
			WebElement suggestionsForYou;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[4]")
			WebElement areaOfInterest;
			
			//Initialization
			public MyNetworkPageFree() {
				PageFactory.initElements(Driver, this);
			}
			
			//Actions
			public void clickSeachValue() {
				searchValue.click();
			}
			
			public void enterSearchValue(String value) {
				searchValue.sendKeys(value);
			}
			
			public void clickCancelSearch() {
				cancelSearch.click();
			}
			
			public void clickTypeMessageDropDown() {
				typeMessageDropDown.click();
			}
			
			public void selectTypeMessage() {
				selectMessage.click();
			}
			
			public void clickAreaOfInterestDropDown() {
				areaOfInterestDropDown.click();
			}
			
			public void selectAreaOfInterest(){
				selectAreaOfInterest.click();
			}
			
			public void clickSectorDropDown() {
				sectorDropDown.click();
			}
			
			public void selectSector() {
				selectSector.click();
			}
			
			public void clickEveryOneDropDown() {
				everyOneDropDown.click();
			}
			
			public void selectEveryOneMyOwnNetwork() {
				selectEveryOneMyOwnNetwork.click();
			}
			
			public void selectEveryOneEveryOne() {
				selectEveryOneEveryOne.click();
			}
			
			public void clickFavoiritesPosts() {
				favouritesPosts.click();
			}
			
			public void clickMyNetworkBtn() {
				myNetworkBtn.click();
			}
			
			public void clickMyNetworkTab() {
				myNetworkTab.click();
			}
			
			public void clickMyRequestsTab() {
				myRequestsTab.click();
			}
			
			public void clickSuggestionsForYouTab() {
				suggestionsForYou.click();
			}
			
			public void clickAreaOfInterest() {
				areaOfInterest.click();
			}

}
