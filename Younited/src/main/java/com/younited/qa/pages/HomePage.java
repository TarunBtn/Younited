package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class HomePage extends TestBase{
	//Page factory or Object Repository
	@FindBy(xpath="//*[@id=\"main-nav\"]/nav/div/div[2]/a/img")
	WebElement userNameLabel;
		
	@FindBy(xpath="//img[@class='d-none d-lg-block']")
	WebElement imageLogo;
	
	@FindBy(xpath="//div[@class='multiselect__select']")
	WebElement reactiesDropDown;
		
	@FindBy(xpath="//a[@class='nav-link'][normalize-space()='Mijn opdrachten']")
	WebElement myAssignmentsLink;
		
	@FindBy(xpath="//a[@class='nav-link active']")
	WebElement dashboardLink;
		
	@FindBy(xpath="//a[normalize-space()='Matchen']")
	WebElement matchLink;
		
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div[2]/div[2]/div[1]/button/span")
	WebElement acceptAllCookies;
	
	@FindBy(xpath="//a[@class='user-infoNav-item-link logout']//span[@class='material-icons'][normalize-space()='logout']")
	WebElement signOutLink;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn btn-primary']")
	WebElement signOutBtn;
		
	//Initialization
	public HomePage() {
		PageFactory.initElements(Driver, this);
	}
		
	//Actions
	public String verifyHomePageTitle() {
		return Driver.getTitle();
	}
		
	public boolean verifyImageLogo() {
		return imageLogo.isDisplayed();
	}
	
	public void clickReactiesDropDown() {
		reactiesDropDown.click();
	}
		
	public MatchPage clickMatchLink() {
		matchLink.click();
		return new MatchPage();
	}
		
	public void clickMyAssignmentsLink() {
		myAssignmentsLink.click();
		//return new MyAssignmentsPage();
	}
		
	public void clickAcceptAllCookies() {
		acceptAllCookies.click();
	}
	
	public void clickSignOutLink() {
		signOutLink.click();
	}
	
	public void clickSignOutBtn() {
		signOutBtn.click();
	}

}
