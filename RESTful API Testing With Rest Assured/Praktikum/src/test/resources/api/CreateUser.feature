Feature: Create User
  As an administrator
  I want to create a user
  So that user data can be stored

  Scenario: Successfully create a user
    Given I set the API endpoint to create a user
    When I send a request to create a user
    Then I should receive a status code 201
    And I should receive valid data for the created user

  Scenario: Failed to create a user
    Given I set the API endpoint to create a user
    When I send a request to create a user with invalid data
    Then I should receive a status code other than 201
    And I should receive an error message indicating the failure to create a user