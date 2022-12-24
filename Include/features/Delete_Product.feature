@delete_product
Feature: Delete Product

  @DEL001
  Scenario: User can delete the product
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "chairunisadwinanda@gmail.com"
    And User input password "12345678"
    And User click Masuk
    And User click icon Daftar Jual Saya at header menu
    And User click the product to be deleted
    And User click Hapus button
    Then User successfully delete the product