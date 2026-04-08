Feature: post feature on facebook
  This will test the functionality at the user wall

  Scenario: post a message on user wall
    Given user should be logged in and should be present on his wall
    When I type the message in the box
    And click on post button
    Then the message should get posted

