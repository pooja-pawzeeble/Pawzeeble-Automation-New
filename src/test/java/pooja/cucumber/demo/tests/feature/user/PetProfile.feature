 @Client @ClientLogin @e2elocationtest
 Feature: Create Pet Profile 

   Background: 
     Given Open browser for application    
     
     
 Scenario Outline: To check validation for invalid pet name and user name 
    When User click on add pet button from user profile screen using mobile number as "8767252435"
    And User enter petname as <petname> on Pet Profile screen
    And User click outside of petname textbox
    Then User can see pet name validation message "Name must be at least 2 characters" on Pet Profile screen 
    When User enter invalid pet username as <username> on Pet Profile screen 
    And User click outside of petname textbox
    Then User can see pet user validation message "Username must be at least 3 characters" on Pet Profile screen 
    And User can see next button is disabled
     
     Examples:
     |petname|username |
     |p     |u       |

@SmokeTest
  Scenario Outline: To check UI of Pet Profile screen and create pet profile with valid data 
  When User sees New User Profile created with mobile number as <mobilenumber><firstname><email><username>
  Then User can see heading as "Please fill your pet details" on Pet Profile screen
  And User can see petname with label "Pet Name" on add new Pet Profile screen
  And User can see pet username with label "Pet Username" on add new Pet Profile screen
  And User can see birthdate with label "Date of Birth" on add new Pet Profile screen
  And User can see age with label "Age (in days/Months)" on add new Pet Profile screen
  And User can see animal type with label "Animal type" on add new Pet Profile screen
  And User can see gender with label "Gender" on add new Pet Profile screen
  And User can see primary breed with label "Primary Breed" on add new Pet Profile screen
  And User can see secondary breed with label "Secondary Breed" on add new Pet Profile screen
  And User can see pet bio with label "pet Bio" on add new Pet Profile screen
  And User can see cancel button with label "Cancel" on add new Pet Profile screen
  And User can see next button with label "Next" on add new Pet Profile screen
  And User can see skip option with label "skip" on add new Pet Profile screen
  And User enter petname as <petname> on Pet Profile screen
  And User enter pet username as <username> on Pet Profile screen
  And User enter birthdate as <birthdate> on Pet Profile screen
  And User enter animal type as <animaltype> on Pet Profile screen
  And User enter primary breed as <primarybreed> on Pet Profile screen
  And User enter secondary breed as <secondarybreed> on Pet Profile screen   
  And User enter petbio as <petbio> on Pet Profile screen
  And User select gender on Pet Profile screen
  When User clicks on next button
  Then pet profile created successfully
   
    Examples:
   |mobilenumber |firstname    | email                 | username    |petname|username | birthdate     |animaltype|primarybreed  |secondarybreed   |petbio                     |
   |7428730894   |testa        | testauto2@gmail.com   | testa       |Tiger  |  Eliza  | 11/11/2018    | dog      | american     |american         |Eat, sleep, cuddle, repeat |
   
  
   
  Scenario: To cancel pet profile form 
  When User click on add pet button from user profile screen using mobile number as "8767252435"
  And User clicks on Cancel button 
  Then pet profile form is cancelled
  
   #Scenario: To check age is displayed or not 
    
    Scenario: To skip create pet profile
     When User sees New User Profile created 
     Then User can skip pet profile 
    
     
    
    Scenario Outline: To add new pet from user profile with valid data 
    When User click on add pet button from user profile screen using mobile number as "8767252435"
    And User enter petname as <petname> on Pet Profile screen
    And User enter pet username as <username> on Pet Profile screen
    And User enter birthdate as <birthdate> on Pet Profile screen
    And User enter animal type as <animaltype> on Pet Profile screen
    And User enter primary breed as <primarybreed> on Pet Profile screen
    And User enter secondary breed as <secondarybreed> on Pet Profile screen   
    And User enter petbio as <petbio> on Pet Profile screen
    And User select gender on Pet Profile screen
    When User clicks on next button
    Then pet profile created successfully
   
    Examples:
    |petname|username | birthdate     |animaltype|primarybreed  |secondarybreed   |petbio     |
    |tommy  |Elizabeth1|22/01/2011    |dog       |american      |bully            | cutest     |
    