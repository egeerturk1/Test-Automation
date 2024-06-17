Feature: Send form to company
  Scenario: Fills and sends form by entering personal informations
    Given User clicks logs in button
    When User logs in
    When User clicks the about us button
    When User scrolls down in about us page
    When User clicks contact us button
    When User fills contact form
    When User clicks send button
    Then User checks that form is sent successfully

  Scenario: Fills and sends form by entering invalid personal informations
    Given User clicks logs in button
    When User logs in
    When User clicks the about us button
    When User scrolls down in about us page
    When User clicks contact us button
    When User fills contact form with invalid email
    When User clicks send button
    Then User checks that form is not sent successfully

  Scenario: Fills and sends form by entering invalid personal informations
    Given User clicks logs in button
    When User logs in
    When User clicks the about us button
    When User scrolls down in about us page
    When User clicks contact us button
    When User fills contact form with invalid phone
    When User clicks send button
    Then User checks that form is not sent successfully