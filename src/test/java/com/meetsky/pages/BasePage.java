package com.meetsky.pages;

import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class  BasePage {

    @FindBy ( xpath = "//*[@id=\"app-dashboard\"]/h2")
    public WebElement welcomeText;

    @FindBy(xpath = "//select[@id='language']")
    public WebElement dropdownSettingLanguageButton;

    @FindBy(id = "nextcloud")
    public WebElement homePageLink;

    // (//a[@href='/index.php/apps/files/'])[1]
    @FindBy(xpath = "(//ul[@id='appmenu']//a)[2]")
    public WebElement filesPageLink;

    @FindBy(xpath = "(//ul[@id='appmenu']//a)[3]")
    public WebElement photosPageLink;

    @FindBy(xpath = "(//ul[@id='appmenu']//a)[4]")
    public WebElement activityPageLink;

    @FindBy(xpath = "(//ul[@id='appmenu']//a)[5]")
    public WebElement spreedPageLink;

    @FindBy(xpath = "(//ul[@id='appmenu']//a)[7]")
    public WebElement contactsPageLink;

    @FindBy(xpath = "(//ul[@id='appmenu']//a)[8]")
    public WebElement calendarPageLink;

    @FindBy(xpath = "(//ul[@id='appmenu']//a)[9]")
    public WebElement notesPageLink;

    @FindBy(xpath = "(//ul[@id='appmenu']//a)[11]")
    public WebElement tasksPageLink;

    @FindBy(xpath = "//a[@class='header-menu__trigger']")
    public WebElement topRightSearchButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement topRightSearchBox;

    @FindBy(xpath = "//div[@class='notifications']")
    public WebElement topRightNotificationButton;

    @FindBy(xpath = "//div[@id='contactsmenu']")
    public WebElement topRightContactsButton;

    @FindBy(xpath = "//input[@id='contactsmenu-search']")
    public WebElement topRightSearchContactsBox;

    @FindBy(xpath = "//div[@id='expand']")
    public WebElement topRightSettingsExpandButton;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement accountMenuUsername;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement accountMenuSetStatusButton;

    @FindBy(xpath = "//li[@data-id='settings']/a")
    public WebElement accountMenuSettingsButton;

    @FindBy(xpath = "//li[@data-id='help']/a")
    public WebElement accountMenuHelpButton;

    @FindBy(xpath = "//li[@data-id='logout']/a")
    public WebElement accountMenuLogoutButton;

    @FindBy(css = ".nav-icon-recent")
    public WebElement naviconrecentLink;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void logout(){
        topRightSettingsExpandButton.click();
        accountMenuLogoutButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().startsWith(ConfigurationReader.getProperty("login_page_url")));
    }

    public void setUpLanguage(){
        topRightSettingsExpandButton.click();
        BrowserUtils.waitFor(5);
        BrowserUtils.waitForClickablility(accountMenuSettingsButton,10);
        accountMenuSettingsButton.click();
        BrowserUtils.waitFor(5);

        Select dropdown = new Select(dropdownSettingLanguageButton);

        dropdown.selectByValue("en");
        BrowserUtils.waitFor(5);
        homePageLink.click();
        Driver.getDriver().navigate().refresh();
    }

}