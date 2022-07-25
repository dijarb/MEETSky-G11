package com.meetsky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TaskPages extends BasePage{

    @FindBy( linkText = "Add List…")
    public WebElement addListButton;

    @FindBy(id = "newListInput")
    public WebElement inputText;

    @FindBy(xpath = "//input[@id='newListInput']")
    public WebElement inputText2;

    @FindBy (xpath = "//span[@class='app-navigation-entry__title']")
    public List<WebElement> taskList;

    public Boolean checkList(List<WebElement> list, String item){

        for (WebElement each : list) {
            System.out.println(each.getText());
            if (each.getText().equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }

//span[@title='All']  newListInput
}
