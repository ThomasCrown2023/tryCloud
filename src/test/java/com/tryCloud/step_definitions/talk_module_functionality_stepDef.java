package com.tryCloud.step_definitions;

import com.github.javafaker.Faker;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.TalkModule_functionality_page;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class talk_module_functionality_stepDef {

    TalkModule_functionality_page talkModuleFunctionalityPage = new TalkModule_functionality_page();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();

    @Given("the user is on the Talk module")
    public void the_user_is_on_the_talk_module() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        BrowserUtils.sleep(3);
        loginPage.login(ConfigurationReader.getProperty("userName"),ConfigurationReader.getProperty("userPassword"));
        BrowserUtils.sleep(3);
        talkModuleFunctionalityPage.talkBtn.click();




    }


    @Then("user clicks new conversation button")
    public void userClicksNewConversationButton() {


        talkModuleFunctionalityPage.createNewConvBtn.click();
        BrowserUtils.sleep(3);
    }


    @When("user gives a name for new conversation")
    public void userGivesANameForNewConversation() {
        talkModuleFunctionalityPage.convName.click();
        BrowserUtils.sleep(3);
        talkModuleFunctionalityPage.convName.sendKeys(faker.name().title());
    }
    @Given("allow guests to join via link")
    public void allow_guests_to_join_via_link() {

        talkModuleFunctionalityPage.linkCheckBox.click();
    }
    @Then("user should add the participant to conversation")
    public void user_should_add_the_participant_to_conversation() {
        BrowserUtils.sleep(3);
        talkModuleFunctionalityPage.addParticBtn.click();
        talkModuleFunctionalityPage.participant.click();
        talkModuleFunctionalityPage.participant2.click();
        talkModuleFunctionalityPage.participant3.click();

    }

    @Given("the user creates a new conversation")
    public void the_user_creates_a_new_conversation() {
        BrowserUtils.sleep(3);
        talkModuleFunctionalityPage.createConvrBtn.click();
    }


    @Given("there is an existing conversation")
    public void there_is_an_existing_conversation() {
        talkModuleFunctionalityPage.newlyCreatedConv.click();

    }
    @Then("user go to conversation control panel")
    public void user_go_to_conversation_control_panel() {
        BrowserUtils.sleep(3);
       talkModuleFunctionalityPage.convControlPan.click();
    }
    @When("the user chooses to delete the conversation")
    public void the_user_chooses_to_delete_the_conversation() {
        BrowserUtils.sleep(3);
       talkModuleFunctionalityPage.deleteBtn.click();
    }

    @And("user confirm to delete conversation")
    public void userConfirmToDeleteConversation() {
        BrowserUtils.sleep(3);
        talkModuleFunctionalityPage.comfirmDeleteBtn.click();
    }


    @Given("user choose an existing conversation")
    public void userChooseAnExistingConversation() {
    talkModuleFunctionalityPage.existingConversation.click();
    }



    @And("user starts a call in the conversation")
    public void userStartsACallInTheConversation() {


        BrowserUtils.sleep(3);
        talkModuleFunctionalityPage.startCallBtn.click();


    }



    @When("the user chooses to leave the call")
    public void the_user_chooses_to_leave_the_call() {


        talkModuleFunctionalityPage.leaveCallBtn.click();
    }


    @Then("new conversation displayed on conversation list")
    public void newConversationDisplayedOnConversationList() {
        talkModuleFunctionalityPage.displayedConversation.getText();
    }
}
