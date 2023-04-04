Feature: Calculator Feature
  Scenario: User can login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    And clicks the login button
    Then the user should be redirected to the home page

  Scenario: User can login with invalid credentials
    Given the user is on the login page
    When the user enters invalid username and password
    And clicks the login button
    Then display error message

  Scenario: User can login with invalid credentials
    Given the user is on the login page
    When the user enters invalid username and valid password
    And clicks the login button
    Then display error message

  Scenario: User can login with invalid credentials
    Given the user is on the login page
    When the user enters valid username and invalid password
    And clicks the login button
    Then display error message

  Scenario: User can login with invalid credentials
    Given the user is on the login page
    When the user enters empty username and password
    And clicks the login button
    Then display error message

