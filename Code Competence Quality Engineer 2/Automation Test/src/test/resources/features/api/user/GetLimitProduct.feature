@Get5Products
Feature: Get product with limit 5 result only
  As a user
  I want to get product with limit 5 result only
  So that I can read 5 product result

  Scenario: As a user I can get product data with valid ID
    Given I set API endpoint for get user with limit 5 products only
    When I send request to get user with limit 5 products only
    Then I receive status code 200
    And I receive valid data with limit 5 products only