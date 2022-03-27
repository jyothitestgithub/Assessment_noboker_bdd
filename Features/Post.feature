Feature: Verification of Post property

Scenario: To check post property ad for free
	Given Initialize the browser 
	And Navigate to "https://www.nobroker.in/" site 
	When User clicks on "Post free property ad" 
	Then Verify that text "Sell or Rent your Property For Free" is displayed in same page 
	And close browser