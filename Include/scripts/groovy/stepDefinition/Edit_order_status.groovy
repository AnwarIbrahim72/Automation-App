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

public class Edit_order_status {
	@When("User click Diminati")
	public void user_click_Diminati() {
		WebUI.click(findTestObject('Object Repository/Daftar Jual Saya Page/btn_Kategori Diminati_daftarjualpage'))
	}

	@When("User redirected to Diminati")
	public void user_redirected_to_Diminati() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/txt_nama produk_diminati'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/txt_nama pembeli_diminati'))
	}

	@Then("User redirected to Info Penawar Page")
	public void user_redirected_to_Info_Penawar_Page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/btn_Terim-detaildiminatipage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/btn_Tolak_detaildiminatipage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/txt_namaproduk_detaildiminatipage'))
	}

	@Given("User click Tolak button")
	public void user_click_Tolak_button() {
		WebUI.click(findTestObject('Object Repository/Detail Diminati Page/btn_Tolak_detaildiminatipage'))
	}

	@When("User see popup Apakah anda yakin akan membatalkan transaksi ini?")
	public void user_see_popup_Apakah_anda_yakin_akan_membatalkan_transaksi_ini() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/btn_Iya_detaildiminatipage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/btn_Tidak_detaildiminatipage'))
	}

	@When("User click button Iya")
	public void user_click_button_Iya() {
		WebUI.click(findTestObject('Object Repository/Detail Diminati Page/btn_Iya_detaildiminatipage'))
	}

	@Then("User see message Tawaran produk ditolak")
	public void user_see_message_Tawaran_produk_ditolak() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/msg_Tawaran produk ditolak_detaildiminatipage'))
	}

	@Given("User click Terima button")
	public void user_click_Terima_button() {
		WebUI.click(findTestObject('Object Repository/Detail Diminati Page/btn_Terim-detaildiminatipage'))
	}

	@Then("User see message Tawaran produk diterima")
	public void user_see_message_Tawaran_produk_diterima() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/msg_menerima tawaran_detaildiminatipage'))
	}

	@When("User click Hubungi button")
	public void user_click_Hubungi_button() {
		WebUI.click(findTestObject('Object Repository/Detail Diminati Page/btn_Hubungi_detaildiminatipage'))
	}

	@When("User see popup Yeay kamu berhasil mendapat harga yang sesuai")
	public void user_see_popup_Yeay_kamu_berhasil_mendapat_harga_yang_sesuai() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/txt_Yeay kamu berhasil mendapat harga yang sesuai_detaildiminatipage'))
	}

	@When("User see button Hubungi via Whatsapp")
	public void user_see_button_Hubungi_via_Whatsapp() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/btn_hubungi via whatsapp_detaildiminatipage'))
	}

	@When("User click Status button")
	public void user_click_Status_button() {
		WebUI.click(findTestObject('Object Repository/Detail Diminati Page/btn_status_detaildiminatipage'))
	}

	@When("User see popup Perbarui status penjualan produkmu")
	public void user_see_popup_Perbarui_status_penjualan_produkmu() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/txt_Perbarui status penjualan produkmu_detaildiminatipage'))
	}

	@When("User choose Batalkan transaksi")
	public void user_choose_Batalkan_transaksi() {
		WebUI.click(findTestObject('Object Repository/Detail Diminati Page/input_batalkantransaksi_detaildiminatipage'))
	}

	@When("User click Kirim status order button")
	public void user_click_Kirim_status_order_button() {
		WebUI.click(findTestObject('Object Repository/Detail Diminati Page/btn_kirim status_detaildiminatipage'))
	}

	@Then("User see message Status produk berhasil diperbarui")
	public void user_see_message_Status_produk_berhasil_diperbarui() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/msg_Status produk berhasil diperbarui_detaildiminatipage'))
	}

	@When("User choose Berhasil terjual")
	public void user_choose_Berhasil_terjual() {
		WebUI.click(findTestObject('Object Repository/Detail Diminati Page/input_statusberhasilterjual_detaildiminatipage'))
	}
}
