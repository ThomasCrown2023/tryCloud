@B31G11-94

Feature: Upload/Edit/Delete File Module Functionality


	Background:
	Given user is logged in
		And the user clicks on Files module




	@B31G11-86
	Scenario: US02AC01TC01: Verify user can see files and files under list table
			And user clicks upload file button
			And user uploads the file
			Then the new file display on the Files module

	@B31G11-87
	Scenario: US02AC02TC01: Verify user can create a new folder
		    When user clicks creates a new folder
			Then user gives a name for folder
			Then user confirms new folder
		    Then the folder should be visible in the files list table

	@B31G11-89
	Scenario: US02AC03TC01: Verify user can delete item from dots menu
		Given the user is on the Files module page with existing items
		When the user selects an item from its three dots menu
		Then user choose to delete the file, and file should be deleted

	@B31G11-91
	Scenario: US02AC04TC01: Verify user can see total number of files and folders under file list
		Given the user is on the Files module page
		    Then user go to bottom of file list and sees the total number of files and folders