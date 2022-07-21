package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class StepDefinitions_Login {
    public LoginPage loginPage = new LoginPage();

    @Given("User is logged in")
    public void userIsLoggedIn() {
        loginPage.login();
        BrowserUtils.verifyUrlStartsWith("https://qa.meetsky.net/index.php/apps/");
    }
}
