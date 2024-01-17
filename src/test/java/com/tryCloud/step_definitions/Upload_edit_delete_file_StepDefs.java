package com.tryCloud.step_definitions;

import com.github.javafaker.Faker;
import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.Upload_edit_delete_file_page;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Upload_edit_delete_file_StepDefs  {

    Upload_edit_delete_file_page uploadEditDeleteFilePage = new Upload_edit_delete_file_page();

    LoginPage loginPage = new LoginPage();

    Faker faker = new Faker();



    @Given("user is logged in")
    public void userIsLoggedIn() {

        Driver.getDriver().get("https://qa.trycloud.net/index.php/apps/dashboard/");
        BrowserUtils.sleep(2);
        loginPage.login(ConfigurationReader.getProperty("userName"), ConfigurationReader.getProperty("userPassword"));
    }

    @And("the user clicks on Files module")
    public void theUserClicksOnFilesModule() {
        BrowserUtils.sleep(2);
        uploadEditDeleteFilePage.moduleButton.click();
    }

    @When("user clicks upload file button")
    public void user_clicks_upload_file_button() {
        uploadEditDeleteFilePage.plusButton.click();
        BrowserUtils.sleep(2);
    }
    @When("user uploads the file")
    public void user_uploads_the_file() {
       BrowserUtils.sleep(2);
       String path = System.getProperty("user.dir") + "\\src\\test\\resources\\fileToUpload\\some-file.txt";
        uploadEditDeleteFilePage.uploadFile.sendKeys(path);

    }
    @Then("the new file display on the Files module")
    public void the_new_file_display_on_the_files_module() {
        String actualFileName = "some-file.txt";
        uploadEditDeleteFilePage.displayFilesModule.getText();
        BrowserUtils.sleep(2);

    }

    @Given("the user is on the Files module page")
    public void the_user_is_on_the_files_module_page() {
        BrowserUtils.sleep(2);
        uploadEditDeleteFilePage.moduleButton.click();

    }
    @When("user clicks creates a new folder")
    public void user_clicks_creates_a_new_folder() {
        BrowserUtils.sleep(2);
        uploadEditDeleteFilePage.uploadFilePanel.click();
        uploadEditDeleteFilePage.createNewFolder.click();
    }
    @Then("user gives a name for folder")
    public void user_gives_a_name_for_folder() {
        BrowserUtils.sleep(2);
        uploadEditDeleteFilePage.folderName.click();
        uploadEditDeleteFilePage.folderName.sendKeys(faker.funnyName().name());
    }
    @Then("user confirms new folder")
    public void user_confirms_new_folder() {
        BrowserUtils.sleep(2);
        uploadEditDeleteFilePage.confirmNewFolder.click();
    }
    @Then("the folder should be visible in the files list table")
    public void the_folder_should_be_visible_in_the_files_list_table() {
        uploadEditDeleteFilePage.NewFolder.getText();
    }


    @Given("the user is on the Files module page with existing items")
    public void the_user_is_on_the_files_module_page_with_existing_items() {
        uploadEditDeleteFilePage.moduleButton.click();
        BrowserUtils.sleep(2);

    }
    @When("the user selects an item from its three dots menu")
    public void the_user_selects_an_item_from_its_three_dots_menu() {
        BrowserUtils.sleep(2);
        uploadEditDeleteFilePage.threeDots.click();

    }
    @Then("user choose to delete the file, and file should be deleted")
    public void user_choose_to_delete_the_file_and_file_should_be_deleted() {
        BrowserUtils.sleep(2);
        uploadEditDeleteFilePage.deleteFile.click();

    }
    @Then("user go to bottom of file list and sees the total number of files and folders")
    public void user_go_to_bottom_of_file_list_and_sees_the_total_number_of_files_and_folders() {
        BrowserUtils.sleep(2);
        BrowserUtils.verifyElementDisplayed(uploadEditDeleteFilePage.FileSummary);
    }



}





