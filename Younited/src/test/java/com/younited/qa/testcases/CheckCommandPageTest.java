package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.younited.qa.base.TestBase;
import com.younited.qa.pages.AddCommandPage;
import com.younited.qa.pages.CheckCommandPage;
import com.younited.qa.pages.CompleteAssignment;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MyAssignmentsPage;
import com.younited.qa.util.TestUtil;

public class CheckCommandPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	CheckCommandPage checkCommandPage;
	CompleteAssignment completeAssignment;
	TestUtil testUtil;
	
	
	public CheckCommandPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		myAssignmentsPage=new MyAssignmentsPage();
		addCommandPage=new AddCommandPage();
		checkCommandPage=new CheckCommandPage();
		completeAssignment=new CompleteAssignment();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		//homePage.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		//homePage.clickReactiesDropDown();
		//testUtil.testWaitFour();
		//homePage.clickReactiesDropDown();
		//testUtil.testWaitFour();
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitFourteen();
		//testUtil.testWaitEight();
		addCommandPage=myAssignmentsPage.clickAddNewCommand();
		testUtil.testWaitEleven();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		addCommandPage.clickChooseFile();
		testUtil.testWaitFour();
		testUtil.uploadFile("D:\\CV Jort Zwolsman.doc");
		testUtil.testWaitEight();
		addCommandPage.clickUploadFile();
		testUtil.testWaitEleven();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
							
	}
	
	@Test
	public void checkCommandPageTest()throws Exception {
		//checkCommandPage.clickFillInComplete();
		//testUtil.testWaitEight();
		System.out.println("Test is passed");
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
		
	}

}
