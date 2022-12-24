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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class Edit_Product {
	@When("User click Daftar Jual button")
	public void user_click_Daftar_Jual_button() {
		WebUI.click(findTestObject('Object Repository/Header/btn_daftar_jual_header'))
	}

	@When("User redirected to Daftar Jual Page")
	public void user_redirected_to_Daftar_Jual_Page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Daftar Jual Saya Page/btn_Kategori Diminati_daftarjualpage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Daftar Jual Saya Page/btn_Kategori Semua Product_daftarjualpage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Daftar Jual Saya Page/btn_Kategori Terjual_daftarjualpage'))
	}

	@When("User click Semua Produk")
	public void user_click_Semua_Produk() {
		WebUI.click(findTestObject('Object Repository/Daftar Jual Saya Page/btn_Kategori Semua Product_daftarjualpage'))
	}

	@When("User click product")
	public void user_click_product() {
		WebUI.click(findTestObject('Object Repository/Daftar Jual Saya Page/box_produk1_daftarjualpage'))
	}

	@When("User redirected to Produk Page")
	public void user_redirected_to_Produk_Page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Semua Produk Page/btn_edit_detailsemuaproduk'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Semua Produk Page/txt_namaproduk_detailsemuaproduk'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Detail Semua Produk Page/btn_delete_detailsemuaproduk'))
	}

	@When("User click Edit button")
	public void user_click_Edit_button() {
		WebUI.click(findTestObject('Object Repository/Detail Semua Produk Page/btn_edit_detailsemuaproduk'))
	}

	@When("User redirected to Produk Info Page")
	public void user_redirected_to_Produk_Info_Page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Edit Product/input_nama produk_edit produk'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Edit Product/input_harga produk_edit produk'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Edit Product/btn_terbitkan_edit produk'))
	}

	@When("User change input product name {string}")
	public void user_change_input_product_name(String prodname) {
		WebUI.setText(findTestObject('Object Repository/Edit Product/input_nama produk_edit produk'), prodname)
	}

	@When("User change input product price {string}")
	public void user_change_input_product_price(String prodprice) {
		WebUI.setText(findTestObject('Object Repository/Edit Product/input_harga produk_edit produk'), prodprice)
	}

	@When("User pick category {string}")
	public void user_pick_category(String category) {
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Edit Product/select_kategori_edit produk'), category)
	}

	@When("User change input product description {string}")
	public void user_change_input_product_description(String description) {
		WebUI.setText(findTestObject('Object Repository/Edit Product/input_deskripsi_edit produk'), description)
	}

	@When("User change product photo {string}")
	public void user_change_product_photo(String photo) {
		WebUI.uploadFile(findTestObject('Object Repository/Add New Product/upload_add and edit product'), photo)
	}

	@Then("User has successfully edited product data")
	public void user_has_successfully_edited_product_data() {
		WebUI.click(findTestObject('Object Repository/Header/img_logo_header'))
	}
}
