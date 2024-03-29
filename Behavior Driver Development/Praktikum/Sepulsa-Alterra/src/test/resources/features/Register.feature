Feature: Register
  As a user
  I want to register
  So that I can login

  Scenario: As a user I can register with valid inputs
    Given I am on the register page
    When I input valid email
    And I input valid phone number
    And I input valid password
    And I click register button
    Then I redirected to the login page

  Scenario: As a user I cannot register with invalid inputs
    Given I am on the register page
    When I input invalid email
    And I input invalid phone number
    And I input invalid password
    And I click register button
    Then I got an invalid input message

  Scenario: As a user I cannot register with empty inputs
    Given I am on the register page
    When I empty the input
    And I click register button
    Then I cannot redirected to the login page