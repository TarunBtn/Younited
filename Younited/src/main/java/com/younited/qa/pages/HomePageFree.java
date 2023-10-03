package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class HomePageFree extends TestBase{
	//Page factory OR Object repository
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
	WebElement dashboard;
		
	@FindBy(partialLinkText="Opdrachten")
	WebElement assignmentsLink;
		
	@FindBy(xpath="//*[@id=\"dashboard\"]/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/button/span")
	WebElement acceptAllCookies;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/span")
	WebElement networkTab;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/ul/li[1]/a")
	WebElement networkTooltip;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/ul/li[2]/a")
	WebElement storeTooltip;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
	WebElement communityTab;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a")
	WebElement entrepreneurTab;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[7]/a")
	WebElement BusinessesTab;
	
		
	//Initialization
	public HomePageFree() {
		PageFactory.initElements(Driver, this);
	}
		
	//Actions
	public void clickDashboardTab() {
		dashboard.click();
	}
		
	public AssignmentsPageFree clickAssignmentsLink() {
		assignmentsLink.click();
		return new AssignmentsPageFree();
	}
		
	public void clickAcceptAllCookies() {
		acceptAllCookies.click();
	}
	
	public void clickNetworkTab() {
		networkTab.click();
	}
	
	public void clickNetworkTabTooltip() {
		networkTooltip.click();
	}
	
	public StorePageFree clickStoreTooltip() {
		storeTooltip.click();
		return new StorePageFree();
	}
	
	public CommunityPageFree clickCommunityTab() {
		communityTab.click();
		return new CommunityPageFree();
	}
	
	public EntrepreneursPageFree clickEntrepreneurTab() {
		entrepreneurTab.click();
		return new EntrepreneursPageFree();
	}
	
	public void clickBusinessesTab() {
		BusinessesTab.click();
	}

}
