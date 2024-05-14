Feature: Get user
  As a user
  I want to get single user
  So that I can read single user data

  Scenario: As a user I can get user data with valid ID
    Given I set API endpoint for get user
    When I send request to get user
    Then I receive status code 200
    And I receive valid data for user