Feature: Handel Alert / Popups

  Scenario Outline: Checking Alert
    Given Open Application
    When Enter the <username>
    And Click on the login button
    And Switch to alert
    Then Close Application

    Examples: 
      | username   |
      | "nareshit" |
