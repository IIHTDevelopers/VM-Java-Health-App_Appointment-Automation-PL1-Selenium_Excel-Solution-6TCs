package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class appointment_Pages extends StartupPage {

//	TC-1 Locators
	By usernameTextbox = By.xpath("//input[@id='username_id']");
	By passwordTextbox = By.xpath("//input[@id='password']");
	By signInButton = By.xpath("//button[@id='login']");
	By appointmentModuleByElement = By.xpath("//a[@href='#/Appointment']");
//	TC-2 Locators
	By appointmentModuleToggleByElement = By.xpath("//span[@data-target='#Appointment']");
	By selectCounterTitleNameByElement = By.xpath("//span[contains(text(), 'Select Counter')]");
//	TC-3 Locators
	By selectCounterNewOneLinkByElement = By.xpath("//div[@class='counter-item']//h5[contains(text(), 'New-1')]");
	By newPatientButtonLinkByElement = By.xpath("//button[@id='btnNewPatient']");
	By patientInformationTextByElement = By.xpath("//h4[contains(text(), 'Patient Information')]");
//	TC-4 Locators
	By careOfPersonContactTextboxByElement = By.xpath("//input[@id='id_CareTaker_CareTakerContact']");
//	TC-5 Locators
	By careOfPersonTextboxByElement = By.xpath("//input[@id='id_CareTaker_CareTakerName']");
//	TC-6 Locators
	By printInvoiceButtonByElement = By.xpath("//input[@id='btnPrintInvoice']");
	By confirmButtonByElement = By.xpath("//button[@id='id_btn_confirm_confirmation']");
	By errorMessageOfLastNameTextboxByElement = By.xpath("//span[contains(text(), ' Last Name is required.')]");


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
