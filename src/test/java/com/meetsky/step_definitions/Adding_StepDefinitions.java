package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import io.cucumber.java.en.Given;

public class Adding_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on main page")
    public void user_is_on_main_page() {
        loginPage.login();
    }

}
