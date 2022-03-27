Feature: Verification of Blog nobroker

Scenario: To check nobroker's blog
	Given Initialize the browser 
	And Navigate to "https://www.nobroker.in/" site 
	When User clicks on Menu 
	And  User clicks on Blog
	Then Verify whether title contains text "The NoBroker Times" 
	And close browser