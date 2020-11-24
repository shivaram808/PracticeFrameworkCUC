Feature: Automating Select Avl Seats page

  @SelectSeats
  Scenario: Verify Seats are selected
    
    Given Login to TS RTC website using valid username and password
    Then  Search a bus in booking page
    Then Click on Select Seats button using bus no "2099"

    
