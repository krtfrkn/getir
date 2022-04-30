@wip
Feature: As a user I should display the restaurants have promotions after selection

  Background:
    Given the user is on the main page
    When the user selects the phone code
    And the user enters the phone number
    And the user clicks on the continue button
    And the user enters OTP and clicks on the approve button
    And the user clicks on the Getir Food button
    And the user clicks on the Promotions button

  Scenario: The user can select one promotion and display the restaurants
    When the user selects "Up to 30 TL discounts with Saturday Feast!" promotion
    Then the user should see the restaurants with the promotion

