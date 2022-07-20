package com.meetsky.step_definitions;

import com.meetsky.pages.DeletedFilesPage;
import com.meetsky.pages.LoginPage;
import io.cucumber.java.en.Given;

public class TaskStepDefinitions {

    LoginPage loginPage = new LoginPage();
    DeletedFilesPage deletedFilesPage = new DeletedFilesPage();

    @Given("User is on main page")
    public void user_is_on_main_page() {

     loginPage.login();

    }
}
