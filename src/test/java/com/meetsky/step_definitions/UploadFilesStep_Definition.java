package com.meetsky.step_definitions;

import com.meetsky.pages.FilesPage;
import com.meetsky.pages.FilePageUploadFiles;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ENTER;

public class UploadFilesStep_Definition {

    FilesPage filesPage = new FilesPage();
    FilePageUploadFiles filePageUploadFiles = new FilePageUploadFiles();

    @Given("user is in Iroda's Files page")
    public void user_is_in_iroda_s_files_page() {
        // This functionality for setting language
      //  if (!uploadFiles.welcomeText.getText().startsWith("Good")) {
            filePageUploadFiles.setUpLanguage();
     //   }
        filesPage.filesPageLink.click();

    }
    @When("user clicks plus icon on the file page")
    public void user_clicks_plus_icon_on_the_file_page() {
        BrowserUtils.waitFor(5);
        filePageUploadFiles.plusIconFilePage.click();
    }

    @Then("user choose New Folder on the dropdown menu")
    public void userChooseNewFolderOnTheDropdownMenu() {

        filePageUploadFiles.newFolderElement.click();


    }

    @And("user write {string}")
    public void userWrite(String string) {

        filePageUploadFiles.newFolderElement.sendKeys("Group 11");

    }

    @And("user click icon arrow or press Enter")
    public void userClickIconArrowOrPressEnter() {
        filePageUploadFiles.newFolderArrow.click();
    }


    @When("user clicks three dots icon")
    public void userClicksThreeDotsIcon() {
        filePageUploadFiles.threeDotsDropdownMenu.click();
    }


    @Then("user choose the move or copy selection on dropdown menu")
    public void userChooseTheMoveOrCopySelectionOnDropdownMenu() {
        filePageUploadFiles.threeDotsMenuMoveOrCopyElement.click();
    }

    @And("user choose the move option")
    public void userChooseTheMoveOption() {
        filePageUploadFiles.talkFolder.click();


    }

    @And("user moved new folder inside Talk the folder")
    public void userMovedNewFolderInsideTalkTheFolder() {
        filePageUploadFiles.moveOptionOnDotsMenu.click();
    }


    @When("user click Talk folder")
    public void userClickTalkFolder() {
        filePageUploadFiles.talkFolderFilePage.click();
    }


    @Then("user select delete option inside three dots menu")
    public void userSelectDeleteOptionInsideThreeDotsMenu() {
        filePageUploadFiles.threeDotsMenuInsideFolder.click();
    }

    @And("user deleted the folder")
    public void userDeletedTheFolder() {
        filePageUploadFiles.threeDotsMenuDeleteOption.click();
    }
}
