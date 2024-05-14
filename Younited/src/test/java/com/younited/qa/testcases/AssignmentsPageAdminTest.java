package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.younited.qa.base.TestBase;
import com.younited.qa.pages.AssignmentsPageAdmin;
import com.younited.qa.pages.AssignmentsPageFree;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class AssignmentsPageAdminTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	AssignmentsPageFree assignmentsPageFree;
	AssignmentsPageAdmin assignmentsPageAdmin;
	TestUtil testUtil;
	
	public AssignmentsPageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		assignmentsPageFree=new AssignmentsPageFree();
		assignmentsPageAdmin=new AssignmentsPageAdmin();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEight();
		homePageAdmin.clickAssignmentsTab();
		testUtil.testWaitEight();
							
	}
	
	@Test
	public void assignmentsPage()throws Exception {	
		//ValueFilterAssignment
		assignmentsPageFree.enterAssignmentsName("QA EngineerEight");
		testUtil.testWaitFour();
		assignmentsPageFree.selectAssignmentsValue();
		testUtil.testWaitFour();
		assignmentsPageFree.clearAssignmentsFilter();
		testUtil.testWaitFour();
		//Sector
		assignmentsPageFree.clickSectorTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		assignmentsPageFree.selectSector();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSectorTab();
		testUtil.testWaitTwo();
		//Descipline
		assignmentsPageFree.clickDescipline();
		testUtil.testWaitTwo();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.selectDescipline();
		testUtil.testWaitFour();
		assignmentsPageFree.clickDescipline();
		testUtil.testWaitTwo();
		//Skill
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.enterSkill();
		testUtil.testWaitTwo();
		assignmentsPageFree.enterSkillValue("Postman");
		testUtil.testWaitFour();
		//assignmentsPageFree.selectSkillToolTip();
		//testUtil.testWaitFour();
		assignmentsPageFree.applySkillFilter();
		testUtil.testWaitFour();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickSkillTab();
		testUtil.testWaitTwo();
		assignmentsPageFree.clickClearFilterSkill();
		testUtil.testWaitFour();
		assignmentsPageFree.clickCancelSkill();
		testUtil.testWaitTwo();
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
		testUtil.testWaitTwo();
		//Work & Thinking level
        assignmentsPageFree.clickWorkAndThinkingLevel();
        testUtil.testWaitTwo();
	    assignmentsPageFree.selectWorkAndThinkingLevel();
	    testUtil.testWaitFour();
	    assignmentsPageFree.clickWorkAndThinkingLevel();
	    testUtil.testWaitTwo();
	    assignmentsPageFree.clickWorkAndThinkingLevel();
	    testUtil.testWaitTwo();
	    assignmentsPageFree.selectWorkAndThinkingLevel();
	    testUtil.testWaitFour();
	    assignmentsPageFree.clickWorkAndThinkingLevel();
	    testUtil.testWaitTwo();
	    //Hours
	  	assignmentsPageFree.clickHoursTab();
	  	testUtil.testWaitTwo();
	  	assignmentsPageFree.selectHours();
	  	testUtil.testWaitEight();
	  	assignmentsPageFree.applyHoursFilter();
	  	testUtil.testWaitEight();
	  	assignmentsPageFree.clickHoursTab();
	  	testUtil.testWaitTwo();
	  	assignmentsPageFree.resetHoursFilter();
	  	testUtil.testWaitEight();
	  	assignmentsPageFree.clickHoursTab();
	  	testUtil.testWaitTwo();
	  	assignmentsPageFree.clickCancelHours();
	  	testUtil.testWaitTwo();
	  	//Hourly rate
	  	assignmentsPageFree.clickHourlyRateTab();
	  	testUtil.testWaitTwo();
	  	assignmentsPageFree.selectHourlyRate();
	  	testUtil.testWaitFour();
	  	assignmentsPageFree.applyHourlyRateFilter();
	  	testUtil.testWaitEight();
	  	assignmentsPageFree.clickHourlyRateTab();
	  	testUtil.testWaitTwo();
	  	assignmentsPageFree.resetHourlyRateFilter();
	  	testUtil.testWaitEight();
	  	assignmentsPageFree.clickHourlyRateTab();
	  	testUtil.testWaitTwo();
	  	assignmentsPageFree.clickCancelHourlyRate();
	  	testUtil.testWaitTwo();
	  	//Location
	  	assignmentsPageFree.clickLocationTab();
	  	testUtil.testWaitTwo();
	  	assignmentsPageFree.enterLocation("Noordwijk, Netherlands");
	  	testUtil.testWaitFour();
	  	assignmentsPageFree.applyLocationFilter();
	  	testUtil.testWaitEight();
	  	assignmentsPageFree.clickLocationTab();
	  	testUtil.testWaitTwo();
	  	assignmentsPageFree.resetLocation();
	  	testUtil.testWaitEight();
	    //View matches
	  	assignmentsPageFree.clickViewMatches();
	  	testUtil.testWaitEight();
	  	assignmentsPageFree.clickViewMatches();
	  	testUtil.testWaitEight();
	  	//Favourites
	  	assignmentsPageFree.clickFavorites();
	  	testUtil.testWaitEight();
	  	assignmentsPageFree.clickFavorites();
	  	testUtil.testWaitEleven();
	  	//Sorting
	  	assignmentsPageFree.clickSortingDropDown();
	  	testUtil.testWaitTwo();
	  	assignmentsPageFree.selectPublicationDateOldFirst();
	  	testUtil.testWaitEight();	
	  	assignmentsPageFree.selectAtHourlyRate();
	  	testUtil.testWaitEight();
	  	assignmentsPageFree.selectByNumberOfHours();
	  	testUtil.testWaitEight();
	  	assignmentsPageFree.selectPublicationDateNewFirst();
	  	testUtil.testWaitEight();
	  	assignmentsPageFree.clickSortingDropDown();
	  	testUtil.testWaitTwo();
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}
