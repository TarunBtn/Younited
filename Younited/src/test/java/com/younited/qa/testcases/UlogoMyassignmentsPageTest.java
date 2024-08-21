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
		testUtil.testWaitTwo();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitEight();
		homePageAdmin.clickMyAssignmentsTab();
		testUtil.testWaitEight();
			
	}
	
	@Test
	public void UlogoMyassignmentsPage()throws Exception {
		myAssignmentsPage.clickFilter();
		testUtil.testWaitFour();
		myAssignmentsPage.enterValueInFilter("Test");
		testUtil.testWaitEight();
		myAssignmentsPage.clickResetFilter();
		testUtil.testWaitFour();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitTwo();
		myAssignmentsPage.selectCompanyFromDropDownAdmin();
		testUtil.testWaitEight();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		/*myAssignmentsPage.clickCommentsLink();
		testUtil.testWaitTwo();
		//testUtil.scrollRight();
		//testUtil.testWaitTwo();
		//myAssignmentsPage.clickScrollRight();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		myAssignmentsPage.clickStatusThumbsup();
		testUtil.testWaitEleven();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		myAssignmentsPage.clickPendingTab();
		testUtil.testWaitFour();
		testUtil.scrollUp();
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
		testUtil.testWaitTwo();*/
		myAssignmentsPage.clickStatusDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.selectStatusFromDropDownClosed();
		testUtil.testWaitEight();
		//myAssignmentsPage.clickStatusDropDown();
		myAssignmentsPage.selectStatusFromDropDownOpen();
		testUtil.testWaitEight();
		myAssignmentsPage.clickStatusDropDown();
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
