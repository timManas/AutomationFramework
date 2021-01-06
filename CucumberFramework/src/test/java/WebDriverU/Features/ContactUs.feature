Feature: Submit data to webdriveruniversity.com using contact us form
	A user should be to sumbit information via the contact us form
	If a user clicks on the reset button then all information should be removed from the contact us form
	
Background:	
	Given Print Hello World
	
	
Scenario: Submit valid data via contact us form
	Given I access webdriveruniversity
	When I click on the contact us button
	And I enter a valid first name
	And I enter a valid last name
	And I enter a valid email address
	And I enter comments
	When I click on the submit button
	Then the information should successfully be submitted via the contact us form
	

