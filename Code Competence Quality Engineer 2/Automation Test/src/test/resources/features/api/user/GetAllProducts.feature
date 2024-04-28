@GetAllProducts
Feature: Get all products
  As a user
  I want to get all products data
  So that I can view list of products

  Scenario: As a user I can get all users data
    Given I set API endpoint for get all products
    When I send request to get all products
    Then I receive status code 200
    And I receive valid data for all products