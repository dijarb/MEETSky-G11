package com.meetsky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesPage extends BasePage{
    @FindBy(xpath = "(//ul[@id='appmenu']//a)[7]")
    public WebElement notesPageLink;

   }
