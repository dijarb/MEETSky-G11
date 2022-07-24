package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.TaskPages;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TaskStepDefinitions {

    TaskPages taskPages = new TaskPages();
    Faker faker = new Faker();

    @When("User clicks task icon")
    public void user_clicks_task_icon() {

        taskPages.tasksPageLink.click();
    }
    @When("User clicks add list button")
    public void user_clicks_add_list_button() {
        taskPages.addListButton.click();
    }

    @When("User enters {string} of task")
    public void user_enters_of_task(String name) {
        BrowserUtils.waitFor(5);
        BrowserUtils.waitForElementToDisplay(taskPages.inputText);
        taskPages.inputText.sendKeys(name);
        System.out.println("name = " + name);
    }

    @When("User enters fake name of task")
    public void user_enters_fake_name_of_task() {
        BrowserUtils.waitFor(5);
        BrowserUtils.waitForElementToDisplay(taskPages.inputText);
        String name = faker.name().fullName();
        taskPages.inputText.sendKeys(name);
        System.out.println("name = " + name);
    }

    @When("User press enter")
    public void user_press_enter() {
        System.out.println("taskPages.inputText.getText() = " + taskPages.inputText.getText());
        System.out.println("taskPages.inputText2.getText() = " + taskPages.inputText2.getText());
        new Actions(Driver.getDriver()).sendKeys(Keys.ENTER).perform();
         BrowserUtils.waitFor(10);
    }



}
