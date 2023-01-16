@SendAMessage
  Feature: Send a message to a contact that is on the contact list.

    Scenario: Verify user can send a message to a contact that is on the contact list.
      Given User open the Vsee application and go to the Sign in page
      When User Login to Gmail page with Username and Password
      Then User should able to see Vsee Messenger Beta app
      And User press on the Contacts tab
      And User select a contact on the contact list
      And User press on send message button
      And User enter some message "Testing"
      And User press Send button
      Then User will be able to see the above text has been sent

