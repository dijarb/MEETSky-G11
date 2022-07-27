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
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TalkModule_StepDefinitions {

    public String employee1;
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

        WebElement groupName = Driver.getDriver().findElement(By.xpath("(//span[@class='acli__content__line-one__title'])[1]"));
        groupName.click();
    }
    @Then("User can see the participants on the right-hand menu under Participants")
    public void user_can_see_the_participants_on_the_right_hand_menu_under_participants() {
        BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Employee100')]")),3);
        List<WebElement> participants = Driver.getDriver().findElements(By.className("participant-row__user-name"));

        ArrayList<String> participantsInColumn = new ArrayList<String>();


        for (WebElement each : participants) {

            System.out.println(each.getText());
            participantsInColumn.add(each.getText());
        }
        System.out.println(participantsInColumn);

        List<WebElement> addedParticipants = Driver.getDriver().findElements(By.className("user-bubble__title"));
        ArrayList<String> participantsInChat = new ArrayList<String>();
        participantsInChat.add("Employee52");

        for (WebElement every : addedParticipants) {

            System.out.println(every.getText());

            participantsInChat.add(every.getText());

        }

        System.out.println(participantsInChat);

        Assert.assertEquals(participantsInColumn, participantsInChat);


    }

    @When("User clicks three dots next to participants name")
    public void user_clicks_three_dots_next_to_participants_name() {

        WebElement participant1 = Driver.getDriver().findElement(By.xpath("//ul[1]/li[4]/div[3]/div[1]/div[1]/button[1]"));

        participant1.click();
    }
    @When("User clicks Remove participants button on the opened menu")
    public void user_clicks_remove_participants_button_on_the_opened_menu() {
        BrowserUtils.waitForClickablility(By.xpath("//span[@class='participant-row__user-name'][contains(text(),'Employee101')]"),2);
        WebElement deleteBtn = Driver.getDriver().findElement(By.xpath("//span[@class='action-button__icon icon-delete']"));
        deleteBtn.click();
        BrowserUtils.waitFor(5);
    }
    @Then("User should not see the removed participants on the list")
    public void user_should_not_see_the_removed_participants_on_the_list() throws Exception {
        List<WebElement> partGroup = Driver.getDriver().findElements(By.className("participant-row__user-name"));
        ArrayList<String> elements = new ArrayList<String>();


        for (WebElement each : partGroup) {
            elements.add(each.getText());
            System.out.println(each.getText());
        }


        Assert.assertFalse(elements.contains("Employee101"));

        System.out.println(elements.contains("Employee101"));
        }
    }





