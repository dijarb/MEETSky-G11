package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import com.meetsky.pages.BasePage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import com.sun.jna.Library;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TalkModule_StepDefinitions {
    @When("User clicks talk icon on header menu")
    public void user_clicks_talk_icon_on_header_menu() {

        BasePage basePage = new BasePage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOf(basePage.spreedPageLink));
        basePage.spreedPageLink.click();


    }

    @When("User clicks plus icon from opened menu on left side of the page")
    public void user_clicks_plus_icon_from_opened_menu_on_left_side_of_the_page() throws InterruptedException {
        WebElement plusIcon = Driver.getDriver().findElement(By.xpath("//button[@slot='trigger']"));
        BrowserUtils.waitForClickablility(plusIcon, 30);
        plusIcon.click();
        BrowserUtils.waitFor(3);


    }

    @When("User types the group name in input box")
    public void user_types_the_group_name_in_input_box() {
        WebElement textField = Driver.getDriver().findElement(By.xpath("//input[@class='conversation-name']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(textField));
        textField.sendKeys("Friends");

    }

    @When("User clicks Add participants button on the bottom right")
    public void user_clicks_add_participants_button_on_the_bottom_right() {
        WebElement addButton = Driver.getDriver().findElement(By.xpath("//button[@class='navigation__button navigation__button-right primary']"));
        BrowserUtils.waitForClickablility(addButton, 30);
        addButton.click();
        BrowserUtils.waitFor(2);

    }

    @When("User selects any of the contacts in contact list")
    public void user_selects_any_of_the_contacts_in_contact_list() {
        WebElement select1 = Driver.getDriver().findElement(By.xpath("(//span[@class='participant-row__user-name'])[2]"));
        select1.click();
        BrowserUtils.waitFor(2);

        WebElement select2 = Driver.getDriver().findElement(By.xpath("(//span[@class='participant-row__user-name'])[3]"));
        select2.click();
        BrowserUtils.waitFor(2);

        WebElement select3 = Driver.getDriver().findElement(By.xpath("(//span[@class='participant-row__user-name'])[4]"));
        select3.click();
        BrowserUtils.waitFor(2);

        WebElement createButton = Driver.getDriver().findElement(By.xpath("//button[@class='navigation__button navigation__button-right primary']"));
        createButton.click();
        BrowserUtils.waitFor(2);


    }

    @Then("New group conversation is created and displayed with the same name on the top left side")
    public void new_group_conversation_is_created_and_displayed_with_the_same_name_on_the_top_left_side() {
        WebElement groupName = Driver.getDriver().findElement(By.xpath("(//div[@class='avatar icon icon-contacts'])[1]"));

        Assert.assertTrue(groupName.isDisplayed());
    }

    @When("User clicks group conversation on the left hand side")
    public void user_clicks_group_conversation_on_the_left_hand_side() {

    }
    @Then("User can see the participants on the right-hand menu under Participants")
    public void user_can_see_the_participants_on_the_right_hand_menu_under_participants() {



}
