package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoMyreactionsPage;
import com.younited.qa.util.TestUtil;

public class UlogoMyreactionsPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMyreactionsPage uLogoMyreactionsPage;
	TestUtil testUtil;
	
	public UlogoMyreactionsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoMyreactionsPage=new UlogoMyreactionsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitEight();
		homePageAdmin.clickMyReactionsTab();
		testUtil.testWaitEight();
		
		
	}
	
	@Test
	public void uLogoMyreactionsPageTest()throws Exception {
		//uLogoMyreactionsPage.clickSuggestedResponses();
		//testUtil.testWaitEight();
		//uLogoMyreactionsPage.clickViewAssignment();
		//testUtil.testWaitFourteen();
		//uLogoMyreactionsPage.clickResponseHistory();
		//testUtil.testWaitEight();
		uLogoMyreactionsPage.clickMyReactionsLogo();
		testUtil.testWaitTwo();
		uLogoMyreactionsPage.clickCheckBox();
		testUtil.testWaitTwo();
		uLogoMyreactionsPage.clickStatusDropDown();
		testUtil.testWaitTwo();
		uLogoMyreactionsPage.selectStatusDropDown();
		testUtil.testWaitFour();
		homePageAdmin.clickSignOutLink();
	  	testUtil.testWaitFour();
	  	homePageAdmin.clickSignOutBtn();
	  	testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
