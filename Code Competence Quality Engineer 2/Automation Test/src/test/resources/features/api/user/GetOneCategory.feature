@GetOneCategory
Feature: Get one product category
  As a user
  I want to get one product category
  So that i can read one category

  Scenario: As a user I can get a product category
    Given I set API endpoint for show a product category
    When I send request to get a products category
    Then I receive status code 200
    And I receive a product category