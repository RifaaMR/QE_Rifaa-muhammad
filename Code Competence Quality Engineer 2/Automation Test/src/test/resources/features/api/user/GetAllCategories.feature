@GetAllCategories
Feature: Get all product categories
  As a user
  I want to get all product categories
  So that i can read all categories

  Scenario: As a user I can get all product categories
    Given I set API endpoint for show all product categories
    When I send request to get all products categories
    Then I receive status code 200
    And I receive all product categories