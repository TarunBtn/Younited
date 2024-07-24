package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class StorePageFree extends TestBase{
	//Page factory OR Object Repository
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[1]")
			WebElement allTab;
			
			@FindBy(xpath="//*[@id=\"store-overview\"]/div[1]/div[7]/div/div/div/a")
			WebElement moreInformationAll;
			
			@FindBy(linkText="Terug naar alle producten")
			WebElement backToAllProducts;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[2]")
			WebElement bookKeepingTab;
			
			@FindBy(xpath="//*[@id=\"store-overview\"]/div/div/div/div/div/a")
			WebElement moreInformationAccounting;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[3]")
			WebElement ctaTestGroup;
			
			@FindBy(xpath="//*[@id=\"store-overview\"]/div/div[4]/div/div/div/a")
			WebElement moreInformationCTA;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[4]")
			WebElement demoTraining;
			
			@FindBy(xpath="//*[@id=\"store-overview\"]/div/div[1]/div/div/div/a")
			WebElement moreInformationDemoTraining;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[5]")
			WebElement development;
			
			@FindBy(xpath="//*[@id=\"store-overview\"]/div/div[1]/div/div/div/a")
			WebElement moreInformationDevelopment;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[6]")
			WebElement test;
			
			@FindBy(xpath="//*[@id=\"store-overview\"]/div/div[1]/div/div/div/a")
			WebElement moreInformationTest;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[7]")
			WebElement testUrl;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[8]")
			WebElement insurances;
			
			//Initialization
			public StorePageFree() {
				PageFactory.initElements(Driver, this);
			}
			
			//Actions
			public void clickAllTab() {
				allTab.click();
			}
			
			public void clickMoreInformationAll() {
				moreInformationAll.click();
			}
			
			public void clickBackToAllProductsLink() {
				backToAllProducts.click();
			}
			
			public void clickBookKeepingTab() {
				bookKeepingTab.click();
			}
			
			public void clickMoreInformationAccounting() {
				moreInformationAccounting.click();
			}
			
			public void clickCTATestGroupTab() {
				ctaTestGroup.click();
			}
			
			public void clickMoreInformationCTA() {
				moreInformationCTA.click();
			}
			
			public void clickDemoTrainingTab() {
				demoTraining.click();
			}
			
			public void clickMoreInformationDemoTraining() {
				moreInformationDemoTraining.click();
			}
			
			public void clickDevelopmentTab() {
				development.click();
			}
			
			public void clickMoreInformationDevelopment() {
				moreInformationDevelopment.click();
			}
			
			public void clickTestTab() {
				test.click();
			}
			
			public void clickMoreInformationTest() {
				moreInformationTest.click();
			}
			
			public void clickTestUrlTab() {
				testUrl.click();
			}
			
			public void clickInsurancesTab() {
				insurances.click();
			}

}
