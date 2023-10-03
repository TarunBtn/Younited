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

public class CommunityPageFreeTest extends TestBase{
	LoginPage loginPage;
	HomePageFree homePageFree;
	CommunityPageFree communityPageFree;
	MyNetworkPageFree myNetworkPageFree;
	TestUtil testUtil;
	
	public CommunityPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		communityPageFree=new CommunityPageFree();
		myNetworkPageFree=new MyNetworkPageFree();
		testUtil=new TestUtil();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitEleven();
		homePageFree.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageFree.clickNetworkTab();
		testUtil.testWaitTwo();
		homePageFree.clickNetworkTabTooltip();
		testUtil.testWaitFour();
								
	}
	
	@Test
	public void communityPageFreeTest()throws Exception {
		communityPageFree.clickTypeOfMessageDropDown();
		testUtil.testWaitTwo();
		communityPageFree.selectTypeOfMessage();
		testUtil.testWaitFour();
		communityPageFree.selectTypeOfMessage();
		testUtil.testWaitFour();
		communityPageFree.clickTypeOfMessageDropDown();
		testUtil.testWaitFour();
		communityPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitFour();
		communityPageFree.selectAreaOfInterestDropDown();
		testUtil.testWaitFour();
		communityPageFree.selectAreaOfInterestDropDown();
		testUtil.testWaitFour();
		communityPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitFour();
		communityPageFree.clickSectorTab();
		testUtil.testWaitFour();
		communityPageFree.selectSector();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		communityPageFree.selectSector();
		testUtil.testWaitFour();
		communityPageFree.clickSectorTab();
		testUtil.testWaitFour();
		communityPageFree.clickEveryoneDropDown();
		testUtil.testWaitFour();
		communityPageFree.selectMyOwnNetwork();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		communityPageFree.selectEveryoneNetwork();
		testUtil.testWaitFour();
		communityPageFree.clickEveryoneDropDown();
		testUtil.testWaitFour();
		communityPageFree.clickFouriteMessage();
		testUtil.testWaitFour();
		communityPageFree.clickFouriteMessage();
		testUtil.testWaitFour();
		//communityPageFree.clickMyNetworkBtn();
				
		
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
	}

}
