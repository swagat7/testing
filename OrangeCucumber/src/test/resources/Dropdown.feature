Feature: Select all dropdowns

  Scenario Outline: select from dropdown
    Given Open application
    When Enter <username> <password>
    And Click on login Button
    And Click on all the dropdown
    Then Close application

    Examples: 
      | username   | password   |
      | "nareshit" | "nareshit" |
