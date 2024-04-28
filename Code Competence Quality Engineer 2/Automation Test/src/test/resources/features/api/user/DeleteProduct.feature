@DeleteProduct
Feature: Delete Product
  As a user
  I want to delete product
  So that the product can be removed

  Scenario: As a user I can delete product
    Given I set API endpoint for delete product
    When I send request to delete product
    Then I receive status code 204