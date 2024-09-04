@Client @ClientLogin @e2elocationtest
Feature: Location

  Background: 
    Given Open browser for application    

  Scenario: To check UI of location screen
  When User clicks on Location button
  Then User can see heading message "Help us find services near you" on location screen
  And User can see input location textbox 
  And User can see Locate me button
  
  Scenario Outline: To select particular valid location
  When User clicks on Location button
  And User enter location as <location> on location screen
  And User selects location from dropdown listz
  Then User can see location is set successfully on homepage
  
  Examples:
  |location|
 	|Pune Maharashtra|
 	
 	#switch between multiple locations pune--then mumbai----then pune
 	#accept location that contains devnagari address also