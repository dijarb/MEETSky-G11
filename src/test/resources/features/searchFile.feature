Feature: As a user, I should be able to search file or contact from the Dashboard and see the photos under Photos Module

  Acceptance Criteria:
  User can search file typing its name through the magnifying glass icon and see the details of the file when clicked on it.
  User can search contacts by clicking on the contacts icon and typing its name
  User can also see the images files under the Photos module when uploaded them
  User can navigate to the Files page whenever clicking the Meetsky icon at the top left corner on the page


  Background: User should be logged in and is in Files page
    Given User is logged in
    And user is in Files page

   Scenario:User can search file via the magnifying icon and see details of the file
   Given there are files in the list
   When user clicks on magnifying icon
   And can search file by entering file name
   Then user can see searched file name on the search window
   And user clicks on the selected file
   Then user can see details of the file

