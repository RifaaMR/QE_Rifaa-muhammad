@LoginInvalidUsername
Feature: Login
  As a user
  I want to login with invalid username
  So that I receive status code 404

  Scenario Outline: As a user I can login with invalid credentials
    Given I set API endpoint for login with invalid credentials
    When I send request to login with invalid username "<username>" and valid password "<password>"
    Then I receive status code 401
    Examples:
      |username           |password     |
      |Bandung            |83r5^_       |