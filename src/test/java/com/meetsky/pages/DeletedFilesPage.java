package com.meetsky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class DeletedFilesPage extends BasePage{

@FindBy(linkText = "Deleted files")
  public WebElement deletedFilesButton;

@FindBy(xpath = "//label[@for='select_all_trash']")
    public WebElement  selectAllCheckBox;


}
