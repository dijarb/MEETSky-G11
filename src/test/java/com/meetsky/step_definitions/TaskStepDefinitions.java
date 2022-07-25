package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.TaskPages;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TaskStepDefinitions {

    TaskPages taskPages = new TaskPages();
    Faker faker = new Faker();
    String fakeName;
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
        //BrowserUtils.waitFor(5);
        BrowserUtils.waitForElementToDisplay(taskPages.inputText);
        taskPages.inputText.sendKeys(name);
        System.out.println("name = " + name);
    }

    @When("User enters fake name of task")
    public void user_enters_fake_name_of_task() {
        BrowserUtils.waitFor(5);
        BrowserUtils.waitForElementToDisplay(taskPages.inputText);
        fakeName = faker.name().username();
        taskPages.inputText.sendKeys(fakeName);
        System.out.println("name = " + fakeName);
    }

    @When("User press enter")
    public void user_press_enter() {
        new Actions(Driver.getDriver()).sendKeys(Keys.ENTER).perform();
        BrowserUtils.waitFor(3);
    }

    @Then("Verify that {string} task is on the task list")
    public void verifyThatTaskIsOnTheTaskList(String item) {
        Assert.assertTrue(taskPages.checkList(taskPages.taskList,item));
    }

    @Then("Verify that fake name is on the task list")
    public void verify_that_fake_name_is_on_the_task_list() {
        Assert.assertTrue(taskPages.checkList(taskPages.taskList,fakeName));
    }
}
