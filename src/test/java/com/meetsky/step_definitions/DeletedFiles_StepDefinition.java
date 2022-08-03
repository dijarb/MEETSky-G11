package com.meetsky.step_definitions;

import com.meetsky.pages.DeletedFilesPage;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DeletedFiles_StepDefinition {
    DeletedFilesPage deletedFilesPage = new DeletedFilesPage();

    @Given("User clicks Deleted Files Button")
    public void user_clicks_deleted_files_button() {
        BrowserUtils.waitFor(5);
        if (!deletedFilesPage.welcomeText.getText().startsWith("Good")) {
            deletedFilesPage.setUpLanguage();
        }
        deletedFilesPage.filesPageLink.click();
        BrowserUtils.waitFor(5);
        deletedFilesPage.deletedFilesButton.click();
    }



    @When("User clicks Name button")
    public void userClicksNameButton() {
        deletedFilesPage.nameButton.click();
    }

    @Then("Files are sorted by Name in ascending order")
    public void filesAreSortedByNameInAscendingOrder() {

        if(!BrowserUtils.webElementExists("(//*[@id=\"headerName-container\"]/a/span[@class='sort-indicator hidden icon-triangle-n'])[1]")){
            BrowserUtils.waitForClickablility(deletedFilesPage.nameButton,10);
            deletedFilesPage.nameButton.click();
        }

        List<String> actual = deletedFilesPage.deletedFileNamesString();
        List<String> expected = deletedFilesPage.deletedFileNamesString();
        expected.sort(String.CASE_INSENSITIVE_ORDER);

        Assert.assertEquals(actual,expected);
    }

    @When("User clicks deleted button")
    public void user_clicks_deleted_button() {
        BrowserUtils.waitFor(3);
        deletedFilesPage.deletedButtonForSort.click();
    }
    @Then("File are sorted by Date in ascending order")
    public void file_are_sorted_by_date_in_ascending_order() {



    }

}

