package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.StorePageFree;
import com.younited.qa.util.TestUtil;

public class StorePageFreeTest extends TestBase{
	LoginPage loginPage;
	HomePageFree homePageFree;
	StorePageFree storePageFree;
	TestUtil testUtil;
	
	
	public StorePageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		storePageFree=new StorePageFree();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitEleven();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageFree.clickNetworkTab();
		testUtil.testWaitTwo();
		homePageFree.clickStoreTooltip();
		testUtil.testWaitEight();
		
	}
	
	@Test
	public void clickStoreTab()throws Exception {
		storePageFree.clickAllTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		storePageFree.clickMoreInformationAll();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		storePageFree.clickBackToAllProductsLink();
		testUtil.testWaitFour();
		storePageFree.clickAccountingTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		storePageFree.clickMoreInformationAccounting();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		storePageFree.clickBackToAllProductsLink();
		testUtil.testWaitFour();
		storePageFree.clickCTATestGroupTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		storePageFree.clickMoreInformationCTA();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		storePageFree.clickBackToAllProductsLink();
		testUtil.testWaitFour();
		storePageFree.clickDemoTrainingTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		storePageFree.clickMoreInformationDemoTraining();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		storePageFree.clickBackToAllProductsLink();
		testUtil.testWaitFour();
		storePageFree.clickDevelopmentTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		storePageFree.clickMoreInformationDevelopment();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		storePageFree.clickBackToAllProductsLink();
		testUtil.testWaitFour();
		storePageFree.clickTestTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		storePageFree.clickMoreInformationTest();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		storePageFree.clickBackToAllProductsLink();
		testUtil.testWaitFour();
		storePageFree.clickTestUrlTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		storePageFree.clickInsurancesTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
			
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}
