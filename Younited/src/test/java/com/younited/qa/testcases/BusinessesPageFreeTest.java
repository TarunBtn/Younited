package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.base.TestBaseBrowserStack;
import com.younited.qa.pages.BusinessesPageFree;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class BusinessesPageFreeTest extends TestBaseBrowserStack{
	LoginPage loginPage;
	HomePageFree homePageFree;
	BusinessesPageFree businessesPageFree;
	TestUtil testUtil;

	public BusinessesPageFreeTest() {
		super();
	}
	
	//@BeforeMethod
	public void asetUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		businessesPageFree=new BusinessesPageFree();
		testUtil=new TestUtil();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitFourteen();
		//homePageFree.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		//homePageFree.suitableAssignments();
		//testUtil.testWaitFour();
		homePageFree.clickBusinessesTab();
		testUtil.testWaitEleven();
				
	}
	
	@Test
	public void businessesPageFree()throws Exception {
		//Filter value
		businessesPageFree.filterValue("Apex");
		testUtil.testWaitEight();
		businessesPageFree.filterValueTooltip();
		testUtil.testWaitEight();
		businessesPageFree.removeFilter();
		testUtil.testWaitEight();
		//Sector-field removed
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.selectSector();
		//testUtil.testWaitFour();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.selectSector();
		//testUtil.testWaitFour();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		businessesPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		businessesPageFree.sortingZtoA();
		testUtil.testWaitFour();
		businessesPageFree.sortingLocationAtoZ();
		testUtil.testWaitFour();
		businessesPageFree.sortingLocationZtoA();
		testUtil.testWaitFour();
		businessesPageFree.sortingAtoZ();
		testUtil.testWaitFour();
		businessesPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		
	}
	
	//@AfterMethod
	public void tearDown(){
		Driver.quit();
		
	}

}
