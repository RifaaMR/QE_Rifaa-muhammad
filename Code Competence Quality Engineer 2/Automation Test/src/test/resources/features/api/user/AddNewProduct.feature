@AddNewProduct
Feature: Add A New Product
  As a User
  I want to add a new product
  So that the product data is saved

  Scenario Outline: As a user I can create an product with valid inputs
    Given I set API endpoint for add new product
    When I send request to add new product with valid credential ("<title>", price = 13.5 , "<description>", "<image>", "<category>")
    Then I receive status code 200
    And I receive valid data for created new product with id 21

    Examples:
    |title         | description    | image               |category  |
    | test product |lorem ipsum set |https://i.pravatar.cc|electronic|