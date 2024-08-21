package com.younited.qa.testcases;

import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MatchPage;
import com.younited.qa.util.TestUtil;

public class MatchPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MatchPage matchPage;
	TestUtil testUtil;
	
	public MatchPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		matchPage=new MatchPage();
		testUtil=new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFourteen();
		  //homePage.clickAcceptAllCookies();
		  //testUtil.testWaitEleven();
		homePage.clickMatchLink();
		testUtil.testWaitEleven();
				
	}
	
	@Test
	public void matchPage()throws Exception {
		//Assignment Filter
		matchPage.clickAssignmentFilterDropdown();
		testUtil.testWaitFour();
		matchPage.selectAssignmentFilter();
		testUtil.testWaitEight();
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
		testUtil.testWaitTwo();		
		/*matchPage.clickEnterValueSkill();
		testUtil.testWaitTwo();
		matchPage.enterValueSkill("Accountbeheer");
		testUtil.testWaitEight();
		//matchPage.selectTooltipSkill();
		//testUtil.testWaitEight();
		matchPage.enterValueSkillTab();
		testUtil.testWaitTwo();
		matchPage.clickSkillTab();
		testUtil.testWaitTwo();
		try {
		    matchPage.clickApplyFilterSkill();
		    testUtil.testWaitTwo();
		}catch(ElementClickInterceptedException e) {
			e.printStackTrace();
		}
		matchPage.clickSkillTab();
		testUtil.testWaitFour();
		matchPage.clickResetFilterSkill();
		testUtil.testWaitEight();*/
		matchPage.clickSkillTab();
		testUtil.testWaitFour();
		//matchPage.clickSkillTab();
		//testUtil.testWaitFour();
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
		testUtil.testWaitFour();
		matchPage.selectNumberOfHoursMaxMin();
		testUtil.testWaitFour();
		matchPage.selectLocation();
		testUtil.testWaitFour();
		homePage.clickSignOutLink();
		testUtil.testWaitFour();
		homePage.clickSignOutBtn();
		testUtil.testWaitFour();*/
		homePage.clickSignOutLink();
		testUtil.testWaitFour();
		homePage.clickSignOutBtn();
		testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
