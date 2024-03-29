Feature: Search Profile
  As a user
  I want to search a profile
  So that I can found the profile that I wanted

  Scenario: Search for a user profile by name
    Given I am on the LinkedIn homepage
    When I entered Rifaa in the search bar
    And I click on the search button
    Then I should see search results related to Rifaa
