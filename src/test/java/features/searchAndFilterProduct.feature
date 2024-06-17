Feature: Search and filter product
  Scenario: Searches product and filter as price
    Given User clicks the search bar
    When User writes name of product and clicks search button
    When User chooses the price interval of product
    When User click filter button
    When User clicks only stocks button
    Then User should be able to view product in right interval