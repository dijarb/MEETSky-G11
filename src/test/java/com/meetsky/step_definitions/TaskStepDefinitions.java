package com.meetsky.step_definitions;

import com.meetsky.pages.DeletedFilesPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.pages.TaskPages;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TaskStepDefinitions {

    TaskPages taskPages = new TaskPages();

    @When("User clicks task icon")
    public void user_clicks_task_icon() {

        taskPages.tasksPageLink.click();
    }
    @When("User clicks add list button")
    public void user_clicks_add_list_button() {
        taskPages.addListButton.click();
    }

    @When("User enters name of task")
    public void user_enters_name_of_task() {
        BrowserUtils.waitForElementToDisplay(taskPages.inputText);
        taskPages.inputText.sendKeys("JoshuaList");
    }
    @When("User press enter")
    public void user_press_enter() {
        new Actions(Driver.getDriver()).sendKeys(Keys.ENTER).perform();
    }


}
