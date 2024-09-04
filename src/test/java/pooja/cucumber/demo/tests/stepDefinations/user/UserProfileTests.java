package pooja.cucumber.demo.tests.stepDefinations.user;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

import io.cucumber.java.en.*;
import pooja.cucumber.demo.pageObject.client.HomePage;
import pooja.cucumber.demo.pageObject.client.Login;
import pooja.cucumber.demo.pageObject.client.NewUserloginForm;
import pooja.cucumber.demo.pageObject.client.PetProfile;
public class UserProfileTests {
	
	NewUserloginForm n = new NewUserloginForm();
	Login l = new Login();
	HomePage hp = new HomePage();
    PetProfile pp= new PetProfile();
	
	public boolean fname=true, mail=true,uname=true;
	
	@When("^User click on Next button on new user login screen$")
    public void user_click_on_next_button_on_new_user_login_screen() throws Throwable {
		n.verifyNextButton("Next");
       NewUserloginForm.clickNextButton();
       Thread.sleep(2000);
    }

    @Then("^User can see heading as \"([^\"]*)\" on new user login screen$")
    public void user_can_see_heading_as_something_on_new_user_login_screen(String strArg1) throws Throwable {
    	
    	NewUserloginForm.verifyPageHeadingDisplayed();
    	n.verifyPageHeadingText(strArg1);
    }

    @Then("^User can see validation message as \"([^\"]*)\" for first name on new user login screen$")
    public void user_can_see_validation_message_as_something_for_first_name_on_new_user_login_screen(String strArg1) throws Throwable {
        n.verifyFirstnameValidationMessage(strArg1);
    }

    @And("^User can see firstname with label \"([^\"]*)\" on new user login screen$")
    public void user_can_see_firstname_with_label_something_on_new_user_login_screen(String strArg1) throws Throwable {
       n.verifyFirstnameLabel();
       n.verifyFirstnameLabelText(strArg1);
    }

    @And("^User can see email address with label \"([^\"]*)\" on new user login screen$")
    public void user_can_see_email_address_with_label_something_on_new_user_login_screen(String strArg1) throws Throwable {
    n.verifyEmailLabel();
    n.verifyEmailLabelText(strArg1);
    }

    @And("^User can see mobile number with label \"([^\"]*)\" on new user login screen$")
    public void user_can_see_mobile_number_with_label_something_on_new_user_login_screen(String strArg1) throws Throwable {
       n.verifyMobNoLabel();
       n.verifyMobNoLabelText(strArg1);
       n.verifyMobNoTextbox();
    }

    @And("^User can see username with label \"([^\"]*)\" on new user login screen$")
    public void user_can_see_username_with_label_something_on_new_user_login_screen(String strArg1) throws Throwable {
       n.verifyUsernameLabel();
       n.verifyUsernameLabelText(strArg1);
    }

    @And("^User can see User Bio with label \"([^\"]*)\" on new user login screen$")
    public void user_can_see_user_bio_with_label_something_on_new_user_login_screen(String strArg1) throws Throwable {
     n.verifyUserbioLabel();
     n.verifyUserbioLabelText(strArg1);
    }

    @And("^User can see cancel button with heading as \"([^\"]*)\"$")
    public void user_can_see_cancel_button_with_heading_as_something(String strArg1) throws Throwable {
    	n.verifyCancelButton(strArg1);
    }

    @And("^User can see next button with heading as \"([^\"]*)\"$")
    public void user_can_see_next_button_with_heading_as_something(String strArg1) throws Throwable {
       n.verifyNextButton(strArg1);
    }

    @And("^User can see validation message as \"([^\"]*)\" for email address on new user login screen$")
    public void user_can_see_validation_message_as_something_for_email_address_on_new_user_login_screen(String strArg1) throws Throwable {
    	n.verifyEmailValidationMessage(strArg1);
    }

    @And("^User can see validation message as \"([^\"]*)\" for user name on new user login screen$")
    public void user_can_see_validation_message_as_something_for_user_name_on_new_user_login_screen(String strArg1) throws Throwable {
       n.verifyUsernameValidationMessage(strArg1);
    }
    @When("^User on New User Profile screen$")
    public void user_on_new_user_profile_screen() throws Throwable {
    	
    	NewUserloginForm.verifyPageHeadingDisplayed();
    	
    	
    }
    
