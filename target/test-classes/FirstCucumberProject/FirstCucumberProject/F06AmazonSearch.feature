Feature: Search product on Amazon

  Scenario: To validate search functionality of Amazon
    Given Launch "https://www.amazon.in/"
    When Enter product "Android Phone Under" and 10000
    When Click on search button
    Then Search result should display
