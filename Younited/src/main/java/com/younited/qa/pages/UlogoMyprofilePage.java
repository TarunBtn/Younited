package com.younited.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.younited.qa.base.TestBase;

public class UlogoMyprofilePage extends TestBase{
	//Pagefactory OR Object Repository
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[1]")
			WebElement generalTab;
					
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div[3]/div/div/a")
			WebElement changeMyGeneralInformation;
					
			@FindBy(xpath="//*[@id=\"general-profile-edit\"]/div/form/div[8]/div/a")
			WebElement changeMyGeneralInformationCancel;
					
			@FindBy(xpath="//*[@id=\"profile-detailed\"]/div/div[1]/div[4]/div/div/a")
			WebElement fillInCompany;
					
			@FindBy(xpath="//*[@id=\"general-company-edit\"]/form/div[22]/div/a")
			WebElement fillInCompanyCancel;
					
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[2]")
			WebElement skillsTab;
					
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div[1]/div/div/div[1]/input")
			WebElement enterSkillsValue;
					
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/div[1]/div/div/div[2]/a[3]/div[2]/span")
			WebElement selectSkillsValue;
					
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div[1]/div/form/div/button")
			WebElement saveAdditionalSkills;
					
			@FindBy(xpath="//*[@id=\"skills\"]/div[2]/div/div/div[2]/ul/li[21]/div/a/span")
			WebElement clickRemoveSkills;
					
			@FindBy(xpath="//*[@id=\"remove\"]/div/div/div[2]/button[1]")
			WebElement deleteSkills;
					
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[3]")
			WebElement workExperienceTab;
					
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div/div[1]/div/a[1]")
			WebElement addWorkExperience;
					
			@FindBy(id="functie")
			WebElement function;
					
			@FindBy(id="bedrijf")
			WebElement company;
					
			@FindBy(id="type")
			WebElement type;
					
			@FindBy(xpath="//*[@id=\"type\"]/option[2]")
			WebElement selectType;
					
			@FindBy(id="beschrijving")
			WebElement description;
					
			@FindBy(name="date")
			WebElement startDateCalender;
					
			@FindBy(xpath="//*[@id=\"my-profile\"]/div[7]/div/div/div/div[1]/button[1]/i")
			WebElement selectYear;
					
			@FindBy(xpath="//*[@id=\"my-profile\"]/div[7]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/div")
			WebElement selectDate;
					
			@FindBy(xpath="//*[@id=\"einddatum\"]/div/i")
			WebElement endDateCalender;
					
			@FindBy(xpath="//*[@id=\"my-profile\"]/div[7]/div/div/div/div[2]/table/tbody/tr[1]/td[2]/div")
			WebElement selectEndDate;
					
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/form/div[9]/div/div[2]/div[3]/div/div/div/div[1]/input")
			WebElement enterProfile;
					
			@FindBy(xpath="/html/body/div[1]/main/div/div[2]/form/div[9]/div/div[2]/div[3]/div/div/div/div[2]/a/div[2]/span")
			WebElement selectProfile;
					
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/form/div[12]/div/button")
			WebElement saveBtn;
					
			@FindBy(xpath="//*[@id=\"timeline\"]/div[2]/div[2]/div/div/a[1]")
			WebElement editWorkExperience;
					
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/form/div[13]/div/a")
			WebElement deleteWorkExperience;
					
			@FindBy(xpath="//*[@id=\"remove\"]/div/div/div[3]/button[1]")
			WebElement clickDeleteWorkExperience;
					
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div/div[1]/div/a[2]")
			WebElement uploadCV;
			
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div/div/div/div[1]/div/div/div[3]/div/div/div/label/span")
			WebElement chooseFile;
			
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div/div/div/div[1]/div/div/div[4]/div/button")
			WebElement uploadFile;
			
			@FindBy(xpath="//*[@id=\"uploadCvConfirmation___BV_modal_body_\"]/div[2]/button[1]")
			WebElement clickUpdateMyProfile;
			
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div/div/div/div[2]/a")
			WebElement clickCancelUploadCV;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[4]")
			WebElement educationsTab;
			
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div[1]/div/a")
			WebElement addTraining;
			
			@FindBy(id="studierichting")
			WebElement fieldOfStudy;
			
			@FindBy(id="opleidingsniveau")
			WebElement educationLevel;
			
			@FindBy(xpath="//*[@id=\"opleidingsniveau\"]/option[5]")
			WebElement selectEducationLevel;
			
			@FindBy(id="van")
			WebElement startingYear;
			
			@FindBy(xpath="//*[@id=\"van\"]/option[7]")
			WebElement selectStartingYear;
			
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/form/div[8]/div/button")
			WebElement clickSaveBtn;
			
			@FindBy(xpath="//*[@id=\"timeline\"]/div[2]/div[2]/div/div/a[1]")
			WebElement editEducations;
			
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/form/div[9]/div/a")
			WebElement deleteEducations;
			
			@FindBy(xpath="//*[@id=\"remove\"]/div/div/div[3]/button[1]")
			WebElement clickDeleteEducations;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[5]")
			WebElement coursesTab;
			
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/div[1]/div/a")
			WebElement addCourse;
			
			@FindBy(id="cursus")
			WebElement course;
			
			@FindBy(id="omschrijving")
			WebElement descriptionCourse;
			
			@FindBy(name="date")
			WebElement clickCompletedOnDate;

			@FindBy(xpath="//*[@id=\"my-profile\"]/div[7]/div/div/div/div[2]/table/tbody/tr[1]/td[2]/div")
			WebElement selectCompletedOnDate;
			
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/form/div[5]/div/button")
			WebElement clickSaveCourse;
			
			@FindBy(xpath="//*[@id=\"timeline\"]/div[2]/div[2]/div/div/a")
			WebElement editCourse;
			
			@FindBy(xpath="//*[@id=\"app\"]/main/div/div[2]/form/div[6]/div/a")
			WebElement deleteCourse;
			
			@FindBy(xpath="//*[@id=\"remove\"]/div/div/div[3]/button[1]")
			WebElement confirmDeleteCourse;
			
			@FindBy(xpath="//*[@id=\"navigation\"]/div/div/nav/a[6]")
			WebElement institutions;
					
			//Initialization
			public UlogoMyprofilePage() {
				PageFactory.initElements(Driver, this);
			}
					
			//Actions
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
				selectDate.click();
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
				selectProfile.click();
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
			
			public void clickAddTraining() {
				addTraining.click();
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
