Feature: Profile functionality
Scenario: Add profile for a user
Given User is already logged into the application
When User clicks on add profile button
And User enters the details
Then User details should get added

Scenario: Update profile for a user
Given User is already logged into the application
When User clicks on edit profile button
And User updates the details
Then User details should get updated

Scenario: Delete profile for a user
Given User is already logged into the application
When User clicks on Delete profile button
Then User profile should get deleted
