package com.meetsky.step_definitions;

import com.meetsky.pages.JoshuaDeletedFilesPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class DeletedFile_Practice {

    JoshuaDeletedFilesPage deletedFilesPage = new JoshuaDeletedFilesPage();

    LoginPage loginPage = new LoginPage();

    @Test
    public void method(){

        loginPage.login();

        deletedFilesPage.deletedFilesButton.click();

        BrowserUtils.waitFor(10);

        int count =0;

        for (WebElement each : deletedFilesPage.fileNames) {
            System.out.println(each.getText());

            count++;

        }

        System.out.println("count = " + count);
    }


}
