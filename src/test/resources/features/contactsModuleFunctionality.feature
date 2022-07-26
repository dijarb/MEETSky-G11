Feature: Contacts Module Functionality
  User Story :
  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Acceptance Criteria:
  User can create a new contact
  User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
  User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
  User can delete any selected contact




  Background: User should be logged in and is in Files page
    Given User is logged in
    And user is in Files page

@METSK-507
  Scenario: User can create a new contact
    When User clicks the Contacts icon on the header menu
    And  User ends up in Contacts page
    And  User clicks the New contact button on the menu placed left side of the page
    And  User should see the New Contact form and clicks the New Contact typed input box
    And  User writes the contact name
    And  User goes back the Files page
    And  User clicks the Contacts icon on the header menu
    Then User should see the name of the contact on the page


  @METSK-509
  Scenario: User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
    When User clicks the Contacts icon on the header menu
    And  User ends up in Contacts page
    And  User should see all the contacts as a list inside of the middle column
    Then User should see the number of the contacts near the All Contacts tab

  @METSK-510
  Scenario: User can delete any selected contact
    When User clicks the Contacts icon on the header menu
    And  User ends up in Contacts page
    And  User clicks the contacts name
    And  User clicks the three dots button on the right side of the page
    And  User clicks the Delete button on the opened dropdown list
    Then The contact must be deleted and user shouldn't see it on the contacts page






