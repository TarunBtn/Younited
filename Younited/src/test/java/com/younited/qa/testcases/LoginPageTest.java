package com.younited.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest(){
		super();
	}
		
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()throws Exception {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Log in | Younited® platform");
		Thread.sleep(4000);
	}
	
	@Test(priority=2)
	public void imageLogoTest()throws Exception {
		boolean flag=loginPage.validateImageLogo();
		Assert.assertTrue(flag);
		Thread.sleep(4000);
	}
	
	@Test(priority=3)
	public void loginTest() throws Exception {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(11000);
	}
	
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
