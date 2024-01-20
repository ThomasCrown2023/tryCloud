package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilePage {

    public FilePage(){PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath="//a[@aria-label='Files']")
        public WebElement fileIcon;

        @FindBy(xpath="//span[.='Add to favorites']")
        public WebElement addToFavoritesButton;

        @FindBy(xpath="//span[.='Remove from favorites']")
        public WebElement removeFromFavoritesButton;

        @FindBy(xpath="//span[@class='icon icon-more']")
        public List<WebElement> dotedLine;

        @FindBy(xpath = "//span[.='Rename']")
        public WebElement RenameButton;

    @FindBy(xpath=")//span[@class='icon icon-more'])[2]")
    public WebElement dotedLine2;




    }



