@GetLimitCart
Feature: Get cart with limit 5 result only
  As a user
  I want to get cart with limit 5 result only
  So that I can read 5 cart result

  Scenario: As a user I can get cart data with valid ID
    Given I set API endpoint for get cart with limit 5 carts only
    When I send request to get cart with limit 5 carts only
    Then I receive status code 200
    And I receive valid data with limit 5 carts only