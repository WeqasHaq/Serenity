@Smoke
Feature: Manifest Page Smoke Test
  Scenario: Create Manifest Smoke Test
    Given User Navigates to Trade Portal
    When User login as Stitch
    And User will be navigated to Manifest Page
    And User clicks on Manifest Link
    And User clicks plus button to creates manifest
    And Open create a new Manifest page
    Then Close the Browser