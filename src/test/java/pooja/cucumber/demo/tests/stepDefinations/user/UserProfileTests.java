package pooja.cucumber.demo.tests.stepDefinations.user;

import io.cucumber.java.en.*;
import pooja.cucumber.demo.pageObject.client.Login;
import pooja.cucumber.demo.pageObject.client.NewUserloginForm;

public class UserProfileTests {
	
	NewUserloginForm n = new NewUserloginForm();
	Login l = new Login();
	
	public boolean fname=true, email=true,uname=true;
	
	@When("^User click on Next button on new user login screen$")
    public void user_click_on_next_button_on_new_user_login_screen() throws Throwable {
		n.verifyNextButton("Next");
       n.clickNextButton();
    }

    @Then("^User can see heading as \"([^\"]*)\" on new user login screen$")
    public void user_can_see_heading_as_something_on_new_user_login_screen(String strArg1) throws Throwable {
    	
    	n.verifyPageHeadingDisplayed();
    	n.verifyPageHeadingText("Please fill Personal details");
    }

    @Then("^User can see validation message as \"([^\"]*)\" for first name on new user login screen$")
    public void user_can_see_validation_message_as_something_for_first_name_on_new_user_login_screen(String strArg1) throws Throwable {
        n.verifyFirstnameValidationMessage("Full Name must be at least 3 characters");
    }

    @And("^User can see firstname with label \"([^\"]*)\" on new user login screen$")
    public void user_can_see_firstname_with_label_something_on_new_user_login_screen(String strArg1) throws Throwable {
       n.verifyFirstnameLabel();
       n.verifyFirstnameLabelText("First Name");
    }

    @And("^User can see email address with label \"([^\"]*)\" on new user login screen$")
    public void user_can_see_email_address_with_label_something_on_new_user_login_screen(String strArg1) throws Throwable {
    n.verifyEmailLabel();
    n.verifyEmailLabelText("Email address");
    }

    @And("^User can see mobile number with label \"([^\"]*)\" on new user login screen$")
    public void user_can_see_mobile_number_with_label_something_on_new_user_login_screen(String strArg1) throws Throwable {
       
    }

    @And("^User can see username with label \"([^\"]*)\" on new user login screen$")
    public void user_can_see_username_with_label_something_on_new_user_login_screen(String strArg1) throws Throwable {
       n.verifyUsernameLabel();
       n.verifyUsernameLabelText("Username");
    }

    @And("^User can see User Bio with label \"([^\"]*)\" on new user login screen$")
    public void user_can_see_user_bio_with_label_something_on_new_user_login_screen(String strArg1) throws Throwable {
     n.verifyUserbioLabel();
     n.verifyUserbioLabelText("User Bio");
    }

    @And("^User can see cancel button with heading as \"([^\"]*)\"$")
    public void user_can_see_cancel_button_with_heading_as_something(String strArg1) throws Throwable {
    	n.verifyBackButton("Cancel");
    }

    @And("^User can see next button with heading as \"([^\"]*)\"$")
    public void user_can_see_next_button_with_heading_as_something(String strArg1) throws Throwable {
       n.verifyNextButton("Next");
    }

    @And("^User can see validation message as \"([^\"]*)\" for email address on new user login screen$")
    public void user_can_see_validation_message_as_something_for_email_address_on_new_user_login_screen(String strArg1) throws Throwable {
    	n.verifyEmailValidationMessage("Please enter a valid email address");
    }

    @And("^User can see validation message as \"([^\"]*)\" for user name on new user login screen$")
    public void user_can_see_validation_message_as_something_for_user_name_on_new_user_login_screen(String strArg1) throws Throwable {
       n.verifyUsernameValidationMessage("Username must be at least 3 characters");
    }

}
