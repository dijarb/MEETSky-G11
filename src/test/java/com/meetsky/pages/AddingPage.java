package com.meetsky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddingPage extends BasePage{

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement threeDots;

    @FindBy(xpath = "//li[@class=' action-favorite-container']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favoritesFile;

    @FindBy(xpath = "//div[@id='app-content-favorites']//span[.='readme']")
    public WebElement seenInFavorites;

    @FindBy(xpath = "//li[@class=' action-rename-container']")
    public WebElement renameOption;

    @FindBy(xpath = "//li[@class=' action-details-container']")
    public WebElement detailsOption;

    @FindBy(id = "commentsTabView")
    public WebElement commentsTabView;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement commentsInput;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement rightSideArrow;

    @FindBy(xpath = "//li[@class='comment']")
    public WebElement seenComments;

    @FindBy(xpath = "//a[@class='action more icon icon-more has-tooltip']")
    public WebElement threeDotsForComments;

    @FindBy(xpath = "//a[@class='menuitem action delete permanent']//span[.='Delete comment']")
    public WebElement deleteComment;

}
