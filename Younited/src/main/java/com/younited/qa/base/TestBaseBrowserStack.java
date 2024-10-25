package com.younited.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.younited.qa.util.TestUtil;

public class TestBaseBrowserStack {

	public static WebDriver Driver;
	public static Properties prop;

    public static final String USERNAME = "your_username";
    public static final String AUTOMATE_KEY = "your_access_key";
    public static final String BROWSERSTACK_URL = "https://" + "tarunbutani_PiOvc9" + ":" + "jpizFmPN3srPvMn6uf39" + "@hub-cloud.browserstack.com/wd/hub";

    public TestBaseBrowserStack() {
      try {
         prop = new Properties();
         FileInputStream ip = new FileInputStream("C:\\Users\\tbutani\\git\\YounitedOne\\YounitedOne\\src\\main\\java\\com\\younited\\qa\\config\\config.properties");
         prop.load(ip);
          } catch(FileNotFoundException e) {
                   e.printStackTrace();
          } catch(IOException e) {
          e.printStackTrace();
          }
      }

    public void initialization() throws Exception {
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        Driver = new ChromeDriver();
        } else if (browserName.equals("FF")) {
          System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        Driver = new FirefoxDriver();
        } else if (browserName.equals("browserstack")) {
        	
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "latest");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("name", "Sample Test");

    Driver = new RemoteWebDriver(new URL(BROWSERSTACK_URL), caps);
}

    Driver.manage().window().maximize();
    Driver.manage().deleteAllCookies();
    Driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    Driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    Driver.get(prop.getProperty("url"));

}
}



