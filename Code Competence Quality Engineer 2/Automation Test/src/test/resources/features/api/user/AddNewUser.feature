@AddNewUser
Feature: Add A New User
  As a user
  I want to add a new user
  So that the user data is saved

  Scenario Outline: As a user I can create an user with valid inputs
    Given I set API endpoint for add new user
    When I send request to add new user with valid credential ("<email>", "<username>", "<password>", "<firstname>", "<lastname>", "<city>", "<street>", 3, "<zipcode>", "<lat>", "<long>", "<phone>")
    Then I receive status code 201
    And I receive valid data for created new user
    Examples:
    |email          | username | password | firstname | lastname | city   | street        | zipcode    | lat     | long  | phone         |
    |John@gmail.com |johnd     |m38rmF$   | John      | Doe      |kilcoole| 7835 new road | 12926-3874 | -37.3159|81.1496|1-570-236-7033 |