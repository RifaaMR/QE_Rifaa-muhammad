@GetSingleProducts
Feature: Get Single product
  As a user
  I want to get single product data
  So that I can view a product data

  Scenario: As a user I can get a product data
    Given I set API endpoint for get product data
    When I send request to get product data
    Then I receive status code 200
    And I receive valid data from a product