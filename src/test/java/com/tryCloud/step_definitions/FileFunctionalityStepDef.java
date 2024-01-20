package com.tryCloud.step_definitions;

import com.tryCloud.pages.FilePage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FileFunctionalityStepDef {
    FilePage page = new FilePage();

    @When("user clicks on the three dots menu of a specific file")
    public void user_clicks_on_the_three_dots_menu_of_a_specific_file() {

       page.fileIcon.click();



    }
    @When("selects the {string} option")
    public void selects_the_option(String string) {

        for (int i = 2; i <page.dotedLine.size(); i++) {
            page.dotedLine.get(i).click();

            if(page.addToFavoritesButton.isDisplayed()){
                page.addToFavoritesButton.click();
            }else continue;

        }


    }
    @Then("the file should be added to the user's favorites list.")
    public void the_file_should_be_added_to_the_user_s_favorites_list() {

    }

// AC1 /////////////////////////////////////////////////////////////////////////////////




    @When("selects the Rename option")
    public void selects_the_rename_option() {

        page.fileIcon.click();
        for (int i = 2; i <page.dotedLine.size() ; i++) {
            page.dotedLine.get(2).click();

        }
       // String fileName = "Investor Factors Associate";






    }
    @Then("the file should be renamed with the new specified name")
    public void the_file_should_be_renamed_with_the_new_specified_name() {

    }




}
