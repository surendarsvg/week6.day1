Feature: login functionality of leaftaps application
Background:
Scenario: login with positive credential
Given open the chrome browser
And load the  application url
And enter the username as demosalesmanager
And enter the password as crmsfa
When click on login button
Then homepage should be displayed