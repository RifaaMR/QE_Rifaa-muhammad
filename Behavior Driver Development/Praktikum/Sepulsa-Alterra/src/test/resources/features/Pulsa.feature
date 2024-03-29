Feature: Pulsa Topup
  As a user
  I want to topup pulsa
  So that my credit will increase

  Scenario: User can top up credit with valid amount
    Given User opens the Sepulsa application
    When User selects the credit top-up service
    And User enters a valid phone number
    And User selects a valid credit amount
    And User proceeds with the payment
    Then Credit top-up is successful

  Scenario: User cannot top up credit with invalid amount
    Given User opens the Sepulsa application
    When User selects the credit top-up service
    And User enters a valid phone number
    And User selects an invalid credit amount
    And User proceeds with the payment
    Then Credit top-up fails with an error message