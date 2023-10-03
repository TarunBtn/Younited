package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoAllcompaniesPage;
import com.younited.qa.pages.UlogoMycompanyPage;
import com.younited.qa.util.TestUtil;

public class UlogoAllcompaniesPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMycompanyPage uLogoMycompanyPage;
	UlogoAllcompaniesPage uLogoAllcompaniesPage;
	TestUtil testUtil;
	
	public UlogoAllcompaniesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoMycompanyPage=new UlogoMycompanyPage();
		uLogoAllcompaniesPage=new UlogoAllcompaniesPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickAllCompaniesTab();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
								
	}
	
	@Test
	public void UlogoAllcompaniesPage()throws Exception {
		//Company verified
		uLogoAllcompaniesPage.clickVerifiedCompanyDropDown();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.selectVerifiedCompany();
		testUtil.testWaitEight();		
		uLogoAllcompaniesPage.selectNotVerifiedCompany();
		testUtil.testWaitEight();	
		uLogoAllcompaniesPage.selectAllCompany();
		testUtil.testWaitEight();
		uLogoAllcompaniesPage.clickVerifiedCompanyDropDown();
		testUtil.testWaitFour();
		//Search Deleted company
		uLogoAllcompaniesPage.clickSearchDeletedCompany();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickSearchDeletedCompany();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.enterValueCompanyFilter("Silver");
		testUtil.testWaitFour();
		//Exact match
		uLogoAllcompaniesPage.clickExactMatch();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickExactMatch();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickResetCompanyFilter();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//AddNewCompany
		uLogoAllcompaniesPage.clickAddNewCompany();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.enterCompanyName("Silver Autogroep");
		testUtil.testWaitEight();
		uLogoAllcompaniesPage.selectCompanyTooltip();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.clickSectorDropDown();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.selectSectorCompany();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clearWebsiteField();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.enterWebsite("https://silverauto.com/");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.clickSaveBtn();
		//uLogoAllcompaniesPage.clickCancelBtn();
		testUtil.testWaitEleven();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoMycompanyPage.clickDeleteCompanySign();
		testUtil.testWaitFour();
		System.out.println(uLogoAllcompaniesPage.companyLink());
		testUtil.testWaitTwo();
		if(uLogoAllcompaniesPage.companyLink().equals("Silver Autogroep verified")) {
			testUtil.testWaitTwo();
			uLogoMycompanyPage.clickDeleteCompany();
			testUtil.testWaitEight();
		}else {
			System.out.println("Company name not exist");
		}
					
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
