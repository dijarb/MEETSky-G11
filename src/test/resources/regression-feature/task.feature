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



    @METSK-517
    Scenario: User can create a new task
      When User clicks add list button
      And User enters fake name of task
      And User press enter
      And User enter new task inside the task list
      And User press enter
      Then Verify that new task is on the task list


  @METSK-530
  Scenario: User can add any task to the list of completed tasks by clicking on the checkbox near the task name
    When User clicks add list button
    And User enters fake name of task
    And User press enter
    And User enter new task inside the task list
    And User press enter
    When User clicks checkbox near the task name
    And User clicks completed task button
    Then Verify that task is on the the list of completed tasks

  @METSK-531
  Scenario: User can add any task to the list of important tasks by clicking on the star icon on the right side of task line
    When User clicks add list button
    And User enters fake name of task
    And User press enter
    And User enter new task inside the task list
    And User press enter
    When User clicks star icon near the task name
    And User clicks important task button
    Then Verify that task is on the the list of important tasks

  @METSK-532 @smoke
  Scenario: User can see the number of all uncompleted tasks next to the Current tab
    Then Verify that user can see the number of all uncompleted tasks

  @example
  Scenario Outline:Create a new task
    When User clicks add list button
    And User enters "<name>" of task
    And User press enter
    Then Verify that "<name>" task is on the task list
    Examples:
      | name  |
      | Numan |
      |Agah |
