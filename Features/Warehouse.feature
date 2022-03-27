Feature: Verification of Commercial rent

Scenario: To check warehouse rent in Gurgaon
	Given Initialize the browser
	And Navigate to "https://www.nobroker.in/" site 
	When User clicks on "Commercial" for options
	And User clicks on "Wearhouse for rent in Gurgaon" under it
	Then Verify that text "Warehouse or Godown" is displayed in the title of the page
	And close browser