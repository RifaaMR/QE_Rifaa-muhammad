Feature: Login
  As a user
  I want to login
  So that I can access dashboard page

  Scenario: As a user I can login with valid inputs
    Given I am on the login page
    When I input valid phone number or email
    And I input valid password
    And I click login button
    Then I am redirected to the dashboard page

  Scenario: As a user I cannot login with invalid inputs
    Given I am on the login page
    When I input invalid phone number or email
    And I input invalid password
    And I click login button
    Then I get an error message that my password or email is incorrect

  Scenario: As a user I cannot login with empty inputs
    Given I am on the login page
    When I empty the input
    And I click login button
    Then I cannot be redirected to the dashboard page