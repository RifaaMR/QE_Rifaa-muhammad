Feature: Ewallet Topup
  As a user
  I want to topup ewallet
  So that my ewallet will increase

  Scenario: User can top up their ewallet with a valid amount
    Given the Sepulsa application is opened by the user
    When the user selects the ewallet topup service
    And a valid ewallet number is entered by the user
    And a valid topup amount is selected by the user
    And the user proceeds with the payment
    Then the ewallet topup is successful

  Scenario: User cannot top up their ewallet with an invalid amount
    Given the Sepulsa application is opened by the user
    When the user selects the ewallet topup service
    And a valid ewallet number is entered by the user
    And an invalid topup amount is selected by the user
    And the user proceeds with the payment
    Then the ewallet topup fails with an error message