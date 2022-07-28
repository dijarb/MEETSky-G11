package com.meetsky.step_definitions;

import com.meetsky.pages.DeletedFilesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DeletedFiles_StepDefinition {
    DeletedFilesPage deletedFilesPage = new DeletedFilesPage();

    @Given("User clicks Deleted Files Button")
    public void user_clicks_deleted_files_button() {
  deletedFilesPage.deletedFilesButton.click();
    }



    @When("User clicks Name button")
    public void userClicksNameButton() {
        deletedFilesPage.nameButton.click();
    }

    @Then("Files are sorted by Name in ascending order")
    public void filesAreSortedByNameInAscendingOrder() {

        List<String> actual = deletedFilesPage.deletedFileNamesString();
        List<String> expected = deletedFilesPage.deletedFileNamesString();
        expected.sort(String.CASE_INSENSITIVE_ORDER);

        Assert.assertEquals(actual,expected);
    }


}

