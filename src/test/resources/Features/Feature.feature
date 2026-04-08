Feature: navigate to bbc and validate the news section
  Scenario: open bbc and click news
    Given i open the bbc webpage
    When i click on the news link
    Then i should see "News" in the page title