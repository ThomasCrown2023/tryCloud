package com.tryCloud.step_definitions;

import com.github.javafaker.Faker;
import com.tryCloud.pages.CalendarPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.build.Plugin;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Calendar_StepDefinitions {
LoginPage loginPage = new LoginPage();
    Actions actions = new Actions(Driver.getDriver());
CalendarPage calendarPage = new CalendarPage();

Faker faker = new Faker();

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        Driver.getDriver().get("https://qa.trycloud.net/index.php/apps/dashboard/");
        BrowserUtils.sleep(2);
        loginPage.login(ConfigurationReader.getProperty("userName"), ConfigurationReader.getProperty("userPassword"));

    }

    @And("the user clicks on Calendar module  and the user clicks the six dots")
    public void theUserClicksOnCalendarModuleAndTheUserClicksTheSixDots() {
        actions.moveToElement(calendarPage.calendarBtn).click().perform();
        BrowserUtils.sleep(2);
        actions.moveToElement(calendarPage.sixDots).click().perform();
        //calendarPage.sixDots.click();
        BrowserUtils.sleep(2);
    }

    @When("the user selects the daily view")
    public void theUserSelectsTheDailyView() {
//actions.moveToElement(calendarPage.dayView).click().perform();
calendarPage.dayView.click();
        BrowserUtils.sleep(2);
    }

    @Then("the daily calendar should be displayed")
    public void theDailyCalendarShouldBeDisplayed() {
        BrowserUtils.verifyElementDisplayed(calendarPage.dayView);
    }


    @When("the user selects the weekly view")
    public void theUserSelectsTheWeeklyView() {
        actions.moveToElement(calendarPage.weekView).click().perform();
    }

    @Then("the weekly calendar is displayed")
    public void theWeeklyCalendarIsDisplayed() {
        BrowserUtils.verifyElementDisplayed(calendarPage.weekView);
    }



    @When("the user selects the monthly view")
    public void theUserSelectsTheMonthlyView() {
        calendarPage.monthlyView.click();
    }

    @Then("the monthly calendar is displayed")
    public void theMonthlyCalendarIsDisplayed() {
        BrowserUtils.verifyElementDisplayed(calendarPage.monthlyView);
    }



    @When("the user clicks the new event button")
    public void theUserClicksTheNewEventButton() {
        calendarPage.newEvent.click();
    }


    @Then("user gives a new title")
    public void userGivesANewTitle() {
        calendarPage.eventTitle.click();
        calendarPage.eventTitle.sendKeys(faker.name().firstName());
    }



    @Then("user choose start date")
    public void userChooseStartDate() {
        calendarPage.startDate.click();
        calendarPage.selectedDate.click();
        calendarPage.hourTime.click();
        calendarPage.minuteTime.click();
        calendarPage.timeSelection.click();

    }

    @Then("user choose end date")
    public void userChooseEndDate() throws InterruptedException {

        //BrowserUtils.sleep(20);
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(20));
       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@autocomplete ='off'])[3]")));
        //actions.moveToElement(calendarPage.eventTitle).click();
       // actions.moveToElement(calendarPage.endDate).perform();

       // Driver.getDriver().navigate().refresh();
        Thread.sleep(30);
        calendarPage.endDate.click();
       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//table[@class='mx-table mx-table-date']//td)[15]")));
        calendarPage.endingDate.click();
        calendarPage.hourEndTime.click();
        calendarPage.minuteEndTime.click();
        calendarPage.timeEndSelection.click();
    }





    @And("the user saves the event")
    public void theUserSavesTheEvent() {
        calendarPage.saveBtn.click();

    }


   
/*
    @And("the user clicks the Personal and it displays")
    public void theUserClicksThePersonalAndItDisplays() {
    }



 */

}
