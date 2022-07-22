Feature: Creating a new task list or a single task and add any task to completed and importants tasks list.

  Background: User is on the task page
    Given User is logged in
    When  User clicks task icon



  Scenario:Create a new task
    When User clicks add list button
    And User enters name of task
    And User press enter

    @abid
  Scenario:Note a new task
    When User clicks notes button
    And User check "Personel" in the notes category


