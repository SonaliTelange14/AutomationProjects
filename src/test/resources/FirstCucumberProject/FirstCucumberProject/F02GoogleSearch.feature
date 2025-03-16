Feature: Google Search

  Scenario: Validate google search funtionality
    Given Open Google WebSite
    When Enter valid text in searchbox
    And Press Enter key
    Then A valid search result should display
