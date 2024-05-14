package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.CommunityPageAdmin;
import com.younited.qa.pages.CommunityPageFree;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;


public class CommunityPageAdminTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	CommunityPageFree communityPageFree;
	CommunityPageAdmin communityPageAdmin;
	TestUtil testUtil;
	
	public CommunityPageAdminTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		communityPageFree=new CommunityPageFree();
		communityPageAdmin=new CommunityPageAdmin();		
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		//homePageAdmin.clickAcceptAllCookies();
		//testUtil.testWaitEight();
		homePageAdmin.clickCommunityPageAdmin();
		testUtil.testWaitEight();
						
	}
	
	@Test
	public void community() throws Exception{
		//CommunityPage
		communityPageFree.clickValueFilter();
		testUtil.testWaitTwo();
		communityPageFree.enterValueFilter("Hr");
		testUtil.testWaitEight();
		communityPageFree.clickCancelSign();
		testUtil.testWaitEight();
		//Type of message
		communityPageFree.clickTypeOfMessageDropDown();
		testUtil.testWaitTwo();
		communityPageFree.selectTypeOfMessage();
		testUtil.testWaitFour();
		communityPageFree.selectTypeOfMessage();
		testUtil.testWaitFour();
		communityPageFree.clickTypeOfMessageDropDown();
		testUtil.testWaitTwo();
		//Area of Interest
		communityPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitTwo();
		communityPageFree.selectAreaOfInterestDropDown();
		testUtil.testWaitFour();
		communityPageFree.selectAreaOfInterestDropDown();
		testUtil.testWaitFour();
		communityPageFree.clickAreaOfInterestDropDown();
		testUtil.testWaitTwo();
		//Sector
		communityPageFree.clickSectorTab();
		testUtil.testWaitTwo();
		communityPageFree.selectSector();
		testUtil.testWaitFour();
		communityPageFree.selectSector();
		testUtil.testWaitFour();
		communityPageFree.clickSectorTab();
		testUtil.testWaitTwo();
		//EveryOne
		communityPageFree.clickEveryoneDropDown();
		testUtil.testWaitTwo();
		communityPageFree.selectMyOwnNetwork();
		testUtil.testWaitFour();
		communityPageFree.selectEveryoneNetwork();
		testUtil.testWaitFour();
		communityPageFree.clickEveryoneDropDown();
		testUtil.testWaitTwo();
		//Favourites
		communityPageFree.clickFouriteMessage();
		testUtil.testWaitFour();
		communityPageFree.clickFouriteMessage();
		testUtil.testWaitFour();
		
				
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
