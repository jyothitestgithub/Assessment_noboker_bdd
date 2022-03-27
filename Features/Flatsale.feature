Feature: Verification of Flat for sale

Scenario: To check flats for sale in T Nagar
	Given Initialize the browser 
	And Navigate to "https://www.nobroker.in/" site 
	When User clicks on "Flats for sale in T Nagra" under "Flats for sale in Chennai " in the footer 
	Then Verify that text "matching properties in T Nagar" is displayed in the redirected page 
	And close browser