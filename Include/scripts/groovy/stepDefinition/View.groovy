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

public class View {
	@When("User click icon Daftar Jual at header menu")
	public void user_click_icon_at_header_menu() {
		WebUI.click(findTestObject('Object Repository/Header/btn_daftar_jual_header'))
	}

	@When("System will redirect to Daftar Jual page")
	public void system_will_redirect_to_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Daftar Jual Saya Page/txt_menu kategori_daftarjualpage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Daftar Jual Saya Page/txt_Daftar Jual Saya_daftarjualpage'))
	}

	@When("User click Semua Produk button")
	public void user_select_a_category() {
		WebUI.click(findTestObject('Object Repository/Daftar Jual Saya Page/btn_Kategori Semua Product_daftarjualpage'))
	}

	@Then("User click name product")
	public void user_click_name_product() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Daftar Jual Saya Page/txt_mobil_daftar jual page'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Daftar Jual Saya Page/txt_tas_daftar jual page'))
	}

	@When("User click the product of diminati")
	public void user_click_the_product_of_diminati() {
		WebUI.click(findTestObject('Diminati Page/card_produk_diminatipage'))
	}

	@When("User click terjual button")
	public void user_click_terjual_button() {
		WebUI.click(findTestObject('Daftar Jual Saya Page/btn_Kategori Terjual_daftarjualpage'))
	}

	@When("User click the product of terjual")
	public void user_click_the_product_of_terjual() {
		WebUI.click(findTestObject('Terjual Page/card_produk_terjualpage'))
	}

	@Then("User can see detail of product diminati")
	public void user_can_see_detail_of_product_diminati() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Diminati Page/btn_Terim-detaildiminatipage'))
		WebUI.verifyElementVisible(findTestObject('Detail Diminati Page/btn_Tolak_detaildiminatipage'))
	}

	@Then("User can see detail of product terjual")
	public void user_can_see_detail_of_product_terjual() {
		WebUI.verifyElementVisible(findTestObject('Detail Terjual Page/img_produkterjual_detailterjualpage'))
		WebUI.verifyElementVisible(findTestObject('Detail Terjual Page/txt_harga_detailterjualpage'))
		WebUI.verifyElementVisible(findTestObject('Detail Terjual Page/txt_namaproduk_detailterjualpage'))
	}

	@When("User click one of the product on the homepage")
	public void user_click_one_of_the_product_on_the_homepage() {
		WebUI.click(findTestObject('Object Repository/Produk Detail As buyer/txt_Alat Tensi_productasbuyer'))
	}

	@When("User redirected to detail product page")
	public void user_redirected_to_detail_product_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Detail As buyer/txt_deskripsi2_productasbuyer'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Detail As buyer/txt_harga produk2_productasbuyer'))
	}

	@When("User click saya tertarik untuk nego button")
	public void user_click_saya_tertarik_untuk_nego_button() {
		WebUI.click(findTestObject('Object Repository/Produk Detail As buyer/btn_saya tertarik_productasbuyer'))
	}

	@When("User click diminati button")
	public void user_diminati_button() {
		WebUI.click(findTestObject('Daftar Jual Saya Page/btn_Kategori Diminati_daftarjualpage'))
	}

	@Then("User can see pop up")
	public void user_can_see_pop_up_masukan_harga() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Detail As buyer/txt_harga tawaranmu_popup'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Detail As buyer/btn_kirim tawaran_popup'))
	}
}
