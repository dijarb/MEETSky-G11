Feature: Upload, move or delete file any selected file under the Files module
  User Story :
  As a user, I should be able to upload a file, move or delete any selected file under the Files module

  Acceptance Criteria:
  User can upload a file
  User can create a new folder
  User can move or copy any selected item to any folder
  User can delete any selected item from its three dots menu
  User can see the total number of files and folders under the files list table

  Background: User should be logged in and is in Files page
    Given User is logged in
    And user is in Files page

    Scenario: User can upload a file
      When User clicks plus icon on the file page
      Then User choose the file from desktop
      And User upload the file
      Then User see file on the file bar

      Scenario: User can create a new folder
        When User clicks plus icon on the file page
        Then User choose New Folder on the dropdown menu
        And User write "Group11"
        And User click icon arrow or press Enter

        Scenario: User can move or copy any selected item to any folder
          When
