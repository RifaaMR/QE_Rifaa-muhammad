Feature: Login
  As a user
  I want to login
  So that I can access dashboard page

  Scenario: As a user I can login with valid email and password
    Given I am on the login page
    When I input valid email for login
    And I input valid password login
    And I click login button
    Then I successfully entered the dashboard page

  Scenario: As a user I cannot login with invalid email and password
    Given I am on the login page
    When I input invalid email or password for login
    And I click login button
    Then I failed to enter the dashboard page

  Scenario: As a user I cannot login with empty input
    Given I am on the login page
    When I empty the input
    And I click login button
    Then I still in the login page
