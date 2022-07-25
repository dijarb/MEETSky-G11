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
        String actual = Driver.getDriver().findElement(By.xpath("//tbody[@id='fileList']//span[@class='innernametext'][2]")).getText();
        String expected = "Test1";
        Assert.assertEquals(expected,actual);
    }
}
