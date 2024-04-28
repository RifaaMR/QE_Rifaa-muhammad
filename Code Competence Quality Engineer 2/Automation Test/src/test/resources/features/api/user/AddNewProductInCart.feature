@AddNewProductInCart
Feature: Add A New Product In Cart
  As a User
  I want to add a new product in cart
  So that the product data in cart is saved

  Scenario Outline: As a user I can create an product with valid inputs
    Given I set API endpoint for add new product in cart
    When I send request to add new product with valid credential userId = 5, date = "<date>"
    Then I receive status code 200
    And I receive valid data for created new product in cart
    Examples:
    |date       |
    |2020-02-03 |

