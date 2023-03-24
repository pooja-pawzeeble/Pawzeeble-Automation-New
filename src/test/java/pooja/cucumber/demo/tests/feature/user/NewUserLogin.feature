@Client @ClientLogin @e2e
Feature: Web-ClientLogin

  Background: 
    Given Open browser for application 
  
  Scenario Outline: To check UI of new user login screen
    When User clicks on join Pawzeeble button
    And User enter mobile number as <mobileNumber> on login screen
    And User clicks on Send OTP button
    And User enter OTP as "098765"
    And User clicks on Verify OTP button 
    Then User logins successfully
    Then User can see heading as "Please fill Personal details" on new user login screen
   
    And User can see firstname with label "First Name" on new user login screen
    
    And User can see email address with label "Email Address" on new user login screen
    And User can see mobile number with label "Mobile Number" on new user login screen
    And User can see username with label "username" on new user login screen
    And User can see User Bio with label "User Bio" on new user login screen
    And User can see cancel button with heading as "Cancel"
    And User can see next button with heading as "Next"
    When User click on Next button on new user login screen
    Then User can see validation message as "Full Name must be at least 3 characters" for first name on new user login screen
    And User can see validation message as "Please enter a valid email address" for email address on new user login screen
    And User can see validation message as "Username must be at least 3 characters" for user name on new user login screen
     
    Examples:
 		|mobileNumber|
 		|8856936685|
 		|7385336422|
    