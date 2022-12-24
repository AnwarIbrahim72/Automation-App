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

public class Submit_bid_price {
	@When("User click selected product")
	public void user_click_selected_product() {
		WebUI.scrollToElement(findTestObject('Object Repository/Product Test/p_A test produk 2'), 0)
		WebUI.click(findTestObject('Object Repository/Product Test/p_A test produk 2'))
	}

	@When("User redirected to Produk Page as buyer")
	public void user_redirected_to_Produk_Page_as_buyer() {
		WebUI.scrollToPosition(0, 0)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Detail As buyer/txt_nama produk_productasbuyer'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Detail As buyer/txt_nama seller_productasbuyer'))
	}

	@When("User click Saya tertarik dan ingin nego button")
	public void user_click_Saya_tertarik_dan_ingin_nego_button() {
		WebUI.click(findTestObject('Object Repository/Produk Detail As buyer/btn_saya tertarik_productasbuyer'))
	}

	@When("User can see Masukkan Harga Tawarmu pop up")
	public void user_can_see_Masukkan_Harga_Tawarmu_pop_up() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Detail As buyer/txt_masukkan harga_popup'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Detail As buyer/input_harga tawar_popup'))
	}

	@When("User input bid price in Harga Tawar field {string}")
	public void user_input_bid_price_in_Harga_Tawar_field(String Harga) {
		WebUI.setText(findTestObject('Object Repository/Produk Detail As buyer/input_harga tawar_popup'), Harga)
	}

	@When("User click Kirim button")
	public void user_click_Kirim_button() {
		WebUI.click(findTestObject('Object Repository/Produk Detail As buyer/btn_kirim tawaran_popup'))
	}

	@Then("User can see message Harga tawarmu berhasil dikirim ke penjual")
	public void user_can_see_message_Harga_tawarmu_berhasil_dikirim_ke_penjual() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Detail As buyer/msg_harga dikirim_productasbuyer'))
	}
}
