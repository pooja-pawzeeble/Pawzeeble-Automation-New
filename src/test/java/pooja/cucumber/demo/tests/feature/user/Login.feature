@Client @ClientLogin @e2e
Feature: ClientLogin

  Background: 
    Given Open browser for application

  #Scenario: To check UI of login screen
  #d User can see label as "Mobile Number" on login screen
  #And User can see send OTP button with text as "Send OTP" on login screen
  #When User click on send OTP button on login screen
  #Then User can see validation message "Mobile number is required" on login screen
  #When User clicks on mobile number textbox
  #And User click outside of mobile number
  #Then User can see validation message "Incorrect Mobile No." on login screen
  # @Scenario Outline: To check invalid mobile numbers on login screen
  #When User clicks on join Pawzeeble button
  #Then User can see label as "Mobile Number(required)" on login screen
  # When User enter mobile number as <mobileNumber> on login screen
  #And User click outside of mobile number
  #Then User can see send OTP button is disabled
  #And User can see validation message "Incorrect Mobile No." on login screen
  #Examples:
  #|mobileNumber|
  #|123|
  #|12345678900|
  #|47892366|
  #|abc|
   
  Scenario: Successfull Login with Valid OTP
    When User clicks on join Pawzeeble button
    Then User can see label as "Mobile Number (required)" on login screen
    When User enter mobile number "8767252435" on login screen
    Then User can see send OTP button is enabled
    When User clicks on Send OTP button
    Then User can see heading message "Please provide the OTP"
    # And User can see detailed message "An OTP has been sent to" on OTP screen
    # And User can see label as "OTP" on OTP screen
    When User enter OTP as "098765"
    Then Verify OTP button is enabled
    When User clicks on Verify OTP button
    Then User logins successfully
     
  Scenario: Unsuccessful Login with Incorrect OTP
    When User clicks on join Pawzeeble button
    And User enter mobile number "8767252435" on login screen
    And User clicks on Send OTP button
    When User enter OTP as "098754"
    And User clicks on Verify OTP button
    Then User should see an error message "Incorrrect OTP provided"

  Scenario: Successful Login with Password
    When User clicks on join Pawzeeble button
    And User enter mobile number "8767252435" and password "pawzeeble1"
    And clicks the Continue button
    Then User logins successfully
    
  Scenario: Unsuccessful Login with Incorrect Password
    When User clicks on join Pawzeeble button
    And User enter mobile number "8767252435" and password "pawzeeble"
    And clicks the Continue button
    Then User should see an error message "password is incorrect"
    
 Scenario Outline: Check Incorrect Mobile Number
  When User clicks on join Pawzeeble button
  And User enter mobile number as <mobileNumber> on login screen
  And clicks the Continue button
  Then User can see validation message "Mobile Number is invalid" on login screen
  Examples:
  |mobileNumber|
  |123|
  |12345678900|
  |47892366|

  Scenario: Error Handling for Missing Fields  
  When User clicks on join Pawzeeble button
  And User enter mobile number "8767252435" on login screen
  And leave the password field empty
  And clicks the Continue button
  Then User should see an error message "Password is required!"
    
#forgot password    
# resend Otp
#change number 
