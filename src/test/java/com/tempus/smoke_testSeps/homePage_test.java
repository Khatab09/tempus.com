package com.tempus.smoke_testSeps;

import com.tempus.pages.ContactUs_Page;
import com.tempus.pages.Home_page;
import com.tempus.util.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import static com.tempus.base.Hooks.driver;


public class homePage_test {
    @Given("verify the browser url once the page loads.")
    public void verify_the_browser_url_once_the_page_loads() {
       String expectedURL ="https://www.tempus.com/";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,currentUrl);
    }
    @Given("go to tempus and click on about us")
    public void go_to_tempus_and_click_on_about_us() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6800)", "");
        Common.waitInSecond(3);
        Home_page home_page = new Home_page();
        home_page.getAboutUs_link().click();
        Common.waitInSecond(3);

    }
    @Then("verify the url")
    public void verify_the_url() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expected = "https://www.tempus.com/about-us/our-team/";
        Assert.assertEquals(currentUrl,expected);


    }
    @Given("go to tempus and click on contact us")
    public void go_to_tempus_and_click_on_contact_us() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6800)", "");
        Common.waitInSecond(3);
        Home_page home_page = new Home_page();
        home_page.getContactUs_button().click();
        Common.waitInSecond(2);
    }
    @Then("verify that tempus address is displayed")
    public void verify_that_tempus_address_is_displayed() {
        ContactUs_Page contactUs_page = new ContactUs_Page();

        Assert.assertTrue(contactUs_page.getTempusAddress().isEnabled());

    }

}
