package com.vsee.qa.challenge.mobile.stepdefinitions;

import com.vsee.qa.challenge.mobile.common.BasePage;
import com.vsee.qa.challenge.mobile.pageobject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps extends BasePage {
    LoginPage loginPage = new LoginPage(driver);

    @Given("User open the Vsee application and go to the Sign in page")
    public void userOpenTheVseeApplicationAndGoToTheSignInPage() {
        loginPage.waitForLoginPageDisplaying();
    }

    @When("User Login to Gmail page with Username and Password")
    public void userLoginToGmailPageWithUsernameAndPassword() {
        loginPage.loginWithUserAndPass(loginUser,loginPass);
    }
}
