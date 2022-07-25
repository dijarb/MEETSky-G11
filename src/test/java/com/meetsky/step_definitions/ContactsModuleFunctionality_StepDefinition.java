package com.meetsky.step_definitions;

import com.meetsky.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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


    @When("User should see all the contacts as a list inside of the middle column")
    public void user_should_see_all_the_contacts_as_a_list_inside_of_the_middle_column() {
        // Write code here that turns the phrase above into concrete actions
        List<WebElement> ContactsInTheColumn = Driver.getDriver().findElements(By.className("app-content-list-item-line-one")) ;
        System.out.println("numberOfContactsInTheColumn = " + ContactsInTheColumn.size() );
        String numberOfContactsInTheColumn = String.valueOf(ContactsInTheColumn.size());
        String numberOfContacs =Driver.getDriver().findElement(By.className("app-navigation-entry__counter")).getText() ;
        System.out.println(Driver.getDriver().findElement(By.className("app-navigation-entry__counter")).getText());

        Assert.assertEquals(numberOfContacs,numberOfContactsInTheColumn);

    }
    @Then("User should see the number of the contacts near the All Contacts tab")
    public void user_should_see_the_number_of_the_contacts_near_the_all_contacts_tab() {
        List<WebElement> ContactsInTheColumn = Driver.getDriver().findElements(By.className("app-content-list-item-line-one")) ;
        System.out.println("Number Of Contacts In The Column = " + ContactsInTheColumn.size() );

        String numberOfContactsInTheColumn = String.valueOf(ContactsInTheColumn.size());
        String numberOfContacs =Driver.getDriver().findElement(By.className("app-navigation-entry__counter")).getText() ;
        System.out.println("Number Of Contacts Near The All Contacts Tab = "+Driver.getDriver().findElement(By.className("app-navigation-entry__counter")).getText());

        Assert.assertEquals(numberOfContacs,numberOfContactsInTheColumn);
    }



    @When("User clicks the contacts name")
    public void user_clicks_the_contacts_name() {
        Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Carlos Sainz')]")).click();
    }
    @When("User clicks the three dots button on the right side of the page")
    public void user_clicks_the_three_dots_button_on_the_right_side_of_the_page() {
        Driver.getDriver().findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
    }
    @When("User clicks the Delete button on the opened dropdown list")
    public void user_clicks_the_delete_button_on_the_opened_dropdown_list() {

        Driver.getDriver().findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/button[1]")).click();

    }
    @Then("The contact must be deleted and user shouldn't see it on the contacts page")
    public void the_contact_must_be_deleted_and_user_shouldn_t_see_it_on_the_contacts_page() {

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h2[contains(text(),'No contact selected')]")).isDisplayed());
    }



}
 //