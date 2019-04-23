Feature: This is will be the First Test on Dashboard

  @2.011 @(Dashboard) @(ManifestCreate)
  Scenario: Test Login Page
    Given user Navigates to Trade Portal
    When user clicks on Stitch
    And user will be navigated to Dashboard Page
    And On the right hand corner, click on the Plus sign for a drop down and select manifest
    And Users should be taken to create a new Manifest page
    Then Close Browser

  @2.01 @(Dashboard) @(ManifestCreate)
  Scenario: Test Login Page
    Given user Navigates to Trade Portal
    When user clicks on Stitch
    And user will be navigated to Dashboard Page
    And On the right hand corner, click on Create for a drop down and select manifest
    And Users should be taken to create a new Manifest page
    Then Close Browser

  #fails because the plus icon is not a link yet^^^
  @28(New) @(Dashboard) @(TransactionHeader)
  Scenario: User should be able see “Create” Text next to plus icon
    Given user Navigates to Trade Portal
    When user clicks on Stitch
    And user will be navigated to Dashboard Page
    And user should see Create on dashboard header
    Then Close Browser

  @38(New)(Dashboard) @(ManifestChart)
  Scenario: User should see “In the past 30 Days” next Manifest For Charts
    Given user Navigates to Trade Portal
    When user clicks on Stitch
    And user will be navigated to Dashboard Page
    And user should be able to see “In the past 30 days” next to BOL chart header
    Then Close Browser

  @39(New)(Dashboard) @(BOLChart)
  Scenario: User should see “In the past 30 Days” next BOL'S  For Charts
    Given user Navigates to Trade Portal
    When user clicks on Stitch
    And user will be navigated to Dashboard Page
    And user should be able to see Manifest Tab when on Dashboard page
    When user clicks on Manifest Tab
    And user should be directed to ManifestList Page
    Then Close Browser
