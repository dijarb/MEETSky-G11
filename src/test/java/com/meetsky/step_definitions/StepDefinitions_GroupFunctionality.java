package com.meetsky.step_definitions;

import com.meetsky.pages.ContactPage;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class StepDefinitions_GroupFunctionality {

    ContactPage contactPage = new ContactPage();

    @When("User clicks the Contacts icon on the header menu vasi")
    public void user_clicks_the_contacts_icon_on_the_header_menu_vasi() {
        BrowserUtils.waitFor(5);
        contactPage.contactsPageLink.click();
    }


    @And("User click group plus button")
    public void userClickGroupPlusButton() {
        BrowserUtils.waitFor(5);
        contactPage.contactGroupPlusButton.click();
    }
}