    @When("^User on New User Profile screen with mobile number as (.+)$")
    public void user_on_new_user_profile_screen_with_mobile_number_as(String mobilenumber) throws Throwable {
    	hp.clickJoinPawzeebleButton();
    	Login.setMobileNumbers(mobilenumber);
    	Thread.sleep(2000);
    	 Login.clickSendOtpButton();
    	//Login.enterOTP();
    	 Login.clickVerifyOtpButton();
    	 NewUserloginForm.verifyPageHeadingDisplayed();
    }

    @When("^User can see Cancel button with heading \"([^\"]*)\" on new user login screen$")
    public void user_can_see_cancel_button_with_heading_something_on_new_user_login_screen(String strArg1) throws Throwable {
    	n.verifyCancelButton(strArg1);
    }

    @Then("^User is on Home page$")
    public void user_is_on_home_page() throws Throwable {
    	$x(hp.menuLogin).shouldBe(visible);
    	Thread.sleep(2000);
    }

    @And("^User click on Cancel button on new user login screen$")
    public void user_click_on_cancel_button_on_new_user_login_screen() throws Throwable {
     n.clickCancelButton();
    }
  
    @And("^User enter firstname as (.+) on new user login screen$")
    public void user_enter_firstname_as_on_new_user_login_screen(String firstname) throws Throwable {
    	if(firstname.trim().equalsIgnoreCase("space")) {
			NewUserloginForm.setFirstnameText(" ");
		}else if(!firstname.trim().equalsIgnoreCase("empty")) {
			NewUserloginForm.setFirstnameText(firstname);
			fname = false;
		}
    	Thread.sleep(2000);
    }

    @And("^User enter email as (.+) on new user login screen$")
    public void user_enter_email_as_on_new_user_login_screen(String email) throws Throwable {
    	if(email.equalsIgnoreCase("space")) {
			NewUserloginForm.setEmailText(" ");
		}else if(!email.equalsIgnoreCase("empty")) {
			NewUserloginForm.setEmailText(email);
			mail = false;
		}
    	Thread.sleep(2000);
    }

    @And("^User enter username as (.+) on new user login screen$")
    public void user_enter_username_as_on_new_user_login_screen(String username) throws Throwable {
    	if(username.equalsIgnoreCase("space")) {
			NewUserloginForm.setUsernameText(" ");
		}else if(!username.equalsIgnoreCase("empty")) {
			NewUserloginForm.setUsernameText(username);
			uname = false;
		}
    	Thread.sleep(2000);
    }
    @Then("^User can see validation messages on new user login screen$")
    public void user_can_see_validation_messages_on_new_user_login_screen() throws Throwable {
    	if(mail) {
			n.verifyEmailValidationMessage("Please enter a valid email address");
		}
		if(fname) {
			n.verifyFirstnameValidationMessage("Full Name must be at least 3 characters");
		}
		if(uname) {
			n.verifyUsernameValidationMessage("Username must be at least 3 characters");
		}
    }
  
    @Then("^User can see mobile number is disabled$")
    public void user_can_see_mobile_number_is_disabled() throws Throwable {
       n.verifyMobNoTextboxdisabled();
    }
    
    @Then("^User can see heading as \"([^\"]*)\"$")
    public void user_can_see_heading_as_something(String strArg1) throws Throwable {
     n.verifyTopicPageHeadingText(strArg1);
     n.verifyTopicPageHeadingDisplayed();
    }

    @And("^user selects suggested topics$")
    public void user_selects_suggested_topics() throws Throwable {
    	
    	NewUserloginForm.userSelectsSuggestedTopicsRandomly();
    	Thread.sleep(2000);
    	
    }
//    @And("^User clicks on next button$")
//    public void User_clicks_on_submit_button() throws Throwable {
//    	n.clickSubmitButton();
//        Thread.sleep(3000);  
//    }
    @And("^User clicks on submit button$")
    public void user_clicks_on_submit_button() throws Throwable {
    	NewUserloginForm.clickSubmitButton();
    	Thread.sleep(3000);  
    }


    @And("^User can see his profile created successfully$")
    public void user_can_see_his_profile_created_successfully() throws Throwable {
    	//$x(pp.lblHeadingName).shouldBe(visible);
    	pp.userProfileCreatedSuccessfully();
    }
}
