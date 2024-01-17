package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkModule_functionality_page {

    public TalkModule_functionality_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkBtn;

    @FindBy (css = ".toggle.has-tooltip")
    public WebElement createNewConvBtn;

    @FindBy (xpath = "//input[@placeholder='Conversation name']")
    public WebElement convName;

    @FindBy (xpath = "//label[@for='checkbox']")
    public WebElement linkCheckBox;

    @FindBy (xpath = "//div[@class='navigation']")
    public WebElement addParticBtn;

    @FindBy (xpath = "(//div[@class='icon-more'])[10]")
    public WebElement participant;

    @FindBy (xpath = "(//div[@class='icon-more'])[11]")
    public WebElement participant2;

    @FindBy (xpath = "(//div[@class='icon-more'])[12]")
    public WebElement participant3;

    @FindBy (xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConvrBtn;

    @FindBy (xpath = "((//div[@class='avatar icon icon-public'])[2])")
    public WebElement newlyCreatedConv;

    @FindBy (xpath = "(//button[@aria-label='Conversation settings'])[1]")
    public WebElement convControlPan;

    @FindBy (xpath = "//li[@class='action critical']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement comfirmDeleteBtn;

    @FindBy (xpath = "(//ul[@class='conversations']//li)[11]")
    public WebElement existingConversation;

    @FindBy (xpath = "//button[@class='top-bar__button top-bar__button primary']")
    public WebElement startCallBtn;

    @FindBy (xpath = "//button[@class='top-bar__button error top-bar__button']")
    public WebElement leaveCallBtn;

    @FindBy ( id = "conversation_m2bbk2i9")
    public WebElement displayedConversation;




}
