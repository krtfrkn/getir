@wip
Feature: As a user, I should go to "Getir Food Promotions" page
  Background:
    Given the user is on the main page
    When the user selects the phone code
    And the user enters the phone number
    And the user clicks on the continue button
    And the user enters OTP and clicks on the approve button
    And the user clicks on the Getir Food button

  Scenario: The user can go to "Getir Food Promotions" page
    When the user clicks on the Promotions button
    Then the user should be on the Getir Food Promotions page