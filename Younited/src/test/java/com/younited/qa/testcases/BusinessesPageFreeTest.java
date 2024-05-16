package com.younited.qa.testcases;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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

import io.github.bonigarcia.wdm.WebDriverManager;

public class BusinessesPageFreeTest extends TestBaseBrowserStack{
	LoginPage loginPage;
	HomePageFree homePageFree;
	BusinessesPageFree businessesPageFree;
	TestUtil testUtil;
	
	/*public static final String USERNAME="tarunbutani_PiOvc9";
	public static final String AUTOMATE_KEY="jpizFmPN3srPvMn6uf39";
	public static final String URL="https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";*/
	
	@Parameters({"os", "osVersion", "browserName", "browserVersion"})
	@BeforeMethod
	public void setUp(String os, String osVersion, String browserName, String browserVersion, Method name) {
		
		System.out.println("Browser name is: "+browserName);
		String methodName=name.getName();
		
		DesiredCapabilities caps=new DesiredCapabilities();
		
		caps.setCapability("os", os);
		caps.setCapability("osVersion", osVersion);
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("browserVersion", browserVersion);
		caps.setCapability("name", methodName);
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			caps.setCapability("browser", "Chrome");
		}else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			caps.setCapability("browser", "Firefox");
		}
		
		try {
			Driver=new RemoteWebDriver(new URL(URL), caps);
			Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

	public BusinessesPageFreeTest() {
		super();
	}
	
	//@BeforeMethod
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
	
	//@Test
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
		
	}
	
	//@AfterMethod
	public void tearDown(){
		Driver.quit();
		
	}

}
