@login
Feature: login

  Scenario Outline: As user i have be able to success login
    Given I am on the login page
    When I enter username "<username>"
    And I enter password "<password>"
    And I click login button
    Then I am on the home page


  Scenario Outline: As an unregistered user i will see error response
    Given I am on the login page
    When I enter username "<username>"
    And I enter password "<password>"
    And I click login button
    Then I will see login error message



