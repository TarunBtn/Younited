package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class HomePageAdmin extends TestBase{
	//Page factory OR Object repository
			@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a/span")
			WebElement assignmentsTab;
				
			@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
			WebElement communityTab;
				
			@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
			WebElement matchTab;
				
			@FindBy(xpath="//*[@id=\"dashboard\"]/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/button/span")
			WebElement acceptAllCookies;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/div[1]/ul/li[4]/div/button/img")
			WebElement userLogo;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/div[1]/ul/li[4]/div/div/div/div[2]/ul/li[2]/a")
			WebElement myDashboard;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[3]/a")
			WebElement openMenu;
			
			@FindBy(xpath="//*[@id=\"sidebar-right\"]/div/div/button/i")
			WebElement closeMenu;
			
			@FindBy(xpath="//*[@id=\"sidebar-right\"]/div/div/div/a[2]")
			WebElement chatTab;
			
			@FindBy(xpath="//*[@id=\"modal-chat___BV_modal_body_\"]/button")
			WebElement chatClose;
			
			@FindBy(xpath="//*[@id=\"sidebar-right\"]/div/div/div/a[3]")
			WebElement myNotificationsTab;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/div[1]/ul/li[4]/div/div/div/div[1]/a")
			WebElement myProfileTab;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[2]/li/a")
			WebElement myAssignmentsTab;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[1]/a/img[1]")
			WebElement logoImage;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[3]/li/a")
			WebElement myCompanyTab;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[4]/li[1]/a")
			WebElement myReactionsTab;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[5]/li/a")
			WebElement userManagementTab;
			
			@FindBy(xpath="/html/body/div[1]/header/nav/div/div[2]/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[6]/li/a")
			WebElement allCompanies;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[7]/li/a")
			WebElement intermediaryCompany;
			
			@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/div[1]/ul/li[4]/div/div/div/div[2]/ul/span[8]/li/a")
			WebElement allAssignments;
			
				
			//Initialization
			public HomePageAdmin() {
				PageFactory.initElements(Driver, this);
			}
				
			//Actions
			public AssignmentsPageAdmin clickAssignmentsTab() {
				assignmentsTab.click();
				
				return new AssignmentsPageAdmin();
			}
				
			public CommunityPageAdmin clickCommunityPageAdmin() {
				communityTab.click();
				
				return new CommunityPageAdmin();
			}
				
			public MatchPageAdmin clickMatchTab() {
				matchTab.click();
					
				return new MatchPageAdmin();
			}
				
			public void clickAcceptAllCookies() {
				acceptAllCookies.click();
			}
			
			public void clickUserLogo() {
				userLogo.click();
			}
			
			public void clickOpenMenu() {
				openMenu.click();
			}
			
			public void clickCloseMenu() {
				closeMenu.click();
			}
			
			public void clickMydashboardTab() {
				myDashboard.click();
			}
			
			public void clickChatTab() {
				chatTab.click();
			}
			
			public void clickChatCloseSign() {
				chatClose.click();
			}
			
			public void clickMynotificationsTab() {
				myNotificationsTab.click();
			}
			
			public void clickMyProfileTab() {
				myProfileTab.click();
			}
			
			public void clickMyAssignmentsTab() {
				myAssignmentsTab.click();
			}
			
			public void moveHoverTologoImage() {
				Actions builder=new Actions(Driver);
				builder.moveToElement(logoImage).build().perform();
			}
			
			public void clickMyCompanyTab() {
				myCompanyTab.click();
			}
			
			public void clickMyReactionsTab() {
				myReactionsTab.click();
			}
			
			public void clickUserManagementTab() {
				userManagementTab.click();
			}
			
			public void clickAllCompaniesTab() {
				allCompanies.click();			
			}
			
			public void clickIntermediaryCompanyTab() {
				intermediaryCompany.click();
			}
			
			public void clickAllassignmentsTab() {
				allAssignments.click();
			}

}
