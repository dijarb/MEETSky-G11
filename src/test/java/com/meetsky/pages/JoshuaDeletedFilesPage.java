package com.meetsky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JoshuaDeletedFilesPage extends BasePage{

    @FindBy (linkText = "Deleted files")
    public  WebElement deletedFilesButton;

    @FindBy (id = "select_all_trash")
    public WebElement selectAllTrash;


    @FindBy (xpath = "(//div[@id='headerName-container'])[11]")
    public WebElement nameButton;

    @FindBy (xpath = "(//th[@id='headerDate'])[11]")
    public WebElement dateButton;


    @FindBy (xpath = "//td[@class='filename']")
    public List<WebElement> fileNames;



}
