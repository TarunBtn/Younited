package com.younited.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoMyprofilePage extends TestBase{
	//Pagefactory OR Object Repository
    @FindBy(xpath="//li[@class='breadcrumb-item active']") 
    WebElement myProfileLogo;

    @FindBy(xpath="//button[@class='btn btn-gold ml-4']")
    WebElement editYourProfile;

	@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[1]")
	WebElement generalTab;
			
	@FindBy(xpath="//*[@id=\"page-header\"]/div[2]/div/div[2]/div/div[3]/div[2]/button")
	WebElement changeMyGeneralInformation;
			
	@FindBy(xpath="//*[@id=\"general-profile-edit\"]/div/form/div[11]/div/a")
	WebElement changeMyGeneralInformationCancel;
			
	@FindBy(xpath="//*[@id=\"profile-detailed\"]/div/div[1]/div[4]/div/div/a")
	WebElement fillInCompany;
			
	@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[22]/div/a")
	WebElement fillInCompanyCancel;
	
	@FindBy(xpath="//a[@href='/mijn-profiel/beschikbaarheid']")
	WebElement availabilityTab;
			
	@FindBy(xpath="//a[@title='Vaardigheden']")
	WebElement skillsTab;
			
	@FindBy(id="suggestionsForJobTitle")
	WebElement enterSkillsValue;
			
	@FindBy(xpath="//*[@id=\"my-profile\"]")
	WebElement selectSkillsValue;
			
	@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div[1]/div/form/div/button")
	WebElement saveAdditionalSkills;
			
	@FindBy(xpath="//*[@id=\"skills\"]/div[3]/div/div/div[2]/ul/li[42]/div/a/span")
	WebElement clickRemoveSkills;
			
	@FindBy(xpath="//*[@id=\"remove\"]/div/div/div[2]/button[1]")
	WebElement deleteSkills;
			
	@FindBy(xpath="//a[@title='Werkervaring']")
	WebElement workExperienceTab;
			
	@FindBy(xpath="//a[@class='btn btn-primary-outline']")
	WebElement addWorkExperience;
			
	@FindBy(id="functie")
	WebElement function;
			
	@FindBy(id="bedrijf")
	WebElement company;
			
	@FindBy(xpath="//select[@class='form-control custom-select']")
	WebElement type;
			
	@FindBy(xpath="//*[@id=\"type\"]/option[2]")
	WebElement selectType;
			
	@FindBy(id="beschrijving")
	WebElement description;
			
	@FindBy(xpath="//*[@id=\"startdatum\"]/div/div/input")
	WebElement startDateCalender;
			
	@FindBy(xpath="/html/body/div[1]/div/div[1]/main/div/div[2]/form/div[7]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/button[1]/span/svg")
	WebElement selectYear;
			
	@FindBy(xpath="/html/body/div[1]/div/span/div/main/span/div/div[2]/form/div[7]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div[1]/div")
	WebElement selectStartDate;
			
	@FindBy(xpath="//*[@id=\"einddatum\"]/div/div/input")
	WebElement endDateCalender;
			
	@FindBy(xpath="/html/body/div[1]/div/span/div/main/span/div/div[2]/form/div[8]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div[2]/div")
	WebElement selectEndDate;
			
	@FindBy(xpath="//*[@id=\"professiondescription\"]")
	WebElement enterProfile;
			
	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/form/div[9]/div/div[2]/div[3]/div/div/div/div[2]/a/div[2]/span")
	WebElement selectProfile;
			
	@FindBy(xpath="//button[@class='btn btn-primary mb-2 mb-sm-0 mr-sm-2 d-inline-flex justify-content-center align-items-center']")
	WebElement saveBtn;
			
	@FindBy(xpath="//*[@id=\"timeline\"]/div[2]/div[2]/div/div/a[1]")
	WebElement editWorkExperience;
			
	@FindBy(xpath="//*[@id=\"timeline\"]/div/div[2]/div[2]/div/div/a[2]")
	WebElement deleteWorkExperience;
			
	@FindBy(xpath="//*[@id=\"remove\"]/div/div/div[3]/button[1]")
	WebElement clickDeleteWorkExperience;
			
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement uploadCV;
	
	@FindBy(xpath="//span[@class='input-group-text']")
	WebElement chooseFile;
	
	@FindBy(xpath="//button[normalize-space()='Toon werkervaring']")
	WebElement uploadFile;
	
	@FindBy(xpath="//*[@id=\"uploadCvConfirmation___BV_modal_body_\"]/div[2]/button[1]")
	WebElement clickUpdateMyProfile;
	
	@FindBy(xpath="//*[@id=\"uploadCvConfirmation___BV_modal_body_\"]/div[2]/button[2]")
	WebElement clickCancelUploadCV;
	
	@FindBy(xpath="//a[@title='Opleidingen']")
	WebElement educationsTab;
	
	@FindBy(xpath="//a[@class='btn btn-primary-outline margin-left-add-button']")
	WebElement addEducations;
	
	@FindBy(id="studierichting")
	WebElement fieldOfStudy;
	
	@FindBy(xpath="//select[@id='opleidingsniveau']")
	WebElement educationLevel;
	
	@FindBy(xpath="//*[@id=\"opleidingsniveau\"]/option[5]")
	WebElement selectEducationLevel;
	
	@FindBy(id="van")
	WebElement startingYear;
	
	@FindBy(xpath="//*[@id=\"van\"]/option[7]")
	WebElement selectStartingYear;
	
	@FindBy(xpath="//button[@class='btn btn-primary mb-2 mb-sm-0 mr-sm-2 d-inline-flex justify-content-center align-items-center']")
	WebElement clickSaveBtn;
	
	@FindBy(xpath="//*[@id=\"timeline\"]/div[1]/div[2]/div/div/a[1]")
	WebElement editEducations;
	
	@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/form/div[9]/div/a")
	WebElement deleteEducations;
	
	@FindBy(xpath="//*[@id=\"remove\"]/div/div/div[3]/button[1]")
	WebElement clickDeleteEducations;
	
	@FindBy(xpath="//a[@title='Cursussen']")
	WebElement coursesTab;
	
	@FindBy(xpath="//body/div[@id='app']/div/span/div[@id='app']/main/span/div[@class='componentTemplate']/div[@class='container']/div[2]/a[1]")
	WebElement addCourse;
	
	@FindBy(id="cursus")
	WebElement course;
	
	@FindBy(id="omschrijving")
	WebElement descriptionCourse;
	
	@FindBy(xpath="//*[@id=\"afgeronddatum\"]/div/div/input")
	WebElement clickCompletedOnDate;

	@FindBy(xpath="/html/body/div[1]/div/span/div/main/span/div/div[2]/form/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div[1]/div")
	WebElement selectCompletedOnDate;
	
	@FindBy(xpath="//button[@class='btn btn-primary mb-2 mb-sm-0 mr-sm-2 d-inline-flex justify-content-center align-items-center']")
	WebElement clickSaveCourse;
	
	@FindBy(xpath="//*[@id=\"timeline\"]/div[3]/div[2]/div/div/a[1]")
	WebElement editCourse;
	
	@FindBy(xpath="//*[@id=\"timeline\"]/div/div[2]/div[2]/span/div[2]/a[2]")
	WebElement deleteCourse;
	
	@FindBy(xpath="//*[@id=\"remove\"]/div/div/div[3]/button[1]")
	WebElement confirmDeleteCourse;
	
	@FindBy(xpath="//a[@title='Instellingen']")
	WebElement institutions;
			
	//Initialization
	public UlogoMyprofilePage() {
		PageFactory.initElements(Driver, this);
	}
			
	//Actions
	public void clickMyProfileLogo() {
		myProfileLogo.click();
	}
	
	public void clickEditYourProfile() {
		editYourProfile.click();
	}
	
	public void clickGeneralTab() {
		generalTab.click();
	}
			
	public void clickChangeMyGeneralInformation() {
		changeMyGeneralInformation.click();
	}
			
	public void clickChangeMyGeneralInformationCancel() {
		changeMyGeneralInformationCancel.click();
	}
			
	public void clickFillInCompany() {
		fillInCompany.click();
	}
			
	public void clickFillInCompanyCancel() {
		fillInCompanyCancel.click();
	}
	
	public void clickAvailabilityTab() {
		availabilityTab.click();
	}
			
	public void clickSkillsTab() {
		skillsTab.click();
	}
			
	public void enterSkillsValue(String value) {
		enterSkillsValue.sendKeys(value);
	}
			
	public void selectSkillsValue() {
		selectSkillsValue.click();
	}
			
	public void clickSaveAdditionalSkills() {
		saveAdditionalSkills.click();
	}
			
	public void clickRemoveSkills() {
		clickRemoveSkills.click();
	}
			
	public void clickDeleteSkills() {
		deleteSkills.click();
	}
			
	public void clickWorkExperienceTab() {
		workExperienceTab.click();
	}
			
	public void clickAddWorkExperience() {
		addWorkExperience.click();
	}
		
	public void enterFunction(String value) {
		function.sendKeys(value);
	}
			
	public void enterCompany(String value) {
		company.sendKeys(value);
	}
			
	public void clickTypeWorkExperience() {
		type.click();
	}
			
	public void selectTypeWorkExperience() {
		selectType.click();
	}
			
	public void enterDescription(String value) {
		description.sendKeys(value);
	}
			
	public void clickStartDateCalender() {
		startDateCalender.click();
	}
			
	public void selectStartYear() {
		selectYear.click();
	}
			
	public void selectStartDate() {
		selectStartDate.click();
	}
			
	public void clickEndDateCalender() {
		endDateCalender.click();
	}
			
	public void selectEndDate() {
		selectEndDate.click();
	}
			
	public void enterProfile(String value) {
		enterProfile.sendKeys(value);
	}
			
	public void selectProfile() {
		enterProfile.sendKeys(Keys.TAB);
	}
			
	public void clickSaveBtn() {
		saveBtn.click();
	}
			
	public void clickEditWorkExperience() {
		editWorkExperience.click();
	}
			
	public void deleteWorkExperience() {
		deleteWorkExperience.click();
	}
			
	public void clickDeleteWorkExperience() {
		clickDeleteWorkExperience.click();
	}
			
	public void clickUploadCV() {
		uploadCV.click();
	}
	
	public void clickChooseFile() {
		chooseFile.click();
	}
	
	public void clickUploadFile() {
		uploadFile.click();
	}
	
	public void clickUpdateMyProfile() {
		clickUpdateMyProfile.click();
	}
	
	public void clickCancelUploadCV() {
		clickCancelUploadCV.click();
	}
	
	public void clickEducationsTab() {
		educationsTab.click();
	}
	
	public void clickAddEducations() {
		addEducations.click();
	}
	
	public void enterFieldOfStudy(String value) {
		fieldOfStudy.sendKeys(value);
	}
	
	public void clickEducationLevel() {
		educationLevel.click();
	}
	
	public void selectEducationLevel() {
		selectEducationLevel.click();
	}
	
	public void clickStartingYear() {
		startingYear.click();
	}
	
	public void selectStartingYear() {
		selectStartingYear.click();
	}
	
	public void clickSaveBtnOne() {
		clickSaveBtn.click();
	}
	
	public void clickEditEducations() {
		editEducations.click();
	}
	
	public void clickDeleteEducations() {
		deleteEducations.click();
	}
	
	public void clickConfirmDeleteEducations() {
		clickDeleteEducations.click();
	}
	
	public void clickCoursesTab() {
		coursesTab.click();;
	}
	
	public void clickAddCourse() {
		addCourse.click();
	}
	
	public void enterCourse(String value) {
		course.sendKeys(value);
	}
	
	public void enterDescriptionCourse(String value) {
		descriptionCourse.sendKeys(value);
	}

	public void clickCompletedOnDateCourse() {
		clickCompletedOnDate.click();
	}
	
	public void selectCompletedOnDateCourse() {
		selectCompletedOnDate.click();
	}
	
	public void clickSaveCourse() {
		clickSaveCourse.click();
	}
	
	public void clickEditCourse() {
		editCourse.click();
	}
	
	public void clickDeleteCourse() {
		deleteCourse.click();
	}
	
	public void clickConfirmDeleteCourse() {
		confirmDeleteCourse.click();
	}
	
	public void clickInstitutionsTab() {
		institutions.click();
	}

}
