Feature: Automating Bus Search page

  @BusSearch
  Scenario: Verify Bus Search is successful
    
    Given Login to TS RTC website using valid username and password
    Then Search a bus starting text for From location "Hyd"
    Then Search a bus starting text for To location "Vij"

    
