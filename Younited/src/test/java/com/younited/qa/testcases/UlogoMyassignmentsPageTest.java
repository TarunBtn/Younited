package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MyAssignmentsPage;
import com.younited.qa.pages.UlogoMyassignmentsPage;
import com.younited.qa.util.TestUtil;

public class UlogoMyassignmentsPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	MyAssignmentsPage myAssignmentsPage;
	UlogoMyassignmentsPage uLogoMyassignmentsPage;
	TestUtil testUtil;
	
	public UlogoMyassignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myAssignmentsPage=new MyAssignmentsPage();
		uLogoMyassignmentsPage=new UlogoMyassignmentsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickMyAssignmentsTab();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
			
	}
	
	@Test
	public void UlogoMyassignmentsPage()throws Exception {
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitTwo();
		myAssignmentsPage.selectCompanyFromDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickCommentsLink();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		myAssignmentsPage.clickStatusThumbsup();
		testUtil.testWaitEleven();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		myAssignmentsPage.clickPendingTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickEntrepreneurCheckbox();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickEntrepreneurDropDown();
		testUtil.testWaitTwo();
		myAssignmentsPage.selectStatusEntrepreneur();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickEntrepreneurDropDown();
		testUtil.testWaitTwo();
		myAssignmentsPage.updateStatusEntrepreneur();
		testUtil.testWaitEight();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickNewTab();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
