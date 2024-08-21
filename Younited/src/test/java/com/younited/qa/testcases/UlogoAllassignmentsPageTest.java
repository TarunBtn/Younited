package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoAllassignmentsPage;
import com.younited.qa.util.TestUtil;

public class UlogoAllassignmentsPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoAllassignmentsPage uLogoAllassignmentsPage;
	TestUtil testUtil;
	
	public UlogoAllassignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoAllassignmentsPage=new UlogoAllassignmentsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		  //homePageAdmin.clickAcceptAllCookies();
		  //testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitEight();
		homePageAdmin.clickAllassignmentsTab();
		testUtil.testWaitEight();
		  //homePageAdmin.moveHoverTologoImage();
		  //testUtil.testWaitFour();
		
	}
	
	@Test
	public void UlogoAllassignmentsPage()throws Exception {
		uLogoAllassignmentsPage.enterSearchCompany("QA EngineerEight");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		  //uLogoAllassignmentsPage.clickExactSearch();
		  //testUtil.testWaitFour();
		  //uLogoAllassignmentsPage.clickExactSearch();
		  //testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickResetCompany();
		testUtil.testWaitEight();
		uLogoAllassignmentsPage.clickStatusDropDown();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.selectStatusDropDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoAllassignmentsPage.clickStatusDropDown();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickResetStatusDropDown();
		testUtil.testWaitEight();
		uLogoAllassignmentsPage.clickFilterDropDown();
		testUtil.testWaitTwo();
		uLogoAllassignmentsPage.selectFilterDropDown();
		testUtil.testWaitEight();
		  //uLogoAllassignmentsPage.clickFilterDropDown();
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
