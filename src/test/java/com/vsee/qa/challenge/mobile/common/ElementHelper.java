package com.vsee.qa.challenge.mobile.common;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    protected AndroidDriver driver;
    public final String idPrefix = "com.vsee.vsee.beta:id/";

    public ElementHelper(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean waitForPresence(AndroidDriver driver, int timeLimitInSeconds, WebElement mobileElement) {
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeLimitInSeconds));
            wait.until(ExpectedConditions.visibilityOf(mobileElement));
            return mobileElement.isDisplayed();
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
