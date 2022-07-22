package com.meetsky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NotesPage extends BasePage{

    @FindBy (id = "notes_new_note")
    public WebElement newNoteButton;

    @FindBy (xpath = "app-navigation-toggle")
    public WebElement notesToggle;

    @FindBy ( xpath = "//span[@title='Categories']")
    public WebElement categoriesButton;

    @FindBy (xpath = "//ul[@class='app-navigation-entry__children']/li")
    public List<WebElement> categoryList;


    public static Boolean checkList(List<WebElement> list, String item){

        for (WebElement each : list) {
            if (each.getText().equalsIgnoreCase(item)) {
                return  true;
            }
        }
        return false;
    }


   }
