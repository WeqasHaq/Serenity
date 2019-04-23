Feature: Testing the overall manifests modual

  @Test1
  Scenario: This will test main page of manifest
    Given That Im on manifest page
    And Search Manifest Number and more in text box
    And I Enter Start Date
    And I Enter End Date
    And I Select Trip Status
    And I Select Filing Status
    # And Click on extra Filters
    # And Click on Actual Port of Arrival
    And Enter Text for port of arrivial
    And Validate that U.S. Customs & border is on header
    And Validate that U.S. Department of Homeland Security is on header
    Then Close Browser

  @Test2
  Scenario: This will test the fuctionality of Search Bar being able to remove search results
    Given That Im on manifest page
    When I see Start Date on Search Bar remove it
    And when I see Trip Status on Search Bar remove it
    And when I see Filing Status on Search Bar remove it
    And when I see Port of Arrival on search bar remove it
    Then Close Browser

  @Test3 @1.05A
  Scenario: 1.05A User can do a wide search on Manifest page using SCAC code
    Given That Im on manifest page
    When I see On the top left side, User should see a blank field labeled as search where user can type in a SCAC code and then press enter
    And User can now view all the results that matches with value entered in the search field for SCAC
    Then Close Browser

  @Test4 @1.05B
  Scenario: 1.05B User can do a wide search on Manifest page using Manifest Number
    Given That Im on manifest page
    When On the top left side, User should see a blank field labeled as search where user can type in a Manifest Number and then press enter
    Then User can now view all the results that matches with value entered in the search field for Manifest Number
    Then Close Browser
