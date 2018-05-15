Feature: Test Google smoke scenario

	Scenario: Test login with valid login
	Given Open Chrome and navigation to Google
	When I am enter the valid username and password
	Then user should be login successfully