Feature: Automating Driver Info page

  @DriverInfo
  Scenario: Verify Driver Information page is displayed
    
    Given Login to TS RTC website using valid username and password
    Then Navigate to Driver Info page
    And  Verify Driver Information label is displayed
    
