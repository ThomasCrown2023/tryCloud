@B31G11-93
Feature: Contacts Module

  Agile: As a user, I should be able to create a new contact and edit/delete any contact under Contacts module


  Background:
    Given the user is logged in
    And the user clicks on Contacts module


  @B31G11-84
  Scenario Outline: US03_AC01_TC01: Verify user can create a new contact
    Given the user clicks on the New Contact button
    When the user can put "<Contact_Name>"
    Then the user clicks on all contacts button
    Then the user should see the "<Contact_Name>" in the all contacts list

    Examples:
      | Contact_Name |
      | Ahmad Ali    |



  @B31G11-88
  Scenario: US03_AC02_TC02: Verify user can see all the contacts as a list
    Given the user clicks on all contacts button
    When the user should see total number of contacts


  @B31G11-90
  Scenario: US03_AC03_TC03: Verify user can change the profile picture of any contact
    Given the user selects a contact
    When user changes the profile picture using the Choose from files option
    Then the profile picture of the selected contact should be updated


  @B31G11-92
  Scenario: US03_AC04_TC04: Verify user can delete any selected contact
    Given the user selects a contact
    When user delete the selected contact
    Then the selected contact should be deleted

