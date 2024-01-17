@B31G11-83
Feature:  Talk Module Functionality

	Agile story:As a user, I should be able to create a new conversation, add participant,
	delete a conversation ,start and leave call under the Talk module

Background: For all scenarios user is on the Talk module page of the application
	Given the user is on the Talk module


	@B31G11-79
	Scenario: US6 - AC1 - TC1 Verify user can create a new conversation and add participant GG
			Given  user clicks new conversation button
			When user gives a name for new conversation
		    And allow guests to join via link
		    Then user should add the participant to conversation
			And the user creates a new conversation
			Then new conversation displayed on conversation list

	@B31G11-81
	Scenario: US6 - AC3 - TC3 Verify user starts a call and leave the call in a conversation GG
		Given user choose an existing conversation
		And  user starts a call in the conversation
		Then the user chooses to leave the call


	@B31G11-80
	Scenario: US6 - AC2 - TC2 Verify users deletes a conversation GG

		    Given there is an existing conversation
		    Then user go to conversation control panel
		    When the user chooses to delete the conversation
			And user confirm to delete conversation











