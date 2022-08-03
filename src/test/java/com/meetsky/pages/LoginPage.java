package com.meetsky.pages;

import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="user")
    public WebElement usernameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(id="submit-form")
    public WebElement loginButton;

    @FindBy(id="lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(id = "reset-password-submit")
    public WebElement resetPasswordButton;

    @FindBy(css = "p.warning.wrongPasswordMsg")
    public WebElement wrongUsernamePasswordText;

    @FindBy(xpath = "//a[@class='toggle-password']")
    public WebElement eyeSign;

    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitFor(5);
        usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        new Actions(Driver.getDriver()).sendKeys(Keys.ENTER).perform();
//        BrowserUtils.clickWithJS(loginButton);
    }

}
