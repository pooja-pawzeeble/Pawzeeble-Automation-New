package pooja.cucumber.demo.tests.stepDefinations.user;
//import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Selenide.$x;

import io.cucumber.java.en.*;
import pooja.cucumber.demo.pageObject.client.HomePage;
import pooja.cucumber.demo.pageObject.client.Login;
import pooja.cucumber.demo.pageObject.client.NewUserloginForm;
//import pooja.cucumber.demo.pageObject.client.NewUserloginForm;
import pooja.cucumber.demo.pageObject.client.PetProfile;
import pooja.cucumber.demo.pageObject.client.UserProfile;

public class PetProfileTests {
	
	PetProfile pp= new PetProfile();
	UserProfile up= new UserProfile();
	HomePage hp= new HomePage();
	public boolean pname=true, uname=true;
	@When("^User sees New User Profile created$")
    public void user_sees_new_user_profile_created() throws Throwable {
//		HomePage.clickJoinPawzeebleButton();
//    	Login.setMobileNumbers(strArg1);
//    	Login.clickSendOtpButton();
//    	 Login.enterOTP();
//    	Login.clickVerifyOtpButton();
		pp.userProfileCreatedSuccessfully();
    }
	 @When("^User sees New User Profile created with mobile number as (.+)(.+)(.+)(.+)$")
	 public void user_sees_new_user_profile_created_with_mobile_number_as(String mobilenumber, String firstname, String email, String username) throws Throwable {
		hp.clickJoinPawzeebleButton();
    	Login.setMobileNumbers(mobilenumber);
    	Login.clickSendOtpButton();
    	 Login.enterOTP();
    	Login.clickVerifyOtpButton();
    	NewUserloginForm.setFirstnameText(firstname);
    	NewUserloginForm.setEmailText(email);
    	NewUserloginForm.setUsernameText(username);
    	NewUserloginForm.clickNextButton();
    	NewUserloginForm.userSelectsSuggestedTopicsRandomly();
    	NewUserloginForm.clickSubmitButton();
		//pp.userProfileCreatedSuccessfully();
    }
	    @Then("^User can see heading as \"([^\"]*)\" on Pet Profile screen$")
	    public void user_can_see_heading_as_something_on_pet_profile_screen(String strArg1) throws Throwable {
	       pp.verifyHeadingText(strArg1);
	       pp.verifyHeadingDisplayed(strArg1);
	    }

	    @And("^User can see petname with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_petname_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	        pp.verifyPetNameLabelDisplayed(strArg1);
	        pp.verifyPetUserNameLabelText(strArg1);
	    }

	    @And("^User can see pet username with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_pet_username_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	       pp.verifyPetUserNameLabelDisplayed(strArg1);
	       pp.verifyPetUserNameLabelText(strArg1);
	    }

	    @And("^User can see birthdate with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_birthdate_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	       pp.verifyBirthdateLabelDisplayed(strArg1);
	       pp.verifyBirthdateLabelText(strArg1);
	    }

	    @And("^User can see age with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_age_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	        pp.verifyAgeLabelDisplayed(strArg1);
	        pp.verifyAgeLabelText(strArg1);
	    }

	    @And("^User can see animal type with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_animal_type_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	      pp.verifyAnimalTypeDisplayed(strArg1);
	      pp.verifyAnimalTypeLabelText(strArg1);
	    }

	    @And("^User can see gender with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_gender_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	       pp.verifyGenderLabelDisplayed(strArg1);
	       pp.verifyGenderLabelText(strArg1);
	    }

	    @And("^User can see primary breed with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_primary_breed_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	       pp.verifyPriBreedLabelDisplayed(strArg1);
	       pp.verifyPriBreedLabelText(strArg1);
	    }

	    @And("^User can see secondary breed with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_secondary_breed_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	     pp.verifySecBreedLabelDisplayed(strArg1);
	     pp.verifySecBreedLabelText(strArg1);
	     
	    }

	    @And("^User can see pet bio with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_pet_bio_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	        pp.verifyPetBioLabelDisplayed(strArg1);
	        pp.verifyPetBioLabelText(strArg1);
	  
	    }

	    @And("^User can see cancel button with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_cancel_button_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	        pp.verifyCancelButton(strArg1);
	    }

	    @And("^User can see next button with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_next_button_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	       pp.verifyNextButton(strArg1);
	    }

	    @And("^User can see skip option with label \"([^\"]*)\" on add new Pet Profile screen$")
	    public void user_can_see_skip_option_with_label_something_on_add_new_pet_profile_screen(String strArg1) throws Throwable {
	        pp.verifySkipButton(strArg1);
	    }
	    
	    @And("^User click outside of petname textbox$")
	    public void user_click_outside_of_petname_textbox() throws Throwable {
	    	$x(PetProfile.lblPetName).click();
	    }
	    
