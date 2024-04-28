@DeleteProductInCart
Feature: Delete Product in cart
  As a user
  I want to delete product in cart
  So that the product can be removed

  Scenario: As a user I can delete product in cart
    Given I set API endpoint for delete product in cart
    When I send request to delete product in cart
    Then I receive status code 200