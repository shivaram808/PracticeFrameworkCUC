Feature: Automating Cancel Ticket Page

  @CancelTicket
  Scenario: Verify Cancel Ticket page is displayed
    
    Given Login to TS RTC website using valid username and password
    Then  Navigate to Cancel Tickets page
    And  Verify Cancel Ticket icon is displayed
    
