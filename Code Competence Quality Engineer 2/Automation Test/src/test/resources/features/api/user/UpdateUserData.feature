@UpdateUserData
Feature: Update user data
  As a user
  I want to update user data
  So that the user data is updated

  Scenario: As a user I can update user data with valid inputs
    Given I set API endpoint for update user data
    When I send request to update user with valid credential
    Then I receive status code 200
    And I receive valid data for updated user data