	    @And("^User can see next button is disabled$")
	    public void user_can_see_next_button_is_disabled() throws Throwable {
	    	$x(PetProfile.btnNext).shouldBe(disabled);
	    }
	    
	    
	    @When("^User clicks on next button$")
	    public void user_clicks_on_next_button() throws Throwable {
	    	pp.clickNextButton();
	    }

	    @Then("^pet profile created successfully$")
	    public void pet_profile_created_successfully() throws Throwable {
	    	UserProfile.userLoginSuccessfully();
	    }

	    @And("^User enter petname as (.+) on Pet Profile screen$")
	    public void user_enter_petname_as_on_pet_profile_screen(String petname) throws Throwable {
	    	if(petname.trim().equalsIgnoreCase("space")) {
				pp.setPetnameText(" ");
			}else if(!petname.trim().equalsIgnoreCase("empty")) {
				pp.setPetnameText(petname);
				pname = false;
			}
	    	Thread.sleep(2000);
	    }

	    @And("^User enter pet username as (.+) on Pet Profile screen$")
	    public void user_enter_pet_username_as_on_pet_profile_screen(String username) throws Throwable {
	    	if(username.trim().equalsIgnoreCase("space")) {
				pp.setUsernameText(" ");
			}else if(!username.trim().equalsIgnoreCase("empty")) {
				pp.setPetnameText(username);
				uname = false;
			}
	    	Thread.sleep(2000);
	    }

	    @When("^User enter invalid pet username as (.+) on Pet Profile screen$")
	    public void user_enter_invalid_pet_username_as_on_pet_profile_screen(String username) throws Throwable {
	        
	    }
	    @And("^User enter birthdate as (.+) on Pet Profile screen$")
	    public void user_enter_birthdate_as_on_pet_profile_screen(String birthdate) throws Throwable {
	    	pp.setBirthdate(birthdate);
	    }

	    @And("^User enter animal type as (.+) on Pet Profile screen$")
	    public void user_enter_animal_type_as_on_pet_profile_screen(String animaltype) throws Throwable {
	    	pp.setAnimalTypeText(animaltype);
	    }

	    @And("^User enter primary breed as (.+) on Pet Profile screen$")
	    public void user_enter_primary_breed_as_on_pet_profile_screen(String primarybreed) throws Throwable {
	    	pp.setPriBreedText(primarybreed);
	    }

	    @And("^User enter secondary breed as (.+) on Pet Profile screen$")
	    public void user_enter_secondary_breed_as_on_pet_profile_screen(String secondarybreed) throws Throwable {
	    	  pp.setSecBreedText(secondarybreed);
	    }

	    @And("^User enter petbio as (.+) on Pet Profile screen$")
	    public void user_enter_petbio_as_on_pet_profile_screen(String petbio) throws Throwable {
	    	pp.setPetBioText(petbio);
	    }

	    @And("^User select gender on Pet Profile screen$")
	    public void user_select_gender_on_pet_profile_screen() throws Throwable {
	    	pp.userSelectGenderRandomly();
	    }
//	    @When("^User click on add pet button from user profile screen$")
//	    public void user_click_on_add_pet_button_from_user_profile_screen() throws Throwable {
//	    	
//	    }
	    
	    @When("^User click on add pet button from user profile screen using mobile number as \"([^\"]*)\"$")
	    public void user_click_on_add_pet_button_from_user_profile_screen_using_mobile_number_as_something(String strArg1) throws Throwable {
	    	hp.clickJoinPawzeebleButton();
	    	Login.setMobileNumbers(strArg1);
	    	Login.clickSendOtpButton();
	    	 Login.enterOTP();
	    	Login.clickVerifyOtpButton();
	    	 //NewUserloginForm.verifyPageHeadingDisplayed();
	    	$x(UserProfile.BtnAddPet).click(); 
	    }
	    @Then("^User can skip pet profile$")
	    public void user_can_skip_pet_profile() throws Throwable {
	    	$x(PetProfile.btnSkip).click();
	    	UserProfile.userLoginSuccessfully(); 
	    }
	    
	    @Then("^User can see pet name validation message \"([^\"]*)\" on Pet Profile screen$")
	    public void user_can_see_pet_name_validation_message_something_on_pet_profile_screen(String strArg1) throws Throwable {
	    	pp.verifyPetNameValidationMessage(strArg1);
	    }
	    @Then("^User can see pet user validation message \"([^\"]*)\" on Pet Profile screen$")
	    public void user_can_see_pet_user_validation_message_something_on_pet_profile_screen(String strArg1) throws Throwable {
	        pp.verifyPetUserNameValidationMessage(strArg1);
	    }
	    @Then("^pet profile form is cancelled$")
	    public void pet_profile_form_is_cancelled() throws Throwable {
	       UserProfile.userLoginSuccessfully();
	    }

	    @And("^User clicks on Cancel button$")
	    public void user_clicks_on_cancel_button() throws Throwable {
	        pp.clickCancelButton();
	    }
	
}