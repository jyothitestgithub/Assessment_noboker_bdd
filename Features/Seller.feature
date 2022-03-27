Feature: Verification of Sellers Plans

Scenario: To check sellers plans
	Given Initialize the browser
	And Navigate to "https://www.nobroker.in/" site 
	When User clicks on Menu 
	And  User clicks on Sellers plan
	Then Verify that title contains text "Seller Plans" 
	And close browser