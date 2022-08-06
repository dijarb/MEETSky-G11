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

    
}
