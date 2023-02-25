Feature: Login to Leaftaps

Background:
Given Open the Browser
And Launch the URL

Scenario Outline: Postive flow
#Given Open the Browser
#And Launch the URL
#When Enter the username as <Username> and password as <password>
When Enter the username as <Username>
#And Enter the password as <Password>
And Click on Login
Then Homepage should be displayed

Examples:
|Username|Password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|


#Scenario: Negative flow
##Given Open the Browser
##And Launch the URL
#When Enter the username as DemoSalesManager
#And Enter the password as abcd
#And Click on Login
#But Error message should be displayed