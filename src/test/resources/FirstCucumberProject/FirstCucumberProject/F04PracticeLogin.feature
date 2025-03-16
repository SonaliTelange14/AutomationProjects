Feature: Login Practice Page

  Background: 
    Given Open Practice Login page website

  Scenario: Validate login with valid data
    When Enter valid username as "student" 
    When Enter valid password as "Password123"
    When Click on submit button
    Then Login successful and Homepage display

  Scenario: To validate login with Invalid Data
    When Enter invalid username as "Purvi"
    When Enter invalid password as "Purvi789"
    When Clicked on submit button
    Then Error message display
