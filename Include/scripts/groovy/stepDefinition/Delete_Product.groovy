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

public class Delete_Product {
	@When("User click icon Daftar Jual Saya at header menu")
	public void user_click_icon_Daftar_Jual_Saya_at_header_menu() {
		WebUI.click(findTestObject('Object Repository/Header/btn_daftar_jual_header'))
	}

	@When("User click the product to be deleted")
	public void user_click_the_product_to_be_deleted() {
		WebUI.click(findTestObject('Object Repository/Semua produk Page/card_produk_semuaprodukpage'))
	}

	@When("User click Hapus button")
	public void user_click_Hapus_button() {
		WebUI.click(findTestObject('Object Repository/Detail Semua Produk Page/btn_delete_detailsemuaproduk'))
	}

	@Then("User successfully delete the product")
	public void user_successfully_delete_the_product() {
		WebUI.verifyElementVisible(findTestObject('Header/btn_daftar_jual_header'))
		WebUI.verifyElementVisible(findTestObject('Header/btn_login_header'))
		WebUI.verifyElementVisible(findTestObject('Header/img_logo_header'))
	}
}

