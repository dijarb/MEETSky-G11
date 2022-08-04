package com.meetsky.step_definitions;

import com.meetsky.pages.SearchPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions_SearchFiles {

    SearchPage searchPage = new SearchPage();

    @Given("there are files in the list")
    public void there_are_files_in_the_list() {
        if(!(searchPage.files.size() >=3)){
            searchPage.addFiles(3);
        }
        Assert.assertTrue(searchPage.files.size()>=3);
    }
    @When("user clicks on magnifying icon")
    public void user_clicks_on_magnifying_icon() {
    SearchPage.magButton.click();
    }
    @And("can search file by entering file name")
    public void can_search_file_by_entering_file_name() {

    }
    @Then("user can see searched file name on the search window")
    public void user_can_see_searched_file_name_on_the_search_window() {

    }
    @Then("user clicks on the selected file")
    public void user_clicks_on_the_selected_file() {

    }
    @Then("user can see details of the file")
    public void user_can_see_details_of_the_file() {

    }

}