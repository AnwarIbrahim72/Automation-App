@add_product
Feature: Add Product

  Background: User login to secondhand web
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "chairunisadwinanda@gmail.com"
    And User input password "12345678"
    And User click Masuk

  @ADD001
  Scenario: User can add new product
    Given User click daftar jual saya menu at header
    When User click Tambah Produk
    And User input Nama Produk with "Baju Sekolah"
    And User input Harga Produk with "130000"
    And User select the category "2"
    And User input Deskripsi "blablabla"
    And User upload product photo 'C:\Users\lenovo\Desktop\QAE BINAR\qa2-binar-platinum-kelompok-1\secondhand-web\Platinum1\Pic\novel.jpeg'
    And User click Terbitkan button
    Then User successfully add new product
    
  @ADD002
  Scenario: User can submit product from preview product
    Given User click daftar jual saya menu at header
    When User click Tambah Produk
    And User input Nama Produk with "Galaksi"
    And User input Harga Produk with "123456"
    And User select the category "3"
    And User input Deskripsi "Bima sakti"
    And User upload product photo 'C:\Users\lenovo\Desktop\QAE BINAR\qa2-binar-platinum-kelompok-1\secondhand-web\Platinum1\Pic\novel.jpeg'
    And User click Preview button
    And User click the draft product
    Then User click Terbitkan 
   
  @ADD003
  Scenario: User add new product when 4 products have been uploaded
    Given User click daftar jual saya menu at header
    When User click Tambah Produk
    And User input Nama Produk with "Baju Sekolah"
    And User input Harga Produk with "130000"
    And User select the category "2"
    And User input Deskripsi "blablabla"
    And User upload product photo 'C:\Users\lenovo\Desktop\QAE BINAR\qa2-binar-platinum-kelompok-1\secondhand-web\Platinum1\Pic\novel.jpeg'
    And User click Terbitkan button
    Then User failed to add new product 
    #
