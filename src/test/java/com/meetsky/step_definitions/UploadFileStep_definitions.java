package com.meetsky.step_definitions;

import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class UploadFileStep_definitions {

    FilesPage filesPage = new FilesPage();


    @When("user clicks plus icon on the file page")
    public void user_clicks_plus_icon_on_the_file_page() {
        Driver.getDriver().findElements(By.xpath("//header/div[1]/ul[1]/li[2]/a[1]"));
        filesPage.iconSpan.click();
    }

    @Then("user choose the file from desktop")
    public void user_choose_the_file_from_desktop() {
        filesPage.newButton.click();
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

    @And("user write {string}")
    public void userWrite(String arg0) {

    }

    @And("user click icon arrow or press Enter")
    public void userClickIconArrowOrPressEnter() {

    }

    @When("user clicks three dots icon")
    public void userClicksThreeDotsIcon() {

    }

    @Then("user choose the move or copy selection on dropdown menu")
    public void userChooseTheMoveOrCopySelectionOnDropdownMenu() {

    }

    @And("user choose the move option")
    public void userChooseTheMoveOption() {

    }

    @And("user moved file inside the {string} folder")
    public void userMovedFileInsideTheFolder(String arg0) {

    }

    @When("user select three dots menu")
    public void userSelectThreeDotsMenu() {

    }

    @Then("user choose the option delete")
    public void userChooseTheOptionDelete() {

    }

    @And("user deleted the file")
    public void userDeletedTheFile() {

    }

    @And("user can see the total number of files and folders under the files list table")
    public void userCanSeeTheTotalNumberOfFilesAndFoldersUnderTheFilesListTable() {
    }
}
