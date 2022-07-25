@METSK-515
Feature: Checking functionality of  task module.

  User Story : As a user, I should be able to create a new task list or a single task and add any task to completed and importants tasks list.

  Acceptance Criteria:
  User can create a new list of tasks**
  User can create a new task
  User can add any task to the list of completed tasks by clicking on the checkbox near the task name
  User can add any task to the list of important tasks by clicking on the star icon on the right side of task line
  User can see the number of all uncompleted tasks next to the Current tab

  Background: User is on the task page
    Given User is logged in
    And  User clicks task icon

  @METSK-514
  Scenario:Create a new task list
    When User clicks add list button
    And User enters fake name of task
    And User press enter
    Then Verify that fake name is on the task list


  @example
  Scenario Outline:Create a new task
    When User clicks add list button
    And User enters "<name>" of task
    And User press enter
    Then Verify that "<name>" task is on the task list
    Examples:
      | name  |
      | Osman |
      |Mehmet |




