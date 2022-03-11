package com.tempus.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.tempus.base.Hooks.driver;
public class Common {
    private static Object JavascriptExecutor;

    public static void waitInSecond(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        }
        catch (Exception I){
        }
    }

    public  static void highlight_element(WebElement element){
        org.openqa.selenium.JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style','background:white;border:4px solid red;');",element);
    }
}
