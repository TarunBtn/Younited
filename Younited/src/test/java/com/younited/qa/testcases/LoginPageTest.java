package com.younited.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.pages.HomePage;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	
	
		public void doLogin() {
			Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/");
			Driver.findElement(By.id("username")).sendKeys("lb+acc-freelancer@nowonline.nl");
			Driver.findElement(By.id("password")).sendKeys("Tester01!");
			Driver.findElement(By.name("action")).click();
		}
		
		@Test(priority=1)
		public void checkInventory() {
			doLogin();
			String title=Driver.getTitle();
			Assert.assertEquals("Younited®", title);
			System.out.println("Test is passed");
		}
		
		@Test(priority=2)
		public void checkAssignmentsLink() {
			doLogin();
			boolean status=Driver.findElement(By.linkText("Assignments")).isDisplayed();
			Assert.assertEquals(true, status);
			System.out.println("Test is passed");
		}
	
	
	/*LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;

	public LoginPageTest(){
		super();
	}
		
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()throws Exception {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Log in | Younited® platform");
		testUtil.testWaitFour();
	}
	
	@Test(priority=2)
	public void imageLogoTest()throws Exception {
		boolean flag=loginPage.validateImageLogo();
		Assert.assertTrue(flag);
		testUtil.testWaitFour();
	}
	
	@Test(priority=3)
	public void loginTest()throws Exception {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.testWaitFour();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}*/

}
