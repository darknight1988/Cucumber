Feature: Test Google smoke scenario

  In order to search by keywork with Google
  As a user
  I want to be able to search for items containing certain words

  Scenario: Test login with valid login
    Given Open Chrome and navigation to Google
    When I am enter the valid username and password
    Then user should be login successfully
