Feature: TS RTC Login Scenarios

  @Login 
  Scenario: Validate TS RTC user login
    Given Login to TS RTC website using valid username and password
    Then TSRTC Home page should be displayed


