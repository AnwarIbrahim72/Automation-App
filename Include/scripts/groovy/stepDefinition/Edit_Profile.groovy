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
import groovy.json.StringEscapeUtils

public class Edit_Profile {
	@When("User click icon Profile in the menu bar")
	public void user_click_icon_Profile_in_the_menu_bar() {
		WebUI.click(findTestObject('Object Repository/Header/btn_user_header'))
	}

	@When("user click button profile")
	public void user_click_button_profile() {
		WebUI.click(findTestObject('Object Repository/Header/btn_profile_header'))
	}

	@When("User redirected to edit profile page")
	public void user_redirected_to_edit_profile_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Edit Profile Page/header_nama'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Edit Profile Page/header_kota'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Edit Profile Page/input_alamat'))
	}

	@When("User Upload Profile image {string}")
	public void user_Upload_Profile_image(String image) {
		WebUI.uploadFile(findTestObject('Edit Profile Page/input_img profile_edit profile'), image )
	}

	@When("User input nama {string}")
	public void user_input_nama(String nama) {
		WebUI.setText(findTestObject('Object Repository/Edit Profile Page/input_nama_edit profile'), nama)
	}

	@When("User pick kota in the field {string}")
	public void user_pick_kota_in_the_field(String kategori) {
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Edit Profile Page/select_kota_edit profile'), kategori)
	}

	@When("User input alamat {string}")
	public void user_input_alamat(String alamat) {
		WebUI.setText(findTestObject('Object Repository/Edit Profile Page/input_alamat'), alamat)
	}

	@When("User input No Handphone {string}")
	public void user_input_No_Handphone(String nohp) {
		WebUI.setText(findTestObject('Object Repository/Edit Profile Page/input_no handphone_edit profile'), nohp)
	}

	@When("User click Submit button")
	public void user_click_Submit_button() {
		WebUI.click(findTestObject('Object Repository/Edit Profile Page/btn_submit_edit profile'))
	}

	@Then ("show success notification")
	public void show_success_notification() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Edit Profile Page/berhasil update profile_edit profile'))
	}
}


