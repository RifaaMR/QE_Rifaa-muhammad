Feature: Delete Post by ID
  As a user
  I want to delete post by ID
  So that I can remove a specific post from the database

  Scenario: Delete post by ID successfully
    Given I set API endpoint to delete post by ID
    When I send a request to delete post by ID
    Then I receive status code 200
    And I receive valid data for deleted post
