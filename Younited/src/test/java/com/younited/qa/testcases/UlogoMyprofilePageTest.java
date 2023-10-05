package com.younited.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePageAdmin;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.UlogoMyprofilePage;
import com.younited.qa.util.TestUtil;

public class UlogoMyprofilePageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMyprofilePage uLogoMyprofilePage;
	TestUtil testUtil;
	
	public UlogoMyprofilePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoMyprofilePage=new UlogoMyprofilePage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickMyProfileTab();
		testUtil.testWaitEight();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		
	}
	
	@Test
	public void UlogoMyProfilePage()throws Exception {
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();		
		uLogoMyprofilePage.clickChangeMyGeneralInformation();
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
		uLogoMyprofilePage.clickChangeMyGeneralInformationCancel();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickFillInCompany();
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
		uLogoMyprofilePage.clickFillInCompanyCancel();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickSkillsTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Enter skill value
		uLogoMyprofilePage.enterSkillsValue("Account");
		testUtil.testWaitEight();
		uLogoMyprofilePage.selectSkillsValue();
		testUtil.testWaitFour();
		//Save additional skills
		uLogoMyprofilePage.clickSaveAdditionalSkills();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Remove skills
		uLogoMyprofilePage.clickRemoveSkills();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickDeleteSkills();
		testUtil.testWaitFour();
		//Work experience
		uLogoMyprofilePage.clickWorkExperienceTab();
		testUtil.testWaitEight();
		uLogoMyprofilePage.clickAddWorkExperience();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterFunction("DBA");
		testUtil.testWaitFour();
		uLogoMyprofilePage.enterCompany("TCS");
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickTypeWorkExperience();
		testUtil.testWaitFour();
		uLogoMyprofilePage.selectTypeWorkExperience();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickTypeWorkExperience();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterDescription("This is test data");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickStartDateCalender();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartDate();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEndDateCalender();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectEndDate();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterProfile("Database administrator");
		testUtil.testWaitFour();
		uLogoMyprofilePage.selectProfile();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickSaveBtn();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEditWorkExperience();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.deleteWorkExperience();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickDeleteWorkExperience();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		//Upload CV
		uLogoMyprofilePage.clickUploadCV();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickChooseFile();
		testUtil.testWaitFour();
		testUtil.uploadFile("D:\\Testfile.docx");
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickUploadFile();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickUpdateMyProfile();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickCancelUploadCV();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		//Educations
		uLogoMyprofilePage.clickEducationsTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickAddTraining();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterFieldOfStudy("Computer Science");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEducationLevel();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectEducationLevel();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEducationLevel();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickStartingYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.selectStartingYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickStartingYear();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickSaveBtnOne();
		testUtil.testWaitEight();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEditEducations();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickDeleteEducations();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickConfirmDeleteEducations();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//Courses
		uLogoMyprofilePage.clickCoursesTab();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickAddCourse();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterCourse("Data Security");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.enterDescriptionCourse("This is test data");
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickCompletedOnDateCourse();
		testUtil.testWaitFour();
		uLogoMyprofilePage.selectCompletedOnDateCourse();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickSaveCourse();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickEditCourse();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickDeleteCourse();
		testUtil.testWaitFour();
		uLogoMyprofilePage.clickConfirmDeleteCourse();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMyprofilePage.clickInstitutionsTab();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
