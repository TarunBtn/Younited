package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.AssignmentsPageFree;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class AssignmentsPageFreeTest extends TestBase{
	LoginPage loginPage;
	HomePageFree homePageFree;
	AssignmentsPageFree assignmentsPageFree;
	TestUtil testUtil;
	
	public AssignmentsPageFreeTest() {
		super();
	}
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();		
		assignmentsPageFree=new AssignmentsPageFree();
		testUtil=new TestUtil();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitEleven();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageFree.clickAssignmentsLink();
		testUtil.testWaitEight();
			
	}
	
	//public void assignmentsPageTitleTest()throws Exception {
		//String title=assignmentsPageFree.assignmentsPageTitle();
		//Assert.assertEquals(title, "Opdrachten - Younited®");
		//testUtil.testWaitTwo();
	//}
	
	@Test
	public void clickFiltersTest()throws Exception {
		//Sector
		assignmentsPageFree.clickSectorTab();
		testUtil.testWaitFour();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		//Descipline
		assignmentsPageFree.clickDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		//Skill
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.enterSkill();
		testUtil.testWaitFour();
		assignmentsPageFree.enterSkillValue("Postman");
		testUtil.testWaitFour();
		//assignmentsPageFree.selectSkillToolTip();
		//testUtil.testWaitFour();
		assignmentsPageFree.applySkillFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickClearFilterSkill();
		testUtil.testWaitFour();
		assignmentsPageFree.clickCancelSkill();
		testUtil.testWaitFour();
		//Duration
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();	
		assignmentsPageFree.clickDuration();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitFour();
		//WorkAndThinkingLevel
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectWorkAndThinkingLevel();
		testUtil.testWaitFour();
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitFour();
		assignmentsPageFree.selectWorkAndThinkingLevel();
		testUtil.testWaitFour();
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitFour();
		//Hours
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitFour();
		assignmentsPageFree.selectHours();
		testUtil.testWaitFour();
		assignmentsPageFree.applyHoursFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetHoursFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickCancelHours();
		testUtil.testWaitTwo();
		//Hourly rate
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitFour();
		assignmentsPageFree.selectHourlyRate();
		testUtil.testWaitFour();
		assignmentsPageFree.applyHourlyRateFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetHourlyRateFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickCancelHourlyRate();
		testUtil.testWaitTwo();
		//Location
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.locationRemove();
		testUtil.testWaitFour();
		assignmentsPageFree.enterLocation("Noordwijk, Netherlands");
		testUtil.testWaitFour();
		assignmentsPageFree.applyLocationFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetLocation();
		testUtil.testWaitFour();
		//assignmentsPageFree.clickLocationTab();
		//testUtil.testWaitTwo();
		//assignmentsPageFree.clickCancelLocation();
		//testUtil.testWaitTwo();
		//View matches
		assignmentsPageFree.clickViewMatches();
		testUtil.testWaitFour();
		assignmentsPageFree.clickViewMatches();
		testUtil.testWaitFour();
		//Favourites
		assignmentsPageFree.clickFavorites();
		testUtil.testWaitFour();
		assignmentsPageFree.clickFavorites();
		testUtil.testWaitFour();
		//Sorting
		assignmentsPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectPublicationDateOldFirst();
		testUtil.testWaitFour();
		assignmentsPageFree.selectAtHourlyRate();
		testUtil.testWaitFour();
		assignmentsPageFree.selectByNumberOfHours();
		testUtil.testWaitFour();
		assignmentsPageFree.selectPublicationDateNewFirst();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
