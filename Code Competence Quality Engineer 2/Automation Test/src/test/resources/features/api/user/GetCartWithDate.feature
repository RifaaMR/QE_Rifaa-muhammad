@GetCartWithDateRange
Feature: Get cart with date range
  As a user
  I want to get cart with date range
  So that I can view list of carts

  Scenario: As a user I can get all cart in date range
    Given I set API endpoint for get all cart in date range
    When I send request to get all cart in date range
    Then I receive status code 200
    And I receive valid data for all cart in date range