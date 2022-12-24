@edit_product
Feature: Edit Product
	
	@EDPROD001
	Scenario: User edit product using valid data
 		Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "aldera1212@gmail.com"
    And User input password "123456789"
    And User click Masuk
    And User successfully login
    And User click Daftar Jual button
    And User redirected to Daftar Jual Page
    And User click Semua Produk
    And User click product
    And User redirected to Produk Page
    And User click Edit button 
    And User redirected to Produk Info Page
    And User change input product name "poster"
    And User change input product price "234000"
    And User pick category "3"
    And User change input product description "poster buronan"
    And User change product photo 'C:\Users\lenovo\Desktop\QAE BINAR\qa2-binar-platinum-kelompok-1\secondhand-web\Platinum1\Pic\novel.jpeg'
    And User click Terbitkan button
    Then User has successfully edited product data
    