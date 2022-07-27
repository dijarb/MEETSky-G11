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
    String fakeTask;
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
    }

    @When("User enters fake name of task")
    public void user_enters_fake_name_of_task() {
        BrowserUtils.waitFor(5);
        BrowserUtils.waitForElementToDisplay(taskPages.inputText);
        fakeName = faker.name().username();
        taskPages.inputText.sendKeys(fakeName);
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
        // new task list is in the taskList
        Assert.assertTrue(taskPages.checkList(taskPages.taskList,fakeName));
    }

    @When("User enter new task inside the task list")
    public void user_enter_new_task_inside_the_task_list() {
        fakeTask =faker.chuckNorris().fact();
        taskPages.inputTextForTask.sendKeys(fakeTask);
    }
    @Then("Verify that new task is on the task list")
    public void verify_that_new_task_is_on_the_task_list() {
        // new task is in the taskDetailList
        Assert.assertTrue(taskPages.checkList(taskPages.taskDetailList,fakeTask));
    }
}
