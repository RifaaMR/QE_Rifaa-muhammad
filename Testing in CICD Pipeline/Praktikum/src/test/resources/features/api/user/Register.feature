@Register
Feature: Register
  As a user
  I want to register
  So that I can use application features

  Scenario: As a user I can register with valid inputs
    Given I set API endpoint for register
    When I send request to register
    Then I receive status code 200
    And I receive valid data for register