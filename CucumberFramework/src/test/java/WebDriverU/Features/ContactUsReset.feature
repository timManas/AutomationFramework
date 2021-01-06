Feature: If a user clicks on the reset button then all information should be removed from the contact us form
	

Scenario: Submit non valid data via contact us form
	Given I access webdriveruniversity
	When I click on the contact us button
	And I enter a non valid first name
	And I enter a non valid last name
	And I enter a non valid email address
	And I enter no comments
	When I click on the submit button
	Then the information should not be successfully be submitted via the contact us form
	But the user should also be notified of the problem   
		

