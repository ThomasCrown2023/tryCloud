@B31G11-98
Feature: Default

	Background:
		Given the user is logged in
		And the user clicks on Calendar module  and the user clicks the six dots


	@B31G11-85
	Scenario: US05_AC01_TC01 Verify User can display daily calendar view

		Then the user selects the daily view
		Then the daily calendar should be displayed


	@B31G11-95
	Scenario: US 005, AC 2 , Verify User can display weekly calendar view

		    When the user selects the weekly view
		    Then the weekly calendar is displayed


	
	@B31G11-96
	Scenario: US 005, AC 3, TC 3, Verify User can display monthly calendar view

		    When the user selects the monthly view
		    Then the monthly calendar is displayed


	
	@B31G11-97
	Scenario: US005, TC 4, AC 4, Verify User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view

		    When the user clicks the new event button
			Then user gives a new title
			Then user choose start date
			Then user choose end date
		    And the user saves the event
		   # And the user clicks the Personal and it displays



