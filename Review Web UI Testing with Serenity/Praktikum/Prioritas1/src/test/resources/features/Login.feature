@login
Feature: login

  Scenario Outline: As user i have be able to success login
    Given I am on the login page
    When I enter username "<username>"
    And I enter password "<password>"
    And I click login button
    Then I am on the home page
    Examples:
    | username      | password      |
    | standard_user | secret_sauce  |
    | problem_user  | secret_sauce  |

  Scenario Outline: As an unregistered user i will see error response
    Given I am on the login page
    When I enter username "<username>"
    And I enter password "<password>"
    And I click login button
    Then I will see login error message
    Examples:
      | username      | password      |
      | standard_user | known_sauce   |
      | normal_user   | known_sauce   |


