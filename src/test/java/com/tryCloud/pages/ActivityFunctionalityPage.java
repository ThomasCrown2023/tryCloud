package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityFunctionalityPage {

    public ActivityFunctionalityPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@ aria-label='Activity'])[1]")
    public WebElement activityButton;

    @FindBy(xpath = "//div[@id='app-navigation']//span")
    public List<WebElement> allActivities;

    @FindBy(xpath = "//div[@id='no_more_activities']")
    public WebElement noMoreEventToLoadMsg;

    @FindBy(xpath = "//div[@class='activity box']")
    public WebElement scrollingPoint;

    @FindBy(xpath = "//span[@class='activitytime has-tooltip live-relative-timestamp']")
    public List<WebElement> activityDateObjects;




}
