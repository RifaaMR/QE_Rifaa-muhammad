@order
Feature: order

  Scenario Outline: As a user i want to be able to order pulsa product
    Given I open sepulsa.com homepage
    When I press at "<product>" product icon
    Then I will be directed to the correct "<product>" product page
    And I enter "<phone number>" at form field
    And I select the first pulsa package
    Then I will be directed to payment page
    When I enter valid "<email address>" at form field
    And I select payment method
    And I select Bayar Sekarang button
    Then I will be directed to finish transaction page
    Examples:
      | product | phone number | email address         |
      | Pulsa   | 081212121212 | Testing1234@gmail.com |



