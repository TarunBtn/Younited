package com.younited.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.younited.qa.base.TestBase;
import com.younited.qa.pages.AddCommandPage;
import com.younited.qa.pages.CheckCommandPage;
import com.younited.qa.pages.CompleteAssignment;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.pages.MyAssignmentsPage;
import com.younited.qa.util.TestUtil;

public class CompleteAssignmentTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MyAssignmentsPage myAssignmentsPage;
	AddCommandPage addCommandPage;
	CheckCommandPage checkCommandPage;
	CompleteAssignment completeAssignment;
	TestUtil testUtil;
	
	public CompleteAssignmentTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		addCommandPage=new AddCommandPage();
		checkCommandPage=new CheckCommandPage();
		myAssignmentsPage=new MyAssignmentsPage();
		completeAssignment=new CompleteAssignment();
		testUtil=new TestUtil();		
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitEight();
		//homePage.clickAcceptAllCookies();
		//testUtil.testWaitEight();		
		homePage.clickMyAssignmentsLink();
		testUtil.testWaitEleven();
		testUtil.testWaitEleven();
		addCommandPage=myAssignmentsPage.clickAddNewCommand();
		testUtil.testWaitEight();												
		addCommandPage.clickChooseFile();		
		testUtil.testWaitFour();
		testUtil.uploadFile("D:\\Testfile.docx");
		testUtil.testWaitEight();
		addCommandPage.clickUploadFile();
		testUtil.testWaitEight();
		checkCommandPage.clickFillInComplete();
		testUtil.testWaitEight();
	}
	
	@Test
	public void completeAssignmentTest()throws Exception {
		completeAssignment.selectCompany();
		testUtil.testWaitFour();
		completeAssignment.clickSectorDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectSectorFromDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectWorkLocation();
		testUtil.testWaitFour();
		//completeAssignment.clickWorkLocationTooltip();
		//testUtil.testWaitFour();
		//try {
			//Driver.findElement(By.name("date")).sendKeys("01-08-2024");
				
		//}catch(ElementNotInteractableException e) {
			//e.printStackTrace();
		//}	
		testUtil.testWaitTwo();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		testUtil.scrollUp();
	    testUtil.testWaitEleven();
		//Generate description
	    try {
		    completeAssignment.clickGenerateDescription();
		    testUtil.testWaitEight();
		    //testUtil.testWaitFourteen();
	    }catch(NoSuchElementException e) {
	    	e.printStackTrace();
	    }	    
		//completeAssignment.clickUseThisText();
		//testUtil.testWaitEight();	   
	    testUtil.testWaitTwo();;
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();        
		//Select start date
		completeAssignment.clickStartDateDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectStartYear();
		testUtil.testWaitTwo();
		completeAssignment.selectStartDate();
		testUtil.testWaitTwo();		
		//Select end date
		completeAssignment.clickEndDateDropDown();
		testUtil.testWaitTwo();
		completeAssignment.selectEndYear();
		testUtil.testWaitTwo();
		completeAssignment.selectEndYear();
		testUtil.testWaitTwo();
		completeAssignment.selectEndDate();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		//NumberofHours
		completeAssignment.selectNumberOfHours();
		testUtil.testWaitFour();
		//selectWorkingThinkingLevel
		completeAssignment.selectWorkingThinkingLevel();
		testUtil.testWaitFour();
		//Select FieldOfExpertise
		completeAssignment.clickFieldOfExpertise();
		testUtil.testWaitFour();
		completeAssignment.selectFieldOfExpertise();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		//completeAssignment.clickSaveButton();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
