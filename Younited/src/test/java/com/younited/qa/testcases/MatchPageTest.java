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
		testUtil.testWaitEight();
		homePage.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePage.clickMatchLink();
		testUtil.testWaitEight();
				
	}
	
	@Test
	public void matchPage()throws Exception {
		//Value Filter
		//matchPage.clickValueFilterDropdown();
		//testUtil.testWaitTwo();
		//matchPage.selectValueFilter();
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
		matchPage.enterLocationValue("Noordwijk, Netherlands");
		testUtil.testWaitTwo();
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
		matchPage.clickEnterValueSkill();
		testUtil.testWaitTwo();
		matchPage.enterValueSkill("Postman");
		testUtil.testWaitFour();
		matchPage.selectTooltipSkill();
		testUtil.testWaitFour();
		try {
		matchPage.clickApplyFilterSkill();
		testUtil.testWaitEight();
		}catch(ElementClickInterceptedException e) {
			e.printStackTrace();
		}
		matchPage.clickResetFilterSkill();
		testUtil.testWaitEight();
		matchPage.clickSkillTab();
		testUtil.testWaitTwo();
		matchPage.clickCancelSkill();
		testUtil.testWaitTwo();
		//Stored
		matchPage.clickStored();
		testUtil.testWaitEight();
		matchPage.clickStored();
		testUtil.testWaitEight();
		//Sorting
		matchPage.selectMatchBasedOnSkill();
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
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
