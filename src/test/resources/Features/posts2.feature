Feature: post feature on facebook
  This will test the functionality at the user wall

  Scenario: post a message on user wall
    Given user should be logged in and should be present on his wall
    When I type the message in the box
    And click on post button
    Then the message should get posted

  Scenario: post a video on user wall
    Given user should be logged in and should be present on his wall
    When user supply the youtube link in the textbox
    And click on post button
    Then video should get posted on the user wall
    And the video should have proper thumbnail