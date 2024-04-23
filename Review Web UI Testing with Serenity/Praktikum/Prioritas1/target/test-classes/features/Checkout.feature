@checkout
Feature: checkout

  Scenario Outline: As user i want to be able to checkout product
    Given I am a logged in user
    And I already have product "<product>" on Cart
    When I press Checkout button
    And I fill "<first name>", "<last name>", "<zip code>"
    And I press continue button
    Then I will see the "<product>" on checkout step two page
    When I press Finish button
    Then I will see order success title




