package com.meetsky.step_definitions;

import com.meetsky.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ContactsModuleFunctionality_StepDefinition {


    @When("User clicks the Contacts icon on the header menu")
    public void user_clicks_the_contacts_icon_on_the_header_menu() {

        Driver.getDriver().findElement(By.xpath("//header/div[1]/ul[1]/li[5]/a[1]")).click();
    }

    @When("User ends up in Contacts page")
    public void user_ends_up_in_contacts_page() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Contacts - Meetsky - QA");
    }

    @When("User clicks the New contact button on the menu placed left side of the page")
    public void user_clicks_the_new_contact_button_on_the_menu_placed_left_side_of_the_page() {

        Driver.getDriver().findElement(By.id("new-contact-button")).click();
    }

    @When("User should see the New Contact form and clicks the New Contact typed input box")
    public void user_should_see_the_new_contact_form_and_clicks_the_new_contact_typed_input_box() {

        Driver.getDriver().findElement(By.id("contact-fullname")).click();
    }

    @When("User writes the contact name")
    public void user_writes_the_contact_name() {

        Driver.getDriver().findElement(By.id("contact-fullname")).sendKeys("Sebastian Vettel");
    }

    @When("User goes back the Files page")
    public void user_goes_back_the_files_page() {
        Driver.getDriver().findElement(By.xpath("//header/div[1]/ul[1]/li[1]/a[1]")).click();

    }

    @Then("User should see the name of the contact on the page")
    public void user_should_see_the_name_of_the_contact_on_the_page() {

        Driver.getDriver().findElement(By.xpath("//header/div[1]/ul[1]/li[5]/a[1]")).click();
        String visibleText = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Sebastian Vettel')]")).getText();
        System.out.println(visibleText);
        Assert.assertEquals(visibleText,"Sebastian Vettel");


    }




}
