Feature: Update Post by ID
  As a user
  I want to update post by ID
  So that I can modify the details of a specific post

  Scenario: Update post by ID successfully
    Given I set API endpoint to update post by ID
    When I send a request to update post by ID
    Then I receive status code 200
    And I receive valid data for updated post
