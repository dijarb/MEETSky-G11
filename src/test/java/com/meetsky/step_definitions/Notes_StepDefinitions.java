package com.meetsky.step_definitions;

import com.meetsky.pages.NotesPage;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Notes_StepDefinitions {

NotesPage notesPage=new NotesPage();

    @When("the user creates a new note")
    public void the_user_creates_a_new_note() {
    notesPage.notesPageLink.click();

    }
    @Then("a new note is created")
    public void a_new_note_is_created() {

         }

    @When("User clicks notes button")
    public void user_clicks_notes_button() {
        notesPage.notesPageLink.click();
        BrowserUtils.waitFor(10);
        notesPage.notesToggle.click();
        BrowserUtils.waitFor(5);
        BrowserUtils.clickWithJS(notesPage.categoriesButton);
    }
    @When("User check {string} in the notes category")
    public void user_check_in_the_notes_category(String string) {

        Assert.assertTrue(notesPage.checkList(notesPage.categoryList,string));

    }
}
