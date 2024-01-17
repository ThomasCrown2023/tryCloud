package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends BasePage{

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = " //a[@aria-label='Calendar'][1]")
    public WebElement calendarBtn;

    @FindBy(xpath = "(//span[@class='action-button__text'])[3]")
    public WebElement dayView;

    @FindBy(xpath = "(//div[@class= 'trigger'])[2]")
           public WebElement sixDots;

@FindBy(xpath = "(//span[@class='action-button__text'])[4]")
    public WebElement weekView;

@FindBy(xpath = "(//span[@class='action-button__text'])[5]")
public WebElement monthlyView;


@FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEvent;

@FindBy(xpath = "(//input[@type='text'])[5]")
public WebElement eventTitle;

@FindBy(xpath = "(//input[@name= 'date'])[2]")
    public WebElement startDate;

@FindBy(xpath = "(//table[@class='mx-table mx-table-date']//td)[14]")
public WebElement selectedDate;

    @FindBy(xpath = "(//table[@class='mx-table mx-table-date']//td)[15]")
    public WebElement endingDate;

@FindBy(xpath = "(//li[@class='mx-time-item'])[5]")
public WebElement hourTime;

    @FindBy(xpath = "(//li[@class='mx-time-item'])[7]")
    public WebElement hourEndTime;

    @FindBy(xpath = "(//li[@data-index='6'])[2]")
    public WebElement minuteTime;

    @FindBy(xpath = "(//li[@data-index='6'])[3]")
    public WebElement minuteEndTime;

    @FindBy(xpath = "(//li[@data-index='1'])[3]")
    public WebElement timeSelection;

    @FindBy(xpath = "(//li[@data-index='1'])[3]")
    public WebElement timeEndSelection;

@FindBy(xpath = "(//div[@class ='mx-input-wrapper'])[3]")
    public WebElement endDate;

@FindBy(xpath = "//button[@class='primary']")
    public WebElement saveBtn;
}
