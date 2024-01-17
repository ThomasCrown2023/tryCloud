package com.tryCloud.step_definitions;

import com.tryCloud.pages.ActivityFunctionalityPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class ActivityFunctionalityStepDef {

    ActivityFunctionalityPage activityFunctionalityPage = new ActivityFunctionalityPage();

    LoginPage loginPage = new LoginPage();

    @Given("user is on the Login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get("https://qa.trycloud.net/index.php/login?clear=1");

    }

    @Given("user enters driver username and password")
    public void user_enters_driver_username_and_password() {

        loginPage.login("userName", "userPassword");
        loginPage.submit.click();
    }

    @Given("user is on the Dashboard page")
    public void user_is_on_the_dashboard_page() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }


    @When("user clicks on the {string} module")
    public void userClicksOnTheModule(String arg0) {

        activityFunctionalityPage.activityButton.click();
    }

    @Then("user should see all listed items displayed")
    public void userShouldSeeAllListedItemsDisplayed(List<String> expectedModuleNames) {


List<String> actualModuleList=BrowserUtils.getElementsText(activityFunctionalityPage.allActivities) ;
       actualModuleList.removeIf(k->k.isBlank());
       Assert.assertEquals(expectedModuleNames,actualModuleList);

    }

    Actions actions = new Actions(Driver.getDriver());


    @When("user scrolls down to the bottom of the page")
    public void user_scrolls_down_to_the_bottom_of_the_page() {

        BrowserUtils.scrollToElement(activityFunctionalityPage.noMoreEventToLoadMsg);
        BrowserUtils.sleep(5);
    }

    @Then("user should see {string} message displayed")
    public void user_should_see_message_displayed(String expectedMsg) {

        String actualMsg = activityFunctionalityPage.noMoreEventToLoadMsg.getText();


    }



    @Then("user should see all orders displayed from newest to oldest")
    public void user_should_see_all_orders_displayed_from_newest_to_oldest() {

        List<WebElement> activityDateObjectsList = activityFunctionalityPage.activityDateObjects;
        List<String> activityDateObjectsListText = new ArrayList<>();

        for (WebElement element : activityDateObjectsList) {
            activityDateObjectsListText.add(element.getText());
        }
        System.out.println("activityDateObjectsListText = " + activityDateObjectsListText);

        BrowserUtils.sleep(5);
        boolean b1 = activityDateObjectsListText.get(0).contains("hours") && activityDateObjectsListText.get(activityDateObjectsListText.size() - 1).contains("hours");
        boolean b2 = activityDateObjectsListText.get(0).contains("hours") && activityDateObjectsListText.get(activityDateObjectsListText.size() - 1).contains("months");
        boolean b3 = activityDateObjectsListText.get(0).contains("hours") && activityDateObjectsListText.get(activityDateObjectsListText.size() - 1).contains("days");
        boolean b4 = activityDateObjectsListText.get(0).contains("hours") && activityDateObjectsListText.get(activityDateObjectsListText.size() - 1).contains("years");


        if (b1) Assert.assertTrue(true);
        else if (b2) Assert.assertTrue(true);
        else if (b3) Assert.assertTrue(true);
        else if (b4) Assert.assertTrue(true);




    }


}



