package com.meetsky.step_definitions;

import com.meetsky.pages.NotesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Notes_StepDefinitions {

NotesPage notesPage=new NotesPage();

    @When("the user creates a new note")
    public void the_user_creates_a_new_note() {
    notesPage.notesPageLink.click();

    }
    @Then("a new note is created")
    public void a_new_note_is_created() {

         }
}
