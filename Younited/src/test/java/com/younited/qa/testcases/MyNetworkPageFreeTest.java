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
		//testUtil.testWaitFourteen();
		//try {
			//homePageFree.clickAcceptAllCookies();
		//}catch(NoSuchElementException e) {
				//e.printStackTrace();
		//}
		//testUtil.testWaitFour();
		//try {
		    //homePageFree.suitableAssignments();
		//}catch(NoSuchElementException e) {
			//e.printStackTrace();
		//}
		//testUtil.testWaitFour();
		homePageFree.clickNetworkTab();
		//testUtil.testWaitFour();
		homePageFree.clickNetworkTabTooltip();
		//testUtil.testWaitEight();
	
	}
	
	@Test
	public void myNetworkPageFreeTest()throws Exception {
		myNetworkPageFree.clickSeachValue();
		//testUtil.testWaitTwo();
		myNetworkPageFree.enterSearchValue("Test");
		//testUtil.testWaitFour();
		myNetworkPageFree.clickCancelSearch();
		//testUtil.testWaitEight();
		//Type of Message
		myNetworkPageFree.clickTypeMessageDropDown();
		//testUtil.testWaitFour();
		myNetworkPageFree.selectTypeMessage();
		//testUtil.testWaitFour();
		myNetworkPageFree.selectTypeMessage();
		//testUtil.testWaitFour();
		myNetworkPageFree.clickTypeMessageDropDown();
		//testUtil.testWaitFour();
		//Area of Interest
		myNetworkPageFree.clickAreaOfInterestDropDown();
		//testUtil.testWaitFour();
		myNetworkPageFree.selectAreaOfInterest();
		//testUtil.testWaitFour();
		myNetworkPageFree.selectAreaOfInterest();
		//testUtil.testWaitFour();
		myNetworkPageFree.clickAreaOfInterestDropDown();
		//testUtil.testWaitFour();
		//Sector
		myNetworkPageFree.clickSectorDropDown();
		//testUtil.testWaitFour();
		myNetworkPageFree.selectSector();
		//testUtil.testWaitFour();
		myNetworkPageFree.selectSector();
		//testUtil.testWaitFour();
		myNetworkPageFree.clickSectorDropDown();
		//testUtil.testWaitTwo();
		myNetworkPageFree.clickEveryOneDropDown();
		//testUtil.testWaitTwo();
		myNetworkPageFree.selectEveryOneMyOwnNetwork();
		//testUtil.testWaitFour();
		myNetworkPageFree.selectEveryOneEveryOne();
		//testUtil.testWaitFour();
		myNetworkPageFree.clickEveryOneDropDown();
		//testUtil.testWaitTwo();
		myNetworkPageFree.clickFavoiritesPosts();
		//testUtil.testWaitFour();
		myNetworkPageFree.clickFavoiritesPosts();
		//testUtil.testWaitFour();
		//MyNetwork
		myNetworkPageFree.clickMyNetworkBtn();
		//testUtil.testWaitEight();
		myNetworkPageFree.clickMyNetworkTab();
		//testUtil.testWaitFour();
		myNetworkPageFree.clickMyRequestsTab();
		//testUtil.testWaitFour();
		testUtil.scrollDown();
		//testUtil.testWaitFour();
		testUtil.scrollUp();
		//testUtil.testWaitTwo();
		myNetworkPageFree.clickSuggestionsForYouTab();
		//testUtil.testWaitFour();
		testUtil.scrollDown();
		//testUtil.testWaitFour();
		testUtil.scrollUp();
		//testUtil.testWaitTwo();
		myNetworkPageFree.clickAreaOfInterest();
		//testUtil.testWaitFour();
		homePageFree.clickSignOutLink();
		//testUtil.testWaitFour();
		homePageFree.clickSignOutBtn();
		//testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
