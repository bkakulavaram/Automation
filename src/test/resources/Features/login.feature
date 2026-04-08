Feature : To test login functionality
Scenario:
    Given user is on the login page
    When user enters username and password
    And click on login button
    Then user is navigated to the home page
Scenario Outline:
    Given user is on login page
    When user enter <username> and <password>
    And click on login button
    Then user is navigated to the home page

Examples: | username | password |
          | user1    |pass1     |
          |user2     |pass2     |
