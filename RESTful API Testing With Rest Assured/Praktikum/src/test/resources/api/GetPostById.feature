Feature: Get Post by ID
  As a user
  I want to get post by ID
  So that I can view the details of a specific post

  Scenario: Get post by ID successfully
    Given I set API endpoint to get post by ID
    When I send a request to get post by ID
    Then I receive status code 200
    And I receive valid data for post by ID
