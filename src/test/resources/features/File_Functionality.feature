@B31G11-107
Feature: Default

	Background:
		Given the user logged in with username as "User1" and password as "Userpass123"
		Given the user is on the login page


	
	@B31G11-104
	Scenario: US-012, AC1 - Add a File to Favorites
		When user clicks on the three dots menu of a specific file
		And selects the "Add to Favorites" option
		Then the file should be added to the user's favorites list.	

	
	@B31G11-105
	Scenario: US-012, AC2 - Rename a File
		When user clicks on the three dots menu of a specific file
		And selects the Rename option
		Then the file should be renamed with the new specified name	


	@B31G11-106
	Scenario: US-012, AC3 - Add Comments to a File
	When user clicks on the three dots menu of a specific file
	And selects the "Add Comments" option
	And enters comments in the provided text field
	Then the comments should be associated with the selected file.
		