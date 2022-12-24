@edit_order
Feature: Edit Order Status

  Background: User login to secondhand website before edit orderstatus
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "akaibra13@gmail.com"
    And User input password "123456789"
    And User click Masuk
    And User successfully login
    And User click Daftar Jual button
    And User redirected to Daftar Jual Page
    And User click Diminati
    And User redirected to Diminati
    And User click product
    Then User redirected to Info Penawar Page

  @EDORS001
  Scenario: User can change the status of the items being ordered to Tolak
    Given User click Tolak button
    When User see popup Apakah anda yakin akan membatalkan transaksi ini?
    And User click button Iya
    Then User see message Tawaran produk ditolak

  @EDORS002
  Scenario: User can change the status of the items being ordered to Terima
    Given User click Terima button
    Then User see message Tawaran produk diterima

  @EDORS003
  Scenario: User can change the status of the items being ordered to Terima and user call buyer
    Given User click Hubungi button
    When User see popup Yeay kamu berhasil mendapat harga yang sesuai
    And User see button Hubungi via Whatsapp

  @EDORS004
  Scenario: User can change the status of the items being ordered to Terima and user cancel the transaction
    Given User click Status button
    When User see popup Perbarui status penjualan produkmu
    And User choose Batalkan transaksi
    And User click Kirim status order button
    Then User see message Status produk berhasil diperbarui

  @EDORS005
  Scenario: User can change the status of the items being ordered to Terima and user accept the transaction
    Given User click Terima button
    When User see message Tawaran produk diterima
    And User click Status button
    And User see popup Perbarui status penjualan produkmu
    And User choose Berhasil terjual
    And User click Kirim status order button
    Then User see message Status produk berhasil diperbarui
