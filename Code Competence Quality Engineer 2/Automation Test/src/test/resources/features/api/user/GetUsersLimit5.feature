@Get5Users
Feature: Get user with limit 5 result only
  As a user
  I want to get user with limit 5 result only
  So that I can read 5 user result

  Scenario: As a user I can get user data with valid ID
    Given I set API endpoint for get user with limit 5 users only
    When I send request to get user with limit 5 users only
    Then I receive status code 200
    And I receive valid data with limit 5 users only