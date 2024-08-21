package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoUsermanagementPage;
import com.younited.qa.util.TestUtil;

public class UlogoUsermanagementPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoUsermanagementPage uLogoUsermanagementPage;
	TestUtil testUtil;
	
	public UlogoUsermanagementPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoUsermanagementPage=new UlogoUsermanagementPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitEight();
		homePageAdmin.clickUserManagementTab();
		testUtil.testWaitEight();
		//homePageAdmin.moveHoverTologoImage();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		
	}
	
	@Test
	public void uLogoUsermanagementPageTest()throws Exception {
		uLogoUsermanagementPage.clickSearchName();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.enterSearchName("Ajay");
		testUtil.testWaitEleven();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickResetSearchName();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.enterEmailAddress("tb+acc-freelancer@test.nowonline.nl");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//uLogoUsermanagementPage.clickExactSearch();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//uLogoUsermanagementPage.clickExactSearch();
		//testUtil.testWaitFour();
		uLogoUsermanagementPage.clickResetEmailAddress();
		testUtil.testWaitFour();
		//Roles
		uLogoUsermanagementPage.clickRoleDropDown();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.selectRole();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		//uLogoUsermanagementPage.clickRoleDropDown();
		//testUtil.testWaitFour();
		//Availability
		//uLogoUsermanagementPage.clickEverythingDropDown();
		//testUtil.testWaitTwo();
		//uLogoUsermanagementPage.selectOnlyAvailable();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//uLogoUsermanagementPage.clickEverythingDropDown();
		//testUtil.testWaitTwo();
		//Descipline
		//uLogoUsermanagementPage.clickDesciplineDropDown();
		//testUtil.testWaitTwo();
		//uLogoUsermanagementPage.selectDescipline();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//uLogoUsermanagementPage.clickDesciplineDropDown();
		//testUtil.testWaitTwo();
		//ElevatorPitch
		//uLogoUsermanagementPage.clickElevatorPitch();
		//testUtil.testWaitEight();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//uLogoUsermanagementPage.clickElevatorPitch();
		//testUtil.testWaitEight();
		//uLogoUsermanagementPage.clickDesciplineDropDown();
		//testUtil.testWaitTwo();
		//uLogoUsermanagementPage.selectDescipline();
		//testUtil.testWaitFour();
		//uLogoUsermanagementPage.clickDesciplineDropDown();
		//testUtil.testWaitTwo();
		//uLogoUsermanagementPage.clickEverythingDropDown();
		//testUtil.testWaitTwo();
		//uLogoUsermanagementPage.selectEverything();
		//testUtil.testWaitEight();
		//uLogoUsermanagementPage.clickRoleDropDown();
		//testUtil.testWaitFour();
		//uLogoUsermanagementPage.selectResetRole();
		//testUtil.testWaitFour();
		//uLogoUsermanagementPage.clickRoleDropDown();
		//testUtil.testWaitTwo();
		//Skills
		uLogoUsermanagementPage.clickSkillsTab();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.enterValueSkills("Postman");
		testUtil.testWaitEight();
		uLogoUsermanagementPage.selectTooltipSkills();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickSkillsTab();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickApplyFilterSkills();
		testUtil.testWaitEight();
		uLogoUsermanagementPage.clickResetFilterSkills();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickSkillsTab();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickCancelSkills();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
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
