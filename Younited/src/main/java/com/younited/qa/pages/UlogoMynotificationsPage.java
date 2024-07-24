package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoMynotificationsPage extends TestBase{
	//PageFactory or Object Repository
	
		@FindBy(xpath="//p[normalize-space()='Mijn meldingen']")
		WebElement myNotificationsLink;
		
		@FindBy(xpath="//*[@id=\"message0\"]/div")
		WebElement clickOpenMail;
		
		//Initialization
		public UlogoMynotificationsPage() {
			PageFactory.initElements(Driver, this);
		}
		
		//Actions
		
		public void clickMyNotificationsLink() {
			myNotificationsLink.click();
		}
		
		public void ClickToOpenMail() {
			clickOpenMail.click();
		}

}
