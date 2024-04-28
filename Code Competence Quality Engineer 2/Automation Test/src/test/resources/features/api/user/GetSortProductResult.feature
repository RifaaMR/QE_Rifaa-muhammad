@GetSortResultProduct
Feature: Get product with sorted result
  As a user
  I want to get product with sorted result
  So that I can read sorted result

  Scenario: As a user I can get product data with valid ID
    Given I set API endpoint for get product with sort result
    When I send request to get product with sort result
    Then I receive status code 200
    And I receive valid product data with sort result