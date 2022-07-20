package com.meetsky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPages extends BasePage{

    @FindBy(id = "nextcloud")
    public WebElement homePageLink;
}
