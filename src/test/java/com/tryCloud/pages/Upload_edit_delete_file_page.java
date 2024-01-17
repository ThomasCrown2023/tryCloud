package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upload_edit_delete_file_page{

    public Upload_edit_delete_file_page() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement moduleButton;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement uploadFilePanel;

    @FindBy(css = "#file_upload_start")
    public WebElement uploadFile;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusButton;

    @FindBy(xpath = "(//span[@class='displayname'])[2]")
    public WebElement createNewFolder;

    @FindBy(xpath = "(//span[@class='innernametext'])[2]")
    public WebElement displayFilesModule;

    @FindBy(id = "view13-input-folder")
    public WebElement folderName;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement confirmNewFolder;

    @FindBy(xpath = "(//div[@class='thumbnail-wrapper'])[1]")
    public WebElement NewFolder;

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[9]")
    public WebElement threeDots;

    @FindBy(xpath = "(//span[@class='icon icon-delete'])[2]")
    public WebElement deleteFile;

    @FindBy(xpath = "//td[@class='filesummary']")
    public WebElement FileSummary;

    @FindBy (xpath = "//span[.='some-file']")
    public WebElement uploadedFile;

    @FindBy(xpath = "((//table[@id='filestable'])[1]//div//span)[30]" )
    public WebElement funnyFile;





}
