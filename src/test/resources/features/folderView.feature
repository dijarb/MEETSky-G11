@METSK-489
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

  Background: User should be logged in and is in Files page
    Given User is logged in
    And user is in Files page

    @METSK-501
    Scenario: User can change folder view order by Name
      Given there are files or folders in the list
      When user clicks on Name button
      Then files are sorted by name in ascending order
      And user clicks on Name button
      Then files are sorted by name in descending order

    @METSK-502
    Scenario: User can change folder view order by Size
      Given there are files in the list with different sizes
      When user clicks on Size button
      Then files are sorted by size in ascending order
      And user clicks on Size button
      Then files are sorted by size in descending order

    @METSK-503
    Scenario: User can change folder view order by Modified
      Given there are files or folders in the list
      When user clicks on Modified button
      Then files are sorted by date modified from newest to oldest
      And user clicks on Modified button
      Then files are sorted by date modified from oldest to newest

    @METSK-504
    Scenario: User can change the folder view by clicking the toggle-view button at the right corner of all files tab screen
      Given there are files or folders in the list
      When user clicks Toggle grid view button
      Then files are shown in a grid
      And user clicks Toggle grid view button
      Then files are shown in a list

    @METSK-505
    Scenario: User can select all the files at once and see the total values of all files in the first line when clicked on the “select all” checkbox at the left top corner of the list
      Given there are files or folders in the list
      When user clicks select all button
      Then all file checkboxes are selected
      And user can see the total values of all files in the first line