Feature: Profile picture functionality
@sanity
Scenario: Add profile picture for a user
Given User is already logged into  application
When User clicks on add profile pic button
And Select the image
Then User profile pic should get added

@regression @functional
Scenario: Update profile pic for a user
Given User is already logged into  application
When User clicks on edit profile picture button
And User updates the image
Then User profile pic should get updated

@functional
Scenario: Delete profile picture for a user
Given User is already logged into  application
When User clicks on Delete profile  picture button
Then User profile picture should get deleted
