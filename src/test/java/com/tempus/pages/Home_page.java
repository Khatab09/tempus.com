package com.tempus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.tempus.base.Hooks.driver;
public class Home_page {
    @FindBy(css = "[id='menu-5-0-about-us-1']>li>[href=\"/about-us/our-team/\"]")
    private WebElement aboutUs_link;
    @FindBy(css = "[id=\"footer\"]>div>div>div>[href=\"/contact-us/\"]")
    private WebElement contactUs_button;


    public Home_page() {
        PageFactory.initElements(driver,this);
    }

    public WebElement getAboutUs_link() {
        return aboutUs_link;
    }

    public WebElement getContactUs_button() {
        return contactUs_button;
    }


}
