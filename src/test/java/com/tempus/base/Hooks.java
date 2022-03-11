package com.tempus.base;

import com.tempus.util.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    String url = "https://www.tempus.com/";
    @Before
    public void setUp(){
        driver= BrowserManager.getDriver("chrome");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
