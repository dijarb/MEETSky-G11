package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.TaskPages;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TaskStepDefinitions {

    TaskPages taskPages = new TaskPages();
    Faker faker = new Faker();
    String fakeName;
    String fakeTask;
    @When("User clicks task icon")
    public void user_clicks_task_icon() {

        if (!taskPages.welcomeText.getText().startsWith("Good")) {
            taskPages.setUpLanguage();
        }

        taskPages.taskLink.click();
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
        BrowserUtils.waitFor(3);
        Assert.assertTrue(taskPages.checkList(taskPages.taskList,item));
    }

    @Then("Verify that fake name is on the task list")
    public void verify_that_fake_name_is_on_the_task_list() {
        // new task list is in the taskList
        BrowserUtils.waitFor(3);
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
        BrowserUtils.waitFor(3);
        Assert.assertTrue(taskPages.checkList(taskPages.taskDetailList,fakeTask));
    }

    @When("User clicks checkbox near the task name")
    public void user_clicks_checkbox_near_the_task_name() {
        BrowserUtils.waitFor(3);
        taskPages.checkboxNearTaskName.click();
    }
    @When("User clicks completed task button")
    public void user_clicks_completed_task_button() {
        BrowserUtils.waitFor(3);
        taskPages.completedTaskIcon.click();
    }
    @Then("Verify that task is on the the list of completed tasks")
    public void verify_that_task_is_on_the_the_list_of_completed_tasks() {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(taskPages.checkList(taskPages.completedTaskNameList,fakeTask));
    }

    @When("User clicks star icon near the task name")
    public void user_clicks_star_icon_near_the_task_name() {
        BrowserUtils.waitFor(5);
        taskPages.starIconNearTaskName.click();
    }
    @When("User clicks important task button")
    public void user_clicks_important_task_button() {
        BrowserUtils.waitFor(3);
        taskPages.importantTaskIcon.click();
    }
    @Then("Verify that task is on the the list of important tasks")
    public void verify_that_task_is_on_the_the_list_of_important_tasks() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(taskPages.checkList(taskPages.taskDetailList,fakeTask));
    }

    @Then("Verify that user can see the number of all uncompleted tasks")
    public void verify_that_user_can_see_the_number_of_all_uncompleted_tasks() {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(taskPages.currentTabNumberOfUncompletedTask.isDisplayed());
    }
}
