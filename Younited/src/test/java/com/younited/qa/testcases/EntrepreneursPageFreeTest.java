package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.EntrepreneursPageFree;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class EntrepreneursPageFreeTest extends TestBase{
	LoginPage loginPage;
	HomePageFree homePageFree;
	TestUtil testUtil;
	EntrepreneursPageFree entrepreneursPageFree;
	
	public EntrepreneursPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		entrepreneursPageFree=new EntrepreneursPageFree();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitFourteen();
		//homePageFree.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		//homePageFree.suitableAssignments();
		//testUtil.testWaitFour();
		homePageFree.clickEntrepreneurTab();
		testUtil.testWaitFourteen();
				
	}
	
	@Test
	public void entrepreneurPageFilter()throws Exception {
		entrepreneursPageFree.enterEntrepreneur("Ajay");
		testUtil.testWaitEight();
		entrepreneursPageFree.clickCancel();
		testUtil.testWaitEight();
		//Working/Thinking level
		entrepreneursPageFree.clickWorkingThinkingDropDown();
		testUtil.testWaitTwo();
		entrepreneursPageFree.selectWorkingThinkingLevel();
		testUtil.testWaitFour();
		entrepreneursPageFree.selectWorkingThinkingLevel();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickWorkingThinkingDropDown();
		testUtil.testWaitTwo();
		//Descipline
		entrepreneursPageFree.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		entrepreneursPageFree.selectDescipline();
		testUtil.testWaitFour();
		entrepreneursPageFree.selectDescipline();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickDesciplineDropDown();
		testUtil.testWaitTwo();
		//Area of Interest
		entrepreneursPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitTwo();
		entrepreneursPageFree.selectAreaOfInterest();
		testUtil.testWaitFour();
		entrepreneursPageFree.selectAreaOfInterest();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitFour();
		//Skills
		entrepreneursPageFree.clickSkillsTab();
		testUtil.testWaitFour();
		entrepreneursPageFree.enterSkill();
		testUtil.testWaitTwo();
		entrepreneursPageFree.enterSkill("Postman");
		testUtil.testWaitFour();
		entrepreneursPageFree.selectSkillToolTip();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickSkillsTab();
		testUtil.testWaitTwo();
		entrepreneursPageFree.clickApplyFilter();
		testUtil.testWaitEight();
		entrepreneursPageFree.clickSkillsTab();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickResetFilter();
		testUtil.testWaitEight();
		entrepreneursPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		entrepreneursPageFree.selectSortingZtoA();
		testUtil.testWaitFour();
		entrepreneursPageFree.selectSortingAtoZ();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		homePageFree.clickSignOutLink();
		testUtil.testWaitFour();
		homePageFree.clickSignOutBtn();
		testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}
