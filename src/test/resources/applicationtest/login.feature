Feature: Login functionality
Scenario: Login validation with valid credentials
Given User is at the login screen
When User enters the username
And User enters the password
And User clicks on login button
Then User should get redirect to the home page 

Scenario: Login validation with in valid credentials
Given User is at the login screen
When User enters the username
And User enters the password
And User clicks on login button
Then User should get error message