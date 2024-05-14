package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class AddCommandPage extends TestBase{
	//Page factory or Object Repository
		@FindBy(xpath="//*[@id=\"assignment-add\"]/span[3]/div/div/div[1]/div[1]/div[3]/label/span")
		WebElement chooseFile;
			
		@FindBy(xpath="//*[@id=\"assignment-add\"]/div[2]/span/div/div/div[2]/button")
		WebElement uploadFile;
			
		//Initialization
		public AddCommandPage() {
			PageFactory.initElements(Driver, this);
		}
				
		//Actions
		public void clickChooseFile() {
			chooseFile.click();
		}
			
		public CheckCommandPage clickUploadFile() {
			uploadFile.click();
			return new CheckCommandPage();
		}

}
