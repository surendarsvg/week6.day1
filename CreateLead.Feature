Feature: Login functionality of leaftaps application

Background:
Given Open the chrome browser
And Load the application url

Scenario: TC001_Login_succesfully
Given Enter the username as <username>
And Enter the password as <password>
When click on login button
Then Homepage should be displayed