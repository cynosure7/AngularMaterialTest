Feature: Angular Material AutoComplete

  Scenario: Basic usage for AutoComplete
    Given I visit url "https://material.angularjs.org/latest/demo/autocomplete"
    Then I should see a "Auto Complete"
#    When I click input field
#    Then I can see the drop down list
#    When I choose "California" in the drop down list
#    Then I can see "California" is in the input field