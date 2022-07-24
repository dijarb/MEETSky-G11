package com.meetsky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPages extends BasePage{

    @FindBy( linkText = "Add List…")
    public WebElement addListButton;

    @FindBy(id = "newListInput")
    public WebElement inputText;

    @FindBy(xpath = "//input[@id='newListInput']")
    public WebElement inputText2;


//span[@title='All']  newListInput
}
