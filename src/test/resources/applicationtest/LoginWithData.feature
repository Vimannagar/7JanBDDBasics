Feature: Login functionality with data
Scenario: Login with valid credentials
Given User should be at login screen
When User enters the username as "userone"
And User enters the password as "password"
And User click on submit button
Then User should get logged in

Scenario: Login with invalid credentials
Given User should be at login screen
When User enters the username "usertwo"
And User enters the password "invalidpassword"
And User click on submit button
Then User gets error message