package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class Login {
	@Given("User has been on the dashboard page")
	public void user_has_been_on_the_dashboard_page() {
		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl('https://secondhand-store.herokuapp.com');
		WebUI.verifyElementVisible(findTestObject('Header/btn_daftar_jual_header'))
		WebUI.verifyElementVisible(findTestObject('Header/btn_login_header'))
		WebUI.verifyElementVisible(findTestObject('Header/img_logo_header'))
	}

	@When("User click Masuk button at header")
	public void user_click_Masuk_at_header() {
		WebUI.click(findTestObject('Header/btn_login_header'))
	}

	@When("User input email {string}")
	public void user_input_email(String email) {
		WebUI.setText(findTestObject('Login Page/input_email_login'), email)
	}

	@When("User input password {string}")
	public void user_input_password(String password) {
		WebUI.setText(findTestObject('Login Page/input_password_login'), password)
	}

	@When("User click Masuk")
	public void user_click_Masuk() {
		WebUI.click(findTestObject('Login Page/btn_login_login'))
	}

	@Then("User successfully login")
	public void user_successfully_login() {
		WebUI.verifyElementVisible(findTestObject('Header/btn_daftar_jual_header'))
		WebUI.verifyElementVisible(findTestObject('Header/btn_login_header'))
		WebUI.verifyElementVisible(findTestObject('Header/img_logo_header'))
	}

	@Then("User failed to login with invalid email")
	public void user_failed_to_login_with_invalid_email() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/msg_wrong email_login'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/img_gambar_login'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/txt_masuk_login'))
	}

	@Then("User failed to login with invalid password")
	public void user_failed_to_login_with_invalid_password() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/msg_wrong password_login'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/img_gambar_login'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/txt_masuk_login'))
	}
}
