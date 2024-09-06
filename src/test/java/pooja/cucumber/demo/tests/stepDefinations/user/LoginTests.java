package pooja.cucumber.demo.tests.stepDefinations.user;

import io.cucumber.java.en.*;
import pooja.cucumber.demo.pageObject.client.HomePage;
import pooja.cucumber.demo.pageObject.client.Login;
import pooja.cucumber.demo.pageObject.client.UserProfile;
import pooja.cucumber.demo.utils.ConfigReader;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class LoginTests {
	HomePage hp = new HomePage();
	Login l = new Login();
	UserProfile userp = new UserProfile();
	
	
	
	@Given("^Open browser for application$")
	public void open_browser_for_application() throws Throwable {
		open(ConfigReader.getProperty("url.e2e"));
	}

	@When("^User clicks on join Pawzeeble button$")
	public void user_clicks_on_join_pawzeeble_button() throws Throwable {
		
		hp.verifyJoinPawzeebleButton();
		hp.clickJoinPawzeebleButton();
		
	}

	/*
	@When("^User click on send OTP button on login screen$")
	public void user_click_on_send_otp_button_on_login_screen() throws Throwable {
		$x(l.btnSendOTP).should(exist).shouldBe(visible).click();
	}
*/
	@Then("^User can see heading message \"([^\"]*)\" on login screen$")
	public void user_can_see_heading_message_something_on_login_screen(String text) throws Throwable {
		l.verifyHeadingDisplayed(text);
		l.verifyHeadingText(text);
	}

	@Then("^User can see validation message \"([^\"]*)\" on login screen$")
	public void user_can_see_validation_message_something_on_login_screen(String strArg1) throws Throwable {
		$x(Login.pwdErrorMessage).should(exist).shouldBe(visible).shouldHave(text(strArg1));
		Thread.sleep(2000);
	}	

	@And("^User can see detailed message \"([^\"]*)\" on login screen$")
	public void user_can_see_detailed_message_something_on_login_screen(String text) throws Throwable {
		
		l.verifySubHeadingDisplayed(text);
		l.verifySubHeadingText(text);
	}

	@And("^User can see label as \"([^\"]*)\" on login screen$")
	public void user_can_see_label_as_something_on_login_screen(String text) throws Throwable {
		l.verifyMobilenumberLabelDisplayed(text);
		l.verifyMobilenumberLabelText(text);
		
	}
	@Then("User should see an error message {string}")
    public void user_should_see_an_error_message(String message) throws InterruptedException {
		Thread.sleep(2000);
        l.verifyInvalidOtp(message);
        
    }

	/*@And("^User can see checkbox with label as \"([^\"]*)\" on login screen$")
	public void user_can_see_checkbox_with_label_as_something_on_login_screen(String text) throws Throwable {
		$x(l.ckbRememberMe).should(exist).shouldBe(visible);
		$x(l.ckbRememberMe).parent().shouldNotHave(cssClass("Mui-checked"));
		$x(l.lblRememberMe).should(exist).shouldBe(visible).shouldHave(text(text));
	} */

	@And("^User can see send OTP button with text as \"([^\"]*)\" on login screen$")
	public void user_can_see_send_otp_button_with_text_as_something_on_login_screen(String strArg1) throws Throwable {
		
		l.verifySendOTPButtonDisplayed(strArg1);
		l.verifySendOTPBtnDisabled();
		
	}
	 @When("^User clicks on mobile number textbox$")
	    public void user_clicks_on_mobile_number_textbox() throws Throwable {
		 l.clickMobileNoTextBox();
	     
	    }

	    @And("^User clicks on Send OTP button$")
	    public void user_clicks_on_send_otp_button() throws Throwable {
	    	 Login.clickSendOtpButton();
	    }
	
	@When("^User enter mobile number as (.+) on login screen$")
    public void user_enter_mobile_number_as_on_login_screen(String mobilenumber) throws Throwable {
      
        Login.setMobileNumbers(mobilenumber);
        Thread.sleep(2000);
    }
	
	@When("^User enter mobile number \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_mobile_number_and_password(String mobileNumber, String password) throws InterruptedException {
		l.setMobileNumberText(mobileNumber);
        Thread.sleep(2000);
        l.setPassword(password);
	}

	
    @Then("^User can see send OTP button is disabled$")
    public void user_can_see_send_otp_button_is_disabled() throws Throwable {
       l.verifySendOTPBtnDisabled();
       
    }

    @And("^User click outside of mobile number$")
    public void user_click_outside_of_mobile_number() throws Throwable {
    	l.clickMobileNoLabel();
    }
    @When("^User enter mobile number \"([^\"]*)\" on login screen$")
    public void user_enter_mobile_number_something_on_login_screen(String text) throws Throwable {
    	l.setMobileNumberText(text);
    	Thread.sleep(2000);
       
    }

    @When("^User enter OTP as \"([^\"]*)\"$")
    public void user_enter_otp_as_something(String strArg1) throws Throwable {
    	Thread.sleep(3000);
    	Login.enterOTP(strArg1);
    }

    @When("^User clicks on Verify OTP button$")
    public void user_clicks_on_verify_otp_button() throws Throwable {	
    	Thread.sleep(2000);
    	Login.clickVerifyOtpButton();
    }

    @Then("^User can see send OTP button is enabled$")
    public void user_can_see_send_otp_button_is_enabled() throws Throwable { 
    	l.verifySendOTPBtnEnabled();
    }

    @Then("^User can see heading message \"([^\"]*)\"$")
    public void user_can_see_heading_message_something(String text) throws Throwable {
    	l.verifyOTPHeadingDisplayed(text);
    	l.verifyOTPHeadingText(text);
    }

    @Then("^Verify OTP button is enabled$")
    public void verify_otp_button_is_enabled() throws Throwable {
    	l.checkVerifyOTPBtnEnabled();
    }

    @Then("^User logins successfully$")
    public void user_logins_successfully() throws Throwable {
    	
    	UserProfile.userLoginSuccessfully();
    	Thread.sleep(2000);
    }

    @And("^User can see detailed message \"([^\"]*)\" on OTP screen$")
    public void user_can_see_detailed_message_something_on_otp_screen(String text) throws Throwable {
    	l.verifySubOTPHeadingDisplayed(text);
    	l.verifySubOTPHeadingText(text);
    }

    @And("^User can see label as \"([^\"]*)\" on OTP screen$")
    public void user_can_see_label_as_something_on_otp_screen(String text) throws Throwable {
    	l.verifyOTPLabelDisplayed(text);
    }
    
    @When("clicks the Continue button")
    public void clicks_the_continue_button() {
        l.clickContinueButton();
    }
    @And("^leave the password field empty$")
    public void leave_the_password_field_empty() {
        // Code to clear the password field, ensuring it's empty
   
    }
    @Then("^User will see resend button activated$")
    public void user_will_see_resend_button_activated() throws InterruptedException {
    	Thread.sleep(60000);
    	l.resendBtnEnabled();
    }
    	
    	@And("^User clicks on change number text on which login page appears$")
        public void user_clicks_on_change_number_text_on_which_login_page_appears() throws InterruptedException {
    	
    		l.changeNumberClicked();
    		Thread.sleep(2000);
    }

    	@When("^User clicks on forgot password$")
        public void user_clicks_on_forgot_password() throws Throwable {
    		Thread.sleep(2000);    		
    		l.ForgotPasswdBtn();
        }

        @Then("^User lands on forgot password screen$")
        public void user_lands_on_forgot_password_screen() throws Throwable {
        	
        	l.verifyForgotPwdHeaderDisplayed();   
        	}

        @And("^Enters new password \"([^\"]*)\" and confirm password \"([^\"]*)\"$")
        public void enters_new_password_and_confirm_password(String newPassword, String confirmPassword) {
            l.setForgotPassword(newPassword, confirmPassword);
        }

        @And("^User clicks on Reset button$")
        public void user_clicks_on_reset_button() throws Throwable {
        	Thread.sleep(2000);    
        l.clickResetBtn();
           
        }
        @When("^User enters OTP \"([^\"]*)\" on forgot Password screen$")
        public void user_enters_OTP_on_forgot_password_screen(String otp) {
            l.enterForgotPwdOTP(otp);
        }
}
