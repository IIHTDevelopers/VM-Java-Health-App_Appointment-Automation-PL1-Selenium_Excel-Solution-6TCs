package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class appointment_Pages extends StartupPage {

	//Locators of L1 Scenarios
	//login locators
	By usernameTextfield = By.id("username_id");
	By usernameTextbox = By.xpath("//input[@id='username_id']");
	By passwordTextbox = By.xpath("//input[@id='password']");
	By signInButton = By.xpath("//button[@id='login']");
	By registeredPatientTextElement = By.xpath("//p[contains(text(), 'Registered Patient')]");

	//Appoint Module's locators 
	By appointmentModuleByElement = By.xpath("//a[@href='#/Appointment']");
	By appointmentModuleToggleByElement = By.xpath("//span[@data-target='#Appointment']");
	By selectCounterTitleNameByElement = By.xpath("//span[contains(text(), 'Select Counter')]");

	By selectCounterNewOneLinkByElement = By.xpath("//div[@class='counter-item']//h5[contains(text(), 'New-1')]");
	By newPatientButtonLinkByElement = By.xpath("//button[@id='btnNewPatient']");
	By patientInformationTextByElement = By.xpath("//h4[contains(text(), 'Patient Information')]");
	By careOfPersonContactTextboxByElement = By.xpath("//input[@id='id_CareTaker_CareTakerContact']");
	By careOfPersonTextboxByElement = By.xpath("//input[@id='id_CareTaker_CareTakerName']");
	By printInvoiceButtonByElement = By.xpath("//input[@id='btnPrintInvoice']");
	By confirmButtonByElement = By.xpath("//button[@id='id_btn_confirm_confirmation']");
	By errorMessageOfLastNameTextboxByElement = By.xpath("//span[contains(text(), ' Last Name is required.')]");

	By firstNameTextboxByElement = By.xpath("//input[@id='aptPatFirstName']");
	By middleNameTextboxByElement = By.xpath("//input[@formcontrolname='MiddleName']");
	By lastNameTextboxByElement = By.xpath("//input[@formcontrolname='LastName']");
	By ageTextboxByElement = By.xpath("//input[@id='txtAgeInput']");
	By phoneTextboxByElement = By.xpath("//input[@id='txtPhone']");

	By havDOBCheckboxByElement = By.xpath("//input[@name='IsDobAvailable']/..//span");
	By dobDatePickerByElement = By.xpath("//input[@id='date']");

	By externalCheckBoxByElement = By.xpath("//input[@id='id_checkbox_includeExternalReferral']/..//span");
	By plusIconClickToAddExternalReffererByElement = By.xpath("//a[@title='Click to add new external refferer']");
	By addExternalReferralTitleByElement = By.xpath("//span[contains(text(), 'Add External Referral')]");
	By referrerNameTexboxByElement = By.xpath("//input[@id='referrerName']");
	By extRefferAddressTextFieldElement = By.xpath("//input[@id='ExtRefferaddress']");
	By contactNumberTextFieldElement = By.xpath("//input[@id='contactNum']");
	By emailTextFieldElement = By.xpath("//div[@class='col-md-7']//input[@id='email']");
	By isIncentiveApplicableCheckboxElement = By.xpath("(//div[@class='icheck-inline']//span)[2]");
	By addreferrerButtonByElement = By.xpath("//button[@id='add']");
	By successNotificationPopupMessageElement = By.xpath("//div[@class='msg-text padding-8-all']");
	By successNotificationPopupMessageOneElement = By.xpath("//p[@class='msg-status']");
	By successNotificationPopupMessageTwoElement = By.xpath("//p[@class='main-message']");

	By relationWithPatientDropdownByElement = By.xpath("//select[@id='id_CareTaker_RelationWithPatient']");

	By bookAppointmentSubModuleByElement = By.xpath("//a[@href='#/Appointment/CreateAppointment']//span[contains(text(), 'Book Appointment')]");
	By newPatientButtonByElement = By.xpath("//a[contains(text(), 'New Patient')]");

	By monthRadioButtonByElement = By.xpath("//input[@value='M']/..//span");
	By daysRadioButtonByElement = By.xpath("//input[@value='D']/..//span");

	By firstNameTexboxOfBookAppointmentByElement = By.xpath("//input[@formcontrolname='FirstName']");
	By middleNameTexboxOfBookAppointmentByElement = By.xpath("//input[@formcontrolname='MiddleName']");
	By lastNameTexboxOfBookAppointmentByElement = By.xpath("//input[@formcontrolname='LastName']");
	By genderMaleOptionOfBookAppointmentByElement = By.xpath("//input[@value='Male']/..//span");
	By addAppointmentButtonByElement = By.xpath("//input[@name='addappointment']");

	By errorNotificationPopupMessageElement = By.xpath("//div[@class='msg-text padding-8-all']");
	By statusErrorNotificationMessageByElement = By.xpath("//p[contains(text(), 'failed')]");
	By mainErrorNotificationMessageByElement = By.xpath("//p[contains(text(), 'Failed!! Cannot create appointment. Check the Details Correctly.')]");

	By procurementModule = By.xpath("//span[.='Procurement']");
	By settingsTab = By.xpath("//a[.=' Settings ']");
	By subCategoryTabByElement = By.xpath("//a[contains(text(), 'Sub Category')]");
	By cuttonSubCategoryNameByElement = By.xpath("//div[contains(text(), 'cotton')]");

	By vaccinationModuleByElement = By.xpath("//a[@href='#/Vaccination']");
	By vaccinationModulesToggleIconByElement = By.xpath("//span[@data-target='#Vaccination']");
	By patientListSubModuleByElement = By.xpath("//a[@href='#/Vaccination/PatientList']//span[contains(text(), 'Patient List')]");
	By titleNameOfVaccinationPatientRegisterFormByElement = By.xpath("//span[contains(text(), 'Vaccination Patient Register')]");
	By newVaccinationPatientButtonByElement = By.xpath("//button[contains(text(), 'New Vaccination Patient')]");

	By keyboardButtonElement = By.xpath("//div[@title='Shortcut Keys']");
	By altPlusNtooltipMessageElement = By.xpath("//li[contains(text(),'+')]");

	By membershipDropdownByElement = By.xpath("//select[@id='Scheme']");

	By reportsSubButton = By.xpath("//a[.=' Reports ']");
	By currentStockLevelButton = By.xpath("//i[.='Current Stock Level']");
	By selectedItemDropdown = By.xpath("//div[@class='selected-list']");
	By selectItemSearchBar = By.xpath("//input[@placeholder='Search']");
	By accountsItemCheckBox = By.xpath("//label[.='Accounts']");
	By generalInventoryOption = By.xpath("//span[@class='fa fa-remove']");
	By accountOption = By.xpath("//span[.='Accounts']");

	By invoiceHeadersSubTab = By.xpath("//a[.='Invoice Headers']");
	By addNewInvoiceHeaderButton = By.xpath("//input[@value='Add New Invoice Header']");
	By chooseFileButton = By.id("img");

	By closeAddNewPatientForm = By.xpath("//button[.='X']");
	By xButton = By.xpath("//a[.='X']");


	//Locators of L2 Scenarios


	String pageName = this.getClass().getSimpleName();
	public appointment_Pages(WebDriver driver) {
		super(driver);
	}


	/**@Test1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		Boolean textIsDisplayed = false;
		try {
			//			commonEvents.setBrowserZoomLevelTo80Percent();
			commonEvents.waitTillElementLocated(usernameTextbox, 10);
			WebElement usernametextFieldWebElement = commonEvents.findElement(usernameTextbox);
			commonEvents.highlightElement(usernametextFieldWebElement);
			commonEvents.sendKeys(usernameTextbox,expectedData.get("username"));

			commonEvents.waitTillElementLocated(passwordTextbox, 10);
			WebElement passwordtextFieldWebElement = commonEvents.findElement(passwordTextbox);
			commonEvents.highlightElement(passwordtextFieldWebElement);
			commonEvents.sendKeys(passwordTextbox,expectedData.get("password"));

			commonEvents.waitTillElementLocated(signInButton, 20);
			WebElement signinButtonWebElement = commonEvents.findElement(signInButton);
			commonEvents.highlightElement(signinButtonWebElement);
			commonEvents.jsClick(signInButton);

			if(commonEvents.isDisplayed(appointmentModuleByElement))
			{   
				WebElement operationTheatreModuleWebElement = commonEvents.findElement(appointmentModuleByElement);
				commonEvents.highlightElement(operationTheatreModuleWebElement);
				textIsDisplayed=true;
			}
		}catch(Exception e) {
			throw e;
		}
		return textIsDisplayed;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
		String pageTitle = "";
		try {
			pageTitle = commonEvents.getTitle();
			System.out.println("title of the page is  :" + pageTitle );
		}catch(Exception e) {
			throw e;
		}	
		return pageTitle;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
		String urlofThepage = "";
		try {
			Thread.sleep(5000);
			urlofThepage = commonEvents.getCurrentUrl();
			System.out.println("URL of the page is  :" + urlofThepage );
		}catch(Exception e) {
			throw e;
		}	
		return urlofThepage;
	}

	/**@Test2
	 * about this method verifyAppointmentModuleIsPresent() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyAppointmentModuleIsPresent() throws Exception {
		String selectCounterTitleIsDisplayed = "";
		try {
			if(commonEvents.isDisplayed(appointmentModuleByElement)){
				commonEvents.jsClick(appointmentModuleToggleByElement);
			}

			if(commonEvents.isDisplayed(selectCounterTitleNameByElement)) {
				selectCounterTitleIsDisplayed = commonEvents.getText(selectCounterTitleNameByElement);
				System.out.println("select counter title name is : " + selectCounterTitleIsDisplayed);
				return selectCounterTitleIsDisplayed;
			}
		}catch(Exception e) {
			throw e;
		}	
		return selectCounterTitleIsDisplayed;
	}

	/**@Test3
	 * about this method verifyButtonAndTextIsPresent() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyButtonAndTextIsPresent() throws Exception {
		String buttonAndTextIsDisplayed = "";
		try {
			if(commonEvents.isDisplayed(selectCounterNewOneLinkByElement)){
				commonEvents.jsClick(selectCounterNewOneLinkByElement);
			}

			commonEvents.waitTillElementLocated(newPatientButtonLinkByElement, 10);			
			if(commonEvents.isDisplayed(newPatientButtonLinkByElement)) {
				commonEvents.click(newPatientButtonLinkByElement);
				commonEvents.waitTillElementLocated(patientInformationTextByElement, 10);	
				buttonAndTextIsDisplayed = commonEvents.getText(patientInformationTextByElement);
				System.out.println("select counter title name is : " + buttonAndTextIsDisplayed);
				return buttonAndTextIsDisplayed;
			}
		}catch(Exception e) {
			throw e;
		}	
		return buttonAndTextIsDisplayed;
	}

	/**@Test4
	 * about this method scrollToBottomVerifyFieldAndHighlight() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public Boolean scrollToBottomVerifyFieldAndHighlight() throws Exception {
		Boolean textboxIsDisplayed = false;
		try {
			commonEvents.waitTillElementLocated(patientInformationTextByElement, 10);
			commonEvents.jsScrollToBottomOfThePage();

			commonEvents.waitTillElementLocated(careOfPersonContactTextboxByElement, 10);
			if(commonEvents.isDisplayed(careOfPersonContactTextboxByElement)){
				commonEvents.click(careOfPersonContactTextboxByElement);
				WebElement careOfPersonContactTextboxWebElement = commonEvents.findElement(careOfPersonContactTextboxByElement);
				commonEvents.highlight(careOfPersonContactTextboxWebElement);
				textboxIsDisplayed = true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return textboxIsDisplayed;
	}

	/**@Test5
	 * about this method verifyPlaceholderNameOfTexbox() 
	 * @param : null
	 * @description : verify the placeholder name of text box 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyPlaceholderNameOfTexbox() throws Exception {
		String placeholderNameOfTextbox = "";
		try {
			commonEvents.waitTillElementLocated(careOfPersonTextboxByElement, 10);
			if(commonEvents.isDisplayed(careOfPersonTextboxByElement)) {
				commonEvents.click(careOfPersonTextboxByElement);
				placeholderNameOfTextbox = commonEvents.getAttribute(careOfPersonTextboxByElement, "placeholder");
				System.out.println("place holder name of care Of Person Textbox : " + placeholderNameOfTextbox );
				return placeholderNameOfTextbox;
			}
		}catch(Exception e) {
			throw e;
		}	
		return placeholderNameOfTextbox;
	}

	/**@Test6
	 * about this method verifyErrorMessage() 
	 * @param : null
	 * @description : verify the error message
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyErrorMessage() throws Exception {
		String errorMessage = "";
		try {
			commonEvents.waitTillElementLocated(printInvoiceButtonByElement, 10);
			if(commonEvents.isDisplayed(printInvoiceButtonByElement)) {
				commonEvents.click(printInvoiceButtonByElement);

				commonEvents.waitTillElementLocated(confirmButtonByElement, 10);
				commonEvents.click(confirmButtonByElement);

				commonEvents.waitTillElementLocated(errorMessageOfLastNameTextboxByElement, 10);
				commonEvents.isDisplayed(errorMessageOfLastNameTextboxByElement);
				errorMessage = commonEvents.getText(errorMessageOfLastNameTextboxByElement);
				System.out.println("error Message of Last Name textbox : " + errorMessage );
				return errorMessage;
			}
		}catch(Exception e) {
			throw e;
		}
		return errorMessage;
	}

}
