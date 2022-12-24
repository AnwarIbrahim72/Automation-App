@ViewProduct
Feature: View Product

  @PRODLIST001
  Scenario: User can view product list (as Seller)
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "melindafitriani0@gmail.com"
    And User input password "Melinda170199"
    And User click Masuk
    And User successfully login
    And User click icon Daftar Jual at header menu
    And System will redirect to Daftar Jual page
    And User click Semua Produk button
    Then User click name product
    
  @BIDLIST001
  Scenario: User can view diminati page (as seller)
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "nameflowist@gmail.com"
    And User input password "12345678"
    And User click Masuk
    And User successfully login
    And User click icon Daftar Jual at header menu
    And System will redirect to Daftar Jual page
    And User click diminati button
    And User click the product of diminati 
    Then User can see detail of product diminati
    
  @SOLD001
  Scenario: User can view terjual page (as seller)
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "nameflowist@gmail.com"
    And User input password "12345678"
    And User click Masuk
    And User successfully login
    And User click icon Daftar Jual at header menu
    And System will redirect to Daftar Jual page
    And User click terjual button
    And User click the product of terjual 
    Then User can see detail of product terjual

  @PRODDTL001
  Scenario: User can see the detail product (as Buyer)
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "melindafitriani0@gmail.com"
    And User input password "Melinda170199"
    And User click Masuk
    And User successfully login
    And User click one of the product on the homepage
    And User redirected to detail product page
    And User click saya tertarik untuk nego button
    Then User can see pop up

  
    