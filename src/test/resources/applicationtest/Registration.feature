Feature: Registration for account opening
Scenario: Filling the information for bank account
Given User should be at registration page
When User enters following data
| Eder | Smith | eder.smith@gmail.com | 9988776655 |
| Ron | Dutta | ron.dutta@gmail.com | 1122334455 |
When User click on submit
Then Details should get saved