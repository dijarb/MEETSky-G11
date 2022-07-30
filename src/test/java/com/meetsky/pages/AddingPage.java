package com.meetsky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddingPage extends BasePage{

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='files']")
    public WebElement filesButton;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement threeDots;

    @FindBy(xpath = "//li[@class=' action-favorite-container']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favoritesFile;

    @FindBy(xpath = "//div[@id='app-content-favorites']//span[.='Talk']")
    public WebElement seenInFavorites;

    @FindBy(xpath = "//li[@class=' action-rename-container']")
    public WebElement renameOption;

    @FindBy(xpath = "//li[@class=' action-details-container']")
    public WebElement detailsOption;

    @FindBy(id = "comments")
    public WebElement commentsTabView;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement commentsInput;

    @FindBy(xpath = "//div[@class='comment comments__writer']//input[@type='submit']")
    public WebElement rightSideArrow;

    @FindBy(xpath = "//div[@class='comment__message']")
    public WebElement seenComments;

    @FindBy(xpath = "//div[@class='comment__header']//div[@class='trigger']")
    public WebElement threeDotsForComments;

    @FindBy(xpath = "//button[@class='action-button focusable']//span[.='Delete comment']")
    public WebElement deleteComment;

}
