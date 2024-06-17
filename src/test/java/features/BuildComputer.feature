Feature: Build Computer
  Scenario: Selects computer by the given list of pc parts and try to buy successfully
    Given User clicks the select computer button
    When User selects montage and configuration service
    When User selects processor
    When User selects motherboard
    When User selects RAM
    When User selects Graphics Unit
    When User selects computer case
    When User selects ssd
    Then User adds computer into basket
    Then User should be able to view selected computer in basket

    #Next scenerio is a example of a correct way of working of a functionality.So This test should pass
  Scenario: Skips essential parts so it should fail

    Given User clicks the select computer button
    When User selects montage and configuration service
    When User selects processor
#   Skips selecting motherboard
    When User tries to select RAM
    Then User informed to select motherboard before selecting any other essential parts

    #Next scenerios are examples of wrong way of working of a functionalities.So These test should fail.
  Scenario: Adds and removes motherboard
            but can select next essential part
    Given User clicks the select computer button
    When User selects montage and configuration service
    When User selects processor
    When User selects motherboard
    When User removes motherboard
    When User tries to select RAM
    Then User informed to select motherboard before selecting any other essential parts

    Scenario: Buys only montage and configuration service without building pc
      Given User clicks the select computer button
      When User selects montage and configuration service
      When User adds computer into basket
      When User goes to basket
      Then User informed buying only montage and configuration service is invalid