@Client @ClientLogin @e2e
Feature: ClientLogin

  Background: 
    Given Open browser for application    

  Scenario: To check UI of login screen
  
    When User clicks on join Pawzeeble button
    Then User can see heading message "Welcome to Pawzeeble" on login screen
    And User can see detailed message "Please provide the following details to login" on login screen
    And User can see label as "Mobile Number" on login screen
    #And User can see checkbox with label as "Remember me" on login screen
    And User can see send OTP button with text as "Send OTP" on login screen
    #When User click on send OTP button on login screen
    #Then User can see validation message "Mobile number is required" on login screen
    When User clicks on mobile number textbox  
   And User click outside of mobile number
   Then User can see validation message "Incorrect Mobile No." on login screen 
    
    Scenario Outline: To check invalid mobile numbers on login screen
    When User clicks on join Pawzeeble button    
    Then User can see label as "Mobile Number(required)" on login screen
    When User enter mobile number as <mobileNumber> on login screen
    And User click outside of mobile number
    Then User can see send OTP button is disabled    
    And User can see validation message "Incorrect Mobile No." on login screen

 		Examples:
 		|mobileNumber|
 		|123|
 		|12345678900|
 		|47892366|
 		|abc|
 		
 	Scenario: To check valid mobile numbers on login screen
 	When User clicks on join Pawzeeble button    
  Then User can see label as "Mobile Number(required)" on login screen
  When User enter mobile number "8767252435" on login screen
  Then User can see send OTP button is enabled 
  When User clicks on Send OTP button
  Then User can see heading message "Please provide the OTP" 
  And User can see detailed message "An OTP has been sent to" on OTP screen
  And User can see label as "OTP" on OTP screen
  When User enter OTP as "098765"
  Then Verify OTP button is enabled
  When User clicks on Verify OTP button 
  Then User logins successfully
  
  #Scenario: To check new user login
  # When User clicks on join Pawzeeble button 
  
  
  
  
 		