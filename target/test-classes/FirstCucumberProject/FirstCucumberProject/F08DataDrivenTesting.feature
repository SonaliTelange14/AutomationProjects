Feature: Data Driven Testing on Expand Testing website

  Scenario Outline: Validate login on  ExpandTesting page
    Given Launch ExpandTesting web page
    When Enter "<Username>" and "<Password>"
    When Click on submit button for Login
    Then Login page should be open

    Examples: 
      | UserName | Password             |
      | Shruti   | shruti@123           |
      | Kiran    | kiran@123            |
      | practice | SuperSecretPassword! |
      | Swarna   | swarna@123           |
#important note: if we are using Examples: then we can not use Scenario: rather we can use Scenario Outline:
