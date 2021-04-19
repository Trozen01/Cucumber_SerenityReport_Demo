Feature: Amazon Home Page

  Scenario: Amazon Login proper format
    Given User is on Amazon login page
    And Sign in button is avaliable on page
    When User click on sign in button
    Then User can see login page
    When User can Enter "s@gmail.com" in username field
    And User can Enter "pass" in password field
    And User click Sign in button
    Then User is on Home Page
    And Title of home page is "Amazon"
    But Sign is button is not present
