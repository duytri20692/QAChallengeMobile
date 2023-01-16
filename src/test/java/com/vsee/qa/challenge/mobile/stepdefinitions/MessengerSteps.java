package com.vsee.qa.challenge.mobile.stepdefinitions;

import com.vsee.qa.challenge.mobile.common.BasePage;
import com.vsee.qa.challenge.mobile.pageobject.MessengerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MessengerSteps extends BasePage {
    MessengerPage messengerPage = new MessengerPage(driver);

    @Then("User should able to see Vsee Messenger Beta app")
    public void userShouldAbleToSeeVseeMessengerBetaApp() {
        messengerPage.waitForMessengerPageDisplaying();
    }

    @And("User press on the Contacts tab")
    public void userPressOnTheContactsTab() {
        messengerPage.pressContactTab();
    }

    @And("User select a contact on the contact list")
    public void userSelectAContactOnTheContactList() {
        messengerPage.pressContactListName();
    }

    @And("User press on send message button")
    public void userPressOnSendMessageButton() {
        messengerPage.pressChatIcon();
    }

    @And("User enter some message {string}")
    public void userEnterSomeMessage(String message) {
        messengerPage.enterMessageChat(message);
    }

    @And("User press Send button")
    public void userPressSendButton() {
        messengerPage.pressChatSendButton();
    }

    @Then("User will be able to see the above text has been sent")
    public void userWillBeAbleToSeeTheAboveTextHasBeenSent() {
        Assert.assertTrue(messengerPage.isMessageDelivered(),"Delivered message not display.");
    }
}
