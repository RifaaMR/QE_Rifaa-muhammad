@GetAllCarts
Feature: Get all carts
  As a user
  I want to get all carts data
  So that I can view list of carts

  Scenario: As a user I can get all users data
    Given I set API endpoint for get all carts
    When I send request to get all carts
    Then I receive status code 200
    And I receive valid data for all carts