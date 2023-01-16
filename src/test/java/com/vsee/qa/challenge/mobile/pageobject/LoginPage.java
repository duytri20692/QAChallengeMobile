package com.vsee.qa.challenge.mobile.pageobject;

import com.vsee.qa.challenge.mobile.common.ElementHelper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ElementHelper {
    @FindBy(id = idPrefix + "loginEmailEdit")
    private WebElement emailTxt;
    @FindBy(id = idPrefix + "loginPasswordEdit")
    private WebElement passTxt;
    @FindBy(id = idPrefix + "loginSignInBut")
    private WebElement signInBtn;

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public LoginPage enterUserName(String username) {
        waitForPresence(driver,5, emailTxt);
        emailTxt.clear();
        emailTxt.sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        waitForPresence(driver,5, passTxt);
        passTxt.clear();
        passTxt.sendKeys(password);
        return this;
    }

    public MessengerPage pressLoginBtn() {
        waitForPresence(driver,5, signInBtn);
        signInBtn.click();
        return new MessengerPage(driver);
    }

    public LoginPage waitForLoginPageDisplaying() {
        waitForPresence(driver,30, emailTxt);
        return this;
    }

    public MessengerPage loginWithUserAndPass(String loginUser, String loginPass) {
        enterUserName(loginUser);
        enterPassword(loginPass);
        pressLoginBtn();
        return new MessengerPage(driver);
    }
}
