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

public class View_notification {
	@Given("click notification button")
	public void click_notification_button() {
		WebUI.click(findTestObject('Object Repository/Header/btn_notif_header'))
	}

	@Then("User can see notification after user submit bid price")
	public void user_can_see_notification_after_user_submit_bid_price() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Notifikasi/txt_harga buyer_notif1'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Notifikasi/txt_harga seller_notif1'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Notifikasi/txt_nama produk_notif1'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Notifikasi/txt_notif submit harga_notif1'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Notifikasi/txt_tanggal menawar_notif1'))
	}

	@Then("User can see notification after seller rejected their offer")
	public void user_can_see_notification_after_seller_rejected_their_offer() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Notifikasi/txt_Penawaran Produk Ditolak_notif2'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Notifikasi/txt_Tawaran kamu ditolak penjual_notif2'))
	}

	@Then("User can see notification after seller accepted their offer")
	public void user_can_see_notification_after_seller_accepted_their_offer() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Notifikasi/div_Penawaran Produk Diterima'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Notifikasi/div_Kamu akan segera dihubungi penjual via whatsapp'))
	}

	@Then("User can see notification after seller accepted their offer and change status to Berhasil terjual")
	public void user_can_see_notification_after_seller_accepted_their_offer_and_change_status_to_Berhasil_terjual() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Notifikasi/div_Penawaran Produk Berhasil Disepakati'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Notifikasi/div_Terima Kasih telah membeli produk ini'))
	}
}
