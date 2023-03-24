package pooja.cucumber.demo.tests.stepDefinations.user;

import io.cucumber.java.en.*;
import pooja.cucumber.demo.pageObject.client.HomePage;
import pooja.cucumber.demo.pageObject.client.Login;
import pooja.cucumber.demo.pageObject.client.UserProfile;
import pooja.cucumber.demo.utils.ConfigReader;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

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
		$x(hp.menuLogin).should(exist).shouldBe(visible);
		$x(hp.menuLogin).click();
	}

	/*
	@When("^User click on send OTP button on login screen$")
	public void user_click_on_send_otp_button_on_login_screen() throws Throwable {
		$x(l.btnSendOTP).should(exist).shouldBe(visible).click();
	}
*/
	@Then("^User can see heading message \"([^\"]*)\" on login screen$")
	public void user_can_see_heading_message_something_on_login_screen(String text) throws Throwable {
		$x(l.lblHeading).should(exist).shouldBe(visible).shouldHave(partialText(text));
	}

	@Then("^User can see validation message \"([^\"]*)\" on login screen$")
	public void user_can_see_validation_message_something_on_login_screen(String strArg1) throws Throwable {
		$x(l.lblErrorMessage).should(exist).shouldBe(visible).shouldHave(text(strArg1));
		Thread.sleep(2000);
	}	

	@And("^User can see detailed message \"([^\"]*)\" on login screen$")
	public void user_can_see_detailed_message_something_on_login_screen(String text) throws Throwable {
		$x(l.lblSubHeading).should(exist).shouldBe(visible).shouldHave(text(text));
	}

	@And("^User can see label as \"([^\"]*)\" on login screen$")
	public void user_can_see_label_as_something_on_login_screen(String text) throws Throwable {
		$x(l.lblPhoneNumber).should(exist).shouldBe(visible).shouldHave(partialText(text));
	}

	/*@And("^User can see checkbox with label as \"([^\"]*)\" on login screen$")
	public void user_can_see_checkbox_with_label_as_something_on_login_screen(String text) throws Throwable {
		$x(l.ckbRememberMe).should(exist).shouldBe(visible);
		$x(l.ckbRememberMe).parent().shouldNotHave(cssClass("Mui-checked"));
		$x(l.lblRememberMe).should(exist).shouldBe(visible).shouldHave(text(text));
	} */

	@And("^User can see send OTP button with text as \"([^\"]*)\" on login screen$")
	public void user_can_see_send_otp_button_with_text_as_something_on_login_screen(String strArg1) throws Throwable {
		$x(l.btnSendOTP).should(exist).shouldBe(visible).shouldHave(text(strArg1));
		$x(l.btnSendOTP).shouldBe(disabled);
	}
	 @When("^User clicks on mobile number textbox$")
	    public void user_clicks_on_mobile_number_textbox() throws Throwable {
		 $x(l.txtMobile).click();
	     
	    }

	    @And("^User clicks on Send OTP button$")
	    public void user_clicks_on_send_otp_button() throws Throwable {
	    	 $x(l.btnSendOTP).click();
	    }
	
	@When("^User enter mobile number as (.+) on login screen$")
    public void user_enter_mobile_number_as_on_login_screen(String mobilenumber) throws Throwable {
        $x(l.txtMobile).val(mobilenumber.trim());
        Thread.sleep(2000);
    }

    @Then("^User can see send OTP button is disabled$")
    public void user_can_see_send_otp_button_is_disabled() throws Throwable {
        $x(l.btnSendOTP).shouldBe(disabled);
    }

    @And("^User click outside of mobile number$")
    public void user_click_outside_of_mobile_number() throws Throwable {
    	$x(l.lblPhoneNumber).click();
    }
    @When("^User enter mobile number \"([^\"]*)\" on login screen$")
    public void user_enter_mobile_number_something_on_login_screen(String text) throws Throwable {
    	$x(l.txtMobile).setValue(text);
    	Thread.sleep(2000);
       
    }

    @When("^User enter OTP as \"([^\"]*)\"$")
    public void user_enter_otp_as_something(String strArg1) throws Throwable {
       
    	ElementsCollection coll= $$(By.cssSelector("input.css-xuc6iw"));
    	
    	String s = "0 9 8 7 6 5";
		String[] str1 = s.split(" ");
		
		//for (int i = 0; i < str1.length; i++)
		//{
		
    	for(SelenideElement e:coll)
    	{
    		e.sendKeys(str1);	
    	}	
    	//}
    	
    }

    @When("^User clicks on Verify OTP button$")
    public void user_clicks_on_verify_otp_button() throws Throwable {
    	
    	$x(l.btnVerifyOtp).click();
    }

    @Then("^User can see send OTP button is enabled$")
    public void user_can_see_send_otp_button_is_enabled() throws Throwable {
    	$x(l.btnSendOTP).shouldBe(enabled);   
    }

    @Then("^User can see heading message \"([^\"]*)\"$")
    public void user_can_see_heading_message_something(String text) throws Throwable {
    	
    	$x(l.lblHeadingOtp).should(exist).shouldBe(visible).shouldHave(text(text)); 
    }

    @Then("^Verify OTP button is enabled$")
    public void verify_otp_button_is_enabled() throws Throwable {
    	$x(l.btnVerifyOtp).shouldBe(enabled);  
    }

    @Then("^User logins successfully$")
    public void user_logins_successfully() throws Throwable {
    	
    	$x(userp.lblUserName).shouldBe(visible);
    	Thread.sleep(2000);
    }

    @And("^User can see detailed message \"([^\"]*)\" on OTP screen$")
    public void user_can_see_detailed_message_something_on_otp_screen(String text) throws Throwable {
    	$x(l.lblSubHeadingOtp).should(exist).shouldBe(visible).shouldHave(text(text));
    }

    @And("^User can see label as \"([^\"]*)\" on OTP screen$")
    public void user_can_see_label_as_something_on_otp_screen(String text) throws Throwable {
    	$x(l.lblOtp).should(exist).shouldBe(visible).shouldHave(partialText(text));
    }

}
