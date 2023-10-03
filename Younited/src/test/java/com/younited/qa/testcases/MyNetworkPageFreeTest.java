package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.CommunityPageFree;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MyNetworkPageFree;
import com.younited.qa.util.TestUtil;

public class MyNetworkPageFreeTest extends TestBase{
	LoginPage loginPage;
	HomePageFree homePageFree;
	CommunityPageFree communityPageFree;
	MyNetworkPageFree myNetworkPageFree;
	TestUtil testUtil;
	
	
	public MyNetworkPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		communityPageFree=new CommunityPageFree();
		myNetworkPageFree=new MyNetworkPageFree();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitFourteen();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageFree.clickNetworkTab();
		testUtil.testWaitFour();
		homePageFree.clickNetworkTabTooltip();
		testUtil.testWaitFour();
		communityPageFree.clickMyNetworkBtn();
		testUtil.testWaitEight();
		
	}
	
	@Test
	public void myNetworkPageFreeTest()throws Exception {
		myNetworkPageFree.clickMyNetworkTab();
		testUtil.testWaitEight();
		myNetworkPageFree.clickMyRequestsTab();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		myNetworkPageFree.clickSuggestionsForYouTab();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		myNetworkPageFree.clickAreaOfInterest();
		testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
