package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsModuleFunctionalityPage extends BasePage{
    public ContactsModuleFunctionalityPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement contactsBtn;


    @FindBy(xpath = "(//button[@aria-haspopup='true'])[6]")
    public WebElement picUploadButton;


    @FindBy(xpath = "(//span[@class='action-button__text'])[6]")
    public WebElement choseFileButton;


    @FindBy(xpath = "(//td[@class='filename'])[2]")
    public WebElement newFile;

    @FindBy(xpath = "//span[@class='filename-parts']")
    public WebElement existingPic;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement chooseButton;

    @FindBy(id = "new-contact-button")
    public WebElement createNewContactBtn;

    @FindBy(xpath = "(//div[@class='app-content-list-item-line-one'])[1]")
    public WebElement contact1;

    @FindBy(xpath = "(//div[@class='app-content-list-item-line-one'])[2]")
    public WebElement contact2;

    @FindBy(xpath = "(//div[@class='app-content-list-item-line-one'])[3]")
    public WebElement contact3;

    @FindBy(id = "contact-fullname")
    public WebElement newContact;

    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContacts;


    @FindBy(xpath = "//div[@class='app-content-list-item active']")
    public WebElement anyContact;

    //@FindBy(css = "div.app-content-list-item")
    //public List<WebElement> contactsList;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> contactsList;

    @FindBy(xpath = "(//div[@class='app-navigation-entry__utils'])[1]")
    public WebElement allContactNumber;


    //@FindBy(xpath = "//button[@aria-controls='menu-mpyff']")
    //public WebElement treeDots;


    @FindBy(xpath = "(//div[@class='trigger'])[7]")
    public WebElement treeDots;
    @FindBy(xpath = "(//button[@class='action-button focusable'])[6]")
    public WebElement deleteButton;


}
