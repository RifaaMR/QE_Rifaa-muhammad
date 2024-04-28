@GetSortResultUsers
Feature: Get user with sorted result
  As a user
  I want to get user with sorted result
  So that I can read sorted result

  Scenario: As a user I can get user data with valid ID
    Given I set API endpoint for get user with sort result
    When I send request to get user with sort result
    Then I receive status code 200
    And I receive valid data with sort result