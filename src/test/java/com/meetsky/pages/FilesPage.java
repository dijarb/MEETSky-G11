package com.meetsky.pages;

import com.github.javafaker.Faker;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilesPage extends BasePage{

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement newButton;

    @FindBy(xpath = "//div[@class='newFileMenu popovermenu bubble menu open menu-left']")
    public WebElement newFileMenu;

    @FindBy(xpath = "//label[@data-action='upload']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//a[@data-action='folder']")
    public WebElement newFolderButton;

    @FindBy(id = "view13-input-folder")
    public WebElement folderNameInputBox;

    @FindBy(xpath = "//a[@data-action='folder']//input[@type='submit']")
    public WebElement newFolderButtonArrow;

    @FindBy(xpath = "//a[@data-action='file']")
    public WebElement newFileButton;

    @FindBy(xpath = "//input[@id='view13-input-file']")
    public WebElement fileNameInputBox;

    @FindBy(xpath = "//a[@data-action='file']//input[@type='submit']")
    public WebElement newFileButtonArrow;

    @FindBy(xpath = "//a[@class='app-sidebar__close icon-close']")
    public WebElement closeButtonInFile;

    @FindBy(id = "view-toggle")
    public WebElement viewToggle;

    @FindBy(id = "filestable")
    public WebElement filesTable;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> files;

    @FindBy(id = "viewer-content")
    public WebElement contentViewer;

    @FindBy(xpath = "//div[@class = 'ProseMirror']")
    public WebElement contentViewerTextArea;

    @FindBy(id = "app-sidebar-vue")
    public WebElement contentViewerSidebar;

    @FindBy(xpath = "//a[@class='name sort columntitle']")
    public WebElement nameButton;

    @FindBy(xpath = "//a[@class='name sort columntitle']//span[1]")
    public WebElement nameLabel;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAllButton;

    @FindBy(xpath = "//a[@class='actions-selected']")
    public WebElement actionsButton;

    @FindBy(xpath = "//div[@class='filesSelectMenu popovermenu bubble menu-center']//li[@class='item-delete']")
    public WebElement deleteButtonInActionsMenu;

    @FindBy(xpath = "//a[@class='size sort columntitle']")
    public WebElement sizeButton;

    @FindBy(xpath = "//tbody[@id='fileList']//span[@class='extension']/preceding-sibling::span[@class='innernametext']")
    public List<WebElement> fileNames;

    @FindBy(xpath = "//tbody[@id='fileList']//span[@class='uploadtext']/preceding-sibling::span[@class='nametext']//span")
    public List<WebElement> folderNames;

    @FindBy(xpath = "//tbody[@id='fileList']//td[@class='filesize']")
    public List<WebElement> fileSizes;

    @FindBy(id = "modified")
    public WebElement modifiedButton;

    @FindBy(xpath = "//tbody[@id='fileList']//span[@class='modified live-relative-timestamp']")
    public List<WebElement> fileDates;

    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    public void addFiles(int num){
        int count=0;
        while (count<num) {
            BrowserUtils.waitForElementToDisplay(newButton);
            BrowserUtils.clickWithJS(newButton);
            BrowserUtils.waitForElementToDisplay(newFileMenu);
            newFileButton.click();
            BrowserUtils.waitForElementToDisplay(fileNameInputBox);
            fileNameInputBox.sendKeys(faker.letterify("??????????"));
            actions.sendKeys(Keys.ENTER).perform();
            BrowserUtils.waitForElementToDisplay(contentViewerSidebar);
            actions.sendKeys(Keys.ESCAPE).perform();
            BrowserUtils.waitForTitle("Files - Meetsky - QA");
            BrowserUtils.waitForMs(500);

            count++;
        }
    }

    public void addFolders(int num){
        int count=0;
        while (count<num) {
            BrowserUtils.waitForClickablility(newButton, 10);
            BrowserUtils.clickWithJS(newButton);
            BrowserUtils.waitForElementToDisplay(newFileMenu);
            newFolderButton.click();
            BrowserUtils.waitForElementToDisplay(folderNameInputBox);
            folderNameInputBox.sendKeys(faker.letterify("??????????"));
            actions.sendKeys(Keys.ENTER).perform();
            BrowserUtils.waitForMs(500);

            count++;
        }
    }
    public void addFilesWithDifferentSizes(){
        addFolders(2);
        addFiles(2);
    }

    public List<String> fileNameList(){
        List<String> list = new ArrayList<>();
        for (WebElement file: fileNames) {
            list.add(file.getText());
        }
        return list;
    }

    public List<String> folderNameList(){
        List<String> list = new ArrayList<>();
        for (WebElement file: folderNames) {
            list.add(file.getText());
        }
        return list;
    }

    public List<Double> fileSizeList(){
        List<Double> list = new ArrayList<>();
        for (WebElement file: fileSizes) {
            String s = file.getText();
            s=s.replaceAll("< |> |( .B)","");
            list.add(Double.parseDouble(s));
        }
        return list;
    }

    public List<Long> fileDatesList(){
        List<Long> list = new ArrayList<>();
        for (WebElement file: fileDates) {
            String s = file.getAttribute("data-timestamp");
            list.add(Long.parseLong(s));
        }
        return list;
    }

    public void deleteAllFiles(){
        selectAllButton.click();
        actionsButton.click();
        deleteButtonInActionsMenu.click();
    }

}
