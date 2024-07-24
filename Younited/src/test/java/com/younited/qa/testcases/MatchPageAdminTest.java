package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MatchPage;
import com.younited.qa.pages.MatchPageAdmin;
import com.younited.qa.util.TestUtil;

public class MatchPageAdminTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	MatchPage matchPage;
	MatchPageAdmin matchPageAdmin;
	TestUtil testUtil;
	
	
	public MatchPageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		matchPage=new MatchPage();
		matchPageAdmin=new MatchPageAdmin();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageAdmin.clickMatchTab();
		testUtil.testWaitEleven();	
		
	}
	
	@Test
	public void match()throws Exception {
		//Assignment Filter
		matchPage.clickAssignmentFilter();
		testUtil.testWaitTwo();
		matchPage.enterAssignmentFilter("Ajay");
		testUtil.testWaitEight();
		matchPageAdmin.clickCancelValueFilter();
		testUtil.testWaitEight();
		//Command Filter
		matchPage.clickCommandDropDown();
		testUtil.testWaitTwo();
		matchPage.selectCommandValue();
		testUtil.testWaitEight();
		//matchPage.cancelCommandValue();
		//testUtil.testWaitEight();
		//Availability
		matchPage.clickAvailabilityDropDown();
		testUtil.testWaitTwo();
		matchPage.selectOnlyAvailable();
		testUtil.testWaitEight();
		matchPage.selectNotAvailable();
		testUtil.testWaitEight();
		matchPage.selectEverything();
		testUtil.testWaitEight();
		matchPage.clickAvailabilityDropDown();
		testUtil.testWaitTwo();
		//Location
		matchPage.clickLocationDropDown();
		testUtil.testWaitTwo();
		matchPage.enterLocationClear();
		testUtil.testWaitFour();
		matchPage.enterLocationValue("Noordwijk, Netherlands");
		testUtil.testWaitFour();
		matchPage.clickApplyFilterLocation();
		testUtil.testWaitEight();
		matchPage.clickLocationDropDown();
		testUtil.testWaitTwo();
		matchPage.resetFilterLocation();
		testUtil.testWaitEight();
		matchPage.clickLocationDropDown();
		testUtil.testWaitTwo();
		matchPage.clickCancelLocation();
		testUtil.testWaitTwo();
		//Work/Thinking level
		matchPage.clickWorkThinkingLevelDropDown();
		testUtil.testWaitTwo();
		matchPage.selectWorkThinking();
		testUtil.testWaitEight();
		matchPage.clickWorkThinkingLevelDropDown();
		testUtil.testWaitFour();
		matchPage.clickWorkThinkingLevelDropDown();
		testUtil.testWaitTwo();
		matchPage.selectWorkThinking();
		testUtil.testWaitEight();
		matchPage.clickWorkThinkingLevelDropDown();
		testUtil.testWaitTwo();		
		//Hours
		matchPage.clickHoursDropDown();
		testUtil.testWaitTwo();
		matchPage.selectHours();
		testUtil.testWaitEight();
		matchPage.clickApplyFilterHours();
		testUtil.testWaitEight();
		matchPage.clickHoursDropDown();
		testUtil.testWaitTwo();
		matchPage.clickResetFilterHours();
		testUtil.testWaitEight();
		matchPage.clickHoursDropDown();
		testUtil.testWaitTwo();
		matchPage.clickCancelHours();
		testUtil.testWaitTwo();
		//Descipline
		matchPage.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		matchPage.selectDescipline();
		testUtil.testWaitEight();
		matchPage.selectDescipline();
		testUtil.testWaitEight();
		matchPage.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		//Skills
		matchPage.clickSkillTab();
		testUtil.testWaitFour();
		//testUtil.switchToAlert("Accountbeheer");
		//testUtil.testWaitFour();
		/*matchPage.clickEnterValueSkill();
		testUtil.testWaitFour();
		matchPage.enterValueSkill("Accountbeheer");
		testUtil.testWaitFour();
		//matchPage.selectTooltipSkill();
		//testUtil.testWaitFour();
		matchPage.enterValueSkillTab();
		testUtil.testWaitFour();
		matchPage.clickSkillTab();
		testUtil.testWaitFour();
		try {
		    matchPage.clickApplyFilterSkill();
		    testUtil.testWaitEight();
		}catch(ElementClickInterceptedException e) {
			e.printStackTrace();
		}
		matchPage.clickSkillTab();
	    testUtil.testWaitFour();*/
		//matchPage.clickResetFilterSkill();
		//testUtil.testWaitEight();
		//matchPage.clickSkillTab();
		//testUtil.testWaitFour();
		matchPage.clickSkillTab();
		testUtil.testWaitFour();
		/*matchPage.clickCancelSkill();
		testUtil.testWaitFour();*/
		//Stored
		matchPage.clickStored();
		testUtil.testWaitEight();
		matchPage.clickStored();
		testUtil.testWaitEight();
		//Sorting
		/*matchPage.selectMatchBasedOnSkill();
		testUtil.testWaitEight();
		matchPage.selectLocation();
		testUtil.testWaitEight();
		matchPage.selectAlphabeticallyAZ();
		testUtil.testWaitEight();
		matchPage.selectAlphabeticallyZA();
		testUtil.testWaitEight();
		matchPage.selectHourlyRateMinMax();
		testUtil.testWaitEight();
		matchPage.selectHourlyRateMaxMin();
		testUtil.testWaitEight();
		matchPage.selectNumberOfHoursMinMax();
		testUtil.testWaitEight();
		matchPage.selectNumberOfHoursMaxMin();
		testUtil.testWaitEight();
		matchPage.selectLocation();
		testUtil.testWaitEight();
		homePageAdmin.clickSignOutLink();
	  	testUtil.testWaitFour();
	  	homePageAdmin.clickSignOutBtn();
	  	testUtil.testWaitFour();*/
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
