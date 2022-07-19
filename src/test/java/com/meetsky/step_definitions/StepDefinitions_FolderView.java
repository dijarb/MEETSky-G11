package com.meetsky.step_definitions;

import com.google.common.collect.Ordering;
import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

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

    @And("there are files and folders in the list")
    public void thereAreFilesAndFoldersInTheList() {
        if(!(filesPage.files.size() >=3)){
            filesPage.addFiles(3);
        }
        Assert.assertTrue(filesPage.files.size()>=3);
    }

    @Given("there are files in the list with different sizes")
    public void thereAreFilesInTheListWithDifferentSizes() {
        System.out.println(filesPage.fileSizeList());
//        if(!(filesPage.fileSizeList().stream().distinct().count()>1)){
//            filesPage.addFilesWithDifferentSizes();
//        }
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
            filesPage.nameButton.click();
        }

        Assert.assertTrue(Ordering.natural().isOrdered(filesPage.fileNameList()));
        Assert.assertTrue(Ordering.natural().isOrdered(filesPage.folderNameList()));
    }

    @Then("files are sorted by name in descending order")
    public void filesAreSortedByNameInDescendingOrder() {
        if(!BrowserUtils.webElementExists("//a[@class='name sort columntitle']//span[@class='sort-indicator icon-triangle-s']")){
            filesPage.nameButton.click();
        }

        List<String> expectedList = filesPage.fileNameList();
        expectedList.sort(Comparator.reverseOrder());
        List<String> actualList = filesPage.fileNameList();

        Assert.assertEquals(expectedList,actualList);

        expectedList = filesPage.folderNameList();
        expectedList.sort(Comparator.reverseOrder());
        actualList = filesPage.folderNameList();

        Assert.assertEquals(expectedList,actualList);
    }

    @And("user clicks on Size button")
    public void userClicksOnSizeButton() {
        filesPage.sizeButton.click();
    }

    @Then("files are sorted by size in ascending order")
    public void filesAreSortedBySizeInAscendingOrder() {
        List<Double> expectedList = filesPage.fileSizeList();
        expectedList.sort(Comparator.naturalOrder());
        List<Double> actualList = filesPage.fileSizeList();

        Assert.assertEquals(expectedList,actualList);
    }

    @Then("files are sorted by size in descending order")
    public void filesAreSortedBySizeInDescendingOrder() {
        List<Double> expectedList = filesPage.fileSizeList();
        expectedList.sort(Comparator.reverseOrder());
        List<Double> actualList = filesPage.fileSizeList();

        Assert.assertEquals(expectedList,actualList);
    }
}
