@METSK-487
Feature: Add to Favorites/Rename/Comment on File Functionality
  As a user, I should be able to add a file to favorites,
  rename any file and give some comments on any file.

  Background: user should be logged in and in files page
    Given User is logged in
    When user is on dashboard page
    And user click Files button
    Then user should be able to be in Files page

  @METSK-525
  Scenario: user can add any file to favorites from its own three dots menu
    When user clicks on three dots button
    And user clicks Add to favorites button
    And user clicks to Favorites
    Then user should see his favorite files in Favorite part

  @METSK-526
  Scenario: user can rename any file from its own three dots menu
    When user clicks on three dots button
    And user clicks Rename button
    And user enters "Test2" for file
    Then user should be able to see his changes on file "Test2"

  @METSK-527
  Scenario: user can put some comments on any file from the file details menu opened right side
    When user clicks on three dots button
    And user clicks on details button
    And user chooses comments option in details
    And user writes some comments in comments option
    And user clicks the right side arrow
    Then user should be able to see his comments

  @METSK-528
  Scenario: user can delete the comments made on any file from the the file details menu opened right side
    When user clicks on three dots button
    And user clicks on details button
    And user chooses comments option in details
    And user clicks on three dots button related to comment
    And user clicks on delete comment button
    Then user should be able to delete the comment




