Feature: Test Login

Scenario: Login account with a valid password
	Given I access webdriveruniversity
	When I click on the login portal button
	And I enter a username
	And I enter a "webdriver123" password
	When I click on the login button
	Then I should be presented with a succesfful validation alert
	

Scenario: Login account with a invalid password
	Given I access webdriveruniversity
	When I click on the login portal button
	And I enter a username
	And I enter a "invalid" password
	When I click on the login button
	Then I should be presented with a unsuccesfful validation alert  
	
	