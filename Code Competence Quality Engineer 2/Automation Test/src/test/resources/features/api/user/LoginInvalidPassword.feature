@LoginInvalidPassword
Feature: Login
  As a user
  I want to login with invalid password
  So that I receive status code 404

  Scenario Outline: As a user I can login with valid credentials
    Given I set API endpoint for login with invalid credentials
    When I send request to login with valid username "<username>" and invalid password "<password>"
    Then I receive status code 404
    Examples:
      |username           |password     |
      |mor_2314           |Rifaa_Tampan |