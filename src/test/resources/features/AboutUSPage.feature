Feature: Automating About us page 

  @AboutUS 
  Scenario: Verify About us icon is displayed
    
    Given Login to TS RTC website using valid username and password
    Then  Navigate to About us page 
    And  Verify About us icon is displayed

  @BusService
  Scenario: Verify preferred Bus type is displayed

    Given Login to TS RTC website using valid username and password
    Then  Navigate to About us page
    And  Verify if "Hari" service is available






    
