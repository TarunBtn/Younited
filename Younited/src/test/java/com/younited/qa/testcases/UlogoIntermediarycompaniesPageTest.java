package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoAllcompaniesPage;
import com.younited.qa.pages.UlogoIntermediarycompaniesPage;
import com.younited.qa.util.TestUtil;

public class UlogoIntermediarycompaniesPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoAllcompaniesPage uLogoAllcompaniesPage;
	UlogoIntermediarycompaniesPage uLogoIntermediarycompanyPage;
	TestUtil testUtil;
	
	public UlogoIntermediarycompaniesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoAllcompaniesPage=new UlogoAllcompaniesPage();
		uLogoIntermediarycompanyPage=new UlogoIntermediarycompaniesPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEleven();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		//homePageAdmin.clickUserLogoPhoto();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		homePageAdmin.clickNativeCompanyTab();
		testUtil.testWaitFour();
		//homePageAdmin.moveHoverTologoImage();
		//testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		//homePageAdmin.clickNativeCompanyTab();
		//testUtil.testWaitFour();
	}
	
	@Test
	public void UlogoIntermediarycompanyPage()throws Exception {
		uLogoIntermediarycompanyPage.enterSearchCompany("SilverTouch");
		testUtil.testWaitFour();
		//uLogoIntermediarycompanyPage.clickSearchCompany();
		//testUtil.testWaitTwo();
		//uLogoIntermediarycompanyPage.clickCancelSearch();
		//testUtil.testWaitTwo();
		//Add new company
		uLogoIntermediarycompanyPage.clickAddNewCompany();
		testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		uLogoIntermediarycompanyPage.enterCompanyName("SilverTouch");
		testUtil.testWaitEight();
		uLogoIntermediarycompanyPage.selectCompanyTooltip();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//uLogoIntermediarycompanyPage.aboutYourCompany("Testdata");
		//testUtil.testWaitFour();
		//Sector
		uLogoIntermediarycompanyPage.clickSectorDropDown();
		testUtil.testWaitTwo();
		uLogoIntermediarycompanyPage.selectSector();
		testUtil.testWaitTwo();
		//testUtil.scrollDown();
		//testUtil.testWaitTwo();
		//Enter website
		uLogoIntermediarycompanyPage.clearWebsiteValue();
		testUtil.testWaitTwo();
		uLogoIntermediarycompanyPage.enterWebsite("https://silvertouch.com/");
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Save company
		uLogoIntermediarycompanyPage.clickSaveBtn();
		testUtil.testWaitEight();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitTwo();
		//testUtil.scrollUp();
		//testUtil.testWaitFour();
		uLogoIntermediarycompanyPage.clickCancelBtn();
		testUtil.testWaitEight();
		//Edit company
		/*uLogoIntermediarycompanyPage.clickEditBtn();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//uLogoIntermediarycompanyPage.clearCompanyName();
		//testUtil.testWaitTwo();
		//uLogoIntermediarycompanyPage.enterCompanyName("One");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Save
		//uLogoIntermediarycompanyPage.clickSaveBtnEdit();
		uLogoIntermediarycompanyPage.clickEditCancel();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();*/
		//Delete Company
		  //uLogoIntermediarycompanyPage.clickDeleteSign();
		  //testUtil.testWaitEight();
		//uLogoIntermediarycompanyPage.clickDeleteCompany();
		  //uLogoIntermediarycompanyPage.clickCancelDelete();
		  //testUtil.testWaitFour();
		//testUtil.scrollDown();
		//testUtil.testWaitFour();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
