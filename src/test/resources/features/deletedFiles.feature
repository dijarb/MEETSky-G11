Feature: DeletedFile

  Background: DeletedFile
    Given User is logged in
    And User clicks Deleted Files Button

  @deletedFilesSortName
  Scenario: User can see the most recent deleted file in the first line of the deleted file list when deleted files are ordered by newest to oldest
    When User clicks Name button
    Then Files are sorted by Name in ascending order

    @sortByDate
    Scenario: User can order the all deleted files by newest to oldest or visa versa
      When User clicks deleted button
      Then File are sorted by Date in ascending order

