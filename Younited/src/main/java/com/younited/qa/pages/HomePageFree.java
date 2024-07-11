package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class HomePageFree extends TestBase{
	//Page factory OR Object repository
			@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
			WebElement dashboard;
				
			@FindBy(xpath="//span[@class='d-flex']")
			WebElement assignmentsLink;
				
			@FindBy(xpath="//button[@data-cookiefirst-button='primary']")
			WebElement acceptAllCookies;
			
			@FindBy(xpath="//span[@class='material-icons-outlined downArraow']")
			WebElement networkTab;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[2]/ul[1]/li[3]/a/ul/li[1]/a")
			WebElement networkTooltip;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div/div[2]/ul[1]/li[3]/a/ul/li[2]/a")
			WebElement storeTooltip;
			
			@FindBy(xpath="//a[@href='/community']")
			WebElement communityTab;
			
			@FindBy(xpath="//a[@href='/community-volgers']")
			WebElement entrepreneurTab;
			
			@FindBy(xpath="//a[normalize-space()='Bedrijven']")
			WebElement BusinessesTab;
			
			@FindBy(xpath="//img[@class='profile-img']")
			WebElement userLogo;
			
			@FindBy(xpath="//a[@href='/mijn-profiel']")
			WebElement manageProfile;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/a/img[1]")
			WebElement logoImage;
			
			@FindBy(xpath="//*[@id=\"lead-reaction-modal___BV_modal_body_\"]/div[2]/button")
			WebElement suitableAssignments;
			
			@FindBy(xpath="//a[normalize-space()='Mijn bedrijf/bedrijven']")
			WebElement myCompany;
			
			@FindBy(xpath="//a[@class='user-infoNav-item-link logout']//span[@class='material-icons'][normalize-space()='logout']")
			WebElement signOutLink;
			
			@FindBy(xpath="//button[@class='btn btn-primary btn btn-primary']")
			WebElement signOutBtn;
			
				
			//Initialization
			public HomePageFree() {
				PageFactory.initElements(Driver, this);
			}
				
			//Actions
			public void suitableAssignments() {
				suitableAssignments.click();
			}
			
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
			
			public BusinessesPageFree clickBusinessesTab() {
				BusinessesTab.click();
				return new BusinessesPageFree();
			}
			
			public void clickUserLogo() {
				userLogo.click();
			}
			
			public void clickManageProfileTab() {
				manageProfile.click();
			}
			
			public void mouseHoverToLogoImage() {
				Actions builder=new Actions(Driver);
				builder.moveToElement(logoImage).build().perform();
			}
			
			public void clickMyCompanyTab() {
				myCompany.click();
			}
			
			public void clickSignOutLink() {
				signOutLink.click();
			}
			
			public void clickSignOutBtn() {
				signOutBtn.click();
			}

}
