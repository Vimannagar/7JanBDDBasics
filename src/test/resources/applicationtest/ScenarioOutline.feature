Feature: Signup
Scenario Outline: Signup to application using different set of data
Given User is at the signup page
When User enters "<name>" in form
And User enters "<age>" inside form
And User select "<gender>" inside the form

Examples:
| name | age | gender |
| Eder | 18 | Male | 
| Ron | 22 | Male |
| Diana | 23 | Female |
