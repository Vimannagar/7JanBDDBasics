Feature: home page
Scenario: verify title
Given User is at the landing page
Then Title of page should contains "Insurance"

Scenario: verify term insurance navigation
Given User is at the landing page
When User clicks on Term Life insurance
Then User should get redirect to "Term Life Insurance"

Scenario: entering information
Given user should be at Term life insurance page
When user enters name as "Daniel Smith" 
And user enters date as "07061995"
And user enters mobile number as "9988776655"
And User clicks on view free quotes button

