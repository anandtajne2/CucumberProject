Feature: Test the login functionality of OrangeHRM

  Scenario: Test the valid login 1
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user should land on home page
    And user will close the browser

  Scenario: Test the valid login 2
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user should land on home page
    And user will close the browser
