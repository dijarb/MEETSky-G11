package com.meetsky.step_definitions;

import com.google.common.collect.Ordering;
import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StepDefinitions_FolderView {
    public FilesPage filesPage = new FilesPage();

    @And("user is in Files page")
    public void userIsInFilesPage() {
        if (!Driver.getDriver().getTitle().equals("Files - Meetsky - QA")){
            filesPage.filesPageLink.click();
        }
        BrowserUtils.verifyTitle("Files - Meetsky - QA");
    }

    @And("there are files or folders in the list")
    public void thereAreFilesOrFoldersInTheList() {
        if(!(filesPage.files.size() >=3)){
            filesPage.addFiles(3);
        }
        Assert.assertTrue(filesPage.files.size()>=3);
    }

    @Given("there are files in the list with different sizes")
    public void thereAreFilesInTheListWithDifferentSizes() {
        if(!(filesPage.fileSizeList().stream().distinct().count()>1)){
            filesPage.addFilesWithDifferentSizes();
        }
        Assert.assertTrue(filesPage.fileSizeList().stream().distinct().count()>1);
    }

    @Given("test")
    public void test() {

    }

    @And("user clicks on Name button")
    public void userClicksOnNameButton() {
        filesPage.nameButton.click();
    }

    @Then("files are sorted by name in ascending order")
    public void filesAreSortedByNameInAscendingOrder() {
        if(!BrowserUtils.webElementExists("//a[@class='name sort columntitle']//span[@class='sort-indicator icon-triangle-n']")){
            BrowserUtils.waitForClickablility(filesPage.nameButton,10);
            filesPage.nameButton.click();
        }

        List<String> expected = filesPage.fileNameList();
        expected.sort(String.CASE_INSENSITIVE_ORDER);
        List<String> actual = filesPage.fileNameList();

        Assert.assertEquals(expected,actual);

        expected = filesPage.folderNameList();
        expected.sort(String.CASE_INSENSITIVE_ORDER);
        actual = filesPage.folderNameList();

        Assert.assertEquals(expected,actual);
    }

    @Then("files are sorted by name in descending order")
    public void filesAreSortedByNameInDescendingOrder() {
        if(!BrowserUtils.webElementExists("//a[@class='name sort columntitle']//span[@class='sort-indicator icon-triangle-s']")){
            BrowserUtils.waitForClickablility(filesPage.nameButton,10);
            filesPage.nameButton.click();
        }

        List<String> expected = filesPage.fileNameList();
        expected.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        List<String> actual = filesPage.fileNameList();

        Assert.assertEquals(expected,actual);

        expected = filesPage.folderNameList();
        expected.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        actual = filesPage.folderNameList();

        Assert.assertEquals(expected,actual);
    }

    @And("user clicks on Size button")
    public void userClicksOnSizeButton() {
        filesPage.sizeButton.click();
    }

    @Then("files are sorted by size in ascending order")
    public void filesAreSortedBySizeInAscendingOrder() {
        if(!BrowserUtils.webElementExists("//a[@class='size sort columntitle']//span[@class='sort-indicator icon-triangle-n']")){
            BrowserUtils.waitForClickablility(filesPage.sizeButton,10);
            filesPage.sizeButton.click();
        }

        List<Double> expectedList = filesPage.fileSizeList();
        expectedList.sort(Comparator.naturalOrder());
        List<Double> actualList = filesPage.fileSizeList();

        Assert.assertEquals(expectedList,actualList);
    }

    @Then("files are sorted by size in descending order")
    public void filesAreSortedBySizeInDescendingOrder() {
        if(!BrowserUtils.webElementExists("//a[@class='size sort columntitle']//span[@class='sort-indicator icon-triangle-s']")){
            BrowserUtils.waitForClickablility(filesPage.sizeButton,10);
            filesPage.sizeButton.click();
        }

        List<Double> expectedList = filesPage.fileSizeList();
        expectedList.sort(Comparator.reverseOrder());
        List<Double> actualList = filesPage.fileSizeList();

        Assert.assertEquals(expectedList,actualList);
    }

    @When("user clicks on Modified button")
    public void userClicksOnModifiedButton() {
        filesPage.modifiedButton.click();
    }


    @Then("files are sorted by date modified from newest to oldest")
    public void filesAreSortedByDateModifiedFromNewestToOldest() {
        if(!BrowserUtils.webElementExists("//a[@id='modified']//span[@class='sort-indicator icon-triangle-s']")){
            BrowserUtils.waitForClickablility(filesPage.modifiedButton,10);
            filesPage.modifiedButton.click();
        }

        List<Long> expectedList = filesPage.fileDatesList();
        expectedList.sort(Comparator.reverseOrder());
        List<Long> actualList = filesPage.fileDatesList();

        Assert.assertEquals(expectedList,actualList);
    }

    @Then("files are sorted by date modified from oldest to newest")
    public void filesAreSortedByDateModifiedOldestToNewest() {
        if(!BrowserUtils.webElementExists("//a[@id='modified']//span[@class='sort-indicator icon-triangle-n']")){
            BrowserUtils.waitForClickablility(filesPage.modifiedButton,10);
            filesPage.modifiedButton.click();
        }

        List<Long> expectedList = filesPage.fileDatesList();
        expectedList.sort(Comparator.naturalOrder());
        List<Long> actualList = filesPage.fileDatesList();

        Assert.assertEquals(expectedList,actualList);
    }

    @When("user clicks Toggle grid view button")
    public void userClicksToggleGridViewButton() {
        filesPage.viewToggle.click();
    }

    @Then("files are shown in a grid")
    public void filesAreShownInAGrid() {
        if(!filesPage.viewToggle.getAttribute("class").equals("button icon-toggle-filelist")){
            filesPage.viewToggle.click();
        }

        Assert.assertTrue(filesPage.filesTable.getAttribute("class").contains("view-grid"));
    }

    @Then("files are shown in a list")
    public void filesAreShownInAList() {
        if(!filesPage.viewToggle.getAttribute("class").equals("button icon-toggle-pictures")){
            filesPage.viewToggle.click();
        }

        Assert.assertFalse(filesPage.filesTable.getAttribute("class").contains("view-grid"));
    }

    @When("user clicks select all button")
    public void userClicksSelectAllButton() {
        BrowserUtils.waitForClickablility(filesPage.selectAllButton,10);
        filesPage.selectAllButton.click();
    }

    @Then("all file checkboxes are selected")
    public void allFileCheckboxesAreSelected() {
        if(!filesPage.filesTable.getAttribute("class").contains("multiselect")){
            filesPage.selectAllButton.click();
        }

        for (WebElement file : filesPage.files) {
            Assert.assertTrue(file.getAttribute("class").contains("selected"));
        }
    }

    @And("user can see the total values of all files in the first line")
    public void userCanSeeTheTotalValuesOfAllFilesInTheFirstLine() {
        Assert.assertNotEquals("Name", filesPage.nameLabel.getText());

        for (String s : filesPage.nameLabel.getText().split(" and ")) {
            if(s.contains("file")){
                s=s.replaceAll(" file(s)","");
                Assert.assertEquals(filesPage.fileNameList().size(),Integer.parseInt(s));
            }
            if(s.contains("folder")){
                s=s.replaceAll(" folder(s)","");
                Assert.assertEquals(filesPage.folderNameList().size(),Integer.parseInt(s));
            }
        }
    }
}
