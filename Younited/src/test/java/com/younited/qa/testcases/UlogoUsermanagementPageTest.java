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
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickUserManagementTab();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		
	}
	
	@Test
	public void uLogoUsermanagementPageTest()throws Exception {
		uLogoUsermanagementPage.enterSearchName("Ajay");
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickResetSearchName();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.enterEmailAddress("tb+acc-freelancer@test.nowonline.nl");
		testUtil.testWaitEight();
		uLogoUsermanagementPage.clickExactSearch();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickExactSearch();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickResetEmailAddress();
		testUtil.testWaitFour();
		//Roles
		uLogoUsermanagementPage.clickRoleDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.selectRole();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickRoleDropDown();
		testUtil.testWaitTwo();
		//Availability
		uLogoUsermanagementPage.clickEverythingDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.selectOnlyAvailable();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickEverythingDropDown();
		testUtil.testWaitTwo();
		//Descipline
		uLogoUsermanagementPage.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.selectDescipline();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		//ElevatorPitch
		uLogoUsermanagementPage.clickElevatorPitch();
		testUtil.testWaitEight();
		uLogoUsermanagementPage.clickElevatorPitch();
		testUtil.testWaitEight();
		uLogoUsermanagementPage.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.selectDescipline();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.clickEverythingDropDown();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.selectEverything();
		testUtil.testWaitEight();
		uLogoUsermanagementPage.clickRoleDropDown();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.selectResetRole();
		testUtil.testWaitFour();
		uLogoUsermanagementPage.clickRoleDropDown();
		testUtil.testWaitTwo();
		//Skills
		uLogoUsermanagementPage.clickSkillsTab();
		testUtil.testWaitTwo();
		uLogoUsermanagementPage.enterValueSkills("Postman");
		testUtil.testWaitFour();
		uLogoUsermanagementPage.selectTooltipSkills();
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
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
