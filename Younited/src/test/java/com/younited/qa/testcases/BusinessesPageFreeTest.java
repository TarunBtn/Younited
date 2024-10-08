package com.younited.qa.testcases;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.younited.qa.base.TestBase;
import com.younited.qa.base.TestBaseBrowserStack;
import com.younited.qa.pages.BusinessesPageFree;
import com.younited.qa.pages.HomePageFree;
import com.younited.qa.pages.LoginPage;
import com.younited.qa.util.TestUtil;


public class BusinessesPageFreeTest extends TestBase{
	
	/*public void doLogin() {
		Driver.get("https://acc-nox-freelancemarktplaats-mobility.azurewebsites.net/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("username")).sendKeys("lb+acc-freelancer@nowonline.nl");
		Driver.findElement(By.id("password")).sendKeys("Tester01!");
		Driver.findElement(By.name("action")).click();
	}
		
		@Test
		public void BusinessesPageFreeTest() {
			doLogin();
			Driver.findElement(By.xpath("//span[@class='d-flex']")).click();
			Driver.findElement(By.xpath("//a[@class='nav-link active']")).click();
			Driver.findElement(By.xpath("company-search")).sendKeys("Apex");
			Driver.findElement(By.xpath("//span[@class='simple-typeahead-list-item-text']")).click();
			Driver.findElement(By.xpath("//span[@class='material-icons clear-icon']")).click();
			//Sorting dropdown
			Driver.findElement(By.xpath("//select[@class='custom-select inverted-select-bg']")).click();
			Driver.findElement(By.xpath("//*[@id=\"assignment-sorting\"]/div/select/option[2]']")).click();
			Driver.findElement(By.xpath("//*[@id=\"assignment-sorting\"]/div/select/option[3]")).click();
			Driver.findElement(By.xpath("//*[@id=\"assignment-sorting\"]/div/select/option[4]")).click();
			Driver.findElement(By.xpath("//*[@id=\"assignment-sorting\"]/div/select/option[1]")).click();
			Driver.quit();
			
			
		}*/
		
	
	LoginPage loginPage;
	HomePageFree homePageFree;
	BusinessesPageFree businessesPageFree;
	TestUtil testUtil;
	
	public BusinessesPageFreeTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		businessesPageFree=new BusinessesPageFree();
		testUtil=new TestUtil();
		homePageFree=loginPage.loginHomePageFree(prop.getProperty("usernameone"), prop.getProperty("passwordone"));
		testUtil.testWaitFourteen();
		//homePageFree.clickAcceptAllCookies();
		//testUtil.testWaitEleven();
		//homePageFree.suitableAssignments();
		//testUtil.testWaitFour();
		homePageFree.clickBusinessesTab();
		testUtil.testWaitEleven();
				
	}
	
	@Test
	public void businessesPageFree()throws Exception {
		//Filter value
		businessesPageFree.filterValue("Apex");
		testUtil.testWaitEight();
		businessesPageFree.filterValueTooltip();
		testUtil.testWaitEight();
		businessesPageFree.removeFilter();
		testUtil.testWaitEight();
		//Sector-field removed
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.selectSector();
		//testUtil.testWaitFour();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		//businessesPageFree.selectSector();
		//testUtil.testWaitFour();
		//businessesPageFree.clickSector();
		//testUtil.testWaitTwo();
		businessesPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		businessesPageFree.sortingZtoA();
		testUtil.testWaitFour();
		businessesPageFree.sortingLocationAtoZ();
		testUtil.testWaitFour();
		businessesPageFree.sortingLocationZtoA();
		testUtil.testWaitFour();
		businessesPageFree.sortingAtoZ();
		testUtil.testWaitFour();
		businessesPageFree.clickSortingDropDown();
		testUtil.testWaitFour();
		homePageFree.clickSignOutLink();
		testUtil.testWaitFour();
		homePageFree.clickSignOutBtn();
		testUtil.testWaitEight();
		
	}
	
	@AfterMethod
	public void tearDown(){
		Driver.quit();
		
	}

}
