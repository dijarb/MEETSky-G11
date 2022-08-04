package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage{

    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id=\"newgroup\"]/div/div/button")
    public WebElement contactGroupPlusButton;

}
