@view_notification
Feature: View Notification
	
  Background: User login to secondhand website to view notification
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "aldera1212@gmail.com"
    And User input password "123456789"
    And User click Masuk
    And User successfully login
    	
	@NTFSEL001
	Scenario: User can view notification after user submit bid price 
    Given click notification button
    Then User can see notification after user submit bid price

 	@NTFSEL002
	Scenario: User can view notification after seller rejected their offer 
    Given click notification button
    Then User can see notification after seller rejected their offer

 	@NTFSEL003
	Scenario: User can view notification after seller accepted their offer 
    Given click notification button
    Then User can see notification after seller accepted their offer

  @NTFSEL004
	Scenario: User can view notification after seller accepted their offer and change status to Berhasil terjual
    Given click notification button
    Then User can see notification after seller accepted their offer and change status to Berhasil terjual
    
    