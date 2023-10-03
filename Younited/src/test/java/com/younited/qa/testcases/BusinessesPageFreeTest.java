package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.BusinessesPageFree;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class BusinessesPageFreeTest extends TestBase{
	LoginPage loginPage;
	HomePageFree homePageFree;
	BusinessesPageFree businessesPageFree;
	TestUtil testUtil;
	
	public BusinessesPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		businessesPageFree=new BusinessesPageFree();
		testUtil=new TestUtil();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitEleven();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageFree.clickBusinessesTab();
		testUtil.testWaitFourteen();
				
	}
	
	@Test
	public void businessesPageFree()throws Exception {
		//Filter value
		businessesPageFree.filterValue("Apex");
		testUtil.testWaitEleven();
		businessesPageFree.filterValueTooltip();
		testUtil.testWaitEight();
		businessesPageFree.removeFilter();
		testUtil.testWaitEleven();
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
		testUtil.testWaitEight();
		businessesPageFree.sortingLocationAtoZ();
		testUtil.testWaitEight();
		businessesPageFree.sortingLocationZtoA();
		testUtil.testWaitEight();
		businessesPageFree.sortingAtoZ();
		testUtil.testWaitEight();
		businessesPageFree.clickSortingDropDown();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}
