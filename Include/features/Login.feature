@login
Feature: Login

  @LOG001
  Scenario: User can login using valid data
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "chairunisadwinanda@gmail.com"
    And User input password "12345678"
    And User click Masuk
    Then User successfully login
    
  @LOG002
  Scenario: User login with invalid email
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "chairunisa@gmail.com"
    And User input password "12345678"
    And User click Masuk
    Then User failed to login with invalid email

  @LOG003
  Scenario: User login with invalid password
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "chairunisadwinanda@gmail.com"
    And User input password "abcdefgh"
    And User click Masuk
    Then User failed to login with invalid password
   