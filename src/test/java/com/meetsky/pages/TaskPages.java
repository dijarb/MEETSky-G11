package com.meetsky.pages;

import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TaskPages extends BasePage{

    @FindBy ( xpath = "//*[@id=\"app-dashboard\"]/h2")
    public WebElement welcomeText;
    
    @FindBy ( xpath = "//a[@href='/index.php/apps/tasks/']")
    public WebElement taskLink;

    // //img[@src='/index.php/avatar/Employee62/32?v=0']



    @FindBy( linkText = "Add List…")
    public WebElement addListButton;

    @FindBy( linkText = "Liste Ekle …")
    public WebElement addListButton2;

    @FindBy(id = "newListInput")
    public WebElement inputText;

    @FindBy(xpath = "//div[@class='header__input']//input")
    public WebElement inputTextForTask;

    @FindBy(xpath = "//div[starts-with(@class,'task-checkbox')]/label")
    public  WebElement checkboxNearTaskName;

    @FindBy (xpath = "//span[@title='Completed']")
    public WebElement completedTaskIcon;

    @FindBy (xpath = "//button[starts-with(@class,'action-item action-item--single reactive no-nav undefined undefined')]/span[1]")
    public WebElement starIconNearTaskName;

    @FindBy (xpath = "(//span[@class='app-navigation-entry__title'])[1]")
    public WebElement importantTaskIcon;

    @FindBy (xpath = "//*[@id=\"collection_current\"]//div[@class='app-navigation-entry__counter']")
    public  WebElement currentTabNumberOfUncompletedTask;

    @FindBy (xpath = "//div[@class='task-body__info']/div[@class='title']")
    public List<WebElement> completedTaskNameList;

    @FindBy(xpath = "//div[@class='task-body__info']/div")
    public List<WebElement> taskDetailList;

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


}
