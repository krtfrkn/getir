@wip
Feature: As a user, I should go to "Getir Food" page

  Background:
    Given the user is on the main page
    When the user selects the phone code
    And the user enters the phone number
    And the user clicks on the continue button
    And the user enters OTP and clicks on the approve button

  Scenario: The user can go to "Getir Food" page
    When the user clicks on the Getir Food button
    Then the user should be on the Getir Food page


