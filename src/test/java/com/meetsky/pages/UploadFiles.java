package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class UploadFiles extends FilesPage {

    public UploadFiles() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    
}
