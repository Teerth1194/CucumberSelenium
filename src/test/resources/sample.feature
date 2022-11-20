Feature: Search automation from google

  @PreRequisite
  Scenario Outline: search Automation in google
    Given user able to navigate to google
    And user able to see google logo
    When user enter <searchText> in google textbox
    And click in search button
    Then verify if search page will be displayed

    Examples:
    |searchText|
    |Automation|