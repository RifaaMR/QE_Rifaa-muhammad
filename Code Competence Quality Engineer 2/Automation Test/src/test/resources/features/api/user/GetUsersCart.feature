@GetUsersCart
Feature: Get user's cart
  As a user
  I want to get user's cart
  So that I can read user's cart

  Scenario: As a user I can get user's cart
    Given I set API endpoint for get user cart with id
    When I send request to get user cart with id
    Then I receive status code 200
    And I receive valid user cart data