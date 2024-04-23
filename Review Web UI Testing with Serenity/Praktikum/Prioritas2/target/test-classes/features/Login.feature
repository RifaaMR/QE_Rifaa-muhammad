@login
Feature: login

  Scenario Outline: As a registered user i want to be able to login
    Given I open sepulsa.com login page
    When I enter credentials on "<email>" and "<password>" fields
    And I press submit button
    Then I will successfully redirect to homepage

  Scenario Outline: As a non registered user i want to try login with invalid credentials
    Given I open sepulsa.com login page
    When I enter credentials on "<email>" and "<password>" fields
    And I press submit button
    Then I will see error message



