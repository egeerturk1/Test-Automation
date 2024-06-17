Feature: Add address
  Scenario: Adding delivery address after search and add to basket
    # Expected: delivery address is saved
    # Actual: delivery address is saved
    # 'Then' statement passes.
    Given User clicks logs in button
    When User logs in
    When User clicks the search bar
    When User writes name of product and clicks search button
    When User chooses the price interval of product
    When User click filter button
    When User clicks only stocks button
    When User clicks the first product
    When User clicks the add basket button
    When User clicks the basket
    When User clicks shopping card from Homepage
    When User clicks on address selection
    When User clicks the add address
    When User fills the necessary valid address information
    When User clicks the save
    Then User should be able to see the delivery address added successfully

  Scenario: Adding delivery address WITH INVALID EMAIL
    # Expected: delivery address is not saved
    # Actual: delivery address is saved
    # 'Then' statement fails.
    Given User clicks logs in button
    When User logs in
    When User clicks the search bar
    When User writes name of product and clicks search button
    When User chooses the price interval of product
    When User click filter button
    When User clicks only stocks button
    When User clicks the first product
    When User clicks the add basket button
    When User clicks the basket
    When User clicks shopping card from Homepage
    When User clicks on address selection
    When User clicks the add address
    When User fills the necessary address information but with using invalid email
    When User clicks the save
    Then User should NOT be able to see the delivery address added successfully

  Scenario: Adding delivery address WITH INVALID TC NUMBER
    # Expected: delivery address is not saved
    # Actual: delivery address is saved
    # 'Then' statement fails.
    Given User clicks logs in button
    When User logs in
    When User clicks the search bar
    When User writes name of product and clicks search button
    When User chooses the price interval of product
    When User click filter button
    When User clicks only stocks button
    When User clicks the first product
    When User clicks the add basket button
    When User clicks the basket
    When User clicks shopping card from Homepage
    When User clicks on address selection
    When User clicks the add address
    When User fills the necessary address information but with using invalid TC number
    When User clicks the save
    Then User should NOT be able to see the delivery address added successfully

  Scenario: Adding delivery address WITH INVALID EMAIL AND TC NUMBER
    # Expected: delivery address is not saved
    # Actual: delivery address is saved
    # 'Then' statement fails.
    Given User clicks logs in button
    When User logs in
    When User clicks the search bar
    When User writes name of product and clicks search button
    When User chooses the price interval of product
    When User click filter button
    When User clicks only stocks button
    When User clicks the first product
    When User clicks the add basket button
    When User clicks the basket
    When User clicks shopping card from Homepage
    When User clicks on address selection
    When User clicks the add address
    When User fills the necessary address information but with using invalid email and invalid TC number
    When User clicks the save
    Then User should NOT be able to see the delivery address added successfully

  Scenario: Adding address with an invalid TC number BUT from the homepage
    # Expected: address is not saved
    # Actual: address is saved
    # 'Then' statement passes.
    Given User clicks logs in button
    When User logs in
    When User clicks the user profile button
    When User clicks the my address information
    When User clicks the add address from MyAddresses
    When User fills the necessary address information but with using invalid TC number
    When User clicks the save
    Then User should NOT be able to see the address added successfully from HOMEPAGE with that TC number

  Scenario: Adding address with an invalid email BUT from the homepage
    # Expected: address is not saved
    # Actual: address is saved
    # 'Then' statement fails.
    Given User clicks logs in button
    When User logs in
    When User clicks the user profile button
    When User clicks the my address information
    When User clicks the add address from MyAddresses
    When User fills the necessary address information but with using invalid email
    When User clicks the save
    Then User should NOT be able to see the address added successfully from HOMEPAGE with that email

  Scenario: Changing the valid TC number to invalid TC number to already added address
    # Expected: address is not saved
    # Actual: address is saved
    # 'Then' statement fails.
    Given User clicks logs in button
    When User logs in
    When User clicks the user profile button
    When User clicks the my address information
    When User clicks the edit address
    When User changes the valid TC number and fills with an invalid TC number instead
    When User clicks save edited address
    Then User should NOT be able to see the address added successfully from HOMEPAGE with that TC number