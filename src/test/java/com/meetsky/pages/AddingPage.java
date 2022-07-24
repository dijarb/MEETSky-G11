package com.meetsky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddingPage extends BasePage{

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement threeDots;

    @FindBy(xpath = "//li[@class=' action-favorite-container']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//div//li[@class='nav-favorites       ui-droppable collapsible']")
    public WebElement favoritesFile;

    @FindBy(xpath = "//div[@id='app-content-favorites']//tr[@data-file=\"Talk\"]")
    public WebElement seenInFavorites;

}
