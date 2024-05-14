Feature: Get all users
  As a user
  I want to get all users data
  So that I can view list of users

  Scenario: As a user I can get all users data
    Given I set API endpoint for get all users
    When I send request to get all users
    Then I receive status code 200
    And I receive valid data for all users