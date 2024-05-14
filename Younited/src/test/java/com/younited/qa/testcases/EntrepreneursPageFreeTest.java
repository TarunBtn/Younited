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
		testUtil.testWaitEleven();
		//homePageFree.clickAcceptAllCookies();
		//testUtil.testWaitEight();
		homePageFree.clickEntrepreneurTab();
		testUtil.testWaitEleven();
				
	}
	
	@Test
	public void entrepreneurPageFilter()throws Exception {
		entrepreneursPageFree.enterEntrepreneur("Ajay");
		testUtil.testWaitFour();
		entrepreneursPageFree.clickCancel();
		testUtil.testWaitFour();
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
		testUtil.testWaitTwo();
		//Skills
		entrepreneursPageFree.clickSkillsTab();
		testUtil.testWaitTwo();
		entrepreneursPageFree.enterSkill();
		testUtil.testWaitTwo();
		entrepreneursPageFree.enterSkill("Postman");
		testUtil.testWaitFour();
		entrepreneursPageFree.selectSkillToolTip();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickApplyFilter();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickResetFilter();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		entrepreneursPageFree.selectSortingZtoA();
		testUtil.testWaitFour();
		entrepreneursPageFree.selectSortingAtoZ();
		testUtil.testWaitFour();
		entrepreneursPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}
