package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoAllcompaniesPage;
import com.younited.qa.pages.UlogoIntermediarycompaniesPage;
import com.younited.qa.util.TestUtil;

public class UlogoIntermediarycompaniesPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoAllcompaniesPage uLogoAllcompaniesPage;
	UlogoIntermediarycompaniesPage uLogoIntermediarycompanyPage;
	TestUtil testUtil;
	
	public UlogoIntermediarycompaniesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoAllcompaniesPage=new UlogoAllcompaniesPage();
		uLogoIntermediarycompanyPage=new UlogoIntermediarycompaniesPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEleven();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitTwo();
		homePageAdmin.clickIntermediaryCompanyTab();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		
	}
	
	@Test
	public void UlogoIntermediarycompanyPage()throws Exception {
		uLogoIntermediarycompanyPage.enterSearchCompany("SilverTouch");
		testUtil.testWaitFour();
		//uLogoIntermediarycompanyPage.clickSearchCompany();
		//testUtil.testWaitTwo();
		//uLogoIntermediarycompanyPage.clickCancelSearch();
		//testUtil.testWaitTwo();
		//Add new company
		uLogoIntermediarycompanyPage.clickAddNewCompany();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoIntermediarycompanyPage.enterCompanyName("SilverTouch");
		testUtil.testWaitEight();
		uLogoIntermediarycompanyPage.selectCompanyTooltip();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Enter website
		uLogoIntermediarycompanyPage.clearWebsiteValue();
		testUtil.testWaitTwo();
		uLogoIntermediarycompanyPage.enterWebsite("https://silvertouch.com/");
		testUtil.testWaitTwo();
		//Save company
		uLogoIntermediarycompanyPage.clickSaveBtn();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitEight();
		//Edit company
		uLogoIntermediarycompanyPage.clickEditBtn();
		testUtil.testWaitFour();
		uLogoIntermediarycompanyPage.clearCompanyName();
		testUtil.testWaitTwo();
		uLogoIntermediarycompanyPage.enterCompanyName("One");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Save
		uLogoIntermediarycompanyPage.clickSaveBtnEdit();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Delete Company
		uLogoIntermediarycompanyPage.clickDeleteSign();
		testUtil.testWaitTwo();
		uLogoIntermediarycompanyPage.clickDeleteCompany();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
