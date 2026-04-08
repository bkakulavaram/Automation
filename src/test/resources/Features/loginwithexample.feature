Feature: login action
  @SmokeTest
  Scenario Outline: Succesful login with valid credentials
    Given user is on home page
    When user navigate to login page
    And user enter "<username>" and "<password>"
    Then message displayed login successfully

    Examples:
    | username | password |
    | standard_user | secret_sauce |
    | locked_out_user | secret_sauce |
    | problem_user | secret_sauce    |
    | performance_glitch_user | secret_sauce |

