Feature: Access http://sports.williamhill.com/betting/en-gb website
  Place bet and assert the odds and returns offered

  Scenario: Place bet and assert the odds and returns offered
    Given User open site
    And User navigate to football event
    Then User navigate to place bet
    Then User define bet 0.05
    Then User click Place bet button
