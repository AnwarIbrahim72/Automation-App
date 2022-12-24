@editprofile
Feature: Edit Profile

  @EPROF001
  Scenario: User Edit Profile Using Valid Data
    Given User has been on the dashboard page
    When User click Masuk button at header
    And User input email "melindafitriani0@gmail.com"
    And User input password "Melinda170199"
    And User click Masuk
    And User successfully login
    And User click icon Profile in the menu bar
    And user click button profile
    And User redirected to edit profile page
    And User Upload Profile image 'C:\Users\lenovo\Desktop\QAE BINAR\qa2-binar-platinum-kelompok-1\secondhand-web\Platinum1\Pic\novel.jpeg'
    And User input nama "Meli"
    And User pick kota in the field "4"
    And User input alamat "jl Airlangga 4 no 26"
    And User input No Handphone "088212739928"
    And User click Submit button
    Then show success notification
