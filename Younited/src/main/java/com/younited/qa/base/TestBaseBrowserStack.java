package com.younited.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseBrowserStack {
	
	public static WebDriver Driver;
	public static Properties prop;
	/*public static final String USERNAME="tarunbutani_PiOvc9";
	public static final String AUTOMATE_KEY="jpizFmPN3srPvMn6uf39";
	public static final String URL="https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
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
		
	}*/
	
	public TestBaseBrowserStack() {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\no02\\git\\Younited\\Younited\\src\\main\\java\\com\\younited\\qa\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization()throws Exception {
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
	}

	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		Driver.quit();
	}

}
