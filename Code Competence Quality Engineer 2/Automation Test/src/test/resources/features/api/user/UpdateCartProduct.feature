@UpdateCartProduct
Feature: Update product in cart
  As a user
  I want to update product in cart
  So that the product is updated

  Scenario: As a user I can update product in cart with valid inputs
    Given I set API endpoint for update product in cart
    When I send request to update product in cart with valid credential
    Then I receive status code 200
    And I receive valid data for updated product in cart

