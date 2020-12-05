Feature: Automating Bus Booking page

  @BusBooking
  Scenario: Verify Bus Booking is successful
    
    Given Login to TS RTC website using valid username and password
    Then Search a bus by From location "Hyderabad"
    Then Search a bus by To location "Vijayawada"
    Then Filter by BusType as "NON A/C CLASS"
    Then Filter by BusBoarding Point "KPHB COLONY"
    Then Click on Select Seats button using bus no "2099"

    
