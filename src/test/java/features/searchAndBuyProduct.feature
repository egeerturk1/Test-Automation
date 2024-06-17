Feature: Search and buy product
  Scenario: Searches product and try to buy successfully
    Given User clicks the search bar
    When User writes name of product and clicks search button
    When User chooses the price interval of product
    When User click filter button
    When User clicks only stocks button
    When User clicks the first product
    When User clicks the add basket button
    When User clicks the basket
    Then User should be able to view product in basket
