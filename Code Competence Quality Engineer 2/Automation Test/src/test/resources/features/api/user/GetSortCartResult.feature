@GetSortResultCart
Feature: Get cart with sorted result
  As a user
  I want to get cart with sorted result
  So that I can read sorted result

  Scenario: As a user I can get cart data with valid ID
    Given I set API endpoint for get cart with sort result
    When I send request to get cart with sort result
    Then I receive status code 200
    And I receive valid cart data with sort result