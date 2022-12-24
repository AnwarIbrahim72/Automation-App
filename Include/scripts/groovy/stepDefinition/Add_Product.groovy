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

public class Add_Product {
	@Given("User click daftar jual saya menu at header")
	public void user_click_daftar_jual_saya_menu_at_header() {
		WebUI.click(findTestObject('Header/btn_daftar_jual_header'))
	}

	@When("User click Tambah Produk")
	public void user_click_Tambah_produk() {
		WebUI.click(findTestObject('Semua produk Page/btn_Tambah Produk_semuaprodukpage'))
	}

	@When("User input Nama Produk with {string}")
	public void user_input_Nama_Produk_with(String namaproduk) {
		WebUI.setText(findTestObject('Add New Product/input_nama produk_add new produk'), namaproduk)
	}

	@When("User input Harga Produk with {string}")
	public void user_input_Harga_Produk_with(String hargaproduk) {
		WebUI.setText(findTestObject('Add New Product/input_harga produk_add new produk'), hargaproduk)
	}

	@When("User select the category {string}")
	public void user_select_the_category(String category) {
		WebUI.selectOptionByIndex(findTestObject('Add New Product/select_kategori_add new produk'), category)
	}

	@When("User input Deskripsi {string}")
	public void user_input_Deskripsi(String deskripsi) {
		WebUI.setText(findTestObject('Add New Product/input_deskripsi_add new produk'), deskripsi)
	}

	@When("User upload product photo {string}")
	public void user_upload_product_photo(String photo) {
		WebUI.uploadFile(findTestObject('Add New Product/upload_add and edit product'), photo)
	}

	@When("User click Terbitkan button")
	public void user_click_Terbitkan_button() {
		WebUI.click(findTestObject('Add New Product/btn_terbitkan_add new produk'))
	}

	@When("User click Preview button")
	public void user_click_Preview_button() {
		WebUI.click(findTestObject('Add New Product/btn_preview_add new produk'))
	}

	@When("User click the draft product")
	public void user_click_the_draft_product() {
		WebUI.verifyElementVisible(findTestObject('Semua produk Page/img_produk_semuaprodukpage'))
		WebUI.verifyElementVisible(findTestObject('Semua produk Page/txt_nama produk_semuaprodukpage'))
		WebUI.click(findTestObject('Detail Semua produk Page/txt_Galaksi_daftarjualpage'))
	}

	@Then("User click Terbitkan")
	public void user_click_Terbitkan() {
		WebUI.click(findTestObject('Add New Product/btn_Terbitkan_previewpage'))
	}

	@Then("User successfully add new product")
	public void user_successfully_add_new_product() {
		WebUI.verifyElementVisible(findTestObject('Daftar Jual Saya Page/txt_nama akun_daftarjualpage'))
		WebUI.verifyElementVisible(findTestObject('Daftar Jual Saya Page/txt_Daftar Jual Saya_daftarjualpage'))
		WebUI.verifyElementVisible(findTestObject('Daftar Jual Saya Page/btn_Edit_daftarjualpage'))
	}

	@Then("User failed to add new product")
	public void user_failed_to_add_new_product() {
		WebUI.verifyElementVisible(findTestObject('Add New Product/msg_error4product_addproduct'))
	}
}
