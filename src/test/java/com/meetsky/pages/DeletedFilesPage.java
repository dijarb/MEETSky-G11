package com.meetsky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DeletedFilesPage extends BasePage{


// here we have a comment
@FindBy(xpath = "//a[starts-with(@class,'nav-icon-trashbin')]")
public WebElement deletedFilesButton;

    @FindBy(xpath = "//label[@for='select_all_trash']")
    public WebElement  selectAllCheckBox;

    @FindBy (id = "select_all_trash")
    public WebElement selectAllTrash;

    @FindBy (xpath = "(//div[@id='headerName-container']/a)[11]")
    public WebElement nameButton;

    @FindBy (linkText = "Deleted")
    public WebElement deletedButtonForSort;

    @FindBy (xpath = "(//th[@id='headerDate'])[11]")
    public WebElement dateButton;
    @FindBy (xpath = "//td[@class='filename']//span[@class='innernametext']")
    public java.util.List<WebElement> deletedFileNames;

    public List<String> deletedFileNamesString() {
        List<String> list = new ArrayList<>();
        for (WebElement deletedFileName : deletedFileNames) {
            list.add(deletedFileName.getText());
        }
        return list;
    }
}
