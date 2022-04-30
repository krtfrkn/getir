@wip
Feature: As a user, I should see the given number of restaurants in the dashboard page
  Background:
    Given the user is on the main page
    When the user selects the phone code
    And the user enters the phone number
    And the user clicks on the continue button
    And the user enters OTP and clicks on the approve button
    And the user clicks on the Getir Food button

    Scenario: Given number of restaurants in the dashboard page
      When the user clicks show more button to end
      Then the user sees the given number of restaurants