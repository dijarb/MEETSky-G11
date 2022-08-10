package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePageUploadFiles extends FilesPage {

    public FilePageUploadFiles() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/a")
    public WebElement plusIconFilePage;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[1]/label/span[2]")
    public  WebElement uploadFile;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/span[2]")
    public WebElement newFolderElement;

    @FindBy (xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/form/input[2]")
    public WebElement newFolderArrow;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]/span[1]")
    public WebElement threeDotsDropdownMenu;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[6]/a/span[2]")
    public WebElement threeDotsMenuMoveOrCopyElement;

    @FindBy(xpath = "//*[@id=\"picker-filestable\"]/tbody/tr[2]/td[1]/span")
    public WebElement talkFolder;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[10]/div[2]/button[2]")
    public WebElement moveOptionOnDotsMenu;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[2]/a/span[1]")
    public WebElement talkFolderFilePage;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[2]/a/span[3]/a[2]")
    public WebElement threeDotsMenuInsideFolder;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[2]/div/ul/li[8]/a/span[2]")
    public WebElement threeDotsMenuDeleteOption;

    
}
