Feature: Verification of About nobroker

Scenario: To check about nobroker
	Given Initialize the browser
	And Navigate to "https://www.nobroker.in/" site 
	When User clicks on "About Us" in footer
	Then Verify whether text "Welcome to NoBroker!" is displayed 
	And close browser