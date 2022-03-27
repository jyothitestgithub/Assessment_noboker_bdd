Feature: Verification of Electrician services

Scenario: To check electrician services
	Given Initialize the browser 
	And Navigate to "https://www.nobroker.in/" site 
	When User clicks on "Electrician Services Bangalore" under "Miscellaneous" in footer 
	Then Verify that text "Best Electricians in Bangalore" is displayed in next page 
	And close browser