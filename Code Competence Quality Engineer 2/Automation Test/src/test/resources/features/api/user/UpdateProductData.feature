@UpdateProductData
Feature: Update product in cart
  As a user
  I want to update product data
  So that the product data is updated

  Scenario: As a user I can update product in cart with valid inputs
    Given I set API endpoint for update product data
    When I send request to update product data with valid credential
    Then I receive status code 200
    And I receive valid data for updated product data

