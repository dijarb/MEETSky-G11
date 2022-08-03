Feature: DeletedFile

  Background: DeletedFile
    Given User is logged in
    And User clicks Deleted Files Button

  @deletedFilesSortName
  Scenario: User can see the most recent deleted file in the first line of the deleted file list when deleted files are ordered by newest to oldest
    When User clicks Name button
    Then Files are sorted by Name in ascending order

