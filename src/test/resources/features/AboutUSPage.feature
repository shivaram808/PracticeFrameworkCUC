Feature: Automating About us page 

#  @AboutUS
#  Scenario: Verify About us icon is displayed
#
#    Given Login to TS RTC website using valid username and password
#    Then  Navigate to About us page
#    And  Verify About us icon is displayed
#
#  @BusService
#  Scenario: Verify preferred Bus type is displayed
#
#    Given Login to TS RTC website using valid username and password
#    Then  Navigate to About us page
#    And  Verify if "Indra (2 + 2 AC Semi-Sleeper)" service is available
#
#
#  @NoOfServices
#  Scenario: Verify No of services
#
#  Given Login to TS RTC website using valid username and password
#  Then  Navigate to About us page
#  And Verify if "Indra (2 + 2 AC Semi-Sleeper)" service is available
#  And Display number of services of "Indra (2 + 2 AC Semi-Sleeper)"
#
#  @GetNoOFBusses
#  Scenario: Verify No of Busses in each service
#
#    Given Login to TS RTC website using valid username and password
#    Then  Navigate to About us page
#    And Fetch no of available serices for bus : "Indra (2 + 2 AC Semi-Sleeper)"

  @GetNoOFBusses
  Scenario Outline: Display Total busses for the all the mentioned Bus Services

    Given Login to TS RTC website using valid username and password
    Then  Navigate to About us page
    And Display Number of busses available for each bus type "<Service>"

    Examples:
      |Service|
      |Vennela (AC Sleeper)|
      |Indra (2 + 2 AC Semi-Sleeper)|
      |Deluxe (2 + 2 Non-AC)|
      |Express (3 + 2 Non-AC)|

