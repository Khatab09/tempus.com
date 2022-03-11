package com.tempus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.tempus.base.Hooks.driver;

public class ContactUs_Page {
    @FindBy(xpath = "//p[text()='600 West Chicago Avenue']")
    private WebElement tempusAddress;


    public ContactUs_Page() {
        PageFactory.initElements(driver,this);
    }

    public WebElement getTempusAddress() {
        return tempusAddress;
    }
}

