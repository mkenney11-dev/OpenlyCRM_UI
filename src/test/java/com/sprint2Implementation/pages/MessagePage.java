package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {

    public MessagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageBtn;

    @FindBy(xpath ="//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement UploadFileAndImageBtn;

    @FindBy(xpath = "//span[@class='insert-btn']")
    public WebElement insertInTextBtn;

    @FindBy(xpath = "//a[@class='files-path']")
    public WebElement uploadedFilesConfMessage;

    @FindBy(xpath = "//td[@class='files-info']")
    public WebElement inTextMessage;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement deleteUploadBtn;

    @FindBy(xpath = "//td[@class='files-name']")
    public WebElement uploadedFile;

}
