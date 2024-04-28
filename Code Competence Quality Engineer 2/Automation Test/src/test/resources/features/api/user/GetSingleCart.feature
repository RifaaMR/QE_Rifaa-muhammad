@GetSingleCart
Feature: Get Single Cart
  As a user
  I want to get single Cart data
  So that I can view a Cart data

  Scenario: As a user I can get a Cart data
    Given I set API endpoint for get Cart data
    When I send request to get Cart data
    Then I receive status code 200
    And I receive valid data from a Cart