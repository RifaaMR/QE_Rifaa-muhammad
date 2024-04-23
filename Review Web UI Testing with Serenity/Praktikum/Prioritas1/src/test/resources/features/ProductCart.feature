@ProductCart
Feature: product cart

  Scenario Outline: As user i want to be able to add product to cart from homepage
    Given I am a logged in user
    When I add a product "<product>" to the cart from homepage
    And I open the cart page
    Then I will see the same "<product title>" on the cart list
    Examples:
      | product                 | product title                   |
      | sauce-labs-bike-light   | Sauce Labs Bike Light           |
      | sauce-labs-backpack     | Sauce Labs Backpack             |

  Scenario Outline: As user i want to be able to remove product from cart
    Given I am a logged in user
    When I add a product "<product>" to the cart from homepage
    And I open the cart page
    And I press remove button for product "<product>"
    Then I will no longer see the "<product title>" on the cart list
    Examples:
      | product                 | product title                   |
      | sauce-labs-bike-light   | Sauce Labs Bike Light           |
      | sauce-labs-backpack     | Sauce Labs Backpack             |




