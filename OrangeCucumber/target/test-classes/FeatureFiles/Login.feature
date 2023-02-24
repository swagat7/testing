Feature: Test the Login functionality

  Scenario Outline: Checking with different credentials
    Given Open the Application
    When Enter the <username><password>
    And Click on login button
    Then Close the application

    Examples: 
      | username   | password   |
      | "nareshit" | "nareshit" |
