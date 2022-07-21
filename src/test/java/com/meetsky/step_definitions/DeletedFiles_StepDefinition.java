package com.meetsky.step_definitions;

import com.meetsky.pages.DeletedFilesPage;
import io.cucumber.java.en.Given;

public class DeletedFiles_StepDefinition {
    DeletedFilesPage deletedFilesPage = new DeletedFilesPage();

    @Given("User clicks Deleted Files Button")
    public void user_clicks_deleted_files_button() {
  deletedFilesPage.deletedFilesButton.click();
    }



}

