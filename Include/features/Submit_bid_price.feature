@submit_bid
Feature: Submit Bid Price

  @BID001
  Scenario: User can submit bid price for selected product when user logged in
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "aldera1212@gmail.com"
    And User input password "123456789"
    And User click Masuk
    And User successfully login
    And User click selected product
    And User redirected to Produk Page as buyer
    And User click Saya tertarik dan ingin nego button
    And User can see Masukkan Harga Tawarmu pop up
    And User input bid price in Harga Tawar field "1000000"
    And User click Kirim button
    Then User can see message Harga tawarmu berhasil dikirim ke penjual
    
    
