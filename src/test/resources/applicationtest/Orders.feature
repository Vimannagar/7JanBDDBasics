Feature: Fetch order information
Background:
Given User should be logged into the application
When User click on orders button
Then User should see order category

Scenario: fetch previouly placed order
When user clicks on past order button 
Then user should be able to see past order information

Scenario: fetch current placed order
When user clicks on current order button 
Then user should be able to see current order information