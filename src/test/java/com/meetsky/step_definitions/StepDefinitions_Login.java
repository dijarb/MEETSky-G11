package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import io.cucumber.java.en.Given;

public class StepDefinitions_Login {
    public LoginPage loginPage = new LoginPage();

    @Given("User is logged in")
    public void userIsLoggedIn() {
        loginPage.login();
    }
}
