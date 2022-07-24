Feature: Add to Favorites/Rename/Comment on File Functionality
  As a user, I should be able to add a file to favorites,
  rename any file and give some comments on any file.

  Background: user should be logged in and in files page
    Given User is logged in
    And user is in Files page

    @wip
  Scenario: user can add any file to favorites from its own three dots menu
    When user clicks on three dots button
    And user clicks Add to favorites button
    And user clicks to Favorites
    Then user should see his favorite files in Favorite part


