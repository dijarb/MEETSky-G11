package com.meetsky.step_definitions;

import com.meetsky.pages.FilesPage;
import com.meetsky.pages.FilePageUploadFiles;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        filePageUploadFiles.plusIconFilePage.click();
    }

    @Then("user choose the file from desktop")
    public void user_choose_the_file_from_desktop() {
        // this for upload files
      //  filePageUploadFiles.uploadFile.click();
        filesPage.uploadFileButton.click();

    }
    @Then("user upload the file")
    public void user_upload_the_file() {

    }
    @Then("user see file on the file bar")
    public void user_see_file_on_the_file_bar() {

    }

    @Then("user choose New Folder on the dropdown menu")
    public void userChooseNewFolderOnTheDropdownMenu() {

    }
}
