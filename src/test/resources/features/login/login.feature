@wip
Feature: As a user, I should be able to login

  Scenario: Login with valid credentials
    Given the user is on the main page
    When the user selects the phone code
    And the user enters the phone number
    And the user clicks on the continue button
    And the user enters OTP and clicks on the approve button
    Then the user should be logged in



