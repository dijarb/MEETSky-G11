package com.meetsky.step_definitions;

import com.meetsky.pages.AddingPage;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

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

    @And("user clicks Rename button")
    public void user_clicks_rename_button() {
        addingPage.renameOption.click();
    }

    @And("user enters new name for file")
    public void user_enters_new_name_for_file(){
        Actions actions = new Actions (Driver.getDriver());
        actions.sendKeys("Test1" + Keys.ENTER).perform();
    }

    @Then("user should be able to see his changes on file name")
    public void user_should_be_able_to_see_his_changes_on_file_name() {
        String actual = (Driver.getDriver().findElement(By.xpath("//tbody[@id='fileList']//span[@class='innernametext'][1]"))).getText();
        String expected = "Test1";
        Assert.assertEquals(expected,actual);
    }

    @When("user clicks on details button")
    public void user_clicks_on_details_button() {
        addingPage.detailsOption.click();
    }

    @When("user chooses comments option in details")
    public void user_chooses_comments_option_in_details() {
        addingPage.commentsTabView.click();
    }

    @When("user writes some comments in comments option")
    public void user_writes_some_comments_in_comments_option() {
        addingPage.commentsInput.sendKeys("Hello!");

    }

    @When("user clicks the right side arrow")
    public void user_clicks_the_right_side_arrow() {
        addingPage.rightSideArrow.click();
    }

    @Then("user should be able to see his comments")
    public void user_should_be_able_to_add_his_comments() {
        addingPage.seenComments.isDisplayed();
    }

    @When("user clicks on three dots button related to comment")
    public void user_clicks_on_three_dots_button_related_to_comment() {
        addingPage.threeDotsForComments.click();
    }

    @When("user clicks on delete comment button")
    public void user_clicks_on_delete_comment_button() {
        addingPage.deleteComment.click();
    }

    @Then("user should be able to delete the comment")
    public void user_should_be_able_to_delete_the_comment() {
        Driver.getDriver().navigate().refresh();
        addingPage.threeDots.click();
        addingPage.detailsOption.click();
        addingPage.commentsTabView.click();
        Driver.getDriver().findElement(By.xpath("//p[.='No comments yet, start the conversation!']")).isDisplayed();
    }
}
