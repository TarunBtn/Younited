package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoMynotificationsPage;
import com.younited.qa.util.TestUtil;

public class UlogoMynotificationsPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMynotificationsPage uLogoMynotificationsPage;
	TestUtil testUtil;
	
	public UlogoMynotificationsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoMynotificationsPage=new UlogoMynotificationsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		//homePageAdmin.clickUserLogo();
		//testUtil.testWaitFour();
		//homePageAdmin.moveHoverTologoImage();
		//testUtil.testWaitTwo();
		//homePageAdmin.clickMynotificationsTab();
		//testUtil.testWaitFour();
		//homePageAdmin.clickMydashboardTab();
		//testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		
	}
	
	@Test
	public void myNotificationsPage()throws Exception {
		uLogoMynotificationsPage.clickMyNotificationsLink();
		testUtil.testWaitEight();
		//uLogoMynotificationsPage.ClickToOpenMail();
		//testUtil.testWaitEight();
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
