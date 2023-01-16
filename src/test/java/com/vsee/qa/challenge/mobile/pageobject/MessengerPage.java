package com.vsee.qa.challenge.mobile.pageobject;

import com.vsee.qa.challenge.mobile.common.ElementHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessengerPage extends ElementHelper {
    @FindBy(id = idPrefix + "contact_list_group_name")
    private WebElement contactListGroup;
    @FindBy(xpath = "//*[@content-desc='Contacts']")
    private WebElement contactTab;
    @FindBy(id = idPrefix + "itemContactListNameView")
    private WebElement contactListName;
    @FindBy(id = idPrefix + "context_chat")
    private WebElement chatIcon;
    @FindBy(id = idPrefix + "chatEditText")
    private WebElement chatTxt;
    @FindBy(id = idPrefix + "chatSendBut")
    private WebElement chatSendBtn;

    public MessengerPage(AndroidDriver driver) {
        super(driver);
    }

    public MessengerPage pressContactTab() {
        waitForPresence(driver,5, contactTab);
        contactTab.click();
        return this;
    }

    public MessengerPage pressContactListName() {
        waitForPresence(driver,5, contactListName);
        contactListName.click();
        return this;
    }

    public MessengerPage pressChatIcon() {
        waitForPresence(driver,5, chatIcon);
        chatIcon.click();
        return this;
    }

    public MessengerPage enterMessageChat(String messageChat) {
        waitForPresence(driver,5, chatTxt);
        chatTxt.clear();
        chatTxt.sendKeys(messageChat);
        return this;
    }

    public MessengerPage pressChatSendButton() {
        waitForPresence(driver,5, chatSendBtn);
        chatSendBtn.click();
        return this;
    }

    public boolean isMessageDelivered() {
        try {
            driver.findElement(new By.ById(idPrefix + "message_status"));
            return true;
        }catch (NoSuchElementException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public void waitForMessengerPageDisplaying() {
        waitForPresence(driver,30, contactListGroup);
    }
}
