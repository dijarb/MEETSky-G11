Feature: Talk Module Functionality

  User Story :

  As a user, I should be able to create/delete conversation groups and chat with other co-workers under Talk Module

  Acceptance Criteria

  User can create a new group conversation by adding other users
  User can can see the participants of the conversation on the right-hand menu under Participants
  User can remove any participant from the conversation as being moderator of the conversation
  User can send messages by typing inside the input box at the bottom of the middle screen on Talk Module page
  User can delete any group conversation previously created

  Background: User should be logged in and is in Files page
    Given User is logged in
    And user is in Files page

  @METSK-508
  Scenario: User can create a new group conversation by adding other users
    When User clicks talk icon on header menu
    And User clicks plus icon from opened menu on left side of the page
    And User types the group name in input box
    And User clicks Add participants button on the bottom right
    And User selects any of the contacts in contact list
    Then New group conversation is created and displayed with the same name on the top left side
