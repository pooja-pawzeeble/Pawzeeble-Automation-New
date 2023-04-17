//package pooja.cucumber.demo.tests.stepDefinations.user;
//import static com.codeborne.selenide.Condition.*;
//import static com.codeborne.selenide.Selenide.$x;
//
//import io.cucumber.java.en.*;
//import pooja.cucumber.demo.pageObject.client.PetProfile;
//import pooja.cucumber.demo.pageObject.client.UserProfile;
//
//public class PetProfileTests {
//	
//	PetProfile pp= new PetProfile();
//	UserProfile up= new UserProfile();
//	public boolean pname=true, uname=true;
//	 @When("^User sees New User Profile created $")
//	    public void user_sees_new_user_profile_created() throws Throwable {
//	       
//	    }
//
//	    @Then("^User can see heading as \"([^\"]*)\" on Pet Profile screen$")
//	    public void user_can_see_heading_as_something_on_pet_profile_screen(String strArg1) throws Throwable {
//	       pp.verifyHeadingText(strArg1);
//	       pp.verifyHeadingDisplayed(strArg1);
//	    }
//
//	    @And("^User can see petname with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_petname_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	        pp.verifyPetNameLabelDisplayed(strArg1);
//	        pp.verifyPetUserNameLabelText(strArg1);
//	    }
//
//	    @And("^User can see pet username with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_pet_username_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	       pp.verifyPetUserNameLabelDisplayed(strArg1);
//	       pp.verifyPetUserNameLabelText(strArg1);
//	    }
//
//	    @And("^User can see birthdate with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_birthdate_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	       pp.verifyBirthdateLabelDisplayed(strArg1);
//	       pp.verifyBirthdateLabelText(strArg1);
//	    }
//
//	    @And("^User can see age with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_age_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	        pp.verifyAgeLabelDisplayed(strArg1);
//	        pp.verifyAgeLabelText(strArg1);
//	    }
//
//	    @And("^User can see animal type with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_animal_type_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	      pp.verifyAnimalTypeDisplayed(strArg1);
//	      pp.verifyAnimalTypeLabelText(strArg1);
//	    }
//
//	    @And("^User can see gender with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_gender_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	       pp.verifyGenderLabelDisplayed(strArg1);
//	       pp.verifyGenderLabelText(strArg1);
//	    }
//
//	    @And("^User can see primary breed with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_primary_breed_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	       pp.verifyPriBreedLabelDisplayed(strArg1);
//	       pp.verifyPriBreedLabelText(strArg1);
//	    }
//
//	    @And("^User can see secondary breed with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_secondary_breed_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	     pp.verifySecBreedLabelDisplayed(strArg1);
//	     pp.verifySecBreedLabelText(strArg1);
//	     
//	    }
//
//	    @And("^User can see pet bio with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_pet_bio_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	        pp.verifyPetBioLabelDisplayed(strArg1);
//	        pp.verifyPetBioLabelText(strArg1);
//	  
//	    }
//
//	    @And("^User can see cancel button with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_cancel_button_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	        pp.verifyCancelButton(strArg1);
//	    }
//
//	    @And("^User can see next button with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_next_button_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	       pp.verifyNextButton(strArg1);
//	    }
//
//	    @And("^User can see skip option with label \"([^\"]*)\" on add new Pet Profile screen$")
//	    public void user_can_see_skip_option_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
//	        pp.verifySkipButton(strArg1);
//	    }
//	    
//	  
//	    @When("^User clicks on next button$")
//	    public void user_clicks_on_next_button() throws Throwable {
//	       pp.clickNextButton();
//	      
//	    }
//
//	    @Then("^pet profile created successfully$")
//	    public void pet_profile_created_successfully() throws Throwable {
//	      up.userLoginSuccessfully();
//	    }
//
//	    @And("^User enter petname as (.+) on Pet Profile screen$")
//	    public void user_enter_petname_as_on_pet_profile_screen(String petname) throws Throwable {
//	    	if(petname.trim().equalsIgnoreCase("space")) {
//				pp.setPetnameText(" ");
//			}else if(!petname.trim().equalsIgnoreCase("empty")) {
//				pp.setPetnameText(petname);
//				pname = false;
//			}
//	    	Thread.sleep(2000);
//	    }
//
//	    @And("^User enter pet username as (.+) on Pet Profile screen$")
//	    public void user_enter_pet_username_as_on_pet_profile_screen(String username) throws Throwable {
//	    	if(username.trim().equalsIgnoreCase("space")) {
//				pp.setUsernameText(" ");
//			}else if(!username.trim().equalsIgnoreCase("empty")) {
//				pp.setPetnameText(username);
//				uname = false;
//			}
//	    	Thread.sleep(2000);
//	    }
//
//	    @And("^User enter birthdate as (.+) on Pet Profile screen$")
//	    public void user_enter_birthdate_as_on_pet_profile_screen(String birthdate) throws Throwable {
//	      pp.setBirthdate(birthdate);
//	    }
//
//	    @And("^User enter animal type as (.+) on Pet Profile screen$")
//	    public void user_enter_animal_type_as_on_pet_profile_screen(String animaltype) throws Throwable {
//	      pp.setAnimalTypeText(animaltype);
//	    }
//
//	    @And("^User enter primary breed as (.+) on Pet Profile screen$")
//	    public void user_enter_primary_breed_as_on_pet_profile_screen(String primarybreed) throws Throwable {
//	       pp.setPriBreedText(primarybreed);
//	    }
//
//	    @And("^User enter secondary breed as (.+) on Pet Profile screen$")
//	    public void user_enter_secondary_breed_as_on_pet_profile_screen(String secondarybreed) throws Throwable {
//	       pp.setSecBreedText(secondarybreed);
//	    }
//
//	    @And("^User enter petbio as (.+) on Pet Profile screen$")
//	    public void user_enter_petbio_as_on_pet_profile_screen(String petbio) throws Throwable {
//	      pp.setPetBioText(petbio);
//	    }
//
//	    @And("^User select gender on Pet Profile screen$")
//	    public void user_select_gender_on_pet_profile_screen() throws Throwable {
//	    	pp.userSelectGenderRandomly();
//	    }
////	    @Then("^User can see validation message \"([^\"]*)\" on Pet Profile screen$")
////	    public void user_can_see_pet_name_validation_message_something_on_pet_profile_screen(String strArg1) throws Throwable {
////	       
////	    }
//
//	    @And("^User click outside of petname textbox$")
//	    public void user_click_outside_of_petname_textbox() throws Throwable {
//	    
//	    }
//	    
//	    @Then("^User can see validation message \"([^\"]*)\" on Pet Profile screen$")
//	    public void user_can_see_pet_user_validation_message_something_on_pet_profile_screen(String strArg1) throws Throwable {
//	      
//	    }
//
//	    @And("^User can see next button is disabled$")
//	    public void user_can_see_next_button_is_disabled() throws Throwable {
//	      
//	    }
//	
//}