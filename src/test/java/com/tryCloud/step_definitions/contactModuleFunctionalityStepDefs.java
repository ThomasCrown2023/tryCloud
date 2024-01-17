package com.tryCloud.step_definitions;

import com.tryCloud.pages.ContactsModuleFunctionalityPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class contactModuleFunctionalityStepDefs {

        Actions actions = new Actions(Driver.getDriver());
        LoginPage loginPage = new LoginPage();
    ContactsModuleFunctionalityPage contactsModuleFunctionalityPage = new ContactsModuleFunctionalityPage();
    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        Driver.getDriver().get("https://qa.trycloud.net/index.php/apps/dashboard/");

        BrowserUtils.sleep(2);
        loginPage.login(ConfigurationReader.getProperty("employeeName"), ConfigurationReader.getProperty("employeePassword"));
    }
    @And("the user clicks on Contacts module")
    public void theUserClicksOnContactsModule() {

        BrowserUtils.waitFor(2);
        actions.moveToElement(contactsModuleFunctionalityPage.contactsBtn).perform();
        contactsModuleFunctionalityPage.contactsBtn.click();
    }


    @Given("the user clicks on the New Contact button")
    public void the_user_clicks_on_the_new_contact_button() {
        BrowserUtils.waitFor(2);
        contactsModuleFunctionalityPage.createNewContactBtn.click();
    }

    @When("the user can put {string}")
    public void theUserCanPut(String contactName) {
        contactsModuleFunctionalityPage.newContact.click();
        contactsModuleFunctionalityPage.newContact.sendKeys(contactName);
        BrowserUtils.waitFor(2);
    }

    @Then("the user clicks on all contacts button")
    public void the_user_clicks_on_all_contacts_button() {
        contactsModuleFunctionalityPage.allContacts.click();
    }

    @Then("the user should see the {string} in the all contacts list")
    public void the_user_should_see_the_in_the_all_contacts_list(String expectedContactsName) {
        BrowserUtils.sleep(2);
        List<String> actualContactsName = new ArrayList<>();
        for (WebElement contactName : contactsModuleFunctionalityPage.contactsList) {
            actualContactsName.add(contactName.getText());
        }

       //Assert.assertEquals(expectedContactsName, actualContactsName);
        //Assert.assertEquals(expectedContactsName,BrowserUtils.getElementsText(contactsModuleFunctionalityPage.contactsList));
        Assert.assertTrue(actualContactsName.contains(expectedContactsName));

    }

    @Then("the user should see total number of contacts")
    public void the_user_should_see_total_number_of_contacts() {
        BrowserUtils.verifyElementDisplayed(contactsModuleFunctionalityPage.allContactNumber);
    }

    @Given("the user selects a contact")
    public void the_user_selects_a_contact() {
        contactsModuleFunctionalityPage.anyContact.click();
    }

    @When("user changes the profile picture using the Choose from files option")
    public void userChangesTheProfilePictureUsingTheChooseFromFilesOption() {

        BrowserUtils.waitFor(2);
        contactsModuleFunctionalityPage.picUploadButton.click();

        BrowserUtils.waitFor(2);
        contactsModuleFunctionalityPage.choseFileButton.click();

        BrowserUtils.waitFor(2);
        contactsModuleFunctionalityPage.newFile.click();

        BrowserUtils.waitFor(2);
        contactsModuleFunctionalityPage.existingPic.click();
        BrowserUtils.waitFor(2);

    }

    @Then("the profile picture of the selected contact should be updated")
    public void the_profile_picture_of_the_selected_contact_should_be_updated() {
        BrowserUtils.waitFor(2);
        contactsModuleFunctionalityPage.chooseButton.click();
    }


    @When("user delete the selected contact")
    public void user_delete_the_selected_contact() {
        contactsModuleFunctionalityPage.anyContact.click();
    }


    @Then("the selected contact should be deleted")
    public void theSelectedContactShouldBeDeleted() {
        BrowserUtils.waitFor(2);
        contactsModuleFunctionalityPage.treeDots.click();
        BrowserUtils.waitFor(2);
        contactsModuleFunctionalityPage.deleteButton.click();
        BrowserUtils.waitFor(2);
    }
}
