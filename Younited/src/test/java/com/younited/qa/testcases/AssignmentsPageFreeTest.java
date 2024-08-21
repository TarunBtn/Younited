package com.younited.qa.testcases;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
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
		testUtil.testWaitFourteen();	
		//homePageFree.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		homePageFree.clickAssignmentsLink();
		testUtil.testWaitEight();
			
	}
	
	@Test
	public void clickFiltersTest()throws Exception {
		//ValueFilterAssignment
		assignmentsPageFree.enterAssignmentsName("QA EngineerEight");
		testUtil.testWaitEight();
		assignmentsPageFree.selectAssignmentsValue();
		testUtil.testWaitFour();
		assignmentsPageFree.clearAssignmentsFilter();
		testUtil.testWaitFour();
		//Sector
		try {
		    assignmentsPageFree.clickSectorTab();
		}catch(ElementNotInteractableException e) {
			e.printStackTrace();
		}
		testUtil.testWaitFour();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSectorTab();
		testUtil.testWaitFour();
		//Descipline
		assignmentsPageFree.clickDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDescipline();
		testUtil.testWaitFour();
		//Skill
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.enterSkill();
		testUtil.testWaitFour();
		assignmentsPageFree.enterSkillValue("Postman");
		testUtil.testWaitFour();
		assignmentsPageFree.selectSkillToolTip();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.applySkillFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		//assignmentsPageFree.clickSkillTab();
		//testUtil.testWaitFour();
		assignmentsPageFree.clickResetFilterSkill();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickCancelSkill();
		testUtil.testWaitFour();
		//Duration
		assignmentsPageFree.clickDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDuration();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDuration();
		testUtil.testWaitFour();
		//Work & Thinking level
		assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitFour();
	    assignmentsPageFree.selectWorkAndThinkingLevel();
		testUtil.testWaitFour();
	    assignmentsPageFree.clickWorkAndThinkingLevel();
		testUtil.testWaitFour();
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
		testUtil.testWaitEight();
		assignmentsPageFree.applyHoursFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetHoursFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHoursTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickCancelHours();
		testUtil.testWaitFour();
		//Hourly rate
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitFour();
		assignmentsPageFree.selectHourlyRate();
		testUtil.testWaitFour();
		assignmentsPageFree.applyHourlyRateFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetHourlyRateFilter();
		testUtil.testWaitEight();
		assignmentsPageFree.clickHourlyRateTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickCancelHourlyRate();
		testUtil.testWaitFour();
		//Location
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitFour();
		assignmentsPageFree.enterLocation("Noordwijk Netherlands");
		testUtil.testWaitFour();
		try {
			  	assignmentsPageFree.enterLocationToolTip();
			  	testUtil.testWaitFour();
		}catch(ElementNotInteractableException e) {
			   e.printStackTrace();
		}
		testUtil.testWaitFour();
		try {
			  	assignmentsPageFree.applyLocationFilter();
			  	testUtil.testWaitFour();
		}catch(NoSuchElementException e) {
			    e.printStackTrace();
		}
		testUtil.testWaitFour();
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitFour();
		assignmentsPageFree.clickLocationTab();
		testUtil.testWaitFour();
		assignmentsPageFree.resetLocation();
		testUtil.testWaitEight();
		//View matches
		assignmentsPageFree.clickViewMatches();
		testUtil.testWaitEleven();
		assignmentsPageFree.clickViewMatches();
		testUtil.testWaitEleven();
		//Favourites
		assignmentsPageFree.clickFavorites();
		testUtil.testWaitEleven();
		assignmentsPageFree.clickFavorites();
		testUtil.testWaitEleven();
		//Sorting
		assignmentsPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		assignmentsPageFree.selectPublicationDateOldFirst();
		testUtil.testWaitEight();	
		assignmentsPageFree.selectAtHourlyRate();
		testUtil.testWaitEight();
		assignmentsPageFree.selectByNumberOfHours();
		testUtil.testWaitEight();
		assignmentsPageFree.selectPublicationDateNewFirst();
		testUtil.testWaitEight();
		assignmentsPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		homePageFree.clickSignOutLink();
		testUtil.testWaitFour();
		homePageFree.clickSignOutBtn();
		testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
		
	}

}
