Feature: Get all users
  As an administrator
  I want to get all users
  So that I can view the list of users

  Scenario: Get all users successfully
    Given I set the API endpoint to get all users
    When I send a request to get all users
    Then I should receive a status code 200
    And I should receive valid data for all users

  Scenario: Unauthorized access to retrieve users
    Given I am not authorized to access the API endpoint for retrieving users
    When I send a request to retrieve all users
    Then I should receive a status code 401
    And the response should contain an error message indicating unauthorized access