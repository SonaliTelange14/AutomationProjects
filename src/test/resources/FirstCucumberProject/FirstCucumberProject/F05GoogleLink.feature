@GoogleLink
Feature: Google Links

  Background: 
    Given Launch google application

  @SmokeTest
  Scenario: To validate Gmail Link
    When Click on Gmail link
    Then Gmail Page should open

  @SanityTest
  Scenario: To validate Images Link
    When Click on Images link
    Then Images Page should open

  @UITest
  Scenario: To validate Advertising link
    When Click on Advertising link
    Then Advertising Page should open

  @UsabilityTest
  Scenario: To validate Business link
    When Click on Business link
    Then Business Page should open
