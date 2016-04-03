@search
Feature: Search Google for links
  As an internet user
  I want to use Google to search for websites
  So that I can find them without knowing the URL

  Scenario: Search for Facebook
    Given I want to go on "Facebook"
    When I search on Google
    Then I should see the search results for "Facebook"

