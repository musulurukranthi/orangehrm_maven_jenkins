Feature: Login feature
  I want to use this feature file to test all the login scenarios

  @smoke
  Scenario: Verify the valid login
    Given user should be in the login page
    And enter the valid username and password
    When click on login button
    Then validate the user should be navigated to dashboard page
    
	@smoke
  Scenario: Verify the invalid login
    Given user should be in the login page
    And enter the valid username and password
    When click on login button
    Then validate the user should be navigated to dashboard page
   