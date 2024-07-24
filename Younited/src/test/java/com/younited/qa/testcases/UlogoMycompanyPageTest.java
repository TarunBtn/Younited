package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoMycompanyPage;
import com.younited.qa.util.TestUtil;

public class UlogoMycompanyPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	TestUtil testUtil;
	UlogoMycompanyPage uLogoMycompanyPage;
	
	public UlogoMycompanyPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		uLogoMycompanyPage=new UlogoMycompanyPage();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickMyCompanyTab();
		testUtil.testWaitFour();
		//homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		
	}
	
	@Test
	public void uLogoMycompanyPage()throws Exception {
		uLogoMycompanyPage.clickAddNewCompany();
		testUtil.testWaitEight();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		uLogoMycompanyPage.enterCompanyName("Coffeeshop Checkpoint");
		testUtil.testWaitFour();
		uLogoMycompanyPage.clickCompanyNameTooltip();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoMycompanyPage.clickEmployeeDropDown();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.selectEmployee();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.clickSectorDropDown();
		testUtil.testWaitFour();
		uLogoMycompanyPage.selectSector();
		testUtil.testWaitFour();
		uLogoMycompanyPage.clearWebsiteField();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.enterWebsiteUrl("https://coffeshopcheckpoint.com");
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.clickSaveBtn();
		//uLogoMycompanyPage.clickCancelBtn();
		testUtil.testWaitFour();
		homePageAdmin.clickSignOutLink();
	  	testUtil.testWaitFour();
	  	homePageAdmin.clickSignOutBtn();
	  	testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
