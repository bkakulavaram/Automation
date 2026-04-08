Feature: Test login functionality
  Scenario Outline: check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When  User enters "<username>" and "<password>"
    And User clicks on login
    Then User is navigated to the home page

    Examples:
      | username  | password   |
      | student   | Password123|
      | bhargavi  | 12345      |
