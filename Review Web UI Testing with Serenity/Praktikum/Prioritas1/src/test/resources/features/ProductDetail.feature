@ProductDetail
Feature: product detail

  Scenario Outline: As user i want to be able to see product detail
    Given I am a logged in user
    When I press product "<product>" title
    Then I will be directed to product page
    And I can see the same product "<product>" title
    And I can see product description
    And I can see product price
    And I can see product image
    Examples:
      |product                         |
      |Sauce Labs Bike Light           |
      |Sauce Labs Backpack             |

  Scenario Outline: As user i want to add product to cart from detail page
    Given I am a logged in user
    When I press product "<product>" title
    And I press add to cart button
    And I open the cart page
    Then I will see the same "<product>" on the cart list
    Examples:
      |product                         |
      |Sauce Labs Bike Light           |
      |Sauce Labs Backpack             |





