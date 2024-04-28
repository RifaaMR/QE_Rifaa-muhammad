@DeleteUserData
Feature: Delete user data
  As a user
  I want to delete user data
  So that the user data can be removed

  Scenario: As a user I can delete user with valid ID
    Given I set API endpoint for delete user data
    When I send request to delete user data with valid ID
    Then I receive status code 204

