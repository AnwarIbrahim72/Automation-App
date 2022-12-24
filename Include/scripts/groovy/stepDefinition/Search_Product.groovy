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

public class Search_Product {
	@Given("User click hobby button")
	public void user_click_hobby_button() {
		WebUI.click(findTestObject('Object Repository/Homepage/btn_kategori hoby_homepage'))
	}
	
	@When("User successfully see the product base on hoby")
	public void user_successfully_see_the_product_base_on_hoby() {
	WebUI.verifyElementVisible(findTestObject('Object Repository/Homepage/txt_kategori hobby_homepage'))
	}

	@Given("User click kendaraan button")
	public void user_click_kendaraan_button() {
		WebUI.click(findTestObject('Object Repository/Homepage/btn_kategori kendaraan_homepage'))
	}
	
	
	@When("User successfully see the product base on kendaraan")
	public void user_successfully_see_the_product_base_on_kendaraan() {
		WebUI.click(findTestObject('Object Repository/Homepage/txt_kendaraan_homepage'))
	}

	@Given("User click baju button")
	public void user_click_baju_button() {
		WebUI.click(findTestObject('Object Repository/Homepage/btn_kategori baju_homepage'))
	}
	
	@When("User successfully see the product base on baju")
	public void user_successfully_see_the_product_base_on_baju() {
		WebUI.click(findTestObject('Object Repository/Homepage/txt_baju_homepage'))
	}

	@Given("User click elektronik button")
	public void user_click_elektronik_button() {
		WebUI.click(findTestObject('Object Repository/Homepage/btn_kategori elektronik_homepage'))
	}
	
	@When("User successfully see the product base on elektronik")
	public void user_successfully_see_the_product_base_on_elektronik() {
		WebUI.click(findTestObject('Object Repository/Homepage/txt_kesehatan_homepage'))
	}

	@Given("User click kesehatan button")
	public void user_click_kesehatan_button() {
		WebUI.click(findTestObject('Object Repository/Homepage/btn_kategori kesehatan_homepage'))
	}
	
	@When("User successfully see the product base on kesehatan")
	public void user_successfully_see_the_product_base_on_kesehatan() {
		WebUI.click(findTestObject('Object Repository/Homepage/txt_kesehatan_homepage'))
	}
}

