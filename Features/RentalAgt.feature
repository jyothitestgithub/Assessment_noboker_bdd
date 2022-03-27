Feature: Verification of Rental Agreement

Scenario: To check about Rental Agreement
	Given Initialize the browser 
	And Navigate to "https://www.nobroker.in/" site 
	When User clicks on "Rent Agreement" under Rent in footer
	Then Verify whether title has "Rental Agreement" is the next or redirected page 
	And close browser