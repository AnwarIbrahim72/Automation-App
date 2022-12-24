@searchproduct
Feature: Search Product

  Background: User login to secondhand web
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "melindafitriani0@gmail.com"
    And User input password "Melinda170199"
    And User click Masuk
    Then User successfully login

  @ESRC001
  Scenario: User does a search product by hoby category
    Given User click hobby button
    When User successfully see the product base on hoby

  @ESRC002
  Scenario: User does a search product by kendaraan category
    Given User click kendaraan button
    When User successfully see the product base on kendaraan

  @ESRC003
  Scenario: User does a search product by baju category
    Given User click baju button
    When User successfully see the product base on baju

  @ESRC004
  Scenario: User does a search product by elektronik category
    Given User click elektronik button
    When User successfully see the product base on elektronik

  @ESRC005
  Scenario: User does a search product by kesehatan category
    Given User click kesehatan button
    When User successfully see the product base on kesehatan
