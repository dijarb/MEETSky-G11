package com.meetsky.step_definitions;

import com.meetsky.pages.AddingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adding_StepDefinitions {

    AddingPage addingPage = new AddingPage();

    @When("user clicks on three dots button")
    public void user_clicks_on_three_dots_button(){
        addingPage.threeDots.click();
    }

    @And("user clicks Add to favorites button")
    public void userClicksAddToFavoritesButton() {
        addingPage.addToFavorites.click();
    }

    @And("user clicks to Favorites")
    public void userClicksToFavorites() {
        addingPage.favoritesFile.click();
    }

    @Then("user should see his favorite files in Favorite part")
    public void userShouldSeeHisFavoriteFilesInFavoritePart() {
        addingPage.seenInFavorites.isDisplayed();
    }
}
