@Client @ClientLogin @nul
Feature: New User Login 

  Background: 
    Given Open browser for application 
  
  Scenario Outline: To check UI of new user login screen
    When User clicks on join Pawzeeble button
    And User enter mobile number as <mobileNumber> on login screen
    And User clicks on Send OTP button
    And User enter OTP as "098765"
    And User clicks on Verify OTP button 
   # Then User logins successfully
    Then User can see heading as "Please fill Personal details" on new user login screen
   
    And User can see firstname with label "First Name" on new user login screen
    
    And User can see email address with label "Email address" on new user login screen
    And User can see mobile number with label "Mobile number" on new user login screen
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
 		|8945289992|
 		|8889898989|
    
   @test
    Scenario Outline: To check Cancel button navigation on new user login screen
    When User on New User Profile screen with mobile number as <mobileNumber>
    When User can see Cancel button with heading "Cancel" on new user login screen
    And User click on Cancel button on new user login screen
    Then User is on Home page 
   
    Examples:
    |mobileNumber|
 		|7454339241|
    
    Scenario Outline: To fill incorrect data on new user login screen
    When User on New User Profile screen with mobile number as <mobileNumber>
    And User enter firstname as <firstname> on new user login screen
    And User enter email as <email> on new user login screen
    And User enter username as <username> on new user login screen
    When User click on Next button on new user login screen
   # Then User can see heading as "Select topics of your interests" 
   # And user selects suggested topics 
   # And User clicks on next button
    Then User can see validation messages on new user login screen
   
    Examples:
    |mobileNumber|firstname | email          | username |
    |7454339241|  Eliza    | E@gmail.com    | empty    |
    |7454339241| empty    | E@gmail.com    | empty    |
    |7454339241| Eliza    | empty          | empty    |
    |7454339241| empty    | empty          | Eliza    |
    |7454339241| empty    | empty          | empty    |
    |7454339241| space    | Dinde          | empty    |
    |7454339241| Eliza    | space          | Demo     |
    |7454339241| Elizabet | E@.com         | Demo     |
    
    Scenario Outline: To check mobile number field is disabled on new user login screen
    When User on New User Profile screen with mobile number as <mobileNumber>
    Then User can see mobile number is disabled 
    
    Examples:
    |mobileNumber|
 		|7454339241|
   
   @SmokeTest
    Scenario Outline: To fill correct data on new user login screen or create New User Profile 
    When User on New User Profile screen with mobile number as <mobileNumber>
    And User enter firstname as <firstname> on new user login screen
    And User enter email as <email> on new user login screen
    And User enter username as <username> on new user login screen
    When User click on Next button on new user login screen
    Then User can see heading as "Select topics of your interests" 
    And user selects suggested topics 
    And User clicks on submit button
    And User can see his profile created successfully 
    
    Examples:
    |mobileNumber |firstname    | email                 | username    |
    |8527834259   | testauto    | testauto1@gmail.com    | testauto    |
    
    
    