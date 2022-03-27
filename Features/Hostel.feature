Feature: Verification of PG/Hostel

Scenario: To check PG/Hostel in Powai
	Given Initialize the browser 
	And Navigate to "https://www.nobroker.in/" site 
	When User clicks on "PG in Powai" under "PG in Munbai" under PG or Hostels
	Then Verify that text " matching properties in Powai" is displayed on the redirected page 
	And close browser