@folderView
Feature: Folder View Functionality
  User Story :
  As a user, I should be able to change folder view order by using Name/Size/Modified buttons

  Acceptance Criteria:
  User can change folder view order by Name
  User can change folder view order by Size
  User can change folder view order by Modified
  User can change the folder view by clicking the toggle-view button at the right corner
  of all files tab screen
  User can select all the files at once and see the total values of all files in the first line
  when clicked on the “select all” checkbox at the left top corner of the list

  Background: User should be logged in and there should be at least 3 folders/files created in Files page
    Given User is logged in
    And user is in Files page

    @wip
    Scenario: User can change folder view order by Name
      Given there are files and folders in the list
      And user clicks on Name button
      Then files are sorted by name in ascending order
      And user clicks on Name button
      Then files are sorted by name in descending order


    Scenario: User can change folder view order by Size
      Given there are files in the list with different sizes
      And user clicks on Size button
      Then files are sorted by size in descending order
      And user clicks on Size button
      Then files are sorted by size in ascending order
