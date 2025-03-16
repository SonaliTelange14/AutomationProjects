Feature: Login to HRM application

  Background: 
    Given Open HRM web application

  Scenario: Login to OHRM using valid data
    When Enter valid username and password
    And I Click on Login button
    Then Homepage should display

  Scenario: Login to OHRM using invalid data
    When Enter invalid username and password
    And Click on login button
    Then Error message should display
