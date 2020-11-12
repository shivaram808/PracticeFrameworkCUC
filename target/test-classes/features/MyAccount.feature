Feature: TS RTC My Account Scenarios

	@MyAccount @19.3 @Regression 
  Scenario: Update details in my account
    Given Login to TS RTC website using valid username and password
    Then TSRTC Home page should be displayed
    When I Click on My Account page
    And I update Issuing Authority as "XYZ"
    Then I should see successfully updated message
    
    
    
