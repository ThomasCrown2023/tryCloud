@B31G11-68
Feature: Activity Functionality

	Background:
		Given the user logged in with username as "User1" and password as "Userpass123"
		

	#{color:#de350b}*User Story :*{color}
	#
	#As a user, I should be able to see listed items under the Activity module.
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	# # {color:#de350b}User can display all listed items under the Activity module.{color}
	# # User can see all items list ordered by newest to oldest.
	# # User can see "No more events to load" message at the end of the "All Activities" tab.
	@B31G11-101
	Scenario: US011-TC001-Verify user can see all listed items under  Activity module
		Given user is on the Dashboard page
		When user clicks on the "Activity" module
		Then user should see all listed items displayed
		 |All activities|
		 |By you|
		 |By others|
		 |Circles|
		 |Favorites|
		 |File changes|
		 |File shares|
		 |Calendar|
		 |Todos|
		 |Comments|
		 |Deck|	

	#{color:#de350b}*User Story :*{color}
	#
	#As a user, I should be able to see listed items under the Activity module.
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	# # User can display all listed items under the Activity module.
	# # User can see all items list ordered by newest to oldest.
	# # {color:#de350b}User can see "No more events to load" message at the end of the "All Activities" tab.{color}
	@B31G11-103
	Scenario: Us011-TC003-Verify that user can see "No more events to load" message at the end of the "All Activities" tab
		When user clicks on the "Activity" module
		And user scrolls down to the bottom of the page
		Then user should see "No more events to load" message displayed

	#{color:#de350b}*User Story :*{color}
	#
	#As a user, I should be able to see listed items under the Activity module.
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	# # User can display all listed items under the Activity module.
	# # {color:#de350b}User can see all items list ordered by newest to oldest.{color}
	# # User can see "No more events to load" message at the end of the "All Activities" tab.
	@B31G11-102
	Scenario: US011-TC002- Verify that user can see all items list ordered by newest to oldest.
		When user clicks on the "Activity" module
		Then user should see all orders displayed from newest to oldest