Feature: Calculator Feature
  Scenario: User can login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    And clicks the login button
    Then the user should be redirected to the home page
