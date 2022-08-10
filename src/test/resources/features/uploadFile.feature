Feature: Upload, move or delete file any selected file under the Files module
  User Story :
  As a user, I should be able to upload a file, move or delete any selected file under the Files module

  Acceptance Criteria:
  User can upload a file
  User can create a new folder
  User can move or copy any selected item to any folder
  User can delete any selected item from its three dots menu
  User can see the total number of files and folders under the files list table

  Background: user should be logged in and is in Files page
    Given User is logged in
    And user is in Iroda's Files page


  Scenario: user can create new folder on a file page
    When user clicks plus icon on the file page
    Then user choose New Folder on the dropdown menu
    And user write "Group11"
    And user click icon arrow or press Enter


  Scenario: User can move or copy any selected item to any folder
    When user clicks three dots icon
    Then user choose the move or copy selection on dropdown menu
    And user choose the move option
    And user moved new folder inside Talk the folder


  Scenario: User can delete any selected item from its three dots menu
    When user click Talk folder
    Then user select delete option inside three dots menu
    And user deleted the folder


