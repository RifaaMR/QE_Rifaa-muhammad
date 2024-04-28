Feature: Create an user
  As a user
  I want to create a new user
  So that the user data is saved

  Scenario: As a user I can create an user with valid inputs
    Given I set API endpoint for create user
    When I send request to create user with valid inputs
    Then I receive status code 201
    And I receive valid data for created user