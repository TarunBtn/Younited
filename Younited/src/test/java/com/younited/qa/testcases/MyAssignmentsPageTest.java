package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.AddCommandPage;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MyAssignmentsPage;
import com.younited.qa.util.TestUtil;

public class MyAssignmentsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	//CheckCommandPage checkCommandPage;
	TestUtil testUtil;
	
	public MyAssignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();					
		loginPage=new LoginPage();
		addCommandPage=new AddCommandPage();
		myAssignmentsPage=new MyAssignmentsPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		homePage.clickAcceptAllCookies();
		testUtil.testWaitEight();		
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitEleven();
		testUtil.testWaitEight();
		//checkCommandPage=new CheckCommandPage();
		testUtil.scrollDown();
		testUtil.testWaitFour();
													
	}
	
	@Test
	public void myAssignmentsPageTest()throws Exception {
		myAssignmentsPage.enterValueInFilter("Test");
		testUtil.testWaitEleven();
		myAssignmentsPage.clickResetFilter();
		testUtil.testWaitEleven();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitTwo();
		myAssignmentsPage.selectCompanyFromDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.clickChooseCompanyDropDown();
		testUtil.testWaitTwo();
		myAssignmentsPage.StatusDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.selectStatusFromDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.StatusDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.StatusDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.clearStatusFromDropDown();
		testUtil.testWaitFour();
		myAssignmentsPage.StatusDropDown();
		testUtil.testWaitTwo();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
