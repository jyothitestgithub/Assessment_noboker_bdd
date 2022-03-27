Feature: Nobroker Login

Scenario Outline: To verify Login functionality
Given Initialize the browser
And Navigate to "https://www.nobroker.in/" site 
When User clicks on Login
And User enters mobile number <mobilenum>
And User clicks on I've Password 
And User enters password <password>
When User clicks on Continue
Then Verify that text <result> is displayed
And close browser

Examples: 
|mobilenum      |password          |result               |
|9390853966     |jyot2039          |Signed in Successfully  |      